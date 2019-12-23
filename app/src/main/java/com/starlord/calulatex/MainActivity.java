package com.starlord.calulatex;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

import java.text.DecimalFormat;

public class MainActivity extends AppCompatActivity {

    private static final char ADDITION = '+';
    private static final char SUBTRACTION = '-';
    private static final char MULTIPLICATION = '*';
    private static final char DIVISION = '/';

    private char CURRENT_ACTION;

    private double valueOne = Double.NaN;
    private double valueTwo = 0;

    private DecimalFormat decimalFormat;

    EditText editText;
    TextView infoTextView;
    String Space = "";
    String Dot = ".";
    int flag = 0;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        decimalFormat = new DecimalFormat("#.##########");
        setContentView(R.layout.activity_main);

        editText = findViewById(R.id.editText);
        infoTextView = findViewById(R.id.infoTextView);
        Button buttonDot = findViewById(R.id.buttonDot);
        Button buttonZero = findViewById(R.id.buttonZero);
        Button buttonOne = findViewById(R.id.buttonOne);
        Button buttonTwo = findViewById(R.id.buttonTwo);
        Button buttonThree = findViewById(R.id.buttonThree);
        Button buttonFour = findViewById(R.id.buttonFour);
        Button buttonFive = findViewById(R.id.buttonFive);
        Button buttonSix = findViewById(R.id.buttonSix);
        Button buttonSeven = findViewById(R.id.buttonSeven);
        Button buttonEight = findViewById(R.id.buttonEight);
        Button buttonNine = findViewById(R.id.buttonNine);
        Button buttonAdd = findViewById(R.id.buttonAdd);
        Button buttonSubtract = findViewById(R.id.buttonSubtract);
        Button buttonMultiply = findViewById(R.id.buttonMultiply);
        Button buttonDivide = findViewById(R.id.buttonDivide);
        Button buttonEqual = findViewById(R.id.buttonEqual);
        Button buttonClear = findViewById(R.id.buttonClear);


