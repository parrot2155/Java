package com.poly.silsub2.salary.controller;

import com.poly.silsub2.salary.model.vo.Salary;

public interface Calculate {
	public abstract void calc(Salary[] sarr);
}
