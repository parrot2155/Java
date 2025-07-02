package com.silsub1;

import java.util.*;
import java.util.stream.Collectors;

public class Silsub01 {
    public static void main(String[] args) {

        Trader raoul = new Trader("kim", "Seoul");
        Trader mario = new Trader("lee", "Suwon");
        Trader alan = new Trader("park", "Busan");
        Trader brian = new Trader("choi", "Incheon");

        Map<String, Trader> traderMap = new HashMap<>();
        traderMap.put("kim", raoul);
        traderMap.put("lee", mario);
        traderMap.put("park", alan);
        traderMap.put("choi", brian);

        List<Transaction> transactions = Arrays.asList(
                new Transaction(traderMap.get("choi"), 2021, 500),
                new Transaction(traderMap.get("kim"), 2022, 1200),
                new Transaction(traderMap.get("kim"), 2021, 300),
                new Transaction(traderMap.get("lee"), 2022, 620),
                new Transaction(traderMap.get("lee"), 2022, 810),
                new Transaction(traderMap.get("park"), 2022, 990)
        );

        // 1
        System.out.println("1. 2021년에 일어난 트랜잭션 (값 오름차순):");
        transactions.stream()
                .filter(t -> t.getYear() == 2021)
                .sorted(Comparator.comparingInt(Transaction::getValue))
                .forEach(System.out::println);

        // 2
        System.out.println("\n2. 2022년에 일어난 트랜잭션 (값 오름차순):");
        transactions.stream()
                .filter(t -> t.getYear() == 2022)
                .sorted(Comparator.comparingInt(Transaction::getValue))
                .forEach(System.out::println);

        // 3
        System.out.println("\n3. 거래자 근무 도시 (중복 없이):");
        transactions.stream()
                .map(t -> t.getTrader().getCity())
                .distinct()
                .forEach(System.out::println);

        // 4
        System.out.println("\n4. 서울에서 근무하는 거래자 (이름순):");
        transactions.stream()
                .map(Transaction::getTrader)
                .filter(trader -> "Seoul".equals(trader.getCity()))
                .distinct()
                .sorted(Comparator.comparing(Trader::getName))
                .forEach(System.out::println);

        // 5
        System.out.println("\n5. 모든 거래자 이름 알파벳 순:");
        transactions.stream()
                .map(t -> t.getTrader().getName())
                .distinct()
                .sorted()
                .forEach(System.out::println);

        // 6
        System.out.println("\n6. 인천에 거래자가 있는가?");
        boolean incheonTrader = transactions.stream()
                .anyMatch(t -> "Incheon".equals(t.getTrader().getCity()));
        System.out.println(incheonTrader);

        // 7
        System.out.println("\n7. 수원 거주 거래자의 트랜잭션 값:");
        transactions.stream()
                .filter(t -> "Suwon".equals(t.getTrader().getCity()))
                .map(Transaction::getValue)
                .forEach(System.out::println);

        // 8
        System.out.println("\n8. 전체 트랜잭션 중 최대 value:");
        transactions.stream()
                .mapToInt(Transaction::getValue)
                .max()
                .ifPresent(System.out::println);
    }
}
