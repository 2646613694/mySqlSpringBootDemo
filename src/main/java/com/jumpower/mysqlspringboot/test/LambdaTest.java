package com.jumpower.mysqlspringboot.test;

import org.apache.commons.collections.MapUtils;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.function.*;
import java.util.stream.Collectors;
import java.util.stream.Stream;

import static java.util.stream.Collectors.summarizingDouble;
import static java.util.stream.Collectors.toList;

/**
 * @author  小可爱
 */
public class LambdaTest {
    public static void main(String[] args) {
   /*  List<String> list = Arrays.asList("1","2","3","4","4","4");
           list.forEach(e ->{
           if (e.startsWith("4")){
               System.out.println("进入了方法，值为"+e);
           }
        });*/


        //去重复
        //quChong(list);
        //求和

        System.out.println("总数的和是");

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

    /**
     * 其他杂七杂八
     */
    public static void QiTa(){
        String xka="我是牛逼哥";
        //用于检测字符串是否以指定的前缀开始
        boolean b = xka.startsWith("我");
        System.out.println(b);
        System.exit(0);
    }
    /**
     * 求和
     */
    public static  int qiuHe(int x,int y){
        Integer qiuHeResult = Stream.of(x, y).reduce(0, (xxx, hhh) -> xxx + hhh);
        return qiuHeResult;
    }


}
