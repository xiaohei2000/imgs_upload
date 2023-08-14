package com.youli.imgupload;

import com.youli.imgupload.entity.ImgsData;
import com.youli.imgupload.mapper.ImgMapper;
import com.youli.imgupload.mapper.ImgXmlMapper;
import org.junit.jupiter.api.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import java.util.List;

@RunWith(SpringRunner.class)
@SpringBootTest
class ImguploadApplicationTests {

    @Autowired
    private ImgXmlMapper imgXmlMapper;
    @Autowired
    private ImgMapper imgMapper;



    @Test
    void contextLoads() {
        List<ImgsData> list = imgMapper.findAll();
        System.out.println(list);
    }
    @Test
    void contextLoads2() {
        ImgsData imgsData = new ImgsData();
        imgsData.setImgid(2);
        imgsData.setImgname("long");
        imgsData.setImgurl("com/youli/imgs");
        imgXmlMapper.add(imgsData);
        List<ImgsData> list = imgXmlMapper.findAll();
        System.out.println(list);
    }

}
