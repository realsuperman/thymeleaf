package hello.itemservice;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.MessageSource;
import org.springframework.context.annotation.Bean;
import org.springframework.context.support.ResourceBundleMessageSource;

@SpringBootApplication
public class ItemServiceApplication {

	public static void main(String[] args) {
		SpringApplication.run(ItemServiceApplication.class, args);
	}

/* 아래의 빈을 등록시 스프링에서 사용하는 메시지 국제화 기능 사용 가능(단! 스프링 부트는 자동으로 등록해놨음)
	@Bean
	public MessageSource messageSource() {
		ResourceBundleMessageSource messageSource = new ResourceBundleMessageSource();
		messageSource.setBasenames("messages", "errors"); // 여러 파일 등록 가능
		messageSource.setDefaultEncoding("utf-8");
		return messageSource;
	}
*/
}
