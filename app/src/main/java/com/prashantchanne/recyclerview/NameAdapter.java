package com.prashantchanne.recyclerview;

import android.support.annotation.NonNull;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

public class NameAdapter extends RecyclerView.Adapter<NameAdapter.NameViewHolder> {

    String[] data;

    public NameAdapter(String[] data){
        this.data = data;
    }

    @NonNull
    @Override
    //It will call When the recycler first loads
    //creates views and keep it in the view holder
    public NameViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        LayoutInflater inflater = LayoutInflater.from(parent.getContext());
        View view = inflater.inflate(R.layout.items,parent,false);
        return new NameViewHolder(view);
    }

    //binds the data with views created by above function
    //set the data
    @Override
    public void onBindViewHolder(@NonNull NameViewHolder holder, int position) {

        String title = data[position];
        holder.text.setText(title);

    }

    //count
    @Override
    public int getItemCount() {
        return data.length;
    }

    //create ViewHolder class that holds the views
    public class NameViewHolder extends RecyclerView.ViewHolder{
        ImageView imageView;
        TextView text;
        public NameViewHolder(View itemView) {
            super(itemView);

            imageView = itemView.findViewById(R.id.image);
            text = itemView.findViewById(R.id.nameText);
        }
    }

}
