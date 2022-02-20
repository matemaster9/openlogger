package cs.matemaster.openlogger.spring.boot.autoconfigure.service.impl;

import cs.matemaster.openlogger.spring.boot.autoconfigure.domain.Log;
import cs.matemaster.openlogger.spring.boot.autoconfigure.mapper.LogMapper;
import cs.matemaster.openlogger.spring.boot.autoconfigure.service.OpenLoggerService;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

/**
 * @Description:
 * @Author: MateMaster
 * @Date: 2022/2/20 9:30
 */
@Service
@AllArgsConstructor
public class OpenLoggerServiceImpl implements OpenLoggerService {

    private LogMapper mapper;

    @Override
    public void save(Log log) {
        if (Objects.isNull(log)) {
            return;
        }
        mapper.insert(log);
    }

    @Override
    public List<Log> getLogList() {
        List<Log> logs = mapper.queryAllLogs();
        return Objects.isNull(logs) ? new ArrayList<>() : logs;
    }
}
