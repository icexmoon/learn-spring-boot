package cn.icexmoon.codegendemo;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
@MapperScan("cn.icexmoon.codegendemo.*.mapper")
public class CodeGenDemoApplication {

    public static void main(String[] args) {
        SpringApplication.run(CodeGenDemoApplication.class, args);
    }

}
