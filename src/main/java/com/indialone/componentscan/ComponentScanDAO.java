package com.indialone.componentscan;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.config.ConfigurableBeanFactory;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Repository;

@Repository
@Scope(ConfigurableBeanFactory.SCOPE_PROTOTYPE)
public class ComponentScanDAO {

    @Autowired
    ComponentScanConnection componentScanConnection;

    public ComponentScanConnection getComponentScanConnection() {
        return componentScanConnection;
    }

    public void setComponentScanConnection(ComponentScanConnection componentScanConnection) {
        this.componentScanConnection = componentScanConnection;
    }
}
