package ik.ijse.spring.controller;

import org.springframework.beans.BeansException;
import org.springframework.beans.factory.*;
import org.springframework.context.ApplicationContext;
import org.springframework.context.ApplicationContextAware;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/controllerOne")
public class ControllerOne implements BeanNameAware, BeanFactoryAware, ApplicationContextAware, InitializingBean, DisposableBean
{

    public ControllerOne() {
        System.out.println("Controller One Instantiated");
    }

    @GetMapping
    public void testMethod(){
        System.out.println("Request Receive");
    }

    @Override
    public void setBeanFactory(BeanFactory beanFactory) throws BeansException {
        System.out.println("Spring Bean One Factory Aware");

    }

    @Override
    public void setBeanName(String name) {
        System.out.println("Spring Bean One Name Aware");

    }

    @Override
    public void destroy() throws Exception {
        System.out.println("Spring Bean One Disposable Aware");

    }

    @Override
    public void afterPropertiesSet() throws Exception {
        System.out.println("Spring Bean One Initializer ");

    }

    @Override
    public void setApplicationContext(ApplicationContext applicationContext) throws BeansException {
        System.out.println("Spring Bean One Application context Aware");

    }
}
