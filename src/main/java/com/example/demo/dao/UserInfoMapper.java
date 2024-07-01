package com.example.demo.dao;

import org.apache.ibatis.annotations.Mapper;

import com.example.demo.dto.UserAddRequest;

/**
 * ユーザー情報 Mapper
 */
@Mapper
public interface UserInfoMapper {

    /**
     * 【個人開発5】ユーザー情報登録
     * @param userRequest 登録用リクエストデータ
     */
    void save(UserAddRequest userRequest);

}