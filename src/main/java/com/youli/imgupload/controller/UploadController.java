package com.youli.imgupload.controller;


import com.youli.imgupload.entity.DataJson;
import com.youli.imgupload.entity.ImgsData;
import com.youli.imgupload.mapper.ImgXmlMapper;
import com.youli.imgupload.serviceImpl.ImgServiceImpl;
import com.youli.imgupload.utils.UploadUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.multipart.MultipartFile;

import java.util.HashMap;

@Controller
@RequestMapping("upload")
public class UploadController {
    @RequestMapping("image")
    @ResponseBody
    public  DataJson uploadImage(@RequestParam(value = "file") MultipartFile multipartFile){

        //调用上传工具类
        String imagepath = UploadUtils.upload(multipartFile);
        DataJson dataJson=new DataJson();
        if (imagepath != null){
            dataJson.setCode(1);
            dataJson.setMsg("上传成功");
            HashMap<String,String> map =new HashMap<>();
            map.put("src",imagepath);
            dataJson.setData(map);
        }else {
            dataJson.setCode(0);
            dataJson.setMsg("上传失败");
        }

        return dataJson;
    }

    @RequestMapping("UploadDB")
    @ResponseBody
    public String UploadDB(String goodsImage,String imagename){

        ImgsData imgsData = new ImgsData();
        imgsData.setImgid(3);
        imgsData.setImgname(imagename);
        imgsData.setImgurl(goodsImage);
//        System.out.println(goodsImage);
//        System.out.println(imagename);
        new ImgServiceImpl().add(imgsData);

        return "1";
    }
}
