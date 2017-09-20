package com.jungle.creeps.mvp.model;


import com.jungle.creeps.bean.UserBean;
import com.jungle.creeps.http.HttpMethods;
import com.jungle.creeps.http.service.GithubService;

import java.util.HashMap;

import rx.Subscriber;
import rx.android.schedulers.AndroidSchedulers;
import rx.schedulers.Schedulers;


public class MainModel implements BaseModel<UserBean> {
    HashMap<String, String> params = new HashMap<>();

    @Override
    public void subscribe(Subscriber<UserBean> subscriber) {
        GithubService githubService = HttpMethods.getInstance().getRetrofit().create(GithubService.class);
        githubService.getUser(params.get("user")).subscribeOn(Schedulers.io()).unsubscribeOn(Schedulers.io())
                .observeOn(AndroidSchedulers.mainThread()).subscribe(subscriber);
    }

    @Override
    public MainModel addParams(HashMap<String, String> params) {
        this.params = params;
        return this;
    }
}
