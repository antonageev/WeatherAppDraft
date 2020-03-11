package com.geekbrains.helloactivity;

import androidx.appcompat.app.AppCompatActivity;
import androidx.viewpager.widget.ViewPager;

import android.os.Bundle;
import android.view.View;
import android.widget.CompoundButton;
import android.widget.TextView;

import com.google.android.material.tabs.TabItem;
import com.google.android.material.tabs.TabLayout;

public class MainActivity extends AppCompatActivity {
    private TabLayout mainTab;
    private TextView contentTextView;
    private TabItem tabToday;
    private TabItem tabTom;
    private TabItem tabTomTom;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        initViews();
        // setContentDependingOnMainTab();

    }

    private void initViews(){
        contentTextView = findViewById(R.id.textContent);
        mainTab = findViewById(R.id.mainTab);
        tabToday = findViewById(R.id.tabToday);
        tabTom = findViewById(R.id.tabTom);
        tabTomTom = findViewById(R.id.tabTomTom);

    }

    // пока не разобрался, как повесить CLickListener на TabItem - выдает NullPointerException:
    //  Caused by: java.lang.NullPointerException: Attempt to invoke virtual method 'void android.view.View.setOnClickListener(android.view.View$OnClickListener)' on a null object reference
    //        at com.geekbrains.helloactivity.MainActivity.setContentDependingOnMainTab(MainActivity.java:40)
    /*
    private void setContentDependingOnMainTab(){
        tabToday.setOnClickListener(new CompoundButton.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (v.isSelected()) contentTextView.setText(R.string.stringContent);
            }
        });
        tabTom.setOnClickListener(new CompoundButton.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (v.isSelected()) contentTextView.setText(R.string.stringContentTom);
            }
        });
        tabTomTom.setOnClickListener(new CompoundButton.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (v.isSelected()) contentTextView.setText(R.string.stringContentTomTom);
            }
        });

    }
     */
}
