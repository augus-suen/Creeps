package com.jungle.creeps.mvp.model;


import io.reactivex.Observer;
import io.reactivex.annotations.NonNull;
import io.reactivex.disposables.Disposable;

public abstract class BaseObServer<T> implements Observer {
    @Override
    public void onComplete() {

    }

    @Override
    public void onNext(@NonNull Object o) {
        onAfter((T) o);
    }

    @Override
    public void onSubscribe(@NonNull Disposable d) {

    }

    @Override
    public void onError(@NonNull Throwable e) {

    }

    public abstract void onAfter(T t);
}
