package com.vo1d.pizzaapp.adapter;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import com.vo1d.pizzaapp.R;
import com.vo1d.pizzaapp.beans.Produit;

import java.util.List;

public class PizzaAdapter extends BaseAdapter {
    private List<Produit> pizzaList;
    private Context context;

    public PizzaAdapter(Context context, List<Produit> pizzaList) {
        this.context = context;
        this.pizzaList = pizzaList;
    }

    @Override
    public int getCount() {
        return pizzaList.size();
    }

    @Override
    public Object getItem(int position) {
        return pizzaList.get(position);
    }

    @Override
    public long getItemId(int position) {
        return position;
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        if (convertView == null) {
            LayoutInflater inflater = (LayoutInflater) context.getSystemService(Context.LAYOUT_INFLATER_SERVICE);
            convertView = inflater.inflate(R.layout.pizza_list_item, parent, false);
        }

        // Bind pizza data to the views in the list item layout
        TextView pizzaName = convertView.findViewById(R.id.pizzaName);
        TextView pizzaDescription = convertView.findViewById(R.id.pizzaDescription); // Reference to the description TextView
        ImageView pizzaImage = convertView.findViewById(R.id.pizzaImage);

        Produit pizza = pizzaList.get(position);
        pizzaName.setText(pizza.getNom());
        pizzaDescription.setText(pizza.getDescription()); // Set the pizza description
        pizzaImage.setImageResource(pizza.getPhoto());

        // Add code to bind other pizza data as needed

        return convertView;
    }


}
