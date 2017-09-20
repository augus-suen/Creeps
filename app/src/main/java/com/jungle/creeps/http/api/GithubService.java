package com.jungle.creeps.http.api;

import com.jungle.creeps.bean.UserBean;

import io.reactivex.Observable;
import retrofit2.http.GET;
import retrofit2.http.Path;


public interface GithubService {
    @GET("/users/{user}")
    Observable<UserBean> getUser(@Path("user") String username);
}
