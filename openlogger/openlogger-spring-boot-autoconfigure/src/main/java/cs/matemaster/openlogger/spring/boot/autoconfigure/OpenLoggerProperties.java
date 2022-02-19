package cs.matemaster.openlogger.spring.boot.autoconfigure;

import org.springframework.boot.context.properties.ConfigurationProperties;

/**
 * @Description:
 * @Author: MateMaster
 * @Date: 2022/2/20 1:42
 */
@ConfigurationProperties(prefix = OpenLoggerProperties.OPEN_LOGGER_PREFIX)
public class OpenLoggerProperties {
    public static final String OPEN_LOGGER_PREFIX = "openlogger";
}
