package com.test04;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.IntStream;
import java.util.stream.Stream;

public class MTest {

	public static void main(String[] args) {
		//스트림(Stream)
		//컬렉션 데이터를 함수형으로 처리하는 API
		//필터링,매핑,집계 등의 작업을 for,if 등을 생략한채로 가능하다.
		
		List<Integer> numbers = Arrays.asList(1,2,3,4,5,6);
		System.out.println(numbers);
		
		numbers.stream()
				.filter(n->n%2==0)
				.forEach(System.out::println);
		
		//filter() : 스트림에서 뽑아져 나오는 데이터에서 특정 데이터만 골라내는 역할
		//			 매개변수로 boolean값을 리턴하는 람다식을 넣어준다.
		//collect() : 처리 결과가 Stream인 데이터드릉ㄹ 다시 Collectionr객체로 반환해주는 기능
		List<String> p = Arrays.asList("홍길동","이순신","김창진","박창진","강창진");
		List<String> jin = p.stream().filter(name->name.contains("진")).collect(Collectors.toList());
		System.out.println(jin);
		
		
		
		//map() : 요소들을 특정 조건에 해당하는 값으로 변환해준다
		
		List<String> w = Arrays.asList("java","html","css","javascript");
		
		List<String> res = w.stream().map(String::toUpperCase).collect(Collectors.toList());
		System.out.println("res: "+res);
		System.out.println("w: "+w);
		
		//10보다 작은 숫자만 (filter,boolean값 리턴)제곱해서 (map,변환값을 리턴) 리스트로(collect)만들자
		List<Integer> num = Arrays.asList(2,6,7,8,9,12,18,22);
		List<Integer> numRes = num.stream()
								  .filter(n->n<10)
								  .map(n->n*n)
								  .collect(Collectors.toList());
		System.out.println(numRes);
		
		//count() : 요소의 개수를 세어준다.
		w.stream().filter(word->word.contains("t")).count();
		System.out.println(w.stream().filter(word->word.contains("t")).count());
		
		//1~45까지의 숫자를 랜덤으로 6개 추출한 리스트 생성해보기
		//generate() 순서없는 무한한 스트림 생성
		//limit() 제한걸어주기
		List<Integer> lotto = Stream
								.generate(()->(int)(Math.random()*45)+1)
								.distinct()
								.limit(6)
								.sorted()
								.collect(Collectors.toList());
		
		lotto.forEach(System.out::println);  //'파이프라인으로 구성되었다'고 표현하기도 함.
		
		
		//antMatch() : 조건과 일치하는 내용이 있는지 확인한다. + allMatch(), noneMatch()이런 애들도 존재한다.
		boolean tf = num.stream().anyMatch(n->n%3==0);
		System.out.println("3의 배수 존재여부 : "+tf);
		
		tf = num.stream().anyMatch(n->n%5==0);
		System.out.println("5의 배수 존재여부 : "+tf);
		
		//스트림을 생성
		Stream<String> s01 = Stream.empty();//비어있는 스트림 생성
		//builder : 직접 원하는 값을 넣으 수 있다.
		Stream<String> s02 = Stream.<String>builder().add("Hello").add("Java").add("Oracle").build();
		s02.forEach(System.out::println);
		
		/*정수만 처리하는 함수*/
		IntStream rn01 = IntStream.range(1,10)//1에서 9까지
									.skip(3)//처음 3개 건너뛰기
									.limit(5);
		rn01.forEach(System.out::println);
		
		IntStream.rangeClosed(1, 10)//1부터 10까지
					.forEach(System.out::println);
		
	}

}














