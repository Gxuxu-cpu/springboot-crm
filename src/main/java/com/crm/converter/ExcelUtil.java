package com.crm.converter;


import org.apache.poi.hssf.usermodel.HSSFCellStyle;
import org.apache.poi.hssf.usermodel.HSSFFont;
import org.apache.poi.hssf.usermodel.HSSFWorkbook;
import org.apache.poi.ss.usermodel.HorizontalAlignment;
import org.apache.poi.ss.usermodel.VerticalAlignment;

/**
 *  * excel导出的工具类  * @author  *  
 */
public class ExcelUtil {
	/**
	 * 提取头公共的样式
	 * 
	 * @param workbook
	 * @param fontSize
	 * @return
	 */
	public static HSSFCellStyle createTitleStyle(HSSFWorkbook workbook, int fontSize) {
		HSSFCellStyle style = workbook.createCellStyle();
		style.setAlignment(HorizontalAlignment.CENTER);// 设置水平居中
		style.setVerticalAlignment(VerticalAlignment.CENTER);// 设置垂直居中
		// 创建字体样式
		HSSFFont font = workbook.createFont();
		font.setFontHeightInPoints((short) fontSize);
		font.setBold(true);// 设置字体样式   如加粗，斜体 等
		font.setFontName("华文行楷");
		style.setFont(font);
		return style;
	}

	/**
	 * 提取小标题公共的样式 
	 * 
	 * @param workbook
	 * @param fontSize
	 * @return
	 */
	public static HSSFCellStyle createSecondTitleStyle(HSSFWorkbook workbook, int fontSize) {
		HSSFCellStyle style = workbook.createCellStyle();
		style.setAlignment(HorizontalAlignment.CENTER);// 设置水平居
		style.setVerticalAlignment(VerticalAlignment.CENTER);// 设置垂直居中
		// 创建一个字体样式
		HSSFFont font = workbook.createFont();
		font.setFontHeightInPoints((short) fontSize);
		font.setBold(true);
		style.setFont(font);
		return style;
	}

	/**
	 *       提取表格头部的样式
	 *       @param workbook
	 *       @param fontSize
	 *       @return
	 *      
	 */
	public static HSSFCellStyle createDataHeaderStyle(HSSFWorkbook workbook, int fontSize) {
		HSSFCellStyle style = workbook.createCellStyle();
		style.setAlignment(HorizontalAlignment.CENTER);// 设置水平居中
		style.setVerticalAlignment(VerticalAlignment.CENTER);// 设置垂直居中
		// 创建一个字体样式
		HSSFFont font = workbook.createFont();
		font.setFontHeightInPoints((short) fontSize);
		font.setBold(true);
		style.setFont(font);
		return style;
	}

	/**
       * 提取表格数据的样式
       * 
       * @param workbook
       * @param fontSize
       * @return
       */
	public static HSSFCellStyle createDataStyle(HSSFWorkbook workbook, int fontSize){
		HSSFCellStyle style = workbook.createCellStyle();
		style.setAlignment(HorizontalAlignment.CENTER);//设置水平居中
		style.setVerticalAlignment(VerticalAlignment.CENTER);//设置垂直居中
		// 创建一个字体样式
		HSSFFont font = workbook.createFont();
		font.setFontHeightInPoints((short) fontSize);

		style.setFont(font);
		return style;
	}
}
		