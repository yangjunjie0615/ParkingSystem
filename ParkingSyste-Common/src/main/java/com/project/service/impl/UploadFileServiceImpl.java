package com.project.service.impl;

import com.project.dao.UploadDao;
import com.project.service.UploadService;
import lombok.Data;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * com.project.service.impl
 *
 * @author: yangjunjie
 */
@Service
@Data
public class UploadFileServiceImpl implements UploadService {

    @Autowired
    private UploadDao uploadDao;

    @Override
    public Integer uploadFile(String newFilePath, Integer uid) {
        Integer result = uploadDao.uploadFile(newFilePath, uid);
        return result;
    }
}
