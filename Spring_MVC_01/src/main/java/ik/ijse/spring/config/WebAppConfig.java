package ik.ijse.spring.config;


import ik.ijse.spring.bean.SpringBean;
import ik.ijse.spring.controller.ControllerOne;
import org.springframework.beans.factory.annotation.Configurable;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.config.annotation.EnableWebMvc;

@Configurable
@ComponentScan(basePackageClasses = {SpringBean.class, ControllerOne.class})
@EnableWebMvc
public class WebAppConfig {

}
