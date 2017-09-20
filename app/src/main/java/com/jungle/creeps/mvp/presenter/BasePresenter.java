package com.jungle.creeps.mvp.presenter;

import com.jungle.creeps.mvp.view.BaseView;

/**
 * Created by xw on 2016/11/1.
 */
public interface BasePresenter<T extends BaseView> {
    void attachView(T view);

    void detachView();

    void searchUser(String loginName);
}
