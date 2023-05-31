package demo.demomybatisplus;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
@MapperScan("demo.demomybatisplus.mapper")
public class DemoMybatisPlusApplication {

	public static void main(String[] args) {
		SpringApplication.run(DemoMybatisPlusApplication.class, args);
	}

}
