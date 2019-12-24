package com.crm.rept.controller;

import java.net.URLEncoder;
import java.util.Date;
import java.util.List;

import javax.annotation.Resource;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.apache.poi.hssf.usermodel.HSSFCell;
import org.apache.poi.hssf.usermodel.HSSFCellStyle;
import org.apache.poi.hssf.usermodel.HSSFRow;
import org.apache.poi.hssf.usermodel.HSSFSheet;
import org.apache.poi.hssf.usermodel.HSSFWorkbook;
import org.apache.poi.ss.util.CellRangeAddress;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import com.crm.bean.Orders;
import com.crm.converter.ExcelUtil;
import com.crm.cust.service.IOrdersService;
import com.crm.support.PageInfo;

@Controller
@RequestMapping("/rept")
public class ContrController {

	@Resource
	private IOrdersService ordersService;

	@RequestMapping("contr")
	public String list(PageInfo<Orders> pageInfo, Orders orders, Model model, String ok, Long odrId) {
		pageInfo.setEntity(orders);// 放入查询条件
		pageInfo.setOk(ok);
		pageInfo.setPageSize(20);
		PageInfo<Orders> info = ordersService.findListByPageInfo(pageInfo);
		model.addAttribute("nianlist", ordersService.selectByParam("年份"));
		model.addAttribute("orders", orders);
		model.addAttribute("pageInfo", info);
		return "rept/contr";
	}

	/**
	 * 创建导出的方法
	 * 
	 * @param response
	 * @param users
	 * @throws Exception
	 */

	@RequestMapping("/export")
	public void exportUserExcel(PageInfo<Orders> pageInfo, Orders orders,HttpServletRequest request,HttpServletResponse response) throws Exception {
		
		pageInfo.setEntity(orders);// 放入查询条件
		pageInfo.setPageSize(20);
		List<Orders> ordersc  = ordersService.findOrders(pageInfo);
		// 声明文件名
		String name = request.getParameter("ming");
		String fileName = name+".xls";
		// 处理文件名

		try {

			fileName = URLEncoder.encode(fileName, "utf-8");

		} catch (Exception e) {

			e.printStackTrace();

		}

		// 处理文件类型

		response.setContentType("application/x-download");

		// 设置下载的文件名

		response.setHeader("Content-Disposition", "attachment; filename=\"" + fileName + "\"");

		// 创建一个工作表

		HSSFWorkbook workbook = new HSSFWorkbook();// 是一个空的，没有sheet的excel

		// 创建sheet并取名

		HSSFSheet sheet = workbook.createSheet("用户数据");

		// 设置整个Excel表格的列的默认宽度

		sheet.setDefaultColumnWidth((short) 30);

		// 开始写数据
		int row = 0;

		// 写第一行数据
		HSSFRow titleRow = sheet.createRow(row);

		// 在第一行里面创建列
		HSSFCell titleCell = titleRow.createCell(0);

		// 创建合并的对象
		/**
		 * 
		 ** 参数1:开始行  参数2：结束行   参数3  开始列    参数4 ：结束列的下标  
		 * 
		 *          
		 */
		CellRangeAddress region = new CellRangeAddress(row, row, 0, 2);

		// 合并
		sheet.addMergedRegion(region);

		// 设置合并后的列的的数据
		titleCell.setCellValue("用户数据");

		// 从公共方法里面提取样式 
		HSSFCellStyle titleStyle = ExcelUtil.createTitleStyle(workbook, 25);

		// 把样式应该到Cell里面
		titleCell.setCellStyle(titleStyle);

		// 第二行

		row++;
		HSSFRow secondTitleRow = sheet.createRow(row);

		// 在第二行里面创建列
		HSSFCell secondCell = secondTitleRow.createCell(0);

		CellRangeAddress region2 = new CellRangeAddress(row, row, 0, 2);

		// 合并
		sheet.addMergedRegion(region2);

		// 设置合并后的列的的数据
		secondCell.setCellValue("总数:" + ordersc.size() + "条，导出时间:" + new Date().toLocaleString());

		// 从公共方法里面提取样式 
		HSSFCellStyle secondTitleStyle = ExcelUtil.createSecondTitleStyle(workbook, 14);

		// 把样式应该到Cell里面
		secondCell.setCellStyle(secondTitleStyle);

		String[] headers = { "编号", "客户名称", "订单金额" };

		// 第三行 是头部数据   
		row++;

		HSSFRow rowHeader = sheet.createRow(row);

		HSSFCellStyle dataHeaderStyle = ExcelUtil.createDataHeaderStyle(workbook, 12);

		for (int i = 0; i < headers.length; i++) {

			HSSFCell cell = rowHeader.createCell(i);

			cell.setCellValue(headers[i]);

			cell.setCellStyle(dataHeaderStyle);

		}

		// 第四行到最后都是用户数据
		HSSFCellStyle dataStyle = ExcelUtil.createDataStyle(workbook, 12);

		for (int i = 0; i < ordersc.size(); i++) {

			row++;

			Orders order = ordersc.get(i);

			HSSFRow rowData = sheet.createRow(row);

			String[] data = { order.getOdrId() + "", order.getOdrCustomer(), String.valueOf(order.getTotal()) };

			for (int j = 0; j < data.length; j++) {

				HSSFCell cell = rowData.createCell(j);

				cell.setCellValue(data[j]);

				cell.setCellStyle(dataStyle);

			}
		}

		// 把它写出去
		workbook.write(response.getOutputStream());

	}

}
