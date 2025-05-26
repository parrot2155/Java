package com.poly.silsub2.salary.controller;

import com.poly.silsub2.salary.model.vo.Salary;
import com.poly.silsub2.salary.view.OutputImpl;

public class CalculateImpl implements Calculate{

	@Override
	public void calc(Salary[] sarr) {
		for(int i=0;i<sarr.length;i++) {
			if(sarr[i].getFamily()<3) {
				sarr[i].setFamilyP(sarr[i].getFamily()*20000);
			}else {
				sarr[i].setFamilyP(sarr[i].getFamily()*60000);
			}
			sarr[i].setOvertimeP(sarr[i].getOvertime()*5000);
			sarr[i].setTotalPay(sarr[i].getPay()/10);
			sarr[i].setIncenP(sarr[i].getIncenP()*sarr[i].getPay());
			sarr[i].setTotalPay(sarr[i].getPay()+sarr[i].getFamilyP()+sarr[i].getIncenP()+sarr[i].getOvertimeP()-sarr[i].getTax());
			
		}
		new OutputImpl().out(sarr);
		
		
		
	}
	
}
