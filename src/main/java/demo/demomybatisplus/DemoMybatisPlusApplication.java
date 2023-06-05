package demo.demomybatisplus;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

@SpringBootApplication
@MapperScan("demo.demomybatisplus.mapper")
@ComponentScan("demo")
public class DemoMybatisPlusApplication {

	public static void main(String[] args) {
		SpringApplication.run(DemoMybatisPlusApplication.class, args);
	}

}
