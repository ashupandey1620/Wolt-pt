package com.ashu.wolt_pt;

import android.os.Bundle;
import android.view.MenuItem;

import androidx.appcompat.app.AppCompatActivity;

import com.google.android.material.bottomnavigation.BottomNavigationView;
import com.google.android.material.navigation.NavigationBarView;


public class MainActivity extends AppCompatActivity {







    BottomNavigationView bottomNavigationView;

    HomeFragment homeFragment = new HomeFragment();
    OrderFragment orderFragment = new OrderFragment();
    RechargeFragment rechargeFragment = new RechargeFragment();
    CustomerServiceFragment customerServiceFragment = new CustomerServiceFragment();
    MeFragment meFragment = new MeFragment();





    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);









        bottomNavigationView = findViewById(R.id.navigation_bar);
        getSupportFragmentManager().beginTransaction().replace(R.id.container, homeFragment).commit();

        bottomNavigationView.setOnItemSelectedListener(new NavigationBarView.OnItemSelectedListener() {
            @Override
            public boolean onNavigationItemSelected(MenuItem item) {
                switch(item.getItemId()) {
                    case R.id.home:
                        getSupportFragmentManager().beginTransaction().replace(R.id.container, homeFragment).commit();
                        return true;
                    case R.id.order:
                        getSupportFragmentManager().beginTransaction().replace(R.id.container, orderFragment).commit();
                        return true;
                    case R.id.recharge:
                        getSupportFragmentManager().beginTransaction().replace(R.id.container, rechargeFragment).commit();
                        return true;
                    case R.id.customerService:
                        getSupportFragmentManager().beginTransaction().replace(R.id.container, customerServiceFragment).commit();
                        return true;
                    case R.id.Me:
                        getSupportFragmentManager().beginTransaction().replace(R.id.container, meFragment).commit();
                        return true;
                }

                return false;
            }
        });



    }
}
