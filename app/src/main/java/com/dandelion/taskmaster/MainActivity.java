package com.dandelion.taskmaster;

import android.content.Intent;
import android.content.SharedPreferences;
import android.preference.PreferenceManager;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Button addTask = findViewById(R.id.addTask);
        addTask.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent goToAddTask = new Intent(MainActivity.this, AddTask.class);
                startActivity(goToAddTask);
            }
        });

        Button allTasks = findViewById(R.id.allTasks);
        allTasks.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent goToAllTasks = new Intent(MainActivity.this, AllTasks.class);
                startActivity(goToAllTasks);
            }
        });

        Button task1 = findViewById(R.id.btn1ToDetails);
        task1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String taskTitle= task1.getText().toString();
                Intent goToDetails = new Intent(MainActivity.this, TaskDetail.class);
                goToDetails.putExtra("title",taskTitle);
                startActivity(goToDetails);
            }
        });

        Button task2 = findViewById(R.id.btn2ToDetails);
        task2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String taskTitle = task2.getText().toString();
                Intent goToDetails = new Intent(MainActivity.this, TaskDetail.class);
                goToDetails.putExtra("title",taskTitle);
                startActivity(goToDetails);
            }
        });

        Button task3 = findViewById(R.id.btn3ToDetails);
        task3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String taskTitle = task3.getText().toString();
                Intent goToDetails = new Intent(MainActivity.this, TaskDetail.class);
                goToDetails.putExtra("title",taskTitle);
                startActivity(goToDetails);
            }
        });

        Button settings = findViewById(R.id.mainToSetting);
        settings.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent goToSettings = new Intent(MainActivity.this, Settings.class);
                startActivity(goToSettings);
            }
        });
    }

    @Override
    protected void onResume() {
        super.onResume();
        SharedPreferences sharedPreferences = PreferenceManager.getDefaultSharedPreferences(MainActivity.this);
        String username = sharedPreferences.getString("username","user");

        TextView usernameField = findViewById(R.id.textView);
        usernameField.setText(username + "'s Tasks");
    }
}