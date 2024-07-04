package ik.ijse.spring;

import ik.ijse.spring.config.WebAppConfig;
import ik.ijse.spring.config.WebRootConfig;
import org.springframework.beans.BeansException;
import org.springframework.beans.factory.*;
import org.springframework.context.ApplicationContext;
import org.springframework.context.ApplicationContextAware;
import org.springframework.web.servlet.support.AbstractAnnotationConfigDispatcherServletInitializer;

public class WebAppInitializer extends AbstractAnnotationConfigDispatcherServletInitializer implements BeanNameAware, BeanFactoryAware, ApplicationContextAware,InitializingBean, DisposableBean {
    @Override
    protected Class<?>[] getRootConfigClasses() {
        return new Class[]{WebRootConfig.class};
    }

    @Override
    protected Class<?>[] getServletConfigClasses() {
        return new Class[]{WebAppConfig.class};
    }

    @Override
    protected String[] getServletMappings() {
        return new String[]{"/"};
    }


    public WebAppInitializer() {
        System.out.println("Web App Instantiated.......");
    }

    @Override
    public void setBeanFactory(BeanFactory beanFactory) throws BeansException {
        System.out.println("Web App Bean Factory");
    }

    @Override
    public void setBeanName(String name) {
        System.out.println("Web App Bean Name");

    }

    @Override
    public void destroy() throws Exception {
        System.out.println("Web App Bean Deployments");

    }

    @Override
    public void afterPropertiesSet() throws Exception {
        System.out.println("Web App Bean Initializer");
    }

    @Override
    public void setApplicationContext(ApplicationContext applicationContext) throws BeansException {
        System.out.println("Web App Bean Application Context");

    }
}
