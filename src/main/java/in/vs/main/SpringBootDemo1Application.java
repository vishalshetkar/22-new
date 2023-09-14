package in.vs.main;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class SpringBootDemo1Application {

	public static void main(String[] args) {
		System.out.println("-------------start app----------------");
		SpringApplication.run(SpringBootDemo1Application.class, args);
		System.out.println("-------------start end----------------");
	}

}
