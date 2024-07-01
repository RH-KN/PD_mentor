package com.example.demo.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.dao.UserInfoMapper;
import com.example.demo.dto.UserAddRequest;

/**
 * ユーザー情報 Service
 */
@Service
public class UserInfoService {

    /**
     * ユーザー情報 Mapper
     */
    @Autowired
    private UserInfoMapper userInfoMapper;

    /**
     * ユーザ情報登録
     * @param userAddRequest リクエストデータ
     */
    public void save(UserAddRequest userAddRequest) {
        userInfoMapper.save(userAddRequest);
    }

}