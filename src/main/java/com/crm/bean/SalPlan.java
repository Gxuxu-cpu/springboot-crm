package com.crm.bean;

import java.text.SimpleDateFormat;
import java.util.Date;

public class SalPlan {
    private Long plaId;

    private Date plaDate;

    private String plaTodo;

    private String plaResult;

    private Long plaChcId;
    
    //前台不能用fmt标签显示日期，在类中加一个plaDateStr属性，把Date类型转成日期类型，在返回给前端
    private String plaDateStr;

    public Long getPlaId() {
        return plaId;
    }

    public void setPlaId(Long plaId) {
        this.plaId = plaId;
    }

    public Date getPlaDate() {
        return plaDate;
    }

    public void setPlaDate(Date plaDate) {
        this.plaDate = plaDate;
    }

    public String getPlaTodo() {
        return plaTodo;
    }

    public void setPlaTodo(String plaTodo) {
        this.plaTodo = plaTodo == null ? null : plaTodo.trim();
    }

    public String getPlaResult() {
        return plaResult;
    }

    public void setPlaResult(String plaResult) {
        this.plaResult = plaResult == null ? null : plaResult.trim();
    }

    public Long getPlaChcId() {
        return plaChcId;
    }

    public void setPlaChcId(Long plaChcId) {
        this.plaChcId = plaChcId;
    }

	public String getPlaDateStr() {
		//把plaDate转成我们想要的格式。
		SimpleDateFormat simpleDateFormat = new SimpleDateFormat("yyyy-MM-dd");
		plaDateStr = simpleDateFormat.format(plaDate);
		return plaDateStr;
	}

	public void setPlaDateStr(String plaDateStr) {
		this.plaDateStr = plaDateStr;
	}
    
    
}