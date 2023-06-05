package demo.demomybatisplus.service;

import com.baomidou.mybatisplus.extension.service.IService;

import demo.common.CommonResponse;
import demo.demomybatisplus.pojo.Book;

public interface BookService extends IService<Book> {
    CommonResponse getBooks();

    CommonResponse addBook(Book book);

    CommonResponse updateBook(Book book);

    CommonResponse deleteBook(Long id);
}
