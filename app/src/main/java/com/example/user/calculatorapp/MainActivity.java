package com.example.user.calculatorapp;

import android.graphics.Color;
import android.support.v4.content.ContextCompat;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import android.widget.RelativeLayout;


public class MainActivity extends AppCompatActivity {

    // Constants
    private static final int NONE = 0;
    private static final int ADD = 1;
    private static final int SUB = 2;
    private static final int MULT = 3;
    private static final int DIV = 4;
    private static final int EXP = 5;
    private static final int SQRT = 6;
    private static final int EQUALS = 7;
    private static final int MAX_SCREEN_SIZE = 12;


    // Buttons
    private Button button1;
    private Button button2;
    private Button button3;
    private Button button4;
    private Button button5;
    private Button button6;
    private Button button7;
    private Button button8;
    private Button button9;
    private Button button0;
    private Button buttonAdd;
    private Button buttonSub;
    private Button buttonMult;
    private Button buttonDiv;
    private Button buttonDecimal;
    private Button buttonEquals;
    private Button buttonClear;
    private Button buttonNeg;
    private Button buttonSqrt;
    private Button buttonExp;
    // Instance Variables for operation
    private TextView screenOutput;
    private String currentOnScreen;
    private boolean editable;
    private double savedNum;
    private int savedOperation;
    private boolean usingSavedNum;
    private boolean isCOS_Empty;
    private boolean isDecimal;
    private boolean alreadyPressed;


    // Set everything up when created
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        // Initialize Instance Variables
        savedNum = 0.0;
        savedOperation = NONE;
        editable = true;
        currentOnScreen = "";
        usingSavedNum = false;
        isCOS_Empty = true;
        isDecimal = false;
        alreadyPressed = false;
        button0 = (Button) findViewById(R.id.button0_ID);
        button1 = (Button) findViewById(R.id.button1_ID);
        button2 = (Button) findViewById(R.id.button2_ID);
        button3 = (Button) findViewById(R.id.button3_ID);
        button4 = (Button) findViewById(R.id.button4_ID);
        button5 = (Button) findViewById(R.id.button5_ID);
        button6 = (Button) findViewById(R.id.button6_ID);
        button7 = (Button) findViewById(R.id.button7_ID);
        button8 = (Button) findViewById(R.id.button8_ID);
        button9 = (Button) findViewById(R.id.button9_ID);
        buttonAdd = (Button) findViewById(R.id.buttonAdd_ID);
        buttonSub = (Button) findViewById(R.id.buttonSub_ID);
        buttonMult = (Button) findViewById(R.id.buttonMult_ID);
        buttonDiv = (Button) findViewById(R.id.buttonDiv_ID);
        buttonDecimal = (Button) findViewById(R.id.buttonDecimal_ID);
        buttonEquals = (Button) findViewById(R.id.buttonEquals_ID);
        buttonClear = (Button) findViewById(R.id.buttonClear_ID);
        buttonNeg = (Button) findViewById(R.id.buttonNeg_ID);
        buttonSqrt = (Button) findViewById(R.id.buttonSqrt_ID);
        buttonExp = (Button) findViewById(R.id.buttonExp_ID);
        screenOutput = (TextView) findViewById(R.id.screenOutput_ID);



        //-------------------------------------
        //      Set Up All The Listeners
        //-------------------------------------

        // The 0 Button
        button0.setOnClickListener(
                new View.OnClickListener() {
                    @Override
                    public void onClick(View view) {
                        numberButtonPress(0);

                    }
                }
        );


        // The 1 Button
        button1.setOnClickListener(
                new View.OnClickListener() {
                    @Override
                    public void onClick(View view) {
                        numberButtonPress(1);

                    }
                }
        );


        // The 2 Button
        button2.setOnClickListener(
                new View.OnClickListener() {
                    @Override
                    public void onClick(View view) {
                        numberButtonPress(2);

                    }
                }
        );


        // The 3 Button
        button3.setOnClickListener(
                new View.OnClickListener() {
                    @Override
                    public void onClick(View view) {
                        numberButtonPress(3);

                    }
                }
        );


        // The 4 Button
        button4.setOnClickListener(
                new View.OnClickListener() {
                    @Override
                    public void onClick(View view) {
                        numberButtonPress(4);

                    }
                }
        );


        // The 5 Button
        button5.setOnClickListener(
                new View.OnClickListener() {
                    @Override
                    public void onClick(View view) {
                        numberButtonPress(5);

                    }
                }
        );


        // The 6 Button
        button6.setOnClickListener(
                new View.OnClickListener() {
                    @Override
                    public void onClick(View view) {
                        numberButtonPress(6);

                    }
                }
        );


        // The 7 Button
        button7.setOnClickListener(
                new View.OnClickListener() {
                    @Override
                    public void onClick(View view) {
                        numberButtonPress(7);

                    }
                }
        );


