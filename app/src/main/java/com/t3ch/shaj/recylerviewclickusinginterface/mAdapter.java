package com.t3ch.shaj.recylerviewclickusinginterface;

import android.content.Context;
import android.support.annotation.NonNull;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import android.widget.Toast;

import java.util.List;

/**
 * Created by Shakil Ahmed Shaj on 15-Apr-19.
 * shakilahmedshaj@gmail.com
 */
public class mAdapter extends RecyclerView.Adapter<mAdapter.mViewHolder> {

    Context context;
    List<String> list;


    public mAdapter(Context context, List<String> list) {

        this.context = context;
        this.list = list;

    }

    @NonNull
    @Override
    public mViewHolder onCreateViewHolder(@NonNull ViewGroup viewGroup, int i) {

        View view = LayoutInflater.from(context).inflate(R.layout.row, null);


        return new mViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull mViewHolder mViewHolder, final int i) {

        mViewHolder.textView.setText(list.get(i));


        mViewHolder.itemView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Toast.makeText(context, String.valueOf(i), Toast.LENGTH_SHORT).show();

            }
        });


    }

    @Override
    public int getItemCount() {
        return list.size();
    }

    class mViewHolder extends RecyclerView.ViewHolder {

        TextView textView;


        public mViewHolder(@NonNull View itemView) {
            super(itemView);

            textView = itemView.findViewById(R.id.row);
        }
    }


}
