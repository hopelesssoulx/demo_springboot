package demo.demomybatisplus.service.impl;

import org.springframework.stereotype.Service;

import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;

import demo.common.CommonResponse;
import demo.demomybatisplus.mapper.BookMapper;
import demo.demomybatisplus.pojo.Book;
import demo.demomybatisplus.service.BookService;

@Service
public class BookServiceImpl extends ServiceImpl<BookMapper, Book> implements BookService {

    @Override
    public CommonResponse getBooks() {
        return CommonResponse.success(list(null));
    }

    @Override
    public CommonResponse addBook(Book book) {
        if (book != null) {
            return CommonResponse.success(save(book));
        }
        return CommonResponse.fail();
    }

    @Override
    public CommonResponse updateBook(Book book) {
        if (book != null) {
            return CommonResponse.success(updateById(book));
        }
        return CommonResponse.fail();
    }

    @Override
    public CommonResponse deleteBook(Long id) {
        return CommonResponse.success(baseMapper.deleteById(id));
    }
}
