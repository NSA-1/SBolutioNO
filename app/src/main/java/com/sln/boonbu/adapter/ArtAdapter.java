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

public class ArtAdapter extends RecyclerView.Adapter<ArtAdapter.ViewHolder>  {

    private List<Ticket> ticketList;
    private Context context;

    public ArtAdapter(Context context,List<Ticket> ticketList) {
        this.ticketList = ticketList;
        this.context = context;
    }

    public  void setTicketList(List<Ticket> ticketList){
        this.ticketList = ticketList;
        notifyDataSetChanged();
    }

    @Override
    public ArtAdapter.ViewHolder onCreateViewHolder(ViewGroup viewGroup, int i) {
        View view = LayoutInflater.from(viewGroup.getContext()).inflate(R.layout.item_explore, viewGroup, false);
        return  new ArtAdapter.ViewHolder(view);
    }

    @Override
    public void onBindViewHolder(ArtAdapter.ViewHolder viewHolder, int i) {
        viewHolder.userName.setText(ticketList.get(i).getDescription());

    }

    @Override
    public int getItemCount() {
        return ticketList.size();
    }

    public class ViewHolder extends RecyclerView.ViewHolder {
        private TextView userName;


        public ViewHolder(final View view) {
            super(view);

            //TODO Erkan icerigi bos oldugu icin kapatildi.
            //userName = (TextView)view.findViewById(R.id.tvUserName);

            itemView.setOnClickListener(new View.OnClickListener(){
                @Override
                public  void  onClick(View v){
                    final int pos = getAdapterPosition();

                    if(pos!= RecyclerView.NO_POSITION){

                    }
                }
            });
        }

        public void clear(){
            ticketList.clear();
            notifyDataSetChanged();
        }
    }
}
