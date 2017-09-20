package com.jungle.creeps.mvp.model;

import java.util.HashMap;


public interface BaseModel<T> {
    void subscribe(BaseSubscriber<T> subscribe);

    BaseModel addParams(HashMap<String, String> params);
}
