package com.yansong.ui;

import android.support.v7.app.AppCompatActivity;

import com.example.sunny.demo0921.model.JsonModel;

/**
 * Created by sunny01 on 2017/9/25.
 */

public class BaseActivity<T extends JsonModel> extends AppCompatActivity {
    private T model;
}
