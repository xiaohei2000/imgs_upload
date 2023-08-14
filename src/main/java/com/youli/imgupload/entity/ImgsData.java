package com.youli.imgupload.entity;

public class ImgsData {
    private Integer imgid;
    private String imgname;
    private String imgurl;

    public Integer getImgid() {
        return imgid;
    }

    public void setImgid(Integer imgid) {
        this.imgid = imgid;
    }

    public String getImgname() {
        return imgname;
    }

    public void setImgname(String imgname) {
        this.imgname = imgname;
    }

    public String getImgurl() {
        return imgurl;
    }

    public void setImgurl(String imgurl) {
        this.imgurl = imgurl;
    }

    @Override
    public String toString() {
        return "imgsData{" +
                "imgid=" + imgid +
                ", imgname='" + imgname + '\'' +
                ", imgurl='" + imgurl + '\'' +
                '}';
    }
}
