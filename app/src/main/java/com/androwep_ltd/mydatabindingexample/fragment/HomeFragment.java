package com.androwep_ltd.mydatabindingexample.fragment;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.databinding.DataBindingUtil;
import androidx.fragment.app.Fragment;

import com.androwep_ltd.mydatabindingexample.R;
import com.androwep_ltd.mydatabindingexample.databinding.FragmentHomeBinding;

public class HomeFragment extends Fragment {
    private View view;
    private FragmentHomeBinding mBinding;
    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        mBinding = DataBindingUtil.inflate(inflater,R.layout.fragment_home, container,false);
        view = mBinding.getRoot();
        mBinding.textView2.setText("Hello Fragment");
        return view;

    }
}
