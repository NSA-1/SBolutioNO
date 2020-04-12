package com.sln.boonbu.adapter;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import com.sln.boonbu.R;
import com.sln.boonbu.model.Ticket;

import java.util.List;

import androidx.recyclerview.widget.RecyclerView;

public class ClothingAdapter extends RecyclerView.Adapter<ClothingAdapter.ViewHolder> {

    List<Ticket> ticketClothingList;
    private Context context;

    public ClothingAdapter(Context context, List<Ticket> ticketClothingList) {
        this.context = context;
        this.ticketClothingList = ticketClothingList;
    }

    public  void  setTicketClothingList(List<Ticket> ticketClothingList){
        this.ticketClothingList = ticketClothingList;
        notifyDataSetChanged();
    }

    @Override
    public ViewHolder onCreateViewHolder(ViewGroup viewGroup, int i) {
        View view = LayoutInflater.from(viewGroup.getContext()).inflate(R.layout.item_clothingticket, viewGroup, false);
        return new ClothingAdapter.ViewHolder(view);
    }

    @Override
    public void onBindViewHolder(ViewHolder viewHolder, int i) {
        viewHolder.userName.setText(ticketClothingList.get(i).getDescription());
    }

    @Override
    public int getItemCount() {
        return ticketClothingList.size();
    }

    public  class ViewHolder extends RecyclerView.ViewHolder{
        private TextView userName;

        public  ViewHolder(final View view){
            super(view);
            //TODO ACILACAK!!
            //userName = (TextView)view.findViewById(R.id.tvUserName1);

            itemView.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    final int pos = getAdapterPosition();

                    if(pos!= RecyclerView.NO_POSITION){

                    }
                }
            });
        }

        public  void  clear(){
            ticketClothingList.clear();
            notifyDataSetChanged();
        }

    }
}
