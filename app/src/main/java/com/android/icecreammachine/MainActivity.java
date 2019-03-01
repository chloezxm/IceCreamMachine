package com.android.icecreammachine;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.EditText;
import android.widget.RadioButton;

public class MainActivity extends AppCompatActivity {

    EditText name;
    CheckBox chocolate;
    String size;
    EditText comments;
    Button submitButton;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        name = findViewById(R.id.name);
        chocolate = findViewById(R.id.with_chocolate);
        comments = findViewById(R.id.other_comments);
        submitButton = findViewById(R.id.submit_button);
        submitButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                IceCream iceCream = new IceCream(name.getText().toString(),
                        chocolate.isChecked(), size, comments.getText().toString());
                Intent intent = new Intent(MainActivity.this, ConfirmIceCreamActivity.class);
                intent.putExtra("icecream", iceCream);
                startActivity(intent);
            }
        });
    }

    public void changeSize(View view) {
        boolean checked = ((RadioButton) view).isChecked();

        switch (view.getId()) {
            case R.id.small_size:
                if (checked) {
                    size = "small";
                }
                break;
            case R.id.medium_size:
                if (checked) {
                    size = "medium";
                }
                break;
            case R.id.large_size:
                if (checked) {
                    size = "large";
                }
                break;
        }
    }
}
