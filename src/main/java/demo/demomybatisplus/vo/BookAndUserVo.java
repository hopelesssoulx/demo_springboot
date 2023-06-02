package demo.demomybatisplus.vo;

import java.util.List;

import demo.demomybatisplus.pojo.Book;
import demo.demomybatisplus.pojo.User;
import lombok.Data;

@Data
public class BookAndUserVo {
    private List<Book> books;
    private List<User> users;
    private Book book;
    private User user;

    public BookAndUserVo() {
    }

    public BookAndUserVo(List<Book> books, List<User> users, Book book, User user) {
        this.books = books;
        this.users = users;
        this.book = book;
        this.user = user;
    }

}
