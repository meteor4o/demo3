package com.example.demo;

import java.net.Proxy;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.Period;
import java.time.ZonedDateTime;
import java.time.format.DateTimeFormatter;
import java.util.*;
import java.util.function.BinaryOperator;
import java.util.function.Predicate;
import java.util.function.Supplier;
import java.util.stream.Collectors;
import java.util.stream.IntStream;
import java.util.stream.Stream;

class A {};

public class Demo<T> {
//    private String name = "Fluffy";
//    {
//        System.out.println("setting field");
//    }
//    public Demo() {
//        name="tiny";
//        System.out.println("setting constructor");
//    }

//    <T> T method4(List<? extends T> list) {
//
//    }

    public static void main(String[] args) {
//        Demo demo = new Demo();
//
//        int x = 4;
//        if(x > 0) {
//            System.out.println("test");
//        }

//        LocalDate date = LocalDate.of(2022, 2, 9);
//        DateTimeFormatter f = DateTimeFormatter.ofPattern("d MMMM yyyy");
//        System.out.println(date.format(f));

//        String s = "Hello";
//        String t = new String(s);
//        if("Hello".equals(s)) System.out.println("one");
//        if(t == s) System.out.println("two");
//        if(t.equals(s)) System.out.println("three");
//        if("Hello" == s) System.out.println("four");
//        s += " world";
//
//        System.out.println(s);

//        String[] array = {"gerbil", "moose"};
//        List<String> list = Arrays.asList(array);
//
//        list.set(1, "pinko");
//        System.out.println(list.get(1));

//        List<Integer> testLIst = new ArrayList<>();
//        testLIst.add(5);
//        testLIst.add(3);
//        testLIst.add(0);
//        testLIst.add(3);
//        for (Integer integer : testLIst) {
//            System.out.println(integer);
//        }

//        Supplier<ArrayList<String>> s1 = ArrayList::new;
//        ArrayList<String> a1 = s1.get();
//        System.out.println(a1);

//        Predicate<String> p1 = String::isEmpty;
//        System.out.println(p1.test(""));
//        Predicate<String> pred = x -> Character.isLetter(x.charAt(0));

//        IntStream s = IntStream.of(1,2,5, 6, 9 ,12);
//        IntStream s2 = IntStream.iterate(1, x -> x +1);
//        s2
//                .limit(3)
//                        .forEach(System.out::println);
//        System.out.println(s.average().getAsDouble());
//        System.out.println(s.reduce(1, (a, b) -> a*b));
//        s.filter(integer -> integer > 5)
//                .sorted()
//                .limit(2)
//                .forEach(System.out::println);

//        Stream.generate(() -> "double")
//                .filter(t -> t.length() > 5)
//                .limit(2)
//                .sorted()
//                .forEach(System.out::print);

//        Stream<String> test = Stream.of("lion", "wolf", "tiger");
//        Map<Integer, String> map = test.collect(Collectors.toMap(
//                String::length, k -> k, (s1, s2) -> s1 + ", " + s2));
//        System.out.println(map);

//        List<String> s = Stream.iterate("1", (st) -> st + "2").limit(5).collect(Collectors.toList());
//        System.out.println(s);

        System.out.println(ZonedDateTime.now());

    }
}
