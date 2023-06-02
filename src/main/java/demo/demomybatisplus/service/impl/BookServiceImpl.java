package demo.demomybatisplus.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;

import demo.common.CommonResponse;
import demo.demomybatisplus.mapper.BookMapper;
import demo.demomybatisplus.pojo.Book;
import demo.demomybatisplus.service.BookService;

@Service
public class BookServiceImpl extends ServiceImpl<BookMapper, Book> implements BookService {

    @Autowired
    private BookMapper bookMapper;

    @Override
    public CommonResponse getBooks() {
        return CommonResponse.success(bookMapper.selectList(null));
    }

}
