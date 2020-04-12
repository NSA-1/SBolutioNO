package com.sln.boonbu.adapter;

import android.content.Context;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import com.google.android.material.bottomnavigation.BottomNavigationView;
import com.sln.boonbu.R;
import com.sln.boonbu.fragment.ExploreFragment;
import com.sln.boonbu.model.Category;

import java.util.List;

import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.FragmentTransaction;
import androidx.recyclerview.widget.RecyclerView;

public class CategoryAdapter extends RecyclerView.Adapter<CategoryAdapter.ViewHolder> {

    private List<Category> categoryModelList;
    private Context context;
    Bundle bundle = null;

    public CategoryAdapter(Context context, List<Category> categoryModelList) {
        this.categoryModelList = categoryModelList;
        this.context = context;
    }

    public void setTicketList(List<Category> categoryModelList) {
        this.categoryModelList = categoryModelList;
        notifyDataSetChanged();
    }

    @Override
    public CategoryAdapter.ViewHolder onCreateViewHolder(ViewGroup viewGroup, int i) {
        View view = LayoutInflater.from(viewGroup.getContext()).inflate(R.layout.item_category, viewGroup, false);
        return new CategoryAdapter.ViewHolder(view);
    }

    @Override
    public void onBindViewHolder(CategoryAdapter.ViewHolder viewHolder, int i) {
        viewHolder.categoryName.setText(categoryModelList.get(i).getName());
        viewHolder.categoryId.setText(categoryModelList.get(i).getId());
        viewHolder.categoryDescription.setText(categoryModelList.get(i).getDescription());
        String id = categoryModelList.get(i).getId();
//TODO resimler ekenmedigi icin kapatildi. Acilacak.
        switch (id) {
            case "1":
                //viewHolder.categoryImage.setImageResource(R.drawable.category_two);
                break;
            case "2":
                //viewHolder.categoryImage.setImageResource(R.drawable.category_three);
                break;
            case "3":
                //viewHolder.categoryImage.setImageResource(R.drawable.category_five);
                break;
            case "4":
                //viewHolder.categoryImage.setImageResource(R.drawable.category_seven);
                break;
            default:
                throw new IllegalStateException("Unexpected value: " + i);
        }


    }

    @Override
    public int getItemCount() {
        return categoryModelList.size();
    }

    public class ViewHolder extends RecyclerView.ViewHolder {
        private TextView categoryName;
        private TextView categoryId;
        private ImageView categoryImage;
        private TextView categoryDescription;


        public ViewHolder(final View view) {
            super(view);
//TODO ekranin icerikleri eklenmedigi icin kapali. Ileride acilacak.
//            categoryName = (TextView) view.findViewById(R.id.txtCategoryName);
//            categoryId = (TextView) view.findViewById((R.id.txtCategoryId));
//            categoryImage = (ImageView) view.findViewById(R.id.ivCategory);
//            categoryDescription = (TextView) view.findViewById(R.id.txtCategoryDescription);
            itemView.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    final int pos = getAdapterPosition();

                    if (pos != RecyclerView.NO_POSITION) {

//
//                        movieDetail.setArguments(bundle);
                        bundle = new Bundle();
                        bundle.putString("categoryId", categoryId.getText().toString());

                        loadFragment(new ExploreFragment());

                    }

                }
            });

        }

        public void clear() {
            categoryModelList.clear();
            notifyDataSetChanged();
        }
    }

    private void loadFragment(Fragment fragment) {
//        transaction.disallowAddToBackStack(); // bu satır geri dönüşü engeller

        fragment.setArguments(bundle);
        FragmentManager manager = ((AppCompatActivity) context).getSupportFragmentManager();

//TODO ACILACAK!!
//        FragmentTransaction transaction = manager.beginTransaction()
//                .replace(R.id.frame_layout, fragment)
//                .addToBackStack(null);
//        transaction.commit();

//TODO ACILACAK!!
//        BottomNavigationView bottomNavigationView;
//        bottomNavigationView = (BottomNavigationView) (((AppCompatActivity) context).findViewById(R.id.navigation));
//        bottomNavigationView.getMenu().getItem(1).setChecked(true);


//        bottomNavigationView.setOnNavigationItemSelectedListener(myNavigationItemListener);
//        bottomNavigationView.setSelectedItemId(R.id.my_menu_item_id);
    }

}
