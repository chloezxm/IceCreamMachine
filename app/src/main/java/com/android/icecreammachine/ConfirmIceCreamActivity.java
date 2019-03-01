package com.android.icecreammachine;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;

public class ConfirmIceCreamActivity extends AppCompatActivity {

    TextView confirmIceCream;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_confirm_ice_cream);

        confirmIceCream = findViewById(R.id.ice_cream_info);
        IceCream iceCream = (IceCream) getIntent().getSerializableExtra("icecream");
        confirmIceCream.setText(iceCream.toString());
    }
}
