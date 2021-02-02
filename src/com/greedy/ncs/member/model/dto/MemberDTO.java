package com.greedy.ncs.member.model.dto;
public class MemberDTO {		
	private String id;
	private String pwd;
	private String name;
	private String date;
	private int height;
	private double weight;
	private boolean hwalsunghwa; 
	private long number;	
	
	public MemberDTO() {}

	public MemberDTO(String id, String pwd, String name, String date, int height, double weight, boolean hwalsunghwa,
			long number) {
		super();
		this.id = id;
		this.pwd = pwd;
		this.name = name;
		this.date = date;
		this.height = height;
		this.weight = weight;
		this.hwalsunghwa = hwalsunghwa;
		this.number = number;}

	public String getId() {
		return id;}

	public void setId(String id) {
		this.id = id;}

	public String getPwd() {
		return pwd;}

	public void setPwd(String pwd) {
		this.pwd = pwd;}

	public String getName() {
		return name;}

	public void setName(String name) {
		this.name = name;}

	public String getDate() {
		return date;
	}

	public void setDate(String date) {
		this.date = date;
	}

	public int getHeight() {
		return height;
	}

	public void setHeight(int height) {
		this.height = height;
	}

	public double getWeight() {
		return weight;
	}

	public void setWeight(double weight) {
		this.weight = weight;
	}

	public boolean isHwalsunghwa() {
		return hwalsunghwa;
	}

	public void setHwalsunghwa(boolean hwalsunghwa) {
		this.hwalsunghwa = hwalsunghwa;
	}

	public long getNumber() {
		return number;
	}

	public void setNumber(long number) {
		this.number = number;
	}

	@Override
	public String toString() {
		return "MemberDTO [id=" + id + ", pwd=" + pwd + ", name=" + name + ", date=" + date + ", height=" + height
				+ ", weight=" + weight + ", hwalsunghwa=" + hwalsunghwa + ", number=" + number + "]";
	}
	
}
