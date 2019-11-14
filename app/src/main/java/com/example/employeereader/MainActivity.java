package com.example.employeereader;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity
{
    String BigList = "";
    @Override
    protected void onCreate(Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }
    public void EmployeeEnterData(View v)
    {
        TextView DisplayScreen = this.findViewById(R.id.DisplayScreen);
        TextView FirstName = this.findViewById(R.id.FirstName);
        TextView LastName = this.findViewById(R.id.LastName);
        TextView Height = this.findViewById(R.id.Height);
        TextView Weight = this.findViewById(R.id.Weight);
        TextView Age = this.findViewById(R.id.Age);
        String FN = FirstName.getText().toString();
        String LN = LastName.getText().toString();
        String H = Height.getText().toString();
        String W = Weight.getText().toString();
        String A = Age.getText().toString();
        EmployeeEntry CurrentEmployee = new EmployeeEntry(FN, LN, W, H, A);
        String Listed = CurrentEmployee.CreateList();
        DisplayScreen.setText(Listed);
    }
}
