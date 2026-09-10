package com.chitegy.app;

import android.app.Activity;
import android.os.Bundle;
import android.graphics.Color;
import android.view.Gravity;
import android.widget.LinearLayout;
import android.widget.TextView;
import android.widget.Button;
import android.widget.Toast;

public class MainActivity extends Activity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        LinearLayout layout = new LinearLayout(this);
        layout.setOrientation(LinearLayout.VERTICAL);
        layout.setGravity(Gravity.CENTER);
        layout.setPadding(30, 30, 30, 30);

        TextView title = new TextView(this);
        title.setText("Welcome to Chitegy");
        title.setTextSize(28);
        title.setTextColor(Color.BLACK);
        title.setGravity(Gravity.CENTER);

        Button button = new Button(this);
        button.setText("Click Me");

        button.setOnClickListener(v ->
            Toast.makeText(
                this,
                "Hello from Chitegy!",
                Toast.LENGTH_SHORT
            ).show()
        );

        layout.addView(title);
        layout.addView(button);

        setContentView(layout);
    }
}
