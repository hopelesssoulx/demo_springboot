package demo.demomybatisplus.pojo;

import demo.common.BaseEntity;
import lombok.Data;

@Data
public class Book extends BaseEntity {

    private String name;

    public Book() {

    }

    public Book(String name) {
        this.name = name;
    }

}
