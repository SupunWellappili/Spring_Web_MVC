package ik.ijse.spring.config;


import ik.ijse.spring.controller.ControllerOne;
import ik.ijse.spring.controller.ControllerTwo;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.ViewResolver;
import org.springframework.web.servlet.config.annotation.EnableWebMvc;
import org.springframework.web.servlet.config.annotation.ResourceHandlerRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;
import org.springframework.web.servlet.view.InternalResourceViewResolver;


@Configuration
@ComponentScan(basePackageClasses = {ControllerOne.class, ControllerTwo.class})
@EnableWebMvc
public class WebAppConfig implements WebMvcConfigurer {


    //view/index.html
    //view/customer.html
    @Bean
    public ViewResolver viewResolver(){
        InternalResourceViewResolver v = new InternalResourceViewResolver();
        v.setPrefix("/WEB-INF/view/");
        v.setSuffix(".html");
        v.setOrder(2);
        return v;
    }

    @Override
    public void addResourceHandlers(ResourceHandlerRegistry registry) {
        registry.addResourceHandler("/WEB-INF/view/**").addResourceLocations("/WEB-INF/view/");
    }
}
