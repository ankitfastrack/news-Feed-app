package com.example.news_test;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.squareup.picasso.Picasso;

import java.util.ArrayList;
import java.util.List;

public class ListAdapter extends RecyclerView.Adapter<ListAdapter.ListViewHolder> {

    OnItemClickListener onClickListener;
    Context context;

    @NonNull
    private List<Article> data;
    public ListAdapter(Context context, List<Article>data,OnItemClickListener onItemClickListener)
    {
        this.context = context;
        this.data=data;
        this.onClickListener=onItemClickListener;
    }
    @Override
    public ListViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        LayoutInflater inflater=LayoutInflater.from(parent.getContext());
        View view=inflater.inflate(R.layout.list_layout,parent,false);
        return new ListViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull final ListViewHolder holder,final int position) {
        String title=data.get(position).getTitle();
        String url=data.get(position).getUrlToImage();
        Picasso.get().load(url).into(holder.itemImg);
        holder.itemText.setText(title);
        holder.itemView.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View view){
                onClickListener.onItemclick(holder.getAdapterPosition());
            }
        });
    }

    @Override
    public int getItemCount() {
        return data.size();
    }

    public class ListViewHolder extends RecyclerView.ViewHolder{

        ImageView itemImg;
        TextView itemText;

        public ListViewHolder(@NonNull View itemView) {
            super(itemView);
            itemImg= (ImageView) itemView.findViewById(R.id.Img_data);
            itemText=(TextView)  itemView.findViewById(R.id.text_data);
        }
    }

    interface OnItemClickListener{
        void onItemclick(int position);
    }
}
