package boot.settings.springbootsettings;

import org.springframework.stereotype.Service;

@Service
public class WorkService {

    private final Boolean isEnabled;

    public WorkService(MyProperties myProperties) {
        isEnabled = myProperties.isEnabled();
    }

    @EnabledService
    public String getSomeString(long a, long b, String c) {
        if (isEnabled) {
            return "HAHA" + a + c + b;
        }

        return "2";
    }
}
