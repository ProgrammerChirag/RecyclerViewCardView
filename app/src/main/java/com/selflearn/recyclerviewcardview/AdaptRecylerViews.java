package com.selflearn.recyclerviewcardview;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import org.w3c.dom.Text;

public class AdaptRecylerViews extends RecyclerView.Adapter<AdaptRecylerViews.AdaptViewHolder> {

    String content[]=  {"first","second","third","fourth","fifth","sixth"};

    public AdaptRecylerViews() {}

    @NonNull
    @Override
    public AdaptViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        LayoutInflater inflater = LayoutInflater.from(parent.getContext());
        View view = inflater.inflate(R.layout.itemcontentadapter,parent,false);
        return  new AdaptViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull AdaptViewHolder holder, int position) {
        holder.textView.setText(content[position]);
    }

    @Override
    public int getItemCount() {
        return content.length;
    }

    public class AdaptViewHolder extends RecyclerView.ViewHolder {
        TextView textView;
        public AdaptViewHolder(@NonNull View itemView) {
            super(itemView);

            textView=itemView.findViewById(R.id.text);
        }
    }
}