        // The 8 Button
        button8.setOnClickListener(
                new View.OnClickListener() {
                    @Override
                    public void onClick(View view) {
                        numberButtonPress(8);

                    }
                }
        );


        // The 9 Button
        button9.setOnClickListener(
                new View.OnClickListener() {
                    @Override
                    public void onClick(View view) {
                        numberButtonPress(9);

                    }
                }
        );


        // The Add Button
        buttonAdd.setOnClickListener(
                new View.OnClickListener() {
                    @Override
                    public void onClick(View view) {
                        operationButtonPress(ADD);

                    }
                }
        );


        // The Sub Button
        buttonSub.setOnClickListener(
                new View.OnClickListener() {
                    @Override
                    public void onClick(View view) {
                        operationButtonPress(SUB);

                    }
                }
        );


        // The Mult Button
        buttonMult.setOnClickListener(
                new View.OnClickListener() {
                    @Override
                    public void onClick(View view) {
                        operationButtonPress(MULT);

                    }
                }
        );


        // The Div Button
        buttonDiv.setOnClickListener(
                new View.OnClickListener() {
                    @Override
                    public void onClick(View view) {
                        operationButtonPress(DIV);

                    }
                }
        );


        // The Exp Button
        buttonExp.setOnClickListener(
                new View.OnClickListener() {
                    @Override
                    public void onClick(View view) {
                        operationButtonPress(EXP);

                    }
                }
        );


        // The Sqrt Button
        buttonSqrt.setOnClickListener(
                new View.OnClickListener() {
                    @Override
                    public void onClick(View view) {
                        operationButtonPress(SQRT);

                    }
                }
        );


        // The Equals Button
        buttonEquals.setOnClickListener(
                new View.OnClickListener() {
                    @Override
                    public void onClick(View view) {
                        operationButtonPress(EQUALS);

                    }
                }
        );


        // The Clear Button
        buttonClear.setOnClickListener(
                new View.OnClickListener() {
                    @Override
                    public void onClick(View view) {
                        clearButtonPress();

                    }
                }
        );


        // The Neg Button
        buttonNeg.setOnClickListener(
                new View.OnClickListener() {
                    @Override
                    public void onClick(View view) {
                        negButtonPress();

                    }
                }
        );


