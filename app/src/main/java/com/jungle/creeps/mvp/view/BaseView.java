package com.jungle.creeps.mvp.view;

import com.jungle.creeps.bean.UserBean;


public interface BaseView {
    void showProgressDialog();

    void hideProgressDialog();

    void showText(UserBean userbean);

    void showErrorMessage(String text);
}
