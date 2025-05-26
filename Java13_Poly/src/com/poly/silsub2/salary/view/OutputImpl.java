package com.poly.silsub2.salary.view;

import com.poly.silsub2.salary.model.vo.Salary;

public class OutputImpl implements Output{
	
	@Override
	public void out(Salary[] sarr) {
		System.out.println("                                        **** 급여명세서 ****");
		System.out.println("---------------------------------------------------------------------------------------------------");
		System.out.println("이름      기본급    가족수   가족수당   시간외근무  시간외수당 세금  인센티브(%)  성과금   실수령액");
		System.out.println();
		
	}

}
