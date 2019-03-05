package com.example.shawon.restaurantmanagementsystem;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.MenuItem;
import android.widget.TextView;

public class SetMealOrderList extends AppCompatActivity {

    TextView OrderedList,SetTotalAmount;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_set_meal_order_list);

        getSupportActionBar().setDisplayHomeAsUpEnabled(true);
        getSupportActionBar().setDisplayShowHomeEnabled(true);


        OrderedList=(TextView)findViewById(R.id.OrderList);
        SetTotalAmount=(TextView)findViewById(R.id.TotalAmount);

        String orderList= getIntent().getStringExtra("List");
        String Amount=getIntent().getStringExtra("Amount");


        try{
            SetTotalAmount.setText( "Total Amount : "+Amount+"/-");


            OrderedList.setText(orderList);
        }catch(Exception e){
            OrderedList.setText(e.toString());
        }



    }


    @Override
    public boolean onOptionsItemSelected(MenuItem item) {

        if(item.getItemId()==android.R.id.home)
        {
            this.finish();
        }
        return super.onOptionsItemSelected(item);
    }

}
