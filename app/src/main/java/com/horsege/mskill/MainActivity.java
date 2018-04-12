package com.horsege.mskill;

import android.app.Activity;
import android.os.Bundle;

import com.horsege.library.Library;

public class MainActivity extends Activity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

//        Product product = new Product();
//        product.toastProduct(this);

        Library library = new Library();
        library.toastLibrary(this);
    }
}
