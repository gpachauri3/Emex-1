package com.example.gaurav.a_1;

import android.app.Activity;
import android.content.Intent;
import android.os.Handler;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.support.design.widget.NavigationView;
import android.support.v4.widget.DrawerLayout;
import android.support.v7.app.ActionBar;
import android.support.v7.app.ActionBarDrawerToggle;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.Toolbar;
import android.util.Log;
import android.view.Gravity;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;

import org.w3c.dom.Text;

public class MainActivity extends Activity{
//    Toolbar toolbar;
//    ImageView menu_bt;
//    TextView toolbarTitle;

   // ActionBar actionBar;
   // DrawerLayout drawerLayout;
    //ActionBarDrawerToggle mDrawerToggle;
    //private NavigationView navigationView;
    //private String TAG = "TAG";

    int time = 3000;
    private final int REQUEST_CODE = 3;
    private Button login, signup;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
       // toolbar = (Toolbar) findViewById(R.id.toolbar);
       // menu_bt = (ImageView) findViewById(R.id.toolbarHome);
       // toolbarTitle = (TextView) findViewById(R.id.toolbarTitle);
        login = (Button) findViewById(R.id.bt_login);
        signup = (Button) findViewById(R.id.bt_signup);
//        this.setSupportActionBar(Toolbar);
//        actionBar=getSupportActionBar();
//        actionBar.setDisplayShowTitleEnabled(false);

        signup.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MainActivity.this, Signup.class);
                startActivity(intent);
            }
        });
        login.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MainActivity.this, Login.class);
                startActivity(intent);
            }
        });
        new Handler().postDelayed(new Runnable() {
            @Override
            public void run() {
                login.setVisibility(View.VISIBLE);
                signup.setVisibility(View.VISIBLE);
            }
        }, time);
//        menu_bt.setOnClickListener(new View.OnClickListener() {
//            @Override
//            public void onClick(View v) {
//                if (drawerLayout.isDrawerOpen(Gravity.LEFT)) {
//                    drawerLayout.closeDrawer(Gravity.LEFT);
//                } else {
//                    drawerLayout.openDrawer(Gravity.LEFT);
//                }
//            }
//        });

    }
}