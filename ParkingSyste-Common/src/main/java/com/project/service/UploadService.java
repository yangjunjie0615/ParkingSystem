package com.project.service;

/**
 * com.project.service
 * @author: yangjunjie
 */
public interface UploadService {
    /**
     * 上传文件
     * @param newFilePath
     * @param uid
     * @return
     */
    Integer uploadFile(String newFilePath, Integer uid);

}
