package com.example.shawon.restaurantmanagementsystem;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.TextView;

import java.util.ArrayList;
import java.util.List;

public class CustomeSetMealActivity extends AppCompatActivity {


    //CheckBox CustomSetMealItem1,CustomSetMealItem2,CustomSetMealItem3,CustomSetMealItem4,CustomSetMealItem5;

    int n=20;
    CheckBox item [] = new CheckBox[n] ;
    Button CustomSetMealButton ;
    TextView setOrderList,SetTotalAmount;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_custome_set_meal);

        //enable back button on toolbar
        getSupportActionBar().setDisplayHomeAsUpEnabled(true);
        getSupportActionBar().setDisplayShowHomeEnabled(true);


        final List<Integer> Price = new ArrayList<Integer>() {{
            add(140);
            add(120);
            add(150);
            add(60);
            add(275);
            add(300);
            add(140);
            add(180);
            add(90);
            add(90);
            add(110);
            add(130);
            add(140);
            add(130);
            add(150);
            add(140);
            add(120);
            add(150);
            add(140);
            add(100);
            add(00);
        }};


        for(int i=1;i<=n;i++)
        {
            String findId= "customSetMealitem"+i;
            int resID = getResources().getIdentifier(findId, "id", getPackageName());

            item[i-1]= (CheckBox)findViewById(resID);

        }

        CustomSetMealButton = (Button)findViewById(R.id.customSetMealOrder);
        //setOrderList= (TextView) findViewById(R.id.CustomOrderList);
        //SetTotalAmount=(TextView)findViewById(R.id.Custom_TotalAmount);

        CustomSetMealButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                StringBuilder CustomerOrderList = new StringBuilder();
                Integer Total_Amount=0;
                int j=0;
                for(int i=1;i<=n;i++)
                {
                    if( item[i-1].isChecked() )
                    {
                        int color = getResources().getColor(R.color.colorAccent);
                        item[i-1].setTextColor(color);
                        j++;
                        String value = item[i-1].getText().toString();

                        Total_Amount+= Price.get(i-1);
                        CustomerOrderList.append(j+". "+value + " is Ordered.\n\n");

                    }
                    else{
                        int color = getResources().getColor(R.color.white);
                        item[i-1].setTextColor(color);


                    }


                }

                String v = Integer.toString(Total_Amount);

                //SetTotalAmount.setText( "Total Amount : "+v + " tk");
                //setOrderList.setText(CustomerOrderList);

                String Amount = Integer.toString(Total_Amount)  ;
                String OrderListToString = CustomerOrderList.toString() ;

                Intent intent = new Intent(CustomeSetMealActivity.this,SetMealOrderList.class);
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
