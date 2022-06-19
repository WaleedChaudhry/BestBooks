package com.example.recyclerview.Adapter;

import android.content.Context;
import android.view.Display;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.example.recyclerview.Model.Model_Class;
import com.example.recyclerview.R;

import java.util.ArrayList;

public class BookAdapter extends RecyclerView.Adapter<BookAdapter.viewholder>{
    public BookAdapter(ArrayList<Model_Class> list, Context context) {
        this.list = list;
        this.context = context;
    }

    ArrayList<Model_Class> list;
    Context context;

    @NonNull
    @Override
    public viewholder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view= LayoutInflater.from(context).inflate(R.layout.samplebook,parent,false);
        return new viewholder(view);

    }

    @Override
    public void onBindViewHolder(@NonNull viewholder holder, int position) {
        Model_Class model= list.get(position);
        holder.bookimg.setBackgroundResource(model.getImage());
        holder.name.setText(model.getBookName());
    }

    @Override
    public int getItemCount() {
        return list.size();
    }

    public class viewholder extends RecyclerView.ViewHolder{
        View bookimg;
        TextView name;

        public viewholder(@NonNull View itemView) {
            super(itemView);
            bookimg =itemView.findViewById(R.id.img);
            name =itemView.findViewById(R.id.textView);


        }
    }
}
