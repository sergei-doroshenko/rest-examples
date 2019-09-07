package org.sergei.rest;

import org.aspectj.lang.ProceedingJoinPoint;
import org.sergei.model.Message;
import org.springframework.stereotype.Component;

import java.util.List;

/**
 * Aspect that traces messages.
 */
@Component
public class TraceRestAspect {

    public Object trace(ProceedingJoinPoint joinpoint) throws Throwable {
        Object result = joinpoint.proceed();
        try {
            List<Message> messages = (List<Message>) result;
            if (!messages.isEmpty()) {
                Message first = messages.get(0);
                first.setPayload(first.getPayload() + " [traced]");
            }
            return messages;
        } catch (Exception e) {
            e.printStackTrace();
        }
        return result;
    }
}
