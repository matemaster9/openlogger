package cs.matemaster.openlogger.spring.boot.autoconfigure;

import lombok.Data;
import org.springframework.boot.context.properties.ConfigurationProperties;

/**
 * @Description:
 * @Author: MateMaster
 * @Date: 2022/2/20 1:42
 */
@Data
@ConfigurationProperties(prefix = OpenLoggerProperties.OPEN_LOGGER_PREFIX)
public class OpenLoggerProperties {
    public static final String OPEN_LOGGER_PREFIX = "openlogger";

    private MySQL mysql;

    @Data
    public static class MySQL {
        private String driverClassName;
        private String username;
        private String password;
        private String url;
    }
}
