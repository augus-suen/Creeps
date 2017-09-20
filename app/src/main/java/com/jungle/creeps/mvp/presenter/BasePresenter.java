package com.jungle.creeps.mvp.presenter;

import com.jungle.creeps.mvp.view.BaseView;


public interface BasePresenter<T extends BaseView> {
    void attachView(T view);

    void detachView();
}
