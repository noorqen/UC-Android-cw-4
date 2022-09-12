package com.example.class4;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity {

    ArrayList<Student>StudentList=new ArrayList<>();
    int currentStudent = 0;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

       TextView StudentName = findViewById(R.id.textViewName);
       TextView StudentAge = findViewById(R.id.textViewAge);
       TextView StudentGrade = findViewById(R.id.textViewGrade);
       ImageView StudentImg = findViewById(R.id.imageView);
       Button Nextbutton = findViewById(R.id.button);

        Student s1 = new Student("يوسف",14,12,R.drawable.boyone);
        Student s2 = new Student("سلام",13,10,R.drawable.girltwo);
        Student s3 = new Student("ماجدة",15,11,R.drawable.girlthree);

        StudentList.add(s1);
        StudentList.add(s2);
        StudentList.add(s3);

        StudentName.setText(StudentList.get(currentStudent).getStudentName());
        StudentAge.setText(StudentList.get(currentStudent).getStudentAge() + "");
        StudentGrade.setText(StudentList.get(currentStudent).getStudentGrade() + "");
        StudentImg.setImageResource(StudentList.get(currentStudent).getStudentImg());

        Nextbutton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                currentStudent++;
                if (currentStudent==StudentList.size()){
                    currentStudent=0;
                }

                StudentName.setText(StudentList.get(currentStudent).getStudentName());
                StudentAge.setText(StudentList.get(currentStudent).getStudentAge() + "");
                StudentGrade.setText(StudentList.get(currentStudent).getStudentGrade() + "");
                StudentImg.setImageResource(StudentList.get(currentStudent).getStudentImg());


            }
        });




    }
}