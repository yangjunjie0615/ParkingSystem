package com.project.dao;

/**
 * com.project.dao
 *
 * @author: yangjunjie
 */
public interface UploadDao {

    /**
     * 上传接口
     * @param newFilePath
     * @param uid
     * @return
     */
    Integer uploadFile(String newFilePath, Integer uid);
}
