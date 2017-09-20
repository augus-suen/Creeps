package com.jungle.creeps.utils;

import android.content.Context;
import android.view.inputmethod.InputMethodManager;


public class KeyBoardUtils {
    /**
     * 控制软键盘显示隐藏
     *
     * @param ctx
     */
    public static void SwitchKeyBoardShowing(Context ctx) {
        InputMethodManager imm = (InputMethodManager) ctx.getSystemService(Context
                .INPUT_METHOD_SERVICE);
        imm.toggleSoftInput(0, InputMethodManager.HIDE_NOT_ALWAYS);
    }
}
