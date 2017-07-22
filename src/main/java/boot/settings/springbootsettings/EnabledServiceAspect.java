package boot.settings.springbootsettings;

import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.Around;
import org.aspectj.lang.annotation.Aspect;
import org.springframework.context.annotation.Configuration;

@Configuration
@Aspect
public class EnabledServiceAspect {
    @Around("@annotation(boot.settings.springbootsettings.EnabledService)")
    public Object logExecutionTime(ProceedingJoinPoint joinPoint) throws Throwable {
        long start = System.currentTimeMillis();

        Object proceed = joinPoint.proceed();

        return "1234";

//        long executionTime = System.currentTimeMillis() - start;
//
//        System.out.println(joinPoint.getSignature() + " executed in " + executionTime + "ms");
//        return proceed;
    }
}
