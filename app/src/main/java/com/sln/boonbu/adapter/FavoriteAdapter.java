package com.sln.boonbu.adapter;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.Color;
import android.view.Gravity;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.PopupWindow;
import android.widget.RelativeLayout;
import android.widget.TextView;

import com.google.zxing.BarcodeFormat;
import com.google.zxing.WriterException;
import com.google.zxing.common.BitMatrix;
import com.google.zxing.qrcode.QRCodeWriter;
import com.sln.boonbu.R;
import com.sln.boonbu.model.Ticket;

import java.util.List;

import androidx.recyclerview.widget.RecyclerView;

import static android.content.Context.LAYOUT_INFLATER_SERVICE;

public class FavoriteAdapter extends RecyclerView.Adapter<FavoriteAdapter.ViewHolder> {

    private List<Ticket> favList;
    private Context context;


    public FavoriteAdapter(Context context,List<Ticket> favList) {
        this.favList = favList;
        this.context = context;
    }

    public  void setfavList(List<Ticket> favList){
        this.favList = favList;
        notifyDataSetChanged();
    }

    @Override
    public FavoriteAdapter.ViewHolder onCreateViewHolder(ViewGroup viewGroup, int i) {
        View view = LayoutInflater.from(viewGroup.getContext()).inflate(R.layout.item_ticket, viewGroup, false);
        return  new FavoriteAdapter.ViewHolder(view);
    }

    @Override
    public void onBindViewHolder(FavoriteAdapter.ViewHolder viewHolder, int i) {
        viewHolder.expirationDate.setText(favList.get(i).getExpirationDate());
        viewHolder.description.setText(favList.get(i).getDescription());
        viewHolder.imgQRCode.setImageBitmap(Generate(favList.get(i).getId()));
    }

    @Override
    public int getItemCount() {
        return favList.size();
    }

    public Bitmap Generate(String inputValue){
        QRCodeWriter writer = new QRCodeWriter();
        try {
            BitMatrix bitMatrix = writer.encode(inputValue, BarcodeFormat.QR_CODE, 512, 512);
            int width = bitMatrix.getWidth();
            int height = bitMatrix.getHeight();
            Bitmap bmp = Bitmap.createBitmap(width, height, Bitmap.Config.RGB_565);
            for (int x = 0; x < width; x++) {
                for (int y = 0; y < height; y++) {
                    bmp.setPixel(x, y, bitMatrix.get(x, y) ? Color.BLACK : Color.WHITE);
                }
            }

            return bmp;
        } catch (WriterException e) {
            e.printStackTrace();
            return null;
        }
    }

    public class ViewHolder extends RecyclerView.ViewHolder {
        private TextView expirationDate, description;
        private ImageView imgQRCode, qrCodeView;
        private PopupWindow popupWindow;
        Button btnCloseQrView;
        RelativeLayout rlQrView;
        TextView txtTicketId;


        public ViewHolder(final View view) {
            super(view);
            //TODO ACILACAK!!
//            expirationDate = (TextView)view.findViewById(R.id.tvExpirationDate);
//            description = (TextView)view.findViewById(R.id.tvDescription);
//            imgQRCode = (ImageView)view.findViewById(R.id.imgQRCode);
//            btnCloseQrView=(Button)view.findViewById(R.id.btnCloseQrView);
//            rlQrView = (RelativeLayout)view.findViewById(R.id.rlQrView);
//            qrCodeView = (ImageView)view.findViewById(R.id.qrCodeView);
//            txtTicketId = (TextView)view.findViewById(R.id.txtTicketId);

            itemView.setOnClickListener(new View.OnClickListener(){
                @Override
                public  void  onClick(View v){
                    final int pos = getAdapterPosition();
                    if(pos!= RecyclerView.NO_POSITION){

                    }
                }
            });


            imgQRCode.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    qrCodeView.setImageBitmap(Generate(txtTicketId.getText().toString()));
                    LayoutInflater inflater = (LayoutInflater)context.getSystemService(LAYOUT_INFLATER_SERVICE);
                    View customView = inflater.inflate(R.layout.qrcode_layout,null);


                    popupWindow = new PopupWindow(
                            customView,
                            ViewGroup.LayoutParams.WRAP_CONTENT,
                            ViewGroup.LayoutParams.WRAP_CONTENT
                    );
                    btnCloseQrView.setOnClickListener(new View.OnClickListener() {
                        @Override
                        public void onClick(View v) {
                            popupWindow.dismiss();
                        }
                    });
                    popupWindow.showAtLocation(rlQrView, Gravity.CENTER,0,0);
                }
            });
        }

        public void clear(){
            favList.clear();
            notifyDataSetChanged();
        }
    }
}
