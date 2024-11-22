package io.github.ropereralk.clean_code;

import io.github.ropereralk.clean_code.config.BeanLister;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.EnableAspectJAutoProxy;

@SpringBootApplication
@EnableAspectJAutoProxy
public class CleanCodeApplication {

	public static void main(String[] args) throws Exception {
		SpringApplication.run(CleanCodeApplication.class, args);
	}

}
