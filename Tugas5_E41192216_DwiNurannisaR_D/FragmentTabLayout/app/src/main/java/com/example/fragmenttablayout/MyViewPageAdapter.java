package com.example.fragmenttablayout;


import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.FragmentPagerAdapter;

import java.util.ArrayList;

 public class MyViewPageAdapter extends FragmentPagerAdapter {

    ArrayList<Fragment> arrayListFragment;
    ArrayList<String> arrayListJudul;

    public MyViewPageAdapter(FragmentManager fm, ArrayList<Fragment> arrayListFragment, ArrayList<String> arrayListJudul){
        super(fm);
        this.arrayListFragment = arrayListFragment;
        this.arrayListJudul = arrayListJudul;
    }

    @Override
    public Fragment getItem(int position){

        return arrayListFragment.get(position);
    }
    @Override
    public int getCount(){
        return arrayListFragment.size();
    }

    @Override
    public CharSequence getPageTitle(int position){
        return arrayListJudul.get(position);
    }
}
