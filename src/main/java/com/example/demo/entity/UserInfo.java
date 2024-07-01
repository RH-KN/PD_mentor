package com.example.demo.entity;

import java.io.Serializable;
import java.util.Date;

import lombok.Data;

/**
 * 【個人開発5】ユーザー情報 Entity
 */
@Data
public class UserInfo implements Serializable {

    /**
     * ID
     */
    private Long id;
    
    /**
     * メールアドレス
     */
    private String email;

    /**
     * 名前
     */
    private String name;

    /**
     * 自己紹介文
     */
    private String nself_introduction;
    
    /**
     * パスワード
     */
    private String password;

    /**
     * 作成日
     */
    private Date created_at;

    /**
     * 更新日
     */
    private Date updated_at;

}