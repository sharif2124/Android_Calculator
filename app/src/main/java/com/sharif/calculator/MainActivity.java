package com.sharif.calculator;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity{

    TextView firsttextview,secondtextview;
    String Secondvalue,operator;
    double num1,num2,result;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        firsttextview=(TextView)findViewById(R.id.firsttextviewid);
        secondtextview=(TextView)findViewById(R.id.secondtextviewid);
        Toast.makeText(this, "Welcome to Android Calculator", Toast.LENGTH_SHORT).show();




    }





    public void digitfunction(View view) {

        Secondvalue = secondtextview.getText().toString();

        if (view.getId() == R.id.zeroButtonID) {
            if (Secondvalue.equals("0")) {
                secondtextview.setText("0");
            } else {
                secondtextview.setText(Secondvalue + "0");
            }
        } else if (view.getId() == R.id.oneButtonID) {
            if (Secondvalue.equals("1")) {
                secondtextview.setText("1");
            } else {
                secondtextview.setText(Secondvalue + "1");
            }
        } else if (view.getId() == R.id.twoButtonID) {
            if (Secondvalue.equals("0")) {
                secondtextview.setText("2");
            } else {
                secondtextview.setText(Secondvalue + "2");
            }
        } else if (view.getId() == R.id.threeButtonID) {
            if (Secondvalue.equals("0")) {
                secondtextview.setText("3");
            } else {
                secondtextview.setText(Secondvalue + "3");
            }
        } else if (view.getId() == R.id.fourButtonID) {
            if (Secondvalue.equals("0")) {
                secondtextview.setText("4");
            } else {
                secondtextview.setText(Secondvalue + "4");
            }
        } else if (view.getId() == R.id.fiveButtonID) {
            if (Secondvalue.equals("0")) {
                secondtextview.setText("5");
            } else {
                secondtextview.setText(Secondvalue + "5");
            }
        } else if (view.getId() == R.id.sixButtonID) {
            if (Secondvalue.equals("0")) {
                secondtextview.setText("6");
            } else {
                secondtextview.setText(Secondvalue + "6");
            }
        } else if (view.getId() == R.id.sevenButtonID) {
            if (Secondvalue.equals("0")) {
                secondtextview.setText("7");
            } else {
                secondtextview.setText(Secondvalue + "7");
            }
        } else if (view.getId() == R.id.eightButtonID) {
            if (Secondvalue.equals("0")) {
                secondtextview.setText("8");
            } else {
                secondtextview.setText(Secondvalue + "8");
            }
        } else if (view.getId() == R.id.nineButtonID) {
            if (Secondvalue.equals("0")) {
                secondtextview.setText("9");
            }else {
            secondtextview.setText(Secondvalue + "9");
        }}
        else  {
                if (Secondvalue.equals("0")) {
                    secondtextview.setText(".");
                } else {
                    secondtextview.setText(Secondvalue + ".");
                }
            }
       




        }



    public void operatorfunction(View view) {
     Secondvalue = secondtextview.getText().toString();
     num1=Double.parseDouble(Secondvalue);
     //isNewOp=true;
     if(view.getId()==R.id.sumbuttonID)
     {
         operator="+";
     }
     else if(view.getId()==R.id.subbuttonID){
         operator="-";
     }
     else if(view.getId()==R.id.multibuttonID){
         operator="*";
     }

     else {
         operator="/";
     }
     firsttextview.setText(Secondvalue+" "+operator);
    secondtextview.setText("0");

    }

    public void resultfunction(View view) {
        num2 = Double.parseDouble(secondtextview.getText().toString());
        if(operator.equals("+")){
            result = num1+num2;
        }
        else if(operator.equals("-")){
            result = num1+num2;
        }
        else if(operator.equals("*")){
            result = num1*num2;
        }

        else {
            result = num1/num2;
        }
        firsttextview.setText(""+num1+" "+operator+" "+num2+" "+"=");
        secondtextview.setText(""+result);
    }

    public void pointfunction(View view) {
        Secondvalue = secondtextview.getText().toString();
        secondtextview.setText(Secondvalue+".");
        num2=0;
    }

    public void clearfunction(View view) {
        secondtextview.setText("");
        num1=0;
        num2=0;
        firsttextview.setText("");
    }

    public void cefunction(View view) {
        secondtextview.setText("");
        num1=0;
        num2=0;
    }

    public void percentfuction(View view) {
       double no = Double.parseDouble(secondtextview.getText().toString())/100;
       secondtextview.setText(no+"");


    }

    public void backfunction(View view) {
        secondtextview.setText("");
        num1=0;
        num2=0;

    }
}