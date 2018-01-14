package com.example.konto.finalcalc;

import android.content.Context;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

public class Calc extends AppCompatActivity {
    protected TextView calculation;
    Button one,two,three,four,five,six,seven,eight,nine,plus,minus,div,mul,root,equal;
    int state =0;
    int operand =0;
    int num1=0;
    String num2;
    boolean eq=false;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_calc);
        calculation =(TextView) findViewById(R.id.textView);
        one = (Button)findViewById(R.id.buttons1);
        two = (Button)findViewById(R.id.buttons2);
        three = (Button)findViewById(R.id.buttons3);
        four = (Button)findViewById(R.id.buttons4);
        five = (Button)findViewById(R.id.buttons5);
        six = (Button)findViewById(R.id.buttons6);
        seven = (Button)findViewById(R.id.buttons7);
        eight = (Button)findViewById(R.id.buttons8);
        nine = (Button)findViewById(R.id.buttons9);
        plus = (Button)findViewById(R.id.buttonsplus);
        minus = (Button)findViewById(R.id.buttonsminus);
        mul = (Button)findViewById(R.id.buttonsmul);
        div = (Button)findViewById(R.id.buttonsdiv);
        root = (Button)findViewById(R.id.buttonsroot);
        equal = (Button)findViewById(R.id.buttonsequal);


        one.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(state==0) {
                    calculation.setText("1");

                    state = 1;
                    num1=Integer.parseInt(calculation.getText().toString());
                }
                else if(state==1) {
                    if(eq) {
                        calculation.setText("9");
                        eq = false;
                    }
                    else
                    calculation.setText(calculation.getText().toString() + "1");
                    state=1;
                    num1=Integer.parseInt(calculation.getText().toString());
                }
                else if (state==2||state==3) {
                    if(num2==null)
                        num2 ="1";
                    else
                        num2=num2+"1";
                    calculation.setText(calculation.getText().toString() + "1");
                    state = 2;
                }

            }
        });

         two.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    if(state==0) {
                        calculation.setText("2");

                        state = 1;
                        num1=Integer.parseInt(calculation.getText().toString());
                    }
                    else if(state==1) {
                        if(eq) {
                            calculation.setText("9");
                            eq = false;
                        }
                        else
                        calculation.setText(calculation.getText().toString() + "2");
                        state=1;
                        num1=Integer.parseInt(calculation.getText().toString());
                    }
                    else if (state==2||state==3) {
                        if(num2==null)
                            num2 ="2";
                        else
                            num2=num2+"2";
                        calculation.setText(calculation.getText().toString() + "3");
                        state = 2;
                    }

                }
            });
        three.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(state==0) {
                    calculation.setText("3");

                    state = 1;
                    num1=Integer.parseInt(calculation.getText().toString());
                }
                else if(state==1) {
                    if(eq) {
                        calculation.setText("9");
                        eq = false;
                    }
                    else
                    calculation.setText(calculation.getText().toString() + "3");
                    state=1;
                    num1=Integer.parseInt(calculation.getText().toString());
                }
                else if (state==2||state==3) {
                    if(num2==null)
                         num2 ="3";
                    else
                        num2=num2+"3";
                    calculation.setText(calculation.getText().toString() + "3");
                    state = 2;
                }

            }
        });
        four.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(state==0) {
                    calculation.setText("4");

                    state = 1;
                    num1=Integer.parseInt(calculation.getText().toString());
                }
                else if(state==1) {
                    if(eq) {
                        calculation.setText("9");
                        eq = false;
                    }
                    else
                    calculation.setText(calculation.getText().toString() + "4");
                    state=1;
                    num1=Integer.parseInt(calculation.getText().toString());
                }
                else if (state==2||state==3) {
                    if(num2==null)
                        num2 ="4";
                    else
                        num2=num2+"4";
                    calculation.setText(calculation.getText().toString() + "4");
                    state = 2;
                }

            }
        });
        five.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(state==0) {
                    calculation.setText("5");

                    state = 1;
                    num1=Integer.parseInt(calculation.getText().toString());
                }
                else if(state==1) {
                    if(eq) {
                        calculation.setText("9");
                        eq = false;
                    }
                    else
                    calculation.setText(calculation.getText().toString() + "5");
                    state=1;
                    num1=Integer.parseInt(calculation.getText().toString());
                }
                else if (state==2||state==3) {
                    if(num2==null)
                        num2 ="5";
                    else
                        num2=num2+"5";
                    calculation.setText(calculation.getText().toString() + "5");
                    state = 2;
                }

            }
        });
        six.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(state==0) {
                    calculation.setText("6");

                    state = 1;
                    num1=Integer.parseInt(calculation.getText().toString());
                }
                else if(state==1) {
                    if(eq) {
                        calculation.setText("9");
                        eq = false;
                    }
                    else
                    calculation.setText(calculation.getText().toString() + "6");
                    state=1;
                    num1=Integer.parseInt(calculation.getText().toString());
                }
                else if (state==2||state==3) {
                    if(num2==null)
                        num2 ="6";
                    else
                        num2=num2+"6";
                    calculation.setText(calculation.getText().toString() + "6");
                    state = 2;
                }

            }
        });
        seven.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(state==0) {
                    calculation.setText("7");

                    state = 1;
                    num1=Integer.parseInt(calculation.getText().toString());
                }
                else if(state==1) {
                    if(eq) {
                        calculation.setText("9");
                        eq = false;
                    }
                    else
                    calculation.setText(calculation.getText().toString() + "7");
                    state=1;
                    num1=Integer.parseInt(calculation.getText().toString());
                }
                else if (state==2||state==3) {
                    if(num2==null)
                        num2 ="7";
                    else
                        num2=num2+"7";
                    calculation.setText(calculation.getText().toString() + "7");
                    state = 2;
                }

            }
        });
        eight.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(state==0) {
                    calculation.setText("8");

                    state = 1;
                    num1=Integer.parseInt(calculation.getText().toString());
                }
                else if(state==1) {
                    if(eq) {
                        calculation.setText("9");
                        eq = false;
                    }
                    else
                    calculation.setText(calculation.getText().toString() + "8");
                    state=1;
                    num1=Integer.parseInt(calculation.getText().toString());
                }
                else if (state==2||state==3) {
                    if(num2==null)
                        num2 ="8";
                    else
                        num2=num2+"8";
                    calculation.setText(calculation.getText().toString() + "8");
                    state = 2;
                }

            }
        });
        nine.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(state==0) {
                    calculation.setText("9");

                    state = 1;
                    num1=Integer.parseInt(calculation.getText().toString());
                }
                else if(state==1) {
                    if(eq) {
                        calculation.setText("9");
                        eq = false;
                    }
                    else
                        calculation.setText(calculation.getText().toString() + "9");
                    state=1;
                    num1=Integer.parseInt(calculation.getText().toString());
                }
                else if (state==2||state==3) {
                    if(num2==null)
                        num2 ="9";
                    else
                        num2=num2+"9";
                    calculation.setText(calculation.getText().toString() + "9");
                    state = 2;
                }

            }
        });
        root.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(state==0) {
                    calculation.setText("0");

                    state = 1;
                    num1=Integer.parseInt(calculation.getText().toString());
                }
                else if(state==1) {
                    if(eq) {
                        calculation.setText("9");
                        eq = false;
                    }
                    else
                    calculation.setText(calculation.getText().toString() + "0");
                    state=1;
                    num1=Integer.parseInt(calculation.getText().toString());
                }
                else if (state==2||state==3) {
                    if(num2==null)
                        num2 ="0";
                    else
                        num2=num2+"0";
                    calculation.setText(calculation.getText().toString() + "0");
                    state = 2;
                }

            }
        });
        div.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(state==0||state==3) {
                    Context context = getApplicationContext();
                    CharSequence text = "Put an number!";
                    int duration = Toast.LENGTH_SHORT;

                    Toast toast = Toast.makeText(context, text, duration);
                    toast.show();
                    state = 0;
                }
                else if(state==1) {
                    calculation.setText(calculation.getText().toString() +"/");
                    operand=4;
                    state=2;
                }
                else if (state==2) {
                    int numsec=Integer.parseInt(num2);
                    num1=calculate(num1,numsec);
                    num2 = null;
                    calculation.setText(num1 + "/");
                    operand=4;
                    state = 3;
                }
            }
        });
        plus.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(state==0||state==3) {
                    Context context = getApplicationContext();
                    CharSequence text = "Put an number!";
                    int duration = Toast.LENGTH_SHORT;

                    Toast toast = Toast.makeText(context, text, duration);
                    toast.show();
                    state = 0;
                }
                else if(state==1) {
                    calculation.setText(calculation.getText().toString() +"+");
                    operand=1;
                    state=2;
                }
                else if (state==2) {
                    int numsec=Integer.parseInt(num2);
                    num1=calculate(num1,numsec);
                    num2 = null;
                    calculation.setText(num1 + "+");
                    operand=1;
                    state = 3;
                }
            }
        });
        minus.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(state==0||state==3) {
                    Context context = getApplicationContext();
                    CharSequence text = "Put an number!";
                    int duration = Toast.LENGTH_SHORT;

                    Toast toast = Toast.makeText(context, text, duration);
                    toast.show();
                    state = 0;
                }
                else if(state==1) {
                    calculation.setText(calculation.getText().toString() +"-");
                    operand=2;
                    state=2;
                }
                else if (state==2) {
                    int numsec=Integer.parseInt(num2);
                    num1=calculate(num1,numsec);
                    num2 = null;
                    calculation.setText(num1 + "-");
                    operand=2;
                    state = 3;
                }
            }
        });
        mul.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(state==0||state==3) {
                    Context context = getApplicationContext();
                    CharSequence text = "Put an number!";
                    int duration = Toast.LENGTH_SHORT;

                    Toast toast = Toast.makeText(context, text, duration);
                    toast.show();
                    state = 0;
                }
                else if(state==1) {
                    calculation.setText(calculation.getText().toString() +"*");
                    operand=3;
                    state=2;
                }
                else if (state==2) {
                    int numsec=Integer.parseInt(num2);
                    num1=calculate(num1,numsec);
                    operand=3;
                    num2 = null;
                    calculation.setText(num1 + "*");
                    state = 3;
                }
            }
        });
        equal.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(state==0||state==3) {
                    Context context = getApplicationContext();
                    CharSequence text = "Put an number!";
                    int duration = Toast.LENGTH_SHORT;

                    Toast toast = Toast.makeText(context, text, duration);
                    toast.show();
                    state = 0;
                }


                else if (state==2) {
                    int numsec=Integer.parseInt(num2);
                    num1=calculate(num1,numsec);

                    num2 = null;
                    calculation.setText(num1 + "");
                    eq=true;
                    state = 1;
                }
            }
        });

    }
    public int calculate(int num1, int num2){
        int num=0;
        switch (operand){
            case 1:
                num=num1+num2;
                break;
            case 2:
                num=num1-num2;
                break;
            case 3:
                num=num1*num2;
                break;
            case 4:
                if (num2!=0)
                    num=num1/num2;
                break;
            default:

        }
        return num;
    }


}
