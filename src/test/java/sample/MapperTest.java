package sample;

import com.fasterxml.jackson.databind.ObjectMapper;
import com.fasterxml.jackson.databind.util.JSONPObject;
import lombok.extern.log4j.Log4j2;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.soomgo.soomgo_project.domain.RequestVO;
import org.soomgo.soomgo_project.mappers.RequestMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit.jupiter.SpringExtension;

import java.sql.Timestamp;
import java.time.LocalDateTime;
import java.util.ArrayList;

@ExtendWith(SpringExtension.class)
@ContextConfiguration("file:src/main/webapp/WEB-INF/spring/root-context.xml")
@Log4j2
public class MapperTest {

    @Autowired(required = false)
    RequestMapper requestMapper;

    @Test
    public void testInsert() {
        RequestVO vo = new RequestVO();
        vo.setNewbie(1);
        vo.setRegDate(Timestamp.valueOf(LocalDateTime.now()));
        vo.setSub("[\"테스트\", \"제이슨\", \"트발\"]");
//        vo.setSub("test");

        int insert = requestMapper.insert(vo);
        log.info("insert 개수 : " + insert);

    }

    @Test
    public void select() {

        RequestVO requestVO = requestMapper.selectById(14);
        log.info(requestVO);
    }
}
