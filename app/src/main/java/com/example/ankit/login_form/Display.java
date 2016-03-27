package com.example.ankit.login_form;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.support.design.widget.Snackbar;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

/**
 * Created by Ankit on 12-03-2016.
 */
public class Display extends Activity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.display);

        String username = getIntent().getStringExtra("Username");
        TextView tv = (TextView) findViewById(R.id.TVusername);
        tv.setText(username);
    }

    public void onButtonClick(View v) {
        if (v.getId() == R.id.Bmapstatus)
        {
            Intent i = new Intent(Display.this, Maps_show_status.class);
            Toast temp = Toast.makeText(Display.this,"Showing Maps Status!",Toast.LENGTH_SHORT);
            temp.show();
            startActivity(i);
        }

    }
}
