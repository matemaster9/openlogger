package cs.matemaster.openlogger.spring.boot.autoconfigure.config;

import cs.matemaster.openlogger.spring.boot.autoconfigure.OpenLoggerProperties;
import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.autoconfigure.jdbc.DataSourceProperties;
import org.springframework.boot.context.properties.EnableConfigurationProperties;
import org.springframework.boot.jdbc.DataSourceBuilder;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import javax.annotation.PostConstruct;
import javax.sql.DataSource;

/**
 * @Description:
 * @Author: MateMaster
 * @Date: 2022/2/20 10:41
 */
@Configuration
@EnableConfigurationProperties({OpenLoggerProperties.class})
@MapperScan(basePackages = "cs.matemaster.openlogger.spring.boot.autoconfigure.mapper")
public class MySQLDataSourceConfig {
    private String driverClassName;
    private String username;
    private String password;
    private String url;

    private final OpenLoggerProperties properties;

    public MySQLDataSourceConfig(OpenLoggerProperties properties) {
        this.properties = properties;
    }

    @PostConstruct
    public void MySQLConfig() {
        driverClassName = properties.getMysql().getDriverClassName();
        username = properties.getMysql().getUsername();
        password = properties.getMysql().getPassword();
        url = properties.getMysql().getUrl();
    }

    @Bean
    public DataSource mysqlDataSource() {
        DataSourceProperties dataSourceProperties = new DataSourceProperties();
        dataSourceProperties.setDriverClassName(driverClassName);
        dataSourceProperties.setUsername(username);
        dataSourceProperties.setPassword(password);
        dataSourceProperties.setUrl(url);
        return DataSourceBuilder.create().build();
    }
}
