package com.example.fragmentation;

import androidx.appcompat.app.AppCompatActivity;
import androidx.viewpager.widget.ViewPager;

import android.graphics.Color;
import android.os.Bundle;

import com.example.fragmentation.adapter.ViewPagerAdapter;
import com.example.fragmentation.fragments.FirstFragment;
import com.example.fragmentation.fragments.SecondFragment;
import com.google.android.material.tabs.TabLayout;

public class ViewPage extends AppCompatActivity {

    private TabLayout tabLayout;
    private ViewPager viewPager;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_view_page);
        viewPager=findViewById(R.id.viewPager);
        tabLayout=findViewById(R.id.tabid);

        tabLayout.setSelectedTabIndicatorColor(Color.parseColor("#FFFFFF"));
        ViewPagerAdapter viewPagerAdapter=new ViewPagerAdapter(getSupportFragmentManager());
        viewPagerAdapter.addFragment(new FirstFragment(),"Sum");
        viewPagerAdapter.addFragment(new SecondFragment(),"Area of Circle");

        viewPager.setAdapter(viewPagerAdapter);
        tabLayout.setupWithViewPager(viewPager);

    }
}
