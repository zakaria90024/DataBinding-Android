package com.androwep_ltd.mydatabindingexample.adapter;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import androidx.annotation.NonNull;
import androidx.databinding.DataBindingUtil;
import androidx.recyclerview.widget.RecyclerView;

import com.androwep_ltd.mydatabindingexample.R;
import com.androwep_ltd.mydatabindingexample.databinding.ItemSampleBinding;

public class SimpleAdapter extends RecyclerView.Adapter<SimpleAdapter.ViewHolder>{
   private ItemSampleBinding mBinding;
    @NonNull
    @Override
    public ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {

        LayoutInflater inflater = LayoutInflater.from(parent.getContext());
        mBinding = DataBindingUtil.inflate(inflater, R.layout.item_sample, parent, false);
        View view = mBinding.getRoot();
        ViewHolder viewHolder = new ViewHolder(view);
        return viewHolder;

    }

    @Override
    public void onBindViewHolder(@NonNull ViewHolder holder, int position) {
        mBinding.textView3.setText("Item"+position);

    }

    @Override
    public int getItemCount() {
        return 10;
    }

    static class ViewHolder extends RecyclerView.ViewHolder{

        public ViewHolder(@NonNull View itemView) {
            super(itemView);
        }
    }
}
