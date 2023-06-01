package demo.demomybatisplus.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import demo.common.CommonResponse;

@RestController
public class HelloController {

    @GetMapping("/hello")
    CommonResponse hello() {
        return CommonResponse.success("hello");
    }
}
