package main;

import java.util.*;
import java.util.stream.*;


public class Main {
    public static void main(String[] args) {
        List<Integer> list = Arrays.asList(5,23,6,0,12,123,6,5,1,99,3,4,1,2);
        System.out.println("Сумма: "+list.stream().reduce(0, Integer::sum) );
        IntSummaryStatistics a  = list.stream().mapToInt(Integer::intValue).summaryStatistics();
        System.out.println("Арифметикалык орточо мааниси: "+Math.floor(a.getAverage() ) );
        Set<Integer> items = new HashSet<>();
        System.out.println("Окшош сандар: "+list.stream().filter(n -> !items.add(n) ).collect(Collectors.toSet() ) );

    }
}