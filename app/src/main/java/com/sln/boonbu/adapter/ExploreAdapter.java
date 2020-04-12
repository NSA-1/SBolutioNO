package com.sln.boonbu.adapter;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageButton;
import android.widget.TextView;
import android.widget.Toast;

import com.google.firebase.database.DatabaseReference;
import com.google.firebase.database.FirebaseDatabase;
import com.sln.boonbu.R;
import com.sln.boonbu.model.Ticket;
import com.sln.boonbu.model.TicketDefinition;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.List;

import androidx.recyclerview.widget.RecyclerView;
import de.hdodenhof.circleimageview.CircleImageView;

public class ExploreAdapter extends RecyclerView.Adapter<ExploreAdapter.ViewHolder> {

    DatabaseReference mRoot = FirebaseDatabase.getInstance().getReference().child("Ticket");


    private List<TicketDefinition> ticketList;
    private Context context;
    private static final DateFormat dateFormat = new SimpleDateFormat("dd-MM-yyyy");

    public ExploreAdapter(Context context, List<TicketDefinition> ticketList) {
        this.ticketList = ticketList;
        this.context = context;
    }

    public void setticketList(List<TicketDefinition> ticketList) {
        this.ticketList = ticketList;
        notifyDataSetChanged();
    }

    @Override
    public ExploreAdapter.ViewHolder onCreateViewHolder(ViewGroup viewGroup, int i) {
        View view = LayoutInflater.from(viewGroup.getContext()).inflate(R.layout.item_explore, viewGroup, false);
        return new ExploreAdapter.ViewHolder(view);
    }

    @Override
    public void onBindViewHolder(ExploreAdapter.ViewHolder viewHolder, int i) {
        //TODO ICINDEKI TUM COMMENTLI KODLAR ACILACAK!!

        viewHolder.ticketName.setText(ticketList.get(i).getName());
        viewHolder.description.setText(ticketList.get(i).getDescription());
        String categoryId = ticketList.get(i).getCategoryId();
        viewHolder.ticketDefinitionId.setText(ticketList.get(i).getId());
//        Boolean isLiked = ticketList.get(i).getIsLikedBefore();
        viewHolder.userId.setText(ticketList.get(i).getUserId());
        viewHolder.categoryId.setText(ticketList.get(i).getCategoryId());
//        viewHolder.isLikedBefore.setText(ticketList.get(i).getIsLikedBefore().toString());

//        if (isLiked) {
//            viewHolder.btnGetTicket.setImageResource(R.drawable.heart_on);
//        }

        switch (categoryId) {
            case "1":

                //viewHolder.ticketIcon.setImageResource(R.drawable.ic_category_art);
                break;
            case "2":
                //viewHolder.ticketIcon.setImageResource(R.drawable.ic_category_food);
                break;
            case "3":
                //viewHolder.ticketIcon.setImageResource(R.drawable.ic_category_clothes);
                break;
            case "4":
                //viewHolder.ticketIcon.setImageResource(R.drawable.ic_category_paperwork);
                break;
            default:
                throw new IllegalStateException("Unexpected value: " + i);

        }


    }

    @Override
    public int getItemCount() {
        return ticketList.size();
    }


    public class ViewHolder extends RecyclerView.ViewHolder {
        private TextView ticketName, description, ticketDefinitionId, userId, categoryId;
        private CircleImageView ticketIcon;
        private ImageButton btnGetTicket;
        private TextView isLikedBefore;

        public ViewHolder(final View view) {
            super(view);
//TODO ACILACAK!!
//            ticketName = (TextView) view.findViewById(R.id.txtTicketName);
//            description = (TextView) view.findViewById(R.id.txtTicketDescription);
//            ticketIcon = (CircleImageView) view.findViewById(R.id.ivCategoryIcon);
//            btnGetTicket = (ImageButton) view.findViewById(R.id.btnGetTicket);
//            ticketDefinitionId = (TextView) view.findViewById(R.id.txtTicketDefinitionId);
//            userId = (TextView) view.findViewById(R.id.txtUserId);
//            categoryId = (TextView) view.findViewById(R.id.txtCategoryId);
//            isLikedBefore = (TextView) view.findViewById(R.id.txtIsLikedBefore);
            btnGetTicket.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {

                    if (Boolean.parseBoolean(isLikedBefore.getText().toString())) {
                        Toast.makeText(context.getApplicationContext(), "Daha önce bu fırsatı popilemişsiniz 😘 ✔", Toast.LENGTH_LONG);
                    } else {
                        Date dt = new Date();
                        Calendar c = Calendar.getInstance();
                        c.setTime(dt);
                        c.add(Calendar.DATE, 3);
                        Date expDt = c.getTime();
                        String expDtStr = dateFormat.format(expDt).toString();
                        String DtStr = dateFormat.format(dt).toString();

                        String dsc, idStr, ctgryId, uId;
                        dsc = description.getText().toString();
                        ctgryId = categoryId.getText().toString();
                        idStr = ticketDefinitionId.getText().toString();
                        uId = userId.getText().toString();

                        String id = mRoot.push().getKey();
                        Ticket myFavTicket = new Ticket(dsc, id, idStr, "0", uId, expDtStr, DtStr, ctgryId);
                        mRoot.child(id).setValue(myFavTicket);
                        Toast.makeText(context.getApplicationContext(), "Popiniz tanımlandı! 💜", Toast.LENGTH_LONG);
                    }
                }
            });
        }

        public void clear() {
            ticketList.clear();
            notifyDataSetChanged();
        }
    }
}