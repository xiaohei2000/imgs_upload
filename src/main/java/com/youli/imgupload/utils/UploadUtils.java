package com.youli.imgupload.utils;

import org.springframework.web.multipart.MultipartFile;

import java.io.File;
import java.io.IOException;
import java.util.UUID;

public class UploadUtils {
    //定义目标路径
    private static final String BASE_PATH="D:\\tomcat\\apache-tomcat-9.0.78\\webapps\\imgs\\";

    //定义访问路径
    private static final String SERVER_PATH="http://localhost:8181/imgs/";

    public static String upload(MultipartFile file){
        //获得上传图片名称
        String filename = file.getOriginalFilename();
        //使用uuid 保证服务器中名字唯一
        String uuid = UUID.randomUUID().toString().replace("-","");
        //uuid与filename拼接
        String newFilename = uuid+"-"+filename;
        //创建文件实例对象
        File image=new File(BASE_PATH,newFilename);
//        判断目标路径是否存在  if(image.exists())

        //对文件进行上传
        try{
            file.transferTo(image);
        } catch (IOException e) {
            return null;
        }

        return SERVER_PATH+newFilename;
    }
}
