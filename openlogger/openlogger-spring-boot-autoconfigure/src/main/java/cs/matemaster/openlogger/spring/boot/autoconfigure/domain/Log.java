package cs.matemaster.openlogger.spring.boot.autoconfigure.domain;

import lombok.Data;

import java.io.Serializable;
import java.sql.Timestamp;
import java.time.LocalDateTime;

/**
 * @Description:
 * @Author: MateMaster
 * @Date: 2022/2/20 9:28
 */
@Data
public class Log implements Serializable {
    /**
     * 描述
     */
    private String description;

    /**
     * 方法名
     */
    private String method;

    /**
     * create time
     */
    private LocalDateTime createTime;
}
