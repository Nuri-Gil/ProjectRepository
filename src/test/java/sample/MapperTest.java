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
    public void testMapper() {
        log.info(requestMapper);
    }

    @Test
    public void testInsert() {
        RequestVO vo = new RequestVO();
        vo.setWriter("1번 writer");
        vo.setRegDate(LocalDateTime.now());
//        vo.setRef("[\"테스트\", \"제이슨\", \"트발\"]");
        vo.setRef("test");

        int insert = requestMapper.insert(vo);
        log.info("insert 개수 : " + insert);
        log.info("id : " + vo.getId());

    }

    @Test
    public void testSelect() {
        int id = 8;
        log.info(requestMapper.select(id));
    }

    @Test
    public void testList() {
        requestMapper.getList().forEach(requestVO -> log.info(requestVO));
    }
}
