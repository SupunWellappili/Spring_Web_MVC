package lk.ijse.spring.config;

import org.springframework.beans.factory.annotation.Configurable;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.config.annotation.EnableWebMvc;
import org.springframework.web.servlet.mvc.Controller;

@Configuration
@ComponentScan(basePackages = "lk.ijse.spring")
@EnableWebMvc
public class WebAppConfig {


}
