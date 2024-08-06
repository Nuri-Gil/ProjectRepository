package org.soomgo.soomgo_project.mappers;

import org.apache.ibatis.annotations.Mapper;
import org.soomgo.soomgo_project.domain.RequestVO;

@Mapper
public interface RequestMapper {
    int insert(RequestVO requestVO);

    RequestVO selectById(int id);
}
