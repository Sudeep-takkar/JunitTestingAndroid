package com.example.sudeep_takkar.simple_calculator;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    private Button number_zero;
    private Button number_one;
    private Button number_two;
    private Button number_three;
    private Button number_four;
    private Button number_five;
    private Button number_six;
    private Button number_seven;
    private Button number_eight;
    private Button number_nine;
    private Button btn_plus;
    private Button btn_minus;
    private Button btn_multiply;
    private Button btn_divide;
    private Button btn_clear;
    private Button btn_equals;

    private TextView info;
    private TextView result;

    public final char ADDITION = '+';
    public final char SUBTRACTION = '-';
    public final char MULTIPLICATION = '*';
    public final char DIVISION = '/';
    public final char EQUALS = '0';
    public double val1 = Double.NaN;
    public double val2;
    public char ACTION;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        initialize();

        number_zero.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                info.setText(info.getText().toString() + "0");
            }
        });

        number_one.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                info.setText(info.getText().toString() + "1");
            }
        });

        number_two.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                info.setText(info.getText().toString() + "2");
            }
        });

        number_three.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                info.setText(info.getText().toString() + "3");
            }
        });

        number_four.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                info.setText(info.getText().toString() + "4");
            }
        });

        number_five.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                info.setText(info.getText().toString() + "5");
            }
        });

        number_six.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                info.setText(info.getText().toString() + "6");
            }
        });

        number_seven.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                info.setText(info.getText().toString() + "7");
            }
        });
        number_eight.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                info.setText(info.getText().toString() + "8");
            }
        });

        number_nine.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                info.setText(info.getText().toString() + "9");
            }
        });

        btn_plus.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Addition(true);
            }
        });

        btn_minus.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Subtraction(true);
            }
        });
        btn_clear.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Clear();
            }
        });

        btn_divide.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Division(true);
            }
        });

        btn_equals.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Equals(true);
            }
        });

        btn_multiply.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Multiplication(true);
            }
        });
    }

    private void initialize(){

        number_zero = (Button)findViewById(R.id.number0);
        number_one = (Button)findViewById(R.id.number1);
        number_two = (Button)findViewById(R.id.number2);
        number_three = (Button)findViewById(R.id.number3);

        number_four = (Button)findViewById(R.id.number4);
        number_five = (Button)findViewById(R.id.number5);
        number_six = (Button)findViewById(R.id.number6);
        number_seven = (Button)findViewById(R.id.number7);

        number_eight = (Button)findViewById(R.id.number8);
        number_nine = (Button)findViewById(R.id.number9);
        btn_clear = (Button)findViewById(R.id.btn_clear);
        btn_divide = (Button)findViewById(R.id.btn_divide);

        btn_equals = (Button)findViewById(R.id.btn_equals);
        btn_minus = (Button)findViewById(R.id.btn_minus);
        btn_multiply = (Button)findViewById(R.id.btn_multiply);
        btn_plus = (Button)findViewById(R.id.btn_plus);
        info = (TextView) findViewById(R.id.info);
        result = (TextView)findViewById(R.id.result);


    }

    public void Addition(boolean x){
        Calculate(x);
        ACTION = ADDITION;
        if(x) {
            result.setText(String.valueOf(val1) + "+");
            info.setText(null);
        }
    }

    public void Subtraction(boolean s){
        Calculate(s);
        ACTION = SUBTRACTION;
        if(s) {
            result.setText(String.valueOf(val1) + "-");
            info.setText(null);
        }
    }

    public void Multiplication(boolean m){
        Calculate(m);
        ACTION = MULTIPLICATION;
        if(m) {
            result.setText(String.valueOf(val1) + "*");
            info.setText(null);
        }
    }

    public void Division(boolean d){
        Calculate(d);
        ACTION = MULTIPLICATION;
        if(d) {
            result.setText(String.valueOf(val1) + "/");
            info.setText(null);
        }
    }

    public void Equals(boolean e){
        Calculate(e);
        ACTION = EQUALS;
        if(e) {
            result.setText(result.getText().toString() + String.valueOf(val2));
            info.setText(String.valueOf(val1));
        }
    }

    private void Clear(){
       if(info.getText().length() > 0){
           CharSequence name = info.getText().toString();
           info.setText(name.subSequence(0, name.length()-1));
       }
       else {
           val2 = Double.NaN;
           val1 = Double.NaN;
           info.setText(null);
           result.setText(null);
       }
    }

    private void Calculate(boolean c){
        if(!Double.isNaN(val1)) {
            val2 = val2 == 0 ? Double.parseDouble(info.getText().toString()) : val2;
        switch (ACTION) {
            case ADDITION:
                val1 += val2;
                break;
            case SUBTRACTION:
                val1 -= val2;
                break;
            case MULTIPLICATION:
                val1 *= val2;
                break;
            case DIVISION:
                val1 /= val2;
                break;
            case EQUALS:
                break;
        }
        }else{
            if(c) {
                val1 = Double.parseDouble(info.getText().toString());
            }
        }
    }
}
