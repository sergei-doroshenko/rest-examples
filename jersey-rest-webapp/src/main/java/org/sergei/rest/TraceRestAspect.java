package org.sergei.rest;

import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.Signature;
import org.sergei.model.Message;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Component;

import java.util.List;

/**
 * Aspect that traces messages.
 */
@Component
public class TraceRestAspect {

    private static final Logger logger = LoggerFactory.getLogger(TraceRestAspect.class);

    public Object trace(ProceedingJoinPoint joinPoint) throws Throwable {
        Signature signature = joinPoint.getSignature();
        String name = signature.getName();
        logger.info("Tracing [MessageResource.{}]", name);
        Object result = joinPoint.proceed();
        try {
            List<Message> messages = (List<Message>) result;
            if (!messages.isEmpty()) {
                Message first = messages.get(0);
                first.setPayload(first.getPayload() + " [traced]");
            }
            return messages;
        } catch (Exception e) {
            logger.error("Error messages tracing", e);
        }
        return result;
    }
}
