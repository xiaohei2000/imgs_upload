package com.youli.imgupload.serviceImpl;

import com.youli.imgupload.entity.ImgsData;
import com.youli.imgupload.mapper.ImgXmlMapper;
import com.youli.imgupload.service.ImgService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class ImgServiceImpl implements ImgService {

    @Autowired
    private ImgXmlMapper imgXmlMapper;

    @Override
    public void add(ImgsData imgsData){
        imgXmlMapper.add(imgsData);
    }

    public String findimg(String imgname){
        return imgXmlMapper.findimg(imgname);
    }
}
