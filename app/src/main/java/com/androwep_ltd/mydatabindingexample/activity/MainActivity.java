package com.androwep_ltd.mydatabindingexample.activity;

import androidx.appcompat.app.AppCompatActivity;
import androidx.databinding.DataBindingUtil;
import androidx.recyclerview.widget.LinearLayoutManager;

import android.os.Bundle;

import com.androwep_ltd.mydatabindingexample.R;
import com.androwep_ltd.mydatabindingexample.adapter.SimpleAdapter;
import com.androwep_ltd.mydatabindingexample.databinding.ActivityMainBinding;

public class MainActivity extends AppCompatActivity {
    ActivityMainBinding mBinding;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        mBinding = DataBindingUtil.setContentView(this,R.layout.activity_main);
        mBinding.textView.setText("Set on textView");

        mBinding.recyclerId.setAdapter(new SimpleAdapter());
        mBinding.recyclerId.setLayoutManager(new LinearLayoutManager(this));
    }
}
