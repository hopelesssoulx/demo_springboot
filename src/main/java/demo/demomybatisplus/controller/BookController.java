package demo.demomybatisplus.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import demo.common.CommonResponse;
import demo.demomybatisplus.pojo.Book;
import demo.demomybatisplus.service.BookService;

@RestController
public class BookController {

    @Autowired
    private BookService bookService;

    @GetMapping("/getBooks")
    CommonResponse getBooks() {
        return bookService.getBooks();
    }

    @PostMapping("/addBook")
    CommonResponse addBook(@RequestBody Book book) {
        return bookService.addBook(book);
    }

    @PutMapping("/updateBook")
    CommonResponse updateBook(@RequestBody Book book) {
        return bookService.updateBook(book);
    }

    @DeleteMapping("/deleteBook")
    CommonResponse deleteBook(@RequestParam(required = true) Long id) {
        return bookService.deleteBook(id);
    }
}
