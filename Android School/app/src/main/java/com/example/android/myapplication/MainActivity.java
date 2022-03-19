package com.example.android.myapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.ListView;
import android.widget.Toast;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {
    /**
     *  عرفوا مصفوفة بإسم students
     *  define an arraylist named students
     */
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        ListView listView = findViewById(R.id.studentListView);

        /**
         *إكتبوا الكود بعد هذا السطر
         *  ضيفوا عناصر من الكلاس
         *  add objects from class Student
         */

        StudentAdapter studentAdapter = new StudentAdapter(this,0,students);
        Student s1 = new Student ("yousef",80,17,R.drawable.boy1);
        Student s2 = new Student ("salman",99,17,R.drawable.boy1);
        Student s3 = new Student ("majed",90,17,R.drawable.boy1);
        ArrayList<Student> students = new ArrayList<>();
        students.add(s1);
        listView.setAdapter(studentAdapter);
    }
}