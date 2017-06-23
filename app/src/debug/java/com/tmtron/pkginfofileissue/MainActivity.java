package com.tmtron.pkginfofileissue;

import android.os.Bundle;
import android.widget.TextView;


public class MainActivity extends MainActivityBase {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        TextView tvHello = findViewById(R.id.tvHello);
        tvHello.setText("Debug Build");
    }
}
