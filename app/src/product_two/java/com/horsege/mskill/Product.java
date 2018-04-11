package com.horsege.mskill;

import android.content.Context;
import android.util.Log;
import android.widget.Toast;

public class Product {

    public void toastProduct(Context context) {
        Log.e("mmz", "m10");
        android.widget.Toast.makeText(context, "Product Two", Toast.LENGTH_SHORT).show();
    }

}
