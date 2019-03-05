package com.example.shawon.restaurantmanagementsystem;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.TextView;

import java.util.Set;

public class SetMealActivity extends AppCompatActivity {


    CheckBox getItem1,getItem2,getItem3,getItem4,getItem5,getItem6;
    Button orderButton;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_set_meal);

        //enable back button on toolbar
        getSupportActionBar().setDisplayHomeAsUpEnabled(true);
        getSupportActionBar().setDisplayShowHomeEnabled(true);



        getItem1=(CheckBox)findViewById(R.id.item1);
        getItem2=(CheckBox)findViewById(R.id.item2);
        getItem3=(CheckBox)findViewById(R.id.item3);
        getItem4=(CheckBox)findViewById(R.id.item4);
        getItem5=(CheckBox)findViewById(R.id.item5);
        getItem6=(CheckBox)findViewById(R.id.item6);
        //==========================================
        orderButton=(Button)findViewById(R.id.Order);
        //textView



        orderButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                StringBuilder stringBuilder = new StringBuilder();
                int TotalAmount=0;
                int j=0;

                if(getItem1.isChecked()){
                    int c = getResources().getColor(R.color.blue);
                    getItem1.setTextColor(c);
                    j+=1;
                    String value = getItem1.getText().toString();
                    TotalAmount+=190;
                    stringBuilder.append(j+". "+value + " is Ordered.\n\n");

                }
                else
                {
                    int c = getResources().getColor(R.color.white);
                    getItem1.setTextColor(c);
                }
                if(getItem2.isChecked()){
                    int c = getResources().getColor(R.color.blue);
                    getItem2.setTextColor(c);
                    j+=1;
                    String value = getItem2.getText().toString();
                    TotalAmount+=220;
                    stringBuilder.append(j+". "+value + " is Ordered.\n\n");

                }else
                {
                    int c = getResources().getColor(R.color.white);
                    getItem2.setTextColor(c);
                }
                if(getItem3.isChecked()){
                    int c = getResources().getColor(R.color.blue);
                    getItem3.setTextColor(c);
                    j+=1;
                    String value = getItem3.getText().toString();
                    TotalAmount+=240;
                    stringBuilder.append(j+". "+value + " is Ordered.\n\n");

                }else
                {
                    int c = getResources().getColor(R.color.white);
                    getItem3.setTextColor(c);
                }

                if(getItem4.isChecked()){
                    int c = getResources().getColor(R.color.blue);
                    getItem4.setTextColor(c);
                    j+=1;
                    String value = getItem4.getText().toString();
                    TotalAmount+=260;
                    stringBuilder.append(j+". "+value + " is Ordered.\n\n");

                }else
                {
                    int c = getResources().getColor(R.color.white);
                    getItem4.setTextColor(c);
                }
                if(getItem5.isChecked()){
                    int c = getResources().getColor(R.color.blue);
                    getItem5.setTextColor(c);
                    j+=1;
                    String value = getItem5.getText().toString();
                    TotalAmount+=250;
                    stringBuilder.append(j+". "+value + " is Ordered.\n\n");

                }else
                {
                    int c = getResources().getColor(R.color.white);
                    getItem5.setTextColor(c);
                }
                if(getItem6.isChecked()){
                    int c = getResources().getColor(R.color.blue);
                    getItem6.setTextColor(c);
                    j+=1;
                    String value = getItem6.getText().toString();
                    TotalAmount+=150;
                    stringBuilder.append(j+". "+value + " is Ordered.\n\n");

                }else
                {
                    int c = getResources().getColor(R.color.white);
                    getItem6.setTextColor(c);
                }

                //StringBuilder builder = new StringBuilder(TotalAmount);
                String Amount = Integer.toString(TotalAmount)  ;
                String OrderListToString = stringBuilder.toString() ;

                Intent intent = new Intent(SetMealActivity.this,SetMealOrderList.class);
                intent.putExtra("List",OrderListToString);
                intent.putExtra("Amount",Amount);
                startActivity(intent);

            }
        });

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
