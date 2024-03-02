package com.example.myapplication.Adapter;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.example.myapplication.R;
import com.example.myapplication.Model.Brand;

import java.util.List;

public class BrandAdapter extends RecyclerView.Adapter<BrandAdapter.BrandViewHolder> {
    private List<Brand> brandList;

    public BrandAdapter(List<Brand> brandList) {
        this.brandList = brandList;
    }

    @NonNull
    @Override
    public BrandViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.item_brand, parent, false);
        return new BrandViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull BrandViewHolder holder, int position) {
        Brand brand = brandList.get(position);
        holder.bind(brand);
    }

    @Override
    public int getItemCount() {
        return brandList.size();
    }

    public static class BrandViewHolder extends RecyclerView.ViewHolder {
        private TextView textViewBrandName,v_id;

        public BrandViewHolder(@NonNull View itemView) {
            super(itemView);
            textViewBrandName = itemView.findViewById(R.id.name);
            v_id = itemView.findViewById(R.id.id);
        }

        public void bind(Brand brand) {
            textViewBrandName.setText(brand.getName());
            v_id.setText(String.valueOf(brand.getId()));
        }
    }
}
