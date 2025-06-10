package com.test1.run;

import com.test1.model.vo.Employee;

public class Run {

	public static void main(String[] args) {
		// 객체배열을 크기 3으로 할당 한 뒤 3개의 생성자를 각각 이용하여 객체 생성 후 출력 
		Employee[] emp = new Employee[3];
		
		emp[0] = new Employee();
		emp[1] = new Employee(1,"홍길동",19,'M',"01012634567","서울 잠실");
		emp[2] = new Employee(2, "강말순", "교육부", "강사", 20, 'F', 1000000, 0.01, "01011112222", "서울 마곡");
		
		for(Employee e : emp) {
			System.out.println(e.information());
		}
		
		// 3개의 객체 중 값이 없는 필드에 각각 값을 넣은 뒤 출력 
		//setter메소드 사용
		emp[0].setEmpNo(0);
		emp[0].setEmpName("고길동");
		emp[0].setDept("영업부");
		emp[0].setJob("팀장");
		emp[0].setAge(50);
		emp[0].setGender('M');
		emp[0].setSalary(2000000);
		emp[0].setBonusPoint(0.2);
		emp[0].setPhone("01011112222");
		emp[0].setAddress("쌍문동");
		
		
		emp[1].setDept("기획부");
		emp[1].setJob("부장");
		emp[1].setSalary(4000000);
		emp[1].setBonusPoint(0.3);
		
		System.out.println("==========================================");
		System.out.println("emp[0] : "+emp[0].information());
		System.out.println("emp[1] : "+emp[1].information());
		System.out.println("==========================================");
		// 직원 각각의 보너스가 적용된 1년 연봉을 계산하여 출력 
		// 연봉 = (급여 + (급여 * 보너스포인트)) * 12 
		int sum = 0;
		for(int i=0;i<emp.length; i++) {
			int sal = emp[i].getSalary();
			double bonus = emp[i].getBonusPoint();
			int sumSal = (int)(sal + (sal*bonus))*12;
			System.out.println(emp[i].getEmpName()+"님의 연봉 : "+sumSal+"원");
			sum+=sumSal;
		}
	
		// 3명의 직원의 연봉 평균을 구하여 출력  
		System.out.println("==========================================");
		System.out.println("직원들의 연봉 평균 : "+sum/3+"원");

	}

}
