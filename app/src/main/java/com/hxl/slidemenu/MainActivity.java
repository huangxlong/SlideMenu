package com.hxl.slidemenu;

import android.os.Bundle;
import android.support.annotation.NonNull;
import android.support.design.widget.NavigationView;
import android.support.v4.widget.DrawerLayout;
import android.support.v7.app.AppCompatActivity;
import android.view.MenuItem;
import android.widget.Toast;

import butterknife.Bind;
import butterknife.ButterKnife;

public class MainActivity extends AppCompatActivity {


    @Bind(R.id.navigationView)
    NavigationView navigationView;
    @Bind(R.id.drawer_layout)
    DrawerLayout drawerLayout;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        ButterKnife.bind(this);


        navigationView.setNavigationItemSelectedListener(new NavigationView.OnNavigationItemSelectedListener() {
            @Override
            public boolean onNavigationItemSelected(@NonNull MenuItem item) {
                switch (item.getItemId()) {
                    case R.id.one:
                        Toast.makeText(MainActivity.this, "one", Toast.LENGTH_SHORT).show();
                        break;
                    case R.id.two:
                        Toast.makeText(MainActivity.this, "two", Toast.LENGTH_SHORT).show();
                        break;
                }
                drawerLayout.closeDrawers();  //关闭抽屉
                return true;
            }
        });
    }
}
