package com.adilash.pwdmgr;

import androidx.appcompat.app.AppCompatActivity;

import android.widget.EditText;
import android.widget.Button;
import android.widget.Toast;
import android.view.View;
import android.content.Intent;
import android.os.Bundle;
import com.adilash.pwdmgr.R;

public class AddPwdActivity extends AppCompatActivity {

    private EditText edLink;
    private EditText edUser;
    private EditText edPass;
    private Button   btDone;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_addpwd);

        edLink = findViewById(R.id.ed_website);
        edUser = findViewById(R.id.ed_username);
        edPass = findViewById(R.id.ed_password);

        btDone = findViewById(R.id.bt_add_pwd);


        btDone.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String stLink = edLink.getText().toString();
                String stUser = edUser.getText().toString();
                String stPass = edPass.getText().toString();
                 
                PwdListActivity.dummy.add(new Password(stLink,stUser,stPass));

                Toast.makeText(AddPwdActivity.this, "Added", Toast.LENGTH_SHORT).show();

                Intent intent = new Intent(AddPwdActivity.this, PwdListActivity.class);
                startActivity(intent);
            }
        });

    }
}
