package com.example.fragmentation;

import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.FragmentTransaction;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import com.example.fragmentation.fragments.FirstFragment;
import com.example.fragmentation.fragments.SecondFragment;
import com.example.fragmentation.fragments.ThirdFragment;

public class MainActivity extends AppCompatActivity implements View.OnClickListener
{

    private Button btnFragment;
    private String status="f1";
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        btnFragment=findViewById(R.id.btnFragment);
        btnFragment.setOnClickListener(this);
    }

    @Override
    public void onClick(View v) {
        FragmentManager fragmentManager=getSupportFragmentManager();
        FragmentTransaction fragmentTransaction=fragmentManager.beginTransaction();
        if (status=="f1")
        {
            FirstFragment firstFragment=new FirstFragment();
            fragmentTransaction.replace(R.id.fragmentContainer,firstFragment);
            fragmentTransaction.commit();
            btnFragment.setText("Load Second Fragment");
            status="f2";
        }
        else if(status=="f2")
        {
            SecondFragment secondFragment=new SecondFragment();
            fragmentTransaction.replace(R.id.fragmentContainer,secondFragment);
            fragmentTransaction.commit();
            btnFragment.setText("Add Fragment");
            status="f3";

        }
        else
        {
            ThirdFragment thirdFragment =new ThirdFragment();
            fragmentTransaction.replace(R.id.fragmentContainer, thirdFragment);
            fragmentTransaction.commit();
            btnFragment.setText("Load First Fragment");
            status="f1";
        }
    }
}
