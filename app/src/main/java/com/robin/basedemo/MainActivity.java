package com.robin.basedemo;

import android.net.Uri;
import android.os.Bundle;
import android.view.View;

public class MainActivity extends BaseActivity implements BlankFragment1.OnFragmentInteractionListener{

    @Override
    int getContentViewId() {
        return R.layout.activity_main;
    }

    @Override
    int getFragmentContentId() {
        return R.id.rl_content;
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(getContentViewId());
        findViewById(R.id.button1).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                addFragment(new BlankFragment1());
            }
        });
        findViewById(R.id.button2).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                removeFragment();
            }
        });
        
    }

    @Override
    public void onFragmentInteraction(Uri uri) {
        
    }
}
