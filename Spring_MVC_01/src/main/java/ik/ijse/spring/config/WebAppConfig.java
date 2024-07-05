package ik.ijse.spring.config;


import ik.ijse.spring.controller.ControllerOne;
import org.springframework.beans.factory.annotation.Configurable;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.web.servlet.ViewResolver;
import org.springframework.web.servlet.config.annotation.EnableWebMvc;
import org.springframework.web.servlet.config.annotation.ResourceHandlerRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;
import org.springframework.web.servlet.view.InternalResourceViewResolver;


@Configurable
@ComponentScan(basePackageClasses = { ControllerOne.class})
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
