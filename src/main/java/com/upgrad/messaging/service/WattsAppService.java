package com.upgrad.messaging.service;

import org.springframework.beans.factory.config.ConfigurableBeanFactory;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

@Component
@Scope(ConfigurableBeanFactory.SCOPE_PROTOTYPE)
public class WattsAppService implements MessageService{


    @Override
    public void send(String msg) {
        System.out.println("Whatsapp is sending message : " +msg);
    }
}
