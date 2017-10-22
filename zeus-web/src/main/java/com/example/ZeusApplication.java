package com.example;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

/**
 * Created with zeus
 *
 * @author: yanbo
 * @date: Created in 2017/10/22 下午10:49
 * @description:
 */
@RestController
@SpringBootApplication
public class ZeusApplication {

    @RequestMapping("/")
    @ResponseBody
    public String home() {
        return "hello zeus! ";
    }

    public static void main(String[] args) {
        SpringApplication.run(ZeusApplication.class, args);
    }
}
