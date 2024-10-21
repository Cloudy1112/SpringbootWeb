package vn.iotstar;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.web.servlet.FilterRegistrationBean;
import org.springframework.context.annotation.Bean;

import vn.iotstar.configs.CustomSiteMeshFilter;

@SpringBootApplication
public class Demo1Springboot3Application {

	//Đây là fle chjy đầu tiên
	public static void main(String[] args) {
		SpringApplication.run(Demo1Springboot3Application.class, args);
	}

	@Bean
	 public FilterRegistrationBean<CustomSiteMeshFilter> siteMeshFilter() {
	 FilterRegistrationBean<CustomSiteMeshFilter> filterRegistrationBean = new FilterRegistrationBean<CustomSiteMeshFilter>();
	 filterRegistrationBean.setFilter(new CustomSiteMeshFilter()); // adding sitemesh filter ??
	 filterRegistrationBean.addUrlPatterns("/*");
	 return filterRegistrationBean;
	 }  //Lệnh này tương đương filter trong wem.xml các file cũ
}