        buttonDot.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (flag == 0) {
                    editText.setText(editText.getText().toString() + ".");
                }
            }
        });

        buttonZero.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (flag == 0) {
                    editText.setText(editText.getText().toString() + "0");
                }
            }
        });

        buttonOne.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (flag == 0) {
                    editText.setText(editText.getText().toString() + "1");
                }
            }
        });

        buttonTwo.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (flag == 0) {
                    editText.setText(editText.getText().toString() + "2");
                }
            }
        });

        buttonThree.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (flag == 0) {
                    editText.setText(editText.getText().toString() + "3");
                }
            }
        });

        buttonFour.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (flag == 0) {
                    editText.setText(editText.getText().toString() + "4");
                }
            }
        });

        buttonFive.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (flag == 0) {
                    editText.setText(editText.getText().toString() + "5");
                }
            }
        });

        buttonSix.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (flag == 0) {
                    editText.setText(editText.getText().toString() + "6");
                }
            }
        });

        buttonSeven.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (flag == 0) {
                    editText.setText(editText.getText().toString() + "7");
                }
            }
        });

        buttonEight.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (flag == 0) {
                    editText.setText(editText.getText().toString() + "8");
                }
            }
        });

        buttonNine.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (flag == 0) {
                    editText.setText(editText.getText().toString() + "9");
                }
            }
        });

        buttonAdd.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (!Space.equals(editText.getText().toString())) {
                    computeCalculation();
                    CURRENT_ACTION = ADDITION;
                    infoTextView.setText(decimalFormat.format(valueOne) + "+");
                    editText.setText(null);
                }
                if (flag == 1) {
                    infoTextView.setText(null);
                    editText.setText(decimalFormat.format(valueOne) + "+");
                    infoTextView.setText(decimalFormat.format(valueOne) + "+");
                    CURRENT_ACTION = ADDITION;
                    editText.setText(null);
                    flag = 0;
                }
            }
        });

        buttonSubtract.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (!Space.equals(editText.getText().toString())) {
                    computeCalculation();
                    CURRENT_ACTION = SUBTRACTION;
                    infoTextView.setText(decimalFormat.format(valueOne) + "-");
                    editText.setText(null);
                }
                if (flag == 1) {
                    infoTextView.setText(null);
                    editText.setText(decimalFormat.format(valueOne) + "-");
                    infoTextView.setText(decimalFormat.format(valueOne) + "-");
                    CURRENT_ACTION = SUBTRACTION;
                    editText.setText(null);
                    flag = 0;
                }
            }
        });

        buttonMultiply.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (!Space.equals(editText.getText().toString())) {
                    computeCalculation();
                    CURRENT_ACTION = MULTIPLICATION;
                    infoTextView.setText(decimalFormat.format(valueOne) + "*");
                    editText.setText(null);
                }
                if (flag == 1) {
                    infoTextView.setText(null);
                    editText.setText(decimalFormat.format(valueOne) + "*");
                    infoTextView.setText(decimalFormat.format(valueOne) + "*");
                    CURRENT_ACTION = MULTIPLICATION;
                    editText.setText(null);
                    flag = 0;
                }
            }
        });

        buttonDivide.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (!Space.equals(editText.getText().toString())) {
                    computeCalculation();
                    CURRENT_ACTION = DIVISION;
                    infoTextView.setText(decimalFormat.format(valueOne) + "/");
                    editText.setText(null);
                }
                if (flag == 1) {
                    infoTextView.setText(null);
                    editText.setText(decimalFormat.format(valueOne) + "/");
                    infoTextView.setText(decimalFormat.format(valueOne) + "/");
                    CURRENT_ACTION = DIVISION;
                    editText.setText(null);
                    flag = 0;
                }
            }
        });


        buttonEqual.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (!Space.equals(editText.getText().toString()) && CURRENT_ACTION != 0) {
                    computeCalculation();
                    infoTextView.setText(infoTextView.getText().toString() +
                            decimalFormat.format(valueTwo) + " = " + decimalFormat.format(valueOne));
                    //valueOne = Double.NaN;
                    flag = 1;
                    CURRENT_ACTION = '0';
                }
            }
        });

        buttonClear.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (editText.getText().length() > 0) {
                    CharSequence currentText = editText.getText();
                    editText.setText(currentText.subSequence(0, currentText.length() - 1));
                } else {
                    valueOne = Double.NaN;
                    valueTwo = Double.NaN;
                    flag = 0;
                    editText.setText("");
                    infoTextView.setText("");
                }
            }
        });
    }

    private void computeCalculation() {
        if (!Double.isNaN(valueOne)) {
            if (!Dot.equals(editText.getText().toString())) {
                valueTwo = Double.parseDouble(editText.getText().toString());
                editText.setText(null);

                if (CURRENT_ACTION == ADDITION)
                    valueOne = this.valueOne + valueTwo;
                else if (CURRENT_ACTION == SUBTRACTION)
                    valueOne = this.valueOne - valueTwo;
                else if (CURRENT_ACTION == MULTIPLICATION)
                    valueOne = this.valueOne * valueTwo;
                else if (CURRENT_ACTION == DIVISION)
                    valueOne = this.valueOne / valueTwo;
            } else if (Dot.equals(editText.getText().toString())) {
                valueTwo = 0;
                editText.setText(null);

                if (CURRENT_ACTION == ADDITION)
                    valueOne = this.valueOne + valueTwo;
                else if (CURRENT_ACTION == SUBTRACTION)
                    valueOne = this.valueOne - valueTwo;
                else if (CURRENT_ACTION == MULTIPLICATION)
                    valueOne = this.valueOne * valueTwo;
                else if (CURRENT_ACTION == DIVISION)
                    valueOne = this.valueOne / valueTwo;
            }
        } else {
            try {
                valueOne = Double.parseDouble(editText.getText().toString());
            } catch (Exception e) {
            }
        }
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        getMenuInflater().inflate(R.menu.options_menu, menu);
        return super.onCreateOptionsMenu(menu);
    }

    @Override
    public boolean onOptionsItemSelected(@NonNull MenuItem item) {
        if (item.getItemId() == R.id.about) {
            Intent intent = new Intent(getApplicationContext(), About.class);
            startActivity(intent);
        }
        return super.onOptionsItemSelected(item);
    }

}
