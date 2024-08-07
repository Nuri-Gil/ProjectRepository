package org.soomgo.soomgo_project.mappers;

import org.apache.ibatis.annotations.Mapper;
import org.soomgo.soomgo_project.domain.RequestVO;

import java.util.List;

@Mapper
public interface RequestMapper {
    int insert(RequestVO requestVO);

    List<RequestVO> getList();

    RequestVO select(int id);
}
