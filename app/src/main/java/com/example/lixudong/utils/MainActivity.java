package com.example.lixudong.utils;

import android.app.FragmentManager;
import android.app.FragmentTransaction;
import android.content.Context;
import android.support.v4.app.FragmentActivity;
import android.os.Bundle;
import android.view.View;

import Fragment.BackHandledFragment;
import Fragment.MainActivityFragment;
import Interface.BackHandledInterface;


public class MainActivity extends FragmentActivity implements BackHandledInterface{

    public Context context;
    public BackHandledFragment mBackHandedFragment;


        @Override
        protected void onCreate(Bundle savedInstanceState) {
            super.onCreate(savedInstanceState);
            setContentView(R.layout.activity_main);
            context = this;
            MainActivityFragment mFActivity = new MainActivityFragment();
            loadFragment(mFActivity);


        }

    public void loadFragment(BackHandledFragment fragment){
        FragmentManager fm = getFragmentManager();
        FragmentTransaction ft = fm.beginTransaction();
        ft.replace(R.id.fragment_layout, fragment ,"other");
        ft.commit();
    }

    @Override
    public void onBackPressed() {
        if (mBackHandedFragment == null || !mBackHandedFragment.onBackPressed()) {
            if (getFragmentManager().getBackStackEntryCount() == 0) {
                    super.onBackPressed();
            } else {
                getFragmentManager().popBackStack();
            }
        }
    }

    @Override
    public void setSelectedFragment(BackHandledFragment fragment) {
        this.mBackHandedFragment = fragment;
    }
}
