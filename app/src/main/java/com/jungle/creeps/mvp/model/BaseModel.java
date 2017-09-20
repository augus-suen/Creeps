package com.jungle.creeps.mvp.model;

import java.util.HashMap;

import rx.Subscriber;


public interface BaseModel<T> {
    void subscribe(Subscriber<T> subscribe);

    BaseModel addParams(HashMap<String, String> params);
}
