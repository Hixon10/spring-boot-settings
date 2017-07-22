package boot.settings.springbootsettings;

import org.springframework.stereotype.Service;

@Service
public class WorkService {

    @EnabledWorkService
    public String getSomeString(long a, long b, String c) {
        return "getSomeString method";
    }

    @EnabledWorkService
    public String getSomeAnotherString() {
        return "getSomeAnotherString method";
    }
}
