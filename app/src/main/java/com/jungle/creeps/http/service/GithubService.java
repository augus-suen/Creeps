package com.jungle.creeps.http.service;

import com.jungle.creeps.bean.UserBean;

import retrofit2.http.GET;
import retrofit2.http.Path;
import rx.Observable;


public interface GithubService {
    @GET("/users/{user}")
    Observable<UserBean> getUser(@Path("user") String username);
}