        // The Decimal Button
        buttonDecimal.setOnClickListener(
                new View.OnClickListener() {
                    @Override
                    public void onClick(View view) {
                        decimalButtonPress();

                    }
                }
        );

    } // End of onCreate






    // Add a decimal point to operand
    private void decimalButtonPress(){
        alreadyPressed = false;
        // Only add 1 decimal to an operand
        if(!isDecimal) {
            // Add to current operand
            if (editable) {
                currentOnScreen = currentOnScreen + ".";
            }
            // First button pressed
            else {
                currentOnScreen = "0.";
                editable = true;
            }

            // Update book keeeping
            usingSavedNum = false;
            isDecimal = true;
            isCOS_Empty = false;
            // Display new operand value
            screenOutput.setText(currentOnScreen);
        }

    }// end of decimalButtonPress





    // Clear what needs to be cleared
    private void clearButtonPress(){
        if(usingSavedNum){
            currentOnScreen = "";
            savedNum = 0.0;
            savedOperation = NONE;
            usingSavedNum = false;
            isCOS_Empty = true;
            isDecimal = false;
            alreadyPressed = false;

            screenOutput.setText(Double.toString(savedNum));
            return;
        }
        else if(!alreadyPressed){
            currentOnScreen = "";
            screenOutput.setText("0");
            isCOS_Empty = true;
            isDecimal = false;

            alreadyPressed = true;
        }
        else {
            currentOnScreen = "";
            savedNum = 0.0;
            savedOperation = NONE;
            usingSavedNum = false;
            isCOS_Empty = true;
            isDecimal = false;
            alreadyPressed = false;

            screenOutput.setText(Double.toString(savedNum));
        }
    }// end of clearButtonPress




    // Turn current operand negative
    private void negButtonPress(){
        alreadyPressed = false;
        if(editable && !isCOS_Empty) {
            if(isDecimal) {
                double tempNum = Double.parseDouble(currentOnScreen);
                tempNum *= -1.0;
                currentOnScreen = Double.toString(tempNum);
                screenOutput.setText(currentOnScreen);
            }
            else{
                int tempInt = Integer.parseInt(currentOnScreen);
                tempInt *= -1;
                currentOnScreen = Integer.toString(tempInt);
                screenOutput.setText(currentOnScreen);
            }
        }
    }// end of negButtonPress






    // Build the current operand
    private void numberButtonPress(int num){
        alreadyPressed = false;
        String numStr = Integer.toString(num);
        // If still building an operand
        if(editable){
            currentOnScreen = currentOnScreen + numStr;
        }
        // Starting a new operand
        else{
            currentOnScreen = numStr;
            editable = true;
            isDecimal = false;
        }

        // Book keeping
        usingSavedNum = false;
        isCOS_Empty = false;
        // Display new operand
        screenOutput.setText(currentOnScreen);

    }// end of numberButtonPress





    // Perform an operation
    private void operationButtonPress(int operation){
        alreadyPressed = false;

        //--------------------------
        //   Calculate the value
        //--------------------------

        //  Use last operation pressed
        switch(savedOperation){
            // This is the first operation
            case NONE:
                if(!usingSavedNum && !isCOS_Empty) {
                    savedNum = Double.parseDouble(currentOnScreen);
                }
                break;
            // Addition
            case ADD:
                if(!isCOS_Empty) {
                    savedNum += Double.parseDouble(currentOnScreen);
                }
                break;
            // Subtraction
            case SUB:
                if(!isCOS_Empty) {
                    savedNum -= Double.parseDouble(currentOnScreen);
                }
                break;
            // Multiplication
            case MULT:
                if(!isCOS_Empty) {
                    savedNum *= Double.parseDouble(currentOnScreen);
                }
                break;
            // Division
            case DIV:
                if(!isCOS_Empty) {
                    savedNum = savedNum / Double.parseDouble(currentOnScreen);
                }
                break;
            // Exponent
            case EXP:
                if(!isCOS_Empty) {
                    savedNum = Math.pow(savedNum, Double.parseDouble(currentOnScreen));
                }
                break;

        }

        // Reset & update vars
        editable = false;
        currentOnScreen = "";
        isDecimal = false;
        isCOS_Empty = true;


        //-------------------------------
        //   Deal with current button
        //-------------------------------

        // Equals button
        if(operation == EQUALS) {
            // Clear saved op
            savedOperation = NONE;
            usingSavedNum = true;
        }
        // Squareroot button
        else if(operation == SQRT){
            // Calculate new value
            savedNum = Math.sqrt(savedNum);
            // Clear saved op
            savedOperation = NONE;
            usingSavedNum = true;
        }
        // Any other button
        else {
            // Save this operation
            savedOperation = operation;
        }


        //---------------------------------
        //    Format The Screen Output
        //---------------------------------

        // Convert value to string
        String savedNumStr = Double.toString(savedNum);
        // No exponent
        if(!savedNumStr.contains("E")){
            // Chop off the trailing 0 if it is an integer
            if(savedNumStr.substring(savedNumStr.length() - 2).compareTo(".0") == 0){
                savedNumStr = savedNumStr.substring(0, savedNumStr.length() - 1);
            }
            screenOutput.setText(savedNumStr);
        }
        // There is an exponent
        else{
            // Pull the exponent off
            String expStr = savedNumStr.substring(savedNumStr.indexOf("E"));
            // Calculate the sizes
            int sizeOfExp = expStr.length();
            int maxMantSize = MAX_SCREEN_SIZE - sizeOfExp;
            // Check if Mantissa needs cut down
            if(savedNumStr.indexOf("E") > maxMantSize){
                // Need to cut the mantissa down to size
                savedNumStr = savedNumStr.substring(0, maxMantSize);
                // Put the exponent back on
                savedNumStr = savedNumStr + expStr;
            }
            // Print out the savedNum
            screenOutput.setText(savedNumStr);
        }
    }// end of operationButtonPress




    // Create the overflow menu
    public boolean onCreateOptionsMenu(Menu menu){
        getMenuInflater().inflate(R.menu.menu_main, menu);
        return true;
    }// end of onCreateOptionsMenu


    // Control what happens inside menu
    public boolean onOptionsItemSelected(MenuItem item){
        RelativeLayout main_view = (RelativeLayout) findViewById(R.id.relativeLayout_ID);

        // Change color of background
        switch (item.getItemId()){
            case R.id.menu_backgroundBlack_ID:
                if(item.isCheckable()){
                    item.setChecked(false);
                }
                else{
                    item.setChecked(true);
                }
                main_view.setBackgroundColor(Color.BLACK);
                return true;
            case R.id.menu_backgroundWhite_ID:
                if(item.isCheckable()){
                    item.setChecked(false);
                }
                else{
                    item.setChecked(true);
                }
                main_view.setBackgroundColor(Color.WHITE);
                return true;
            case R.id.menu_backgroundGrey_ID:
                if(item.isCheckable()){
                    item.setChecked(false);
                }
                else{
                    item.setChecked(true);
                }
                main_view.setBackgroundColor(ContextCompat.getColor(this, R.color.myLightGrey));
                return true;
            default:
                return super.onOptionsItemSelected(item);

        }
    }// end of onOptionsItemSelected









}
