package com.dataojo.entity;

public class Message {

	private double x;
	private double y;
	private double z;
	private int id ;
	private String code;
	private String datetime;
	private Object des;

	public double getX() {
		return x;
	}
	public void setX(double x) {
		this.x = x;
	}
	public double getY() {
		return y;
	}
	public void setY(double y) {
		this.y = y;
	}
	public double getZ() {
		return z;
	}
	public void setZ(double z) {
		this.z = z;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getCode() {
		return code;
	}
	public void setCode(String code) {
		this.code = code;
	}
	public String getDatetime() {
		return datetime;
	}
	public void setDatetime(String datetime) {
		this.datetime = datetime;
	}
	public Object getDes() {
		return des;
	}
	public void setDes(Object des) {
		this.des = des;
	}

	@Override
	public String toString() {
		return  id + "," + code + "," + datetime + "," + x + "," + y + "," + z + "," + des ;
	}

}
