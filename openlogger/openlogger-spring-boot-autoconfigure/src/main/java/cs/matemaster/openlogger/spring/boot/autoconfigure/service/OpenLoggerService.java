package cs.matemaster.openlogger.spring.boot.autoconfigure.service;

import cs.matemaster.openlogger.spring.boot.autoconfigure.domain.Log;
import org.apache.ibatis.annotations.Insert;

import java.util.List;

/**
 * @Description:
 * @Author: MateMaster
 * @Date: 2022/2/20 9:29
 */
public interface OpenLoggerService {

    /**
     * insert record into table
     *
     * @param log
     */
    void save(Log log);

    /**
     * get log list
     * @return
     */
    List<Log> getLogList();
}
