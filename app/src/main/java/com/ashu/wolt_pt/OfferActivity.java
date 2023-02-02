package com.ashu.wolt_pt;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.FragmentTransaction;

public class OfferActivity extends AppCompatActivity {

    private Button button;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        setContentView(R.layout.activity_offer);


        button = findViewById(R.id.rechargeOC);

        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                RechargeFragment rechargeFragment = new RechargeFragment();
                FragmentTransaction fragmentTransaction = getSupportFragmentManager().beginTransaction();
                fragmentTransaction.replace(R.id.container,rechargeFragment).commit();
            }
        });



    }
}