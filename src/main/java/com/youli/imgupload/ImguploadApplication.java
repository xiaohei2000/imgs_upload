package com.youli.imgupload;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
@MapperScan("com.youli.imgupload.mapper")
public class ImguploadApplication {

    public static void main(String[] args) {
        SpringApplication.run(ImguploadApplication.class, args);
    }

}
