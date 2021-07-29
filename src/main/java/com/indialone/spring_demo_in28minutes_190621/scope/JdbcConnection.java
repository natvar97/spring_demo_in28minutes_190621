package com.indialone.spring_demo_in28minutes_190621.scope;

import org.springframework.beans.factory.config.ConfigurableBeanFactory;
import org.springframework.context.annotation.Scope;
import org.springframework.context.annotation.ScopedProxyMode;
import org.springframework.stereotype.Component;

/*

    Here we have the jdbcConnection dependency in PersonDao
    if we give the @Scope with SCOPE_PROTYPE then it will not give the different object as normally in
    Bean class it will normal for Bean class for scope_protype

    but if we want to use bean class different dependency class then we want to use proxyMode in depedency class
    eg. JdbcConnection class we have used the proxymode as Targetclass

 */

@Component
@Scope(value = ConfigurableBeanFactory.SCOPE_PROTOTYPE, proxyMode = ScopedProxyMode.TARGET_CLASS)
public class JdbcConnection {

    public JdbcConnection() {
        System.out.println("this is the Jdbc Connection class");
    }
}
