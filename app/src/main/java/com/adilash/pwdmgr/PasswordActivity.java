package com.adilash.pwdmgr;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.TextView;
import android.view.Menu;
import android.content.Intent;
import android.view.MenuInflater;
import com.adilash.pwdmgr.R;

public class PasswordActivity extends AppCompatActivity {
    
    private TextView tvLink;
    private TextView tvUsername;
    private TextView tvPassword; 

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_password);

        tvLink = findViewById(R.id.tv_link);
        tvUsername = findViewById(R.id.tv_set_user);
        tvPassword = findViewById(R.id.tv_set_password);

        Intent intent = getIntent();
        String itemLink = intent.getStringExtra("linkItem");
        String itemUser = intent.getStringExtra("userItem");
        String itemPass = intent.getStringExtra("passItem");

        tvLink.setText(itemLink);
        tvUsername.setText(itemUser);
        tvPassword.setText(itemPass);
    }

//    @Override
//    public boolean onCreateOptionsMenu(Menu menu) {
//        MenuInflater menuInflater = getMenuInflater();
//        menuInflater.inflate(R.menu.edit_menu,menu);
//        return true;
//    }
}
