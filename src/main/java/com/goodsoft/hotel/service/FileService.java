package com.goodsoft.hotel.service;

import com.goodsoft.hotel.exception.HotelDataBaseException;
import org.springframework.web.multipart.MultipartFile;

import javax.servlet.http.HttpServletRequest;
import java.util.List;

/**
 * function 文件上传业务接口
 * Created by  manjusaka[manjusakachn@gmail.com] on 2017/8/4.
 * version v1.0
 */
public interface FileService {
    //文件上传业务处理
    int fileUploadService(MultipartFile[] files, String fileType, String fileId) throws HotelDataBaseException;

    //获取文件数据业务方法
    List<String> getFileData(HttpServletRequest request, String fileId) throws HotelDataBaseException;
}
