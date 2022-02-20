package cs.matemaster.openlogger.spring.boot.autoconfigure.mapper;

import cs.matemaster.openlogger.spring.boot.autoconfigure.domain.Log;
import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.annotations.Select;

import java.util.List;

/**
 * @Description:
 * @Author: MateMaster
 * @Date: 2022/2/20 9:29
 */
public interface LogMapper {

    /**
     * insert record into table
     *
     * @param log
     * @return
     */
    @Insert("insert into tb_log (description, method, create_time) values(l.description, l.method, now()) ")
    Integer insert(@Param("l") Log log);

    /**
     * select all
     * @return
     */
    @Select("select description, method, create_time from tb_log")
    List<Log> queryAllLogs();
}
