package com.example.demo.dto;

import java.io.Serializable;

import jakarta.validation.constraints.Email;
import jakarta.validation.constraints.NotEmpty;
import jakarta.validation.constraints.Pattern;
import jakarta.validation.constraints.Size;
import lombok.Data;

/**
 * 【個人開発5】ユーザー情報登録 リクエストデータ
 */
@Data
public class UserAddRequest implements Serializable {
	
    /**
     * 名前
     */
    @NotEmpty(message = "名前は必ず入力してください")
    @Size(max = 255, message = "名前は255文字以内で入力してください")
    private String name;
    
    
    /**
     * メールアドレス
     */
    @NotEmpty(message = "メールアドレスは必ず入力してください")
    @Email(message = "メールアドレスが正しい形式ではありません")
    @Size(max = 255, message = "メールアドレスは255桁以内で入力してください")
    private String email;
    
    
    /**
     * パスワード
     */
    @NotEmpty(message = "パスワードは必ず入力してください")
    @Pattern(regexp = "^([a-zA-Z0-9]{8,})$", message = "英数字8文字以上で入力してください")
    private String password;
}