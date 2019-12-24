package com.crm.bean;

import java.util.Date;
import java.util.List;

public class Orders {
    private Long odrId;

    private String odrCustomer;

    private Date odrDate;

    private String odrAddr;

    private String odrStatus;

    private String odrCustNo;

    private Double total;

    //Orders和Orders_line是一对多的关系
    private List<OrdersLine> ordersLineList;
    
    
    public Long getOdrId() {
        return odrId;
    }

    public void setOdrId(Long odrId) {
        this.odrId = odrId;
    }

    public String getOdrCustomer() {
        return odrCustomer;
    }

    public void setOdrCustomer(String odrCustomer) {
        this.odrCustomer = odrCustomer == null ? null : odrCustomer.trim();
    }

    public Date getOdrDate() {
        return odrDate;
    }

    public void setOdrDate(Date odrDate) {
        this.odrDate = odrDate;
    }

    public String getOdrAddr() {
        return odrAddr;
    }

    public void setOdrAddr(String odrAddr) {
        this.odrAddr = odrAddr == null ? null : odrAddr.trim();
    }

    public String getOdrStatus() {
        return odrStatus;
    }

    public void setOdrStatus(String odrStatus) {
        this.odrStatus = odrStatus == null ? null : odrStatus.trim();
    }

    public String getOdrCustNo() {
        return odrCustNo;
    }

    public void setOdrCustNo(String odrCustNo) {
        this.odrCustNo = odrCustNo == null ? null : odrCustNo.trim();
    }

    public Double getTotal() {
        return total;
    }

    public void setTotal(Double total) {
        this.total = total;
    }

	public List<OrdersLine> getOrdersLineList() {
		return ordersLineList;
	}

	public void setOrdersLineList(List<OrdersLine> ordersLineList) {
		this.ordersLineList = ordersLineList;
	}

	@Override
	public String toString() {
		return "Orders [odrId=" + odrId + ", odrCustomer=" + odrCustomer + ", odrDate=" + odrDate + ", odrAddr="
				+ odrAddr + ", odrStatus=" + odrStatus + ", odrCustNo=" + odrCustNo + ", total=" + total
				+ ", ordersLineList=" + ordersLineList + "]";
	}
    
    
}