package org.soomgo.soomgo_project.service;

import lombok.RequiredArgsConstructor;
import lombok.extern.log4j.Log4j2;
import org.soomgo.soomgo_project.domain.RequestVO;
import org.soomgo.soomgo_project.mappers.RequestMapper;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;


@Service
@Log4j2
@RequiredArgsConstructor // 의존성 주입 -> 생성자 정의
@Transactional
public class RequestService {

    // Mapper 만 바라볼 것!!
    private final RequestMapper requestMapper; // 처음부터 만들어져야 함, 생성자 정의
    public int register(RequestVO requestVO) {
        log.info("==========================" + requestVO);

        int count = requestMapper.insert(requestVO);// BoardMapper 인터페이스에서 만든 int 값이 하나 나옴

        return requestVO.getId();
    }

    public List<RequestVO> list() {
        return requestMapper.getList();
    }

    public RequestVO get(int id) {
        return requestMapper.select(id);
    }

    public boolean remove(int id) {
        return true; // 08.06 -> 나중에 추가할 것
    }
}
