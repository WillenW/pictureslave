package com.djk.pic.utils;

import org.springframework.beans.BeansException;
import org.springframework.context.ApplicationContext;
import org.springframework.context.ApplicationContextAware;
import org.springframework.stereotype.Component;

/**
 * @author dujinkai
 */
@Component
public class ApplicationContextHelper implements ApplicationContextAware {
    private static ApplicationContext appCtx;

    /**
     * 此方法可以把ApplicationContext对象inject到当前类中作为一个静态成员变量。
     *
     * @param applicationContext ApplicationContext 对象.
     * @throws org.springframework.beans.BeansException
     */
    @Override
    public void setApplicationContext(ApplicationContext applicationContext) throws BeansException {
        appCtx = applicationContext;
    }

    /**
     * 这是一个便利的方法，帮助我们快速得到一个BEAN
     *
     * @param beanName bean的名字
     * @return 返回一个bean对象
     */
    public static Object getBean(String beanName) {
        return appCtx.getBean(beanName);
    }

    /**
     * 这是一个便利的方法，帮助我们快速得到一个BEAN
     *
     * @param requiredType bean的类型
     * @return 返回一个bean对象
     */
    public static <T> T getBean(Class<T> requiredType) {
        return appCtx.getBean(requiredType);
    }
}