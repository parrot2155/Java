package com.poly.silsub2.salary.model.vo;

public abstract class Salary {
	//필드
	private String name;
	private long pay;
	private long familyP;
	private long overtimeP;
	private long incenP;
	private long tax;
	private long totalPay;
	private int family;
	private int overtime;
	private static float incentive = (float) 0.5;
	private static int count = 0;
	
	public Salary() {}
		
	public Salary(String name, long pay, int family, int overtime) {
		super();
		this.name = name;
		this.pay = pay;
		this.family = family;
		this.overtime = overtime;
		count++;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public long getPay() {
		return pay;
	}

	public void setPay(long pay) {
		this.pay = pay;
	}

	public long getFamilyP() {
		return familyP;
	}

	public void setFamilyP(long familyP) {
		this.familyP = familyP;
	}

	public long getOvertimeP() {
		return overtimeP;
	}

	public void setOvertimeP(long overtimeP) {
		this.overtimeP = overtimeP;
	}

	public long getIncenP() {
		return incenP;
	}

	public void setIncenP(long incenP) {
		this.incenP = incenP;
	}

	public long getTax() {
		return tax;
	}

	public void setTax(long tax) {
		this.tax = tax;
	}

	public long getTotalPay() {
		return totalPay;
	}

	public void setTotalPay(long totalPay) {
		this.totalPay = totalPay;
	}

	public int getFamily() {
		return family;
	}

	public void setFamily(int family) {
		this.family = family;
	}

	public int getOvertime() {
		return overtime;
	}

	public void setOvertime(int overtime) {
		this.overtime = overtime;
	}

	public static float getIncentive() {
		return incentive;
	}

	public static void setIncentive(float incentive) {
		Salary.incentive = incentive;
	}

	public static int getCount() {
		return count;
	}

	public static void setCount(int count) {
		Salary.count = count;
	}
	
	
	

}
