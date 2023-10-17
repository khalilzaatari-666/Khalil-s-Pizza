package com.vo1d.pizzaapp;

import android.annotation.SuppressLint;
import android.app.Activity;
import android.os.Bundle;
import android.widget.ImageView;
import android.widget.TextView;
import com.vo1d.pizzaapp.beans.Produit;

public class PizzaDetailActivity extends Activity {
    @SuppressLint("SetTextI18n")
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_pizza_detail);

        // Get the pizza details from the intent
        Produit selectedPizza = (Produit) getIntent().getSerializableExtra("pizza");

        // Find the TextView elements in the layout
        TextView pizzaDetailName = findViewById(R.id.pizzaDetailName);
        TextView pizzaDetailDescription = findViewById(R.id.pizzaDetailDescription);
        TextView pizzaDetailNbrIngredients = findViewById(R.id.pizzaDetailNbrIngredients);
        TextView pizzaDetailDuree = findViewById(R.id.pizzaDetailDuree);
        ImageView pizzaDetailImage = findViewById(R.id.pizzaDetailImage);

        // Set the pizza details in the TextView elements
        assert selectedPizza != null;
        pizzaDetailName.setText(selectedPizza.getNom());
        pizzaDetailDescription.setText(selectedPizza.getDescription());
        pizzaDetailNbrIngredients.setText("Ingredients: " + selectedPizza.getNbrIngredients());
        pizzaDetailDuree.setText("Preparation Time: " + selectedPizza.getDuree() + " minutes");
        pizzaDetailImage.setImageResource(selectedPizza.getPhoto());

        // Add code to set other pizza details as needed
    }
}
