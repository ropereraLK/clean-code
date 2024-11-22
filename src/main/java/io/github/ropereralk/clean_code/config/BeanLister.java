package io.github.ropereralk.clean_code.config;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.context.ApplicationContext;
import org.springframework.stereotype.Component;

@Component
public class BeanLister implements CommandLineRunner {

    @Autowired
    private ApplicationContext applicationContext;

    @Override
    public void run(String... args) throws Exception {
        String[] allBeanNames = applicationContext.getBeanDefinitionNames();
        System.out.println("List of all beans in the Spring ApplicationContext:");
        for (String beanName : allBeanNames) {
            System.out.println(beanName);
        }
    }
}