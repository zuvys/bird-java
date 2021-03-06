package com.bird.eventbus;

import com.bird.eventbus.arg.IEventArg;
import com.bird.eventbus.register.IEventRegister;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

/**
 * 事件总线
 */
@Component
public class EventBus {

    @Autowired(required = false)
    private IEventRegister eventRegister;

    /**
     * 向EventBus中推消息
     */
    public void push(IEventArg eventArg){
        eventRegister.regist(eventArg);
    }
}
