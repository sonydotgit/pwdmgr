package com.adilash.pwdmgr;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.content.Intent;

import java.util.ArrayList;
import java.util.List;

public class PwdListActivity extends AppCompatActivity {
    RecyclerView recyclerView;

    public static List<Password> dummy = new ArrayList<>();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_pwd_list);

        recyclerView = findViewById(R.id.parent_view);


        dummy.add(new Password("accounts.google.com","adarsh","1234"));
        dummy.add(new Password("tinder.com","abhilash39","abhi123"));

        LinearLayoutManager linearLayoutManager = new LinearLayoutManager(getBaseContext(), LinearLayoutManager.VERTICAL, false);

        recyclerView.setLayoutManager(linearLayoutManager);
        PwdListAdapter pwdListAdapter = new PwdListAdapter(this, dummy);
        recyclerView.setAdapter(pwdListAdapter);
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        MenuInflater menuInflater = getMenuInflater();
        menuInflater.inflate(R.menu.add_menu,menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        switch (item.getItemId()) {
            case R.id.add_pwd:
                Intent intent = new Intent(PwdListActivity.this, AddPwdActivity.class);
                startActivity(intent);
                return true;
            default:
                return super.onOptionsItemSelected(item);
        }
    }
}
