package com.jumpower.mysqlspringboot.test;

import org.apache.commons.collections.MapUtils;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.function.DoubleToIntFunction;
import java.util.function.DoubleToLongFunction;
import java.util.function.IntBinaryOperator;
import java.util.function.IntToDoubleFunction;
import java.util.stream.Collectors;
import java.util.stream.Stream;

import static java.util.stream.Collectors.toList;

/**
 * @author  小可爱
 */
public class Lambdatest {
    public static void main(String[] args) {
       List<String> list = Arrays.asList("1","2","3","4","4","4");
        list.stream().forEach(e ->{
            System.out.println(e);
        });

        //去重复
        //quChong(list);


     /* //xy的值等于x-yj
        IntBinaryOperator tComparator = (x, y) -> x - y;
        int i = tComparator.applyAsInt(10, 99);
        System.out.println(i);*/


    }

    /**
     * 去掉重复的字母或者数字
     * @param list
     * @return
     */
    public static String quChong(List<String> list){
        String s = list.stream().distinct().collect(Collectors.joining(","));
        System.out.println("去掉重复字后的数字有"+s);
        return  s;
    }

}
