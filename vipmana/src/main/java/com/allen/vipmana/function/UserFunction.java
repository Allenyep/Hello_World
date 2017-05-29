package com.allen.vipmana.function;

import com.allen.vipmana.entity.User;
import org.springframework.transaction.annotation.Transactional;

/**
 * Created by allen on 2017/5/10.
 */
public interface UserFunction {
    //用户登录
    public User login(String account,String password)throws Exception;

    //修改密码
    @Transactional
    User updatePassword(String id,String oldPassword,String newPassword,String newPasswordConfirm)throws Exception;
}
