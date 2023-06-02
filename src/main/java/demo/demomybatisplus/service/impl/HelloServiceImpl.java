package demo.demomybatisplus.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import demo.common.CommonResponse;
import demo.demomybatisplus.service.BookService;
import demo.demomybatisplus.service.HelloService;
import demo.demomybatisplus.service.UserService;
import demo.demomybatisplus.vo.BookAndUserVo;

@Service
public class HelloServiceImpl implements HelloService {

    @Autowired
    private BookService bookService;

    @Autowired
    private UserService userService;

    @Override
    @Transactional
    public CommonResponse getBooksAndUsers() {
        BookAndUserVo bookAndUserVo = new BookAndUserVo();
        bookAndUserVo.setBooks(bookService.list(null));
        bookAndUserVo.setUsers(userService.list(null));

        return CommonResponse.success(bookAndUserVo);
    }

    @Override
    public CommonResponse getBookAndUserById(Long bookId, Long userId) {
        // BookAndUserVo bookAndUserVo = new BookAndUserVo();
        // bookAndUserVo.setBook(bookService.getById(bookId));
        // bookAndUserVo.setUser(userService.getById(userId));

        // return CommonResponse.success(bookAndUserVo);

        return CommonResponse.success(new BookAndUserVo(null, null, bookService.getById(bookId),
                userService.getById(userId)));
    }

    @Override
    public CommonResponse getBooksByIds(List<Long> bookIds) {
        BookAndUserVo bookAndUserVo = new BookAndUserVo();
        if (bookIds != null) {
            bookAndUserVo.setBooks(bookService.listByIds(bookIds));
        }

        return CommonResponse.success(bookAndUserVo);
    }

}
