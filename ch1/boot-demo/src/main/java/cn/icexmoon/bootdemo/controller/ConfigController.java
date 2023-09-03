package cn.icexmoon.bootdemo.controller;

import cn.icexmoon.bootdemo.properties.AuthorProperties;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * Created with IntelliJ IDEA.
 *
 * @author : 魔芋红茶
 * @version : 1.0
 * @Project : boot-demo
 * @Package : cn.icexmoon.bootdemo.controller
 * @ClassName : .java
 * @createTime : 2023/9/3 11:30
 * @Email : icexmoon@qq.com
 * @Website : https://icexmoon.cn
 * @Description :
 */
@RestController
@RequestMapping("/config")
public class ConfigController {
    @Autowired
    private AuthorProperties authorProperties;

    @GetMapping("/print")
    public void print(){
        System.out.println(authorProperties.getName());
        System.out.println(authorProperties.getAge());
        System.out.println(authorProperties.getHobbies());
    }
}
