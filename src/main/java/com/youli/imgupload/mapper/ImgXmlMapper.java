package com.youli.imgupload.mapper;

import com.youli.imgupload.entity.ImgsData;
import org.apache.ibatis.annotations.Mapper;
import org.springframework.stereotype.Repository;

import java.util.List;

@Mapper
@Repository
public interface ImgXmlMapper {

    List<ImgsData> findAll();

    void add(ImgsData imgsData);

    String findimg(String imgname);
}
