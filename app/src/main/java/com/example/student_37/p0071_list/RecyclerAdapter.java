package com.example.student_37.p0071_list;

import android.support.annotation.NonNull;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Toast;

import java.util.List;

public class RecyclerAdapter extends RecyclerView.Adapter<RecyclerViewHolder> {

    private List<String> items;
    private OnRecyclerClicked onRecyclerClicked= null;

    public void setOnRecyclerClicked(final OnRecyclerClicked onRecyclerClicked) {
        this.onRecyclerClicked = onRecyclerClicked;
    }

    public RecyclerAdapter(List<String> items){
        super();
        this.items = items;
    }

    @NonNull
    @Override
    public RecyclerViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.item_recycler_view, parent, false);
        return new RecyclerViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull final RecyclerViewHolder holder, int position) {
        final String textToShow = items.get(position);
        holder.bind(textToShow);
        holder.itemView.setOnClickListener(new View.OnClickListener(){
               @Override
               public void onClick(View v) {
                   if (onRecyclerClicked != null) {
                       onRecyclerClicked.onClick(textToShow);
                   }
               }
           }
        );
    }

    interface OnRecyclerClicked {
        void onClick(String text);
    }

    @Override
    public int getItemCount() {
        return items.size();
    }
}
