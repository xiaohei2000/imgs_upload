package com.youli.imgupload.service;

import com.youli.imgupload.entity.ImgsData;

public interface ImgService {

    //添加图片名称，路径到数据库
    void add(ImgsData imgsData);

    String findimg(String imgname);

}
