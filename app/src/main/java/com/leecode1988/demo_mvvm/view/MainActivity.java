package com.leecode1988.demo_mvvm.view;

import android.databinding.DataBindingUtil;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;

import com.leecode1988.demo_mvvm.R;
import com.leecode1988.demo_mvvm.databinding.ActivityMainBinding;
import com.leecode1988.demo_mvvm.viewmodel.MainViewModel;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        ActivityMainBinding mainBinding = DataBindingUtil.
                setContentView(this, R.layout.activity_main);

        MainViewModel mainViewModel = new MainViewModel(this);
        mainBinding.setViewModel(mainViewModel);

    }
}
