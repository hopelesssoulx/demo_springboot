package demo.demomybatisplus.service;

import java.util.List;

import demo.common.CommonResponse;

public interface HelloService {

    CommonResponse getBooksAndUsers();

    CommonResponse getBookAndUserById(Long bookId, Long userId);

    CommonResponse getBooksByIds(List<Long> bookIds);
}
