package cs.matemaster.openlogger.spring.boot.autoconfigure;

import cs.matemaster.openlogger.spring.boot.autoconfigure.config.MySQLDataSourceConfig;
import org.springframework.boot.context.properties.EnableConfigurationProperties;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Import;

/**
 * @Description:
 * @Author: MateMaster
 * @Date: 2022/2/20 1:41
 */
@Configuration
@EnableConfigurationProperties({OpenLoggerProperties.class})
@Import({MySQLDataSourceConfig.class})
public class OpenLoggerAutoConfiguration {
}
