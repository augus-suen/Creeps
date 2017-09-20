package com.jungle.creeps.mvp.model;

import java.util.HashMap;


public interface BaseModel<T> {
    void subscribe(BaseObServer<T> subscribe);

    BaseModel addParams(HashMap<String, String> params);
}
