package com.tmtron.pkginfofileissue;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.widget.TextView;

import com.tmtron.mylibrary.LibClass;
import com.tmtron.pkginfofileissue.R;

public class MainActivity extends MainActivityBase {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        TextView tvHello = findViewById(R.id.tvHello);
        tvHello.setText(LibClass.getLibText());
    }
}
