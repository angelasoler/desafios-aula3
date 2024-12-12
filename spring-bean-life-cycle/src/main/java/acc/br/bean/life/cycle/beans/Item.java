package acc.br.bean.life.cycle.beans;

import org.springframework.beans.BeansException;
import org.springframework.context.ApplicationContext;
import org.springframework.context.ApplicationContextAware;
import org.springframework.beans.factory.*;


import jakarta.annotation.PostConstruct;
import jakarta.annotation.PreDestroy;

public class Item implements BeanNameAware, ApplicationContextAware, InitializingBean, DisposableBean, BeanFactoryAware {
    private String name;
    private String beanName;
    private ApplicationContext applicationContext;

    private BeanFactory beanFactory;

    public Item(String name) {
        System.out.println("1. Instantiation: A new item has been created.");
        this.name = name;
    }

    public String getName() {
        return name;
    }

    @Override
    public void setBeanName(String name) {
        System.out.println("2. BeanNameAware: Setting bean name: " + name);
        this.beanName = name;
    }

    @Override
    public void setApplicationContext(ApplicationContext applicationContext) throws BeansException {
        System.out.println("4. ApplicationContextAware: Setting application context.");
        this.applicationContext = applicationContext;
    }

    @Override
    public void setBeanFactory(BeanFactory beanFactory) throws BeansException {
        this.beanFactory = beanFactory;
        System.out.println("3. BeanFactoryAware: Setting bean factory for " + getName());
    }

    @Override
    public void afterPropertiesSet() throws Exception {
        System.out.println("7. Initialization: " + getName() + " is undergoing intensive training.");
    }

    @Override
    public void destroy() throws Exception {
        System.out.println("11. DisposableBean: " + getName() + " is saying goodbye and resting.");
        restAndRecover();
    }

    public void customInit() {
        System.out.println("8. Custom Initialization: Executing custom init for " + getName());
    }

    public void customDestroy() {
        System.out.println("13. Custom Destruction: " + getName() + " is bidding farewell and performing a final action.");

    }

    private void restAndRecover() {
        System.out.println("12. DisposableBean: " + getName() + " is resting and recovering energy.");
    }

    @PostConstruct
    public void init() {
        System.out.println("6. @PostConstruct: " + getName() + " is preparing for action.");
    }

    @PreDestroy
    public void preDestroy() {
        System.out.println("10. @PreDestroy: " + getName() + " is saying goodbye and preparing to rest.");
    }
}
