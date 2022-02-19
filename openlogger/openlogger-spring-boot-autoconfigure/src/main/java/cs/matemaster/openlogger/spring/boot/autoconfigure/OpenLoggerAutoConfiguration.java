package cs.matemaster.openlogger.spring.boot.autoconfigure;

import org.springframework.boot.context.properties.EnableConfigurationProperties;
import org.springframework.context.annotation.Configuration;

/**
 * @Description:
 * @Author: MateMaster
 * @Date: 2022/2/20 1:41
 */
@Configuration
@EnableConfigurationProperties({OpenLoggerProperties.class})
public class OpenLoggerAutoConfiguration {
}
