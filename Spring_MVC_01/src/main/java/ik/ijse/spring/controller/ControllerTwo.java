package ik.ijse.spring.controller;

import org.springframework.beans.BeansException;
import org.springframework.beans.factory.*;
import org.springframework.context.ApplicationContext;
import org.springframework.context.ApplicationContextAware;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/two") //Handle Mapping
public class ControllerTwo implements BeanNameAware, BeanFactoryAware, ApplicationContextAware, InitializingBean, DisposableBean {

    public ControllerTwo() {
        System.out.println("Controller Two Instantiated");
    }

    @GetMapping //Mapping Methods/Handler Methods
    public String testTwo(){
        return "Hello Spring";
    }

    @Override
    public void setBeanFactory(BeanFactory beanFactory) throws BeansException {
        System.out.println("Spring Bean Two Factory Aware");
    }

    @Override
    public void setBeanName(String name) {
        System.out.println("Spring Bean Two Name Aware");

    }

    @Override
    public void destroy() throws Exception {
        System.out.println("Spring Bean Two Disposable ");

    }

    @Override
    public void afterPropertiesSet() throws Exception {
        System.out.println("Spring Bean Two  Initializer");

    }

    @Override
    public void setApplicationContext(ApplicationContext applicationContext) throws BeansException {
        System.out.println("Spring Bean Two Application Context Aware");

    }
}
