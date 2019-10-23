package com.jumpower.mysqlspringboot.test;

import org.apache.commons.collections.MapUtils;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.function.DoubleToIntFunction;
import java.util.function.DoubleToLongFunction;
import java.util.function.IntBinaryOperator;
import java.util.function.IntToDoubleFunction;
import java.util.stream.Stream;

public class test {
    public static void main(String[] args) {
      /*  List<String> list = Arrays.asList("1","2","3","4");
        list.stream().forEach(e ->{
            System.out.println(e);
        });*/

        IntBinaryOperator tComparator = (x, y) -> x - y;
        int i = tComparator.applyAsInt(10, 99);
        System.out.println(i);


    }
}
