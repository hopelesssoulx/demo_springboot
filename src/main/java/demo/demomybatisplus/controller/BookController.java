package demo.demomybatisplus.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import demo.common.CommonResponse;
import demo.demomybatisplus.service.BookService;

@RestController
public class BookController {

    @Autowired
    private BookService bookService;

    @GetMapping("/getBooks")
    CommonResponse getBooks() {
        return bookService.getBooks();
    }
}
