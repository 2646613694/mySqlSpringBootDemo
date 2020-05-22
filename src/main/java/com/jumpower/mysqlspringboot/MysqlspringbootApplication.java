package com.jumpower.mysqlspringboot;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@MapperScan("com.jumpower.mysqlspringboot.mapper")
@SpringBootApplication
public class MysqlspringbootApplication {

    public static void main(String[] args) {
        SpringApplication.run(MysqlspringbootApplication.class, args);
        System.out.println("\n" +
                "  ━━━━━━神兽出没━━━━━━\n" +
                "  　　　┏┓　　　┏┓\n" +
                "  　　┏┛┻━━━┛┻┓\n" +
                "  　　┃　　　　　　　┃\n" +
                "  　　┃　　　━　　　┃\n" +
                "  　　┃　┳┛　┗┳　┃\n" +
                "  　　┃　　　　　　　┃\n" +
                "  　　┃　　　┻　　　┃\n" +
                "  　　┃　　　　　　　┃\n" +
                "  　　┗━┓　　　┏━┛\n" +
                "  　　　　┃　　　┃    神兽保佑,代码无bug   \n" +
                "  　　　　┃　　　┃\n" +
                "  　　　　┃　　　┗━━━┓\n" +
                "  　　　　┃　　　　　　　┣┓\n" +
                "  　　　　┃　　　　　　　┏┛\n" +
                "  　　　　┗┓┓┏━┳┓┏┛\n" +
                "  　　　　　┃┫┫　┃┫┫\n" +
                "  　　　　　┗┻┛　┗┻┛\n" +
                " \n" +
                "  ━━━━━━感觉萌萌哒━━━━━━");
        /*傻逼*/
    }

}
