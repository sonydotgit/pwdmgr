package com.adilash.pwdmgr;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.view.View;
import android.widget.Toast;
import android.widget.Button;
import android.widget.EditText;
import android.os.Bundle;
import com.adilash.pwdmgr.R;

public class LockActivity extends AppCompatActivity {

    private Button mUnlockButton;
    private EditText mUnlockPassword;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_lock);

        mUnlockButton = findViewById(R.id.bt_show_pwd);
        mUnlockButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                mUnlockPassword = findViewById(R.id.ed_pwd);
                String edPwd = mUnlockPassword.getText().toString();

                if (edPwd.equals("adilash123")) {
                    Intent intent = new Intent(LockActivity.this, PwdListActivity.class);
                    startActivity(intent);
                } else {
                    Toast.makeText(LockActivity.this, "Wrong Password", Toast.LENGTH_SHORT).show();
                }
            }
        });
    }
}
