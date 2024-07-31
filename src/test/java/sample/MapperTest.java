package sample;

import lombok.extern.log4j.Log4j2;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.soomgo.soomgo_project.domain.RequestVO;
import org.soomgo.soomgo_project.mappers.RequestMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit.jupiter.SpringExtension;

import java.time.LocalDateTime;

@ExtendWith(SpringExtension.class)
@ContextConfiguration("file:src/main/webapp/WEB-INF/spring/root-context.xml")
@Log4j2
public class MapperTest {

    @Autowired(required = false)
    RequestMapper requestMapper;

    @Test
    public void testInsert() {
        RequestVO requestVO = new RequestVO();

        requestVO.setReq_newbie("1");
        requestVO.setReq_regDate(LocalDateTime.now());
        requestVO.setReq_sort("서비스 항목");
        requestVO.setReq_type("상세 항목");
        requestVO.setReq_ref("newbie");

        log.info("COUNT : " + requestMapper.insert(requestVO)); // 몇개가 추가 되었나? -> 1
        log.info("ID : " + requestVO.getReq_id());
    }
}
