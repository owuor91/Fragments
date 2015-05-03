package com.example.teeshirt.fragments;

import android.os.Bundle;
import android.support.v7.app.ActionBarActivity;
import android.view.Menu;
import android.view.MenuItem;
import android.app.Fragment;
import android.app.FragmentManager;
import android.app.FragmentTransaction;
import android.view.View;

public class MainActivity extends ActionBarActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }


   public void changeFragment(View view){
       Fragment fragment;

       if (view== findViewById(R.id.button)){
            fragment = new Fragment1();
           FragmentManager fm = getFragmentManager();
           FragmentTransaction ft = fm.beginTransaction();
           ft.replace(R.id.fragmentholder, fragment);
           ft.commit();
       }
       if (view == findViewById(R.id.button2)){
           fragment = new Fragment2();
           FragmentManager fm = getFragmentManager();
           FragmentTransaction ft = fm.beginTransaction();
           ft.replace(R.id.fragmentholder,fragment);
           ft.commit();
       }
   }
}
