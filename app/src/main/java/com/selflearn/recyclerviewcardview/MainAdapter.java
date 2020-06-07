package com.selflearn.recyclerviewcardview;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

public class MainAdapter extends  RecyclerView.Adapter<MainAdapter.MainViewHolder>  {


    String title[]={"stories","news and politics","religion","comedy"};
    public Context context;
    public MainAdapter() {


    }
    public MainAdapter(Context context){
        this.context = context;

    }

    @NonNull
    @Override
    public MainViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        LayoutInflater inflater =LayoutInflater.from(parent.getContext());
         View view=inflater.inflate(R.layout.itemmainadapter,parent,false);
        return new MainViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull MainViewHolder holder, int position) {
        holder.textView.setText(title[position]);
        holder.recyclerView.setLayoutManager(new LinearLayoutManager(context,LinearLayoutManager.HORIZONTAL,false));
        holder.recyclerView.setHasFixedSize(true);
        holder.recyclerView.setAdapter(new AdaptRecylerViews());
    }

    @Override
    public int getItemCount() {
        return title.length;
    }

    public class MainViewHolder extends RecyclerView.ViewHolder {

        TextView textView;
        RecyclerView recyclerView;
        public MainViewHolder(@NonNull View itemView) {
            super(itemView);
            textView= itemView.findViewById(R.id.textview);
            recyclerView = itemView.findViewById(R.id.recycleView1);

        }
    }
}
