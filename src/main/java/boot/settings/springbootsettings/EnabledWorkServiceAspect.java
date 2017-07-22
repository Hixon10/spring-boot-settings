package boot.settings.springbootsettings;

import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.Around;
import org.aspectj.lang.annotation.Aspect;
import org.springframework.context.annotation.Configuration;

@Configuration
@Aspect
public class EnabledWorkServiceAspect {

    private final Boolean isEnabled;

    public EnabledWorkServiceAspect(MyProperties myProperties) {
        isEnabled = myProperties.isEnabled();
    }

    @Around("@annotation(boot.settings.springbootsettings.EnabledWorkService)")
    public Object logExecutionTime(ProceedingJoinPoint joinPoint) throws Throwable {
        if (isEnabled) {
            return joinPoint.proceed();
        }

        System.out.println("Skipping execution of method: method=" + joinPoint.toShortString());
        return null;
    }
}
