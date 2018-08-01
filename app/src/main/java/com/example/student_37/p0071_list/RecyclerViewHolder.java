package com.example.student_37.p0071_list;

import android.support.v7.widget.RecyclerView;
import android.view.View;
import android.widget.TextView;

public class RecyclerViewHolder extends RecyclerView.ViewHolder  {

    private TextView textView;

    public RecyclerViewHolder(View view) {
        super(view);
        textView = view.findViewById(R.id.recycler_text);
    }

    public void bind(String textToShow) {
        textView.setText(textToShow);
    }

}
