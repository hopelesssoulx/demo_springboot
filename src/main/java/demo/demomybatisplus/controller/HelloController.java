package demo.demomybatisplus.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import demo.common.CommonResponse;
import demo.demomybatisplus.service.HelloService;

@RestController
public class HelloController {

    @Autowired
    private HelloService helloService;

    @GetMapping("/hello")
    CommonResponse hello() {
        return CommonResponse.success("hello");
    }

    @GetMapping("/getBooksAndUsers")
    CommonResponse getBooksAndUsers() {
        return helloService.getBooksAndUsers();
    }

    @GetMapping("/getBookAndUserById")
    CommonResponse getBookAndUserById(@RequestParam(required = false, value = "bookId") Long bookId,
            @RequestParam(required = false, value = "userId") Long userId) {
        return helloService.getBookAndUserById(bookId, userId);
    }

    @GetMapping("/getBooksByIds")
    CommonResponse getBooksByIds(@RequestBody(required = false) List<Long> bookIds) {
        return helloService.getBooksByIds(bookIds);
    }
}
