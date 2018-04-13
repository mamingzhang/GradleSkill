package com.horsege.mskill;

import android.content.Context;
import android.widget.Toast;

/**
 * product_one
 */
public class Product {

    /**
     * 输出Product信息
     * @param context Context
     */
    public void toastProduct(Context context) {
        Toast.makeText(context, "Product One", Toast.LENGTH_SHORT).show();
    }

}
