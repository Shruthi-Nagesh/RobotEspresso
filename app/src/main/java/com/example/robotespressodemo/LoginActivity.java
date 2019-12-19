package com.example.robotespressodemo;

import android.content.Intent;
import android.os.Bundle;

import com.google.android.material.floatingactionbutton.FloatingActionButton;
import com.google.android.material.snackbar.Snackbar;

import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.Toolbar;

import android.text.TextUtils;
import android.view.View;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class LoginActivity extends AppCompatActivity implements View.OnClickListener {

    private EditText mUserName;
    private EditText mPassword;
    private Button mLogin;

    private TextView mForgotPassword;
    private TextView mErrorMessage;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Toolbar toolbar = findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);
        toolbar.setTitle("Login");
        mUserName = findViewById(R.id.userame);
        mPassword = findViewById(R.id.password);
        mLogin = findViewById(R.id.login);

        mForgotPassword = findViewById(R.id.forgotpassword);
        mErrorMessage = findViewById(R.id.error_message);

        mLogin.setOnClickListener(this);
        mForgotPassword.setOnClickListener(this);

    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_main, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        // Handle action bar item clicks here. The action bar will
        // automatically handle clicks on the Home/Up button, so long
        // as you specify a parent activity in AndroidManifest.xml.
        int id = item.getItemId();

        //noinspection SimplifiableIfStatement
        if (id == R.id.action_settings) {
            return true;
        }

        return super.onOptionsItemSelected(item);
    }

    @Override
    public void onClick(View v) {
     switch (v.getId()) {
         case R.id.login:
             if(TextUtils.isEmpty(mUserName.getText().toString()) || TextUtils.isEmpty(mPassword.getText().toString())) {

                 mErrorMessage.setVisibility(View.VISIBLE);
             } else {

                 Intent  showListIntet = new Intent(this, ShowListActivity.class);
                 startActivity(showListIntet);
                 mErrorMessage.setVisibility(View.GONE);
             }

             break;
         case R.id.forgotpassword:
             Intent  forgotPasswordIntent = new Intent(this, ForgotPassword.class);
             startActivity(forgotPasswordIntent);
             break;
     }

    }
}
