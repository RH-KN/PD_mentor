package com.example.demo.controller;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.validation.ObjectError;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.example.demo.dto.UserAddRequest;


/**
 * 【個人開発5】ユーザー情報 Controller
 */

@RequestMapping("/")
@Controller
public class PersonalDevController {
	
    /**
     * ユーザー情報 Service
     */
//    @Autowired
//    private UserInfoService userInfoService;
	
    /**
     * 【個人開発5】ユーザー新規登録(signin)画面を表示
     * @GetMapping("/common/signin")でも一緒
     */
	///signinページにアクセスした時の表示処理
	@RequestMapping(value = "/signin", method = RequestMethod.GET)
	public String displaysignin(Model model) {
	    model.addAttribute("userAddRequest", new UserAddRequest());
	    return "common/signin"; // テンプレートのパスを指定する
	}
    
	
    /**
     * 【個人開発5】ユーザー新規登録(signin‐signup)
     */
    
	//新規登録する、ボタンを押したとき（/signup）のアクション
    @RequestMapping(value = "/signup", method = RequestMethod.POST)
    public String create(@Validated @ModelAttribute UserAddRequest userRequest, BindingResult result, Model model) {
        if (result.hasErrors()) {
        	
            // 入力チェックエラーの場合
            List<String> errorList = new ArrayList<String>();
            for (ObjectError error : result.getAllErrors()) {
                errorList.add(error.getDefaultMessage());
            }
            model.addAttribute("validationError", errorList);
            return "common/signin";  // エラーメッセージを持ってcommon/signinページに戻る
            
            }
        
     // 正常な場合の処理
        return "redirect:/toploggedin";
        
}
        
        // ユーザー情報の登録
        public String save(UserAddRequest userRequest) {
        return "redirect:/toploggedin";
    }
	
	
}