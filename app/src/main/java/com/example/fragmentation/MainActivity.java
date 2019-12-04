package com.example.fragmentation;

import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.FragmentTransaction;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import com.example.fragmentation.fragments.FirstFragment;
import com.example.fragmentation.fragments.SecondFragment;

public class MainActivity extends AppCompatActivity implements View.OnClickListener
{

    private Button btnFragment;
    private Boolean status=true;
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
        if (status)
        {
            FirstFragment firstFragment=new FirstFragment();
            //firstFragment.add(R.id.fragmentContainer,firstFragment);
            fragmentTransaction.commit();
            btnFragment.setText("Load Second Fragment");
            status=false;
        }
        else
        {
            SecondFragment secondFragment=new SecondFragment();

        }
    }
}
