package com.leecode1988.demo_mvvm.viewmodel;

import android.content.Context;
import android.text.Editable;
import android.text.TextUtils;
import android.text.TextWatcher;
import android.view.View;
import android.widget.Toast;

/**
 * author:LeeCode
 * create:2019/2/1 20:07
 */
public class MainViewModel {
    private String userName;
    private String password;
    private Context mContext;


    public MainViewModel(Context context) {
        this.mContext = context;
    }

    public TextWatcher userNameChangedListener() {
        return new TextWatcher() {
            @Override
            public void beforeTextChanged(CharSequence s, int start, int count, int after) {

            }

            @Override
            public void onTextChanged(CharSequence s, int start, int before, int count) {
                userName = s.toString();
            }

            @Override
            public void afterTextChanged(Editable s) {

            }
        };
    }

    public TextWatcher passwordChangedListener(){
        return new TextWatcher() {
            @Override
            public void beforeTextChanged(CharSequence s, int start, int count, int after) {

            }

            @Override
            public void onTextChanged(CharSequence s, int start, int before, int count) {
                password=s.toString();
            }

            @Override
            public void afterTextChanged(Editable s) {

            }
        };
    }

    public void login(View view) {
        if (!TextUtils.isEmpty(userName) && !TextUtils.isEmpty(password)) {
            if (("lee").equals(userName) && "123".equals(password)) {
                Toast.makeText(mContext, "登录成功", Toast.LENGTH_SHORT).show();
            } else {
                Toast.makeText(mContext, "用户名或密码错误", Toast.LENGTH_SHORT).show();
            }
        } else {
            Toast.makeText(mContext, "用户名密码不能为空", Toast.LENGTH_SHORT).show();
        }
    }
}
