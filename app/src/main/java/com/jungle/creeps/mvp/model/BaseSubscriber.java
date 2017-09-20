package com.jungle.creeps.mvp.model;

import rx.Subscriber;

/**
 * 自定义BaseSubscriber
 * @param <T>
 */

public abstract class BaseSubscriber<T> extends Subscriber {
    @Override
    public void onStart() {
        super.onStart();
    }

    @Override
    public void onCompleted() {
    }

    @Override
    public void onNext(Object o) {
        onAfter((T) o);
    }

    @Override
    public void onError(Throwable e) {

    }

    public abstract void onAfter(T t);
}
