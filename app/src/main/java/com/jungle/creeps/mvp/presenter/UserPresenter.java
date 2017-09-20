package com.jungle.creeps.mvp.presenter;

import android.content.Context;
import android.text.TextUtils;

import com.jungle.creeps.bean.UserBean;
import com.jungle.creeps.mvp.model.BaseObServer;
import com.jungle.creeps.mvp.model.MainModel;
import com.jungle.creeps.mvp.view.BaseView;
import com.jungle.creeps.utils.KeyBoardUtils;

import java.util.HashMap;

import io.reactivex.annotations.NonNull;
import io.reactivex.disposables.Disposable;

public class UserPresenter implements BasePresenter {
    private Context ctx;
    private BaseView mMainView;
    private MainModel mModel;

    public UserPresenter(Context _ctx) {
        this.ctx = _ctx;
        mModel = new MainModel();
    }

    @Override
    public void attachView(BaseView view) {
        mMainView = view;
    }

    @Override
    public void detachView() {
        mMainView = null;
    }

    public void searchUser(String loginName) {
        if (TextUtils.isEmpty(loginName.trim())) {
            mMainView.showErrorMessage("请输入合法登录名");
            return;
        }
        if (mModel != null) {
            HashMap<String, String> map = new HashMap<>();
            map.put("user", loginName);
            mModel.addParams(map).subscribe(new BaseObServer<UserBean>() {

                @Override
                public void onSubscribe(@NonNull Disposable d) {
                    super.onSubscribe(d);
                    mMainView.showProgressDialog();
                }

                @Override
                public void onAfter(UserBean userBean) {
                    mMainView.showText(userBean);
                }

                @Override
                public void onComplete() {
                    super.onComplete();
                    mMainView.hideProgressDialog();
                    KeyBoardUtils.SwitchKeyBoardShowing(ctx);
                }

                @Override
                public void onError(@NonNull Throwable e) {
                    super.onError(e);
                    e.printStackTrace();
                    mMainView.hideProgressDialog();
                }
            });
        }

    }
}
