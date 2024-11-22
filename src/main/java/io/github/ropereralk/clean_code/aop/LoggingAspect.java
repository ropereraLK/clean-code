package io.github.ropereralk.clean_code.aop;

import org.aspectj.lang.annotation.Aspect;
import org.springframework.stereotype.Component;
import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.annotation.*;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

@Aspect
@Component
public class LoggingAspect {
    private static final Logger LOGGER = LogManager.getLogger(LoggingAspect.class);

    // Define a pointcut: Before execution
    @Before("execution(* io.github.ropereralk.clean_code.aop.controller..*(..))")
    public void logBeforeMethod(JoinPoint joinPoint) {
        Object[] args = joinPoint.getArgs();

        StringBuilder logMessage = new StringBuilder();
        logMessage.append("Executing [")
                .append(joinPoint.getTarget().getClass().getSimpleName())
                .append(".").append(joinPoint.getSignature().getName())
                .append("] Args: ");

        if (args.length > 0) {

            for (Object arg : args) {
                logMessage.append(arg).append(", ");
            }

        } else {
            logMessage.append("No args.");
        }

        LOGGER.info(logMessage);
    }


    @AfterThrowing(pointcut = "execution(* io.github.ropereralk.clean_code.aop.controller..*(..))", throwing = "exception")
    public void logAfterThrowing(JoinPoint joinPoint, Throwable exception) {
        LOGGER.error("Exception in method: {}, Message: {}", joinPoint.getSignature().getName(),  exception.getMessage());

    }

}
