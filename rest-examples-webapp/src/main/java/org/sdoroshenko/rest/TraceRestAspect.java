package org.sdoroshenko.rest;

import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.Signature;
import org.sdoroshenko.model.Message;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Component;

import java.text.SimpleDateFormat;
import java.time.Instant;
import java.util.Date;
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
                Date now = Date.from(Instant.now());
                SimpleDateFormat format = new SimpleDateFormat("dd-mm-yyyy hh:mm:ss");
                first.setPayload(first.getPayload() + " [Traced at: " + format.format(now) + "]");
            }
            return messages;
        } catch (Exception e) {
            logger.error("Error messages tracing", e);
        }
        return result;
    }
}
