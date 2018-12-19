package com.xinglong.pojo;

import java.util.Date;

public class Result {
    private Integer id;

    private String benchnumber;
    
    private Double al;

    private Double ca;

    private Double cu;

    private Double fe;

    private Double mg;

    private Double zn;

    private Double mn;

    private Double f;
    
    private Date date;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getBenchnumber() {
        return benchnumber;
    }

    public void setBenchnumber(String benchnumber) {
        this.benchnumber = benchnumber == null ? null : benchnumber.trim();
    }
    public Double getAl() {
        return al;
    }
    public void setAl(Double al) {
        this.al = al;
    }

    public Double getCa() {
        return ca;
    }

    public void setCa(Double ca) {
        this.ca = ca;
    }

    public Double getCu() {
        return cu;
    }

    public void setCu(Double cu) {
        this.cu = cu;
    }

    public Double getFe() {
        return fe;
    }

    public void setFe(Double fe) {
        this.fe = fe;
    }

    public Double getMg() {
        return mg;
    }

    public void setMg(Double mg) {
        this.mg = mg;
    }

    public Double getZn() {
        return zn;
    }

    public void setZn(Double zn) {
        this.zn = zn;
    }

    public Double getMn() {
        return mn;
    }

    public void setMn(Double mn) {
        this.mn = mn;
    }

    public Double getF() {
        return f;
    }

    public void setF(Double f) {
        this.f = f;
    }
    public Date getDate() {
        return date;
    }
	public void setDate(Date date) {
		this.date = date;		
	}
    @Override
    public String toString() {
    	return benchnumber+"\t"+date+"\nAl:"+getAl()+" Ca:"+getCa()+" Cu:"+getCu()+
    			" Fe:"+getFe()+" Mg:"+getMg()+" Zn:"+getZn()+" Mn:"+getMn()+" F:"+getF();
    }
    
}