package com.example.krupa.androidorderform;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

import java.text.NumberFormat;

public class MainActivity extends AppCompatActivity {
    Order order;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        order = new Order();
    }

    /**
     * on-click of "+" button add quantity
     * @param view
     */
    void addQuantity(View view){
        order.setQuantity( order.getQuantity() + 1);
        displayQuantity(order.getQuantity());
        displayPrice(order.getTotalPrice());
    }
    /**
     * on-click of "-" button subtract quantity
     * @param view
     */
    void  subQuantity(View view){
        order.setQuantity( order.getQuantity() - 1);
        displayQuantity(order.getQuantity());
        displayPrice(order.getTotalPrice());
    }

    /**
     * update displayed quantity on screen
     * @param quantity
     */
    private void displayQuantity(int quantity){
        TextView quantityTextView = (TextView) findViewById((R.id.quantity_text_view));
        quantityTextView.setText(String.valueOf(quantity));
    }

    /**
     * submit order
     */
    void submitOrder (View view){
        //displayPrice(5);
    }
    /**
     * display post order
     */
    private void displayPrice (double number){
        TextView priceTextView = (TextView) findViewById(R.id.price_text_view);
        priceTextView.setText(NumberFormat.getCurrencyInstance().format(number));
    }



}
