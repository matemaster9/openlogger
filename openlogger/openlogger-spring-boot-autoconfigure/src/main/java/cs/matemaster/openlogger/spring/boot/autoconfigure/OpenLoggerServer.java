package cs.matemaster.openlogger.spring.boot.autoconfigure;

import cs.matemaster.openlogger.spring.boot.autoconfigure.domain.Log;
import cs.matemaster.openlogger.spring.boot.autoconfigure.service.OpenLoggerService;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Component;

import java.util.List;

/**
 * @Description:
 * @Author: MateMaster
 * @Date: 2022/2/20 11:41
 */
@Component
@AllArgsConstructor
public class OpenLoggerServer {
    private final OpenLoggerService openLoggerService;

    public List<Log> getAllLogs() {
        return openLoggerService.getLogList();
    }
}
