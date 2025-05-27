package com.chap05_date.run;

import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.GregorianCalendar;
import java.util.TimeZone;

public class Run {
	
	/* Date : 기준 1970년 1월 1일 0시 0분 0초 ,ms단위 //우리나라KST적용되어 9시로 나온다.
	 * Calender
	 * GregorianCalender
	 * 전부 java.util패키지 안에 들어있다.
	 * 
	 * 
	 */

	public static void main(String[] args) {
		Date oriTime = new Date();
		oriTime = new Date();//70년 1월 1일
		System.out.println(oriTime);
		oriTime = new Date(1000L); //최초값에서 1초 흐른 시간.
		System.out.println(oriTime);
		System.out.println(oriTime.toGMTString()); //그리니치 표준시
		
		Date toDay = new Date();
		
		//원하는 패턴으로 출력
		//SimpleDateFormat을 사용할거임
		SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd hh:mm:ss");//Month와 minute은 대소문자 구분 필수.
		System.out.println(sdf.format(toDay)); //원하는 형식의 string값으로 바꿔준다.
		
		System.out.println("--------------캘린더--------------");
		//월은 -1해서 관리한다.
		//필드넘버 개념
		
		Calendar calendar = Calendar.getInstance();
		System.out.println(calendar);
		
		//수정
		calendar.set(2022, 1, 22);
		System.out.println(calendar);
		
		int year = calendar.get(1); //저장되어있는 애들 중에 필드 넘버 1(년도)을 가져온다. 
		int month = calendar.get(Calendar.MONTH)+1;
		int date = calendar.get(Calendar.DATE);
		System.out.println(year+"년 "+ month +"월 "+date+"일");
		
		//SimpleDateFormat
		System.out.println(calendar.getTime());
		System.out.println(calendar.getTimeInMillis());
		SimpleDateFormat sd = new SimpleDateFormat("yyyy-MM-dd hh:mm:ss");
		System.out.println(sd.format(calendar.getTime()));
		
		sd.setTimeZone(TimeZone.getTimeZone("Etc/Greenwich"));
		System.out.println(sd.format(calendar.getTime()));
		
//		for(String name:TimeZone.getAvailableIDs()) {
//			System.out.println(name);
//		}
		
		System.out.println("------------------그레고리안");
		GregorianCalendar gc = new GregorianCalendar();
		System.out.println(gc.getTime());
		
		System.out.println(gc.get(GregorianCalendar.YEAR));
		System.out.println(gc.get(Calendar.HOUR_OF_DAY));
		
		System.out.println(gc.isLeapYear(2024)); //윤년인지 확인
		
		
		
		
		
		
		
		
		
		
		
		
	}

	
	
	
	
	
}












