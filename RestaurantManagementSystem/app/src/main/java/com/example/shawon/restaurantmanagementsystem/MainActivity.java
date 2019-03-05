package com.example.shawon.restaurantmanagementsystem;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.LinearLayout;

public class MainActivity extends AppCompatActivity {

    Button SetMeal,customSetmeal,Developer,AboutUs;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        SetMeal=(Button)findViewById(R.id.setMeal);
        customSetmeal=(Button)findViewById(R.id.customSetMeal);
        Developer=(Button)findViewById(R.id.Developer);
        AboutUs=(Button)findViewById(R.id.AboutUs);

        Developer.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {


               ///todo
                String developer_name = "1.Tanvir Mitul\n\n" +
                        "2.Abu nauam Tonmoy\n\n"+ "3.Abir Mahmud shovon\n\n" +
                        "4.Farhan Fardid\n\n"+"Shahanul Haque\n";

                Intent intent = new Intent(MainActivity.this,AboutDeveloper.class);
                intent.putExtra("Developers",developer_name);
                startActivity(intent);

            }
        });

        AboutUs.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                ///todo



                String AboutUsTEXT = getResources().getString(R.string.AboutUS);

                Intent intent = new Intent(MainActivity.this,AboutDeveloper.class);
                intent.putExtra("Developers",AboutUsTEXT);
                startActivity(intent);
            }
        });

        customSetmeal.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent2 = new Intent(MainActivity.this,CustomeSetMealActivity.class);
                startActivity(intent2);


            }
        });


        SetMeal.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(MainActivity.this,SetMealActivity.class);
                startActivity(intent);

            }
        });



    }
}
