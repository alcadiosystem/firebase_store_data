package com.alcadio.cityguideapp.common.presentation.activities;

import android.os.Bundle;
import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;

public class BaseActivity extends AppCompatActivity {

    public interface BackListener{
        void onBackPressed();
    }


    private BackListener backListener;


    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
    }

    public void setBackListener(BackListener backListener) {
        this.backListener = backListener;
    }

    @Override
    public void onBackPressed() {
        if(backListener != null){
            backListener.onBackPressed();
            return;
        }
        super.onBackPressed();
    }
}
