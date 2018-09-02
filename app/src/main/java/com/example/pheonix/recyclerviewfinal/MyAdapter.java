package com.example.pheonix.recyclerviewfinal;

import android.support.annotation.NonNull;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;

import static android.widget.Toast.*;

public class MyAdapter extends RecyclerView.Adapter <MyAdapter.MyViewHolder>{
    String[] data;
    public MyAdapter(String[] data) {
        this.data = data ;
    }

    @Override
    public MyViewHolder onCreateViewHolder (ViewGroup parent, int viewType) {
        View v = LayoutInflater.from(parent.getContext()).inflate(R.layout.items_table, parent, false);
        return new MyViewHolder(v);
    }

    @Override
    public void onBindViewHolder(@NonNull MyViewHolder holder, int position) {
        String java = data[position];
        holder.textiew.setText(java);

    }

    @Override
    public int getItemCount()
    {
        return data.length ;
    }

   public class MyViewHolder extends RecyclerView.ViewHolder implements View.OnClickListener{
       public ImageView imageiew;
      public TextView textiew;
       public MyViewHolder(View itemView) {
           super(itemView);
           textiew = (TextView) itemView.findViewById(R.id.textView);
           imageiew = (ImageView) itemView.findViewById(R.id.imageView);
           }

       @Override
       public void onClick(View v) {
           int position = getAdapterPosition();
           String items = String.valueOf(position);
         //  makeText("this", "hello", LENGTH_SHORT).show();
        // Toast.makeText(items.indexOf(position), this, LENGTH_SHORT).show();
       }
   }
}
