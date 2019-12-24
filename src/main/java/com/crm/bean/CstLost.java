package com.crm.bean;

public class CstLost {
    private Long lstId;

    private String lstCustNo;

    private String lstCustName;

    private Long lstCustManagerId;

    private String lstCustManagerName;

    private String lstLastOrderDate;

    private String lstLostDate;

    private String lstDelay;

    private String lstReason;

    private String lstStatus;

    public Long getLstId() {
        return lstId;
    }

    public void setLstId(Long lstId) {
        this.lstId = lstId;
    }

    public String getLstCustNo() {
        return lstCustNo;
    }

    public void setLstCustNo(String lstCustNo) {
        this.lstCustNo = lstCustNo == null ? null : lstCustNo.trim();
    }

    public String getLstCustName() {
        return lstCustName;
    }

    public void setLstCustName(String lstCustName) {
        this.lstCustName = lstCustName == null ? null : lstCustName.trim();
    }

    public Long getLstCustManagerId() {
        return lstCustManagerId;
    }

    public void setLstCustManagerId(Long lstCustManagerId) {
        this.lstCustManagerId = lstCustManagerId;
    }

    public String getLstCustManagerName() {
        return lstCustManagerName;
    }

    public void setLstCustManagerName(String lstCustManagerName) {
        this.lstCustManagerName = lstCustManagerName == null ? null : lstCustManagerName.trim();
    }

    public String getLstLastOrderDate() {
        return lstLastOrderDate;
    }

    public void setLstLastOrderDate(String lstLastOrderDate) {
        this.lstLastOrderDate = lstLastOrderDate == null ? null : lstLastOrderDate.trim();
    }

    public String getLstLostDate() {
        return lstLostDate;
    }

    public void setLstLostDate(String lstLostDate) {
        this.lstLostDate = lstLostDate == null ? null : lstLostDate.trim();
    }

    public String getLstDelay() {
        return lstDelay;
    }

    public void setLstDelay(String lstDelay) {
        this.lstDelay = lstDelay == null ? null : lstDelay.trim();
    }

    public String getLstReason() {
        return lstReason;
    }

    public void setLstReason(String lstReason) {
        this.lstReason = lstReason == null ? null : lstReason.trim();
    }

    public String getLstStatus() {
        return lstStatus;
    }

    public void setLstStatus(String lstStatus) {
        this.lstStatus = lstStatus == null ? null : lstStatus.trim();
    }
}