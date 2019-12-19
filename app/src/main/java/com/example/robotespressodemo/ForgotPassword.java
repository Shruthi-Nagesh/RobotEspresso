package com.example.robotespressodemo;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.text.TextUtils;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

import androidx.annotation.Nullable;

public class ForgotPassword extends Activity implements View.OnClickListener {

    private EditText mNewPassword;
    private EditText mConfirmPassword;
    private Button mDone;
    private TextView mErrormsg;

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_forgot);
        mNewPassword = findViewById(R.id.new_password);
        mConfirmPassword = findViewById(R.id.cofirm_password);
        mDone = findViewById(R.id.done);
        mErrormsg = findViewById(R.id.error_message);

        mDone.setOnClickListener(this);

    }

    @Override
    public void onClick(View v) {

        switch (v.getId()){
            case R.id.done:
                if(TextUtils.isEmpty(mNewPassword.getText().toString()) || TextUtils.isEmpty(mConfirmPassword.getText().toString())) {
                    mErrormsg.setVisibility(View.VISIBLE);
                }else {
                    mErrormsg.setVisibility(View.GONE);
                    Intent intent = new Intent(this, LoginActivity.class);
                    startActivity(intent);
                }
                break;
        }

    }
}
