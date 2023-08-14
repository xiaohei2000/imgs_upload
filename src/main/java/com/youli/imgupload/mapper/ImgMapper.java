package com.youli.imgupload.mapper;

import com.youli.imgupload.entity.ImgsData;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Select;
import org.springframework.stereotype.Repository;

import java.util.List;

@Mapper
@Repository
public interface ImgMapper {

    @Select("select * from imgs")
    List<ImgsData> findAll();

}
