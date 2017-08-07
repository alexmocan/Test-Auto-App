package com.example.android.autotest;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.CheckBox;
import android.widget.EditText;
import android.widget.RadioButton;
import android.widget.TextView;
import android.widget.Toast;


public class MainActivity extends AppCompatActivity {
    final int NUMBER_OF_QUESTIONS = 10;
    public int correctAnswers = 0;
    public boolean testFinished = false;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public String getStudentName() {
        //Get student name;
        EditText student = (EditText) findViewById(R.id.student_name_view);
        return student.getText().toString();
    }

    /**
     * This method is called when to get out in a string the e-mail adress that student write down in Email field - Email EditTxt).
     */
    public String getStudentEmail() {
        //Get student email;
        EditText email = (EditText) findViewById(R.id.student_email_view);
        return email.getText().toString();
    }

    /**
     * This method is called when the Finish test button is clicked.
     */
    public void checkAnswer(View view) {

        //Reset the answers.
        correctAnswers = 0;
        testFinished = false;
        String studentName = getStudentName();

        // Check if the name field is filled in and show the results;
        if (studentName.matches("")) {
            //Show a error message as a toast - the name field haven't been filled in.
            Toast.makeText(this, getString(R.string.name_error_text), Toast.LENGTH_LONG).show();
        } else {

            //Get and check if it is the correct answer for question 1;
            EditText answerOne = (EditText) findViewById(R.id.question_1_answer);
            if (answerOne.getText().toString().matches("3") || answerOne.getText().toString().equalsIgnoreCase("three")) {
                correctAnswers += 1;
            } else {
                if (answerOne.getText().toString().matches("")) {
                    Toast.makeText(this, getString(R.string.no_answer_question_1_text), Toast.LENGTH_LONG).show();
                    return;
                }
            }

            //Get and check if it is the correct answer for question 2;
            RadioButton answerTwoB = (RadioButton) findViewById(R.id.question_2_answer_2);
            if (answerTwoB.isChecked()) {
                correctAnswers += 1;
            } else {
                RadioButton answerTwoA = (RadioButton) findViewById(R.id.question_2_answer_1);
                RadioButton answerTwoC = (RadioButton) findViewById(R.id.question_2_answer_3);
                if ((!answerTwoA.isChecked()) && (!answerTwoC.isChecked())) {
                    Toast.makeText(this, getString(R.string.no_answer_question_2_text), Toast.LENGTH_LONG).show();
                    return;
                }
            }

            //Get and check if it is the correct answer for question 3;
            RadioButton answerThreeB = (RadioButton) findViewById(R.id.question_3_answer_2);
            if (answerThreeB.isChecked()) {
                correctAnswers += 1;
            } else {
                RadioButton answerThreeA = (RadioButton) findViewById(R.id.question_3_answer_1);
                RadioButton answerThreeC = (RadioButton) findViewById(R.id.question_3_answer_3);
                if ((!answerThreeA.isChecked()) && (!answerThreeC.isChecked())) {
                    Toast.makeText(this, getString(R.string.no_answer_question_3_text), Toast.LENGTH_LONG).show();
                    return;
                }
            }

            //Get and check if it is the correct answer for question 4;
            EditText answerFour = (EditText) findViewById(R.id.question_4_answer);
            if (answerFour.getText().toString().matches("2") || answerFour.getText().toString().equalsIgnoreCase("two")) {
                correctAnswers += 1;
            } else {
                if (answerFour.getText().toString().matches("")) {
                    Toast.makeText(this, getString(R.string.no_answer_question_4_text), Toast.LENGTH_LONG).show();
                    return;
                }
            }

            //Get and check if it is the correct answer for question 5;
            RadioButton answerFiveC = (RadioButton) findViewById(R.id.question_5_answer_3);
            if (answerFiveC.isChecked()) {
                correctAnswers += 1;
            } else {
                RadioButton answerFiveA = (RadioButton) findViewById(R.id.question_5_answer_1);
                RadioButton answerFiveB = (RadioButton) findViewById(R.id.question_5_answer_2);
                if ((!answerFiveA.isChecked()) && (!answerFiveB.isChecked())) {
                    Toast.makeText(this, getString(R.string.no_answer_question_5_text), Toast.LENGTH_LONG).show();
                    return;
                }
            }

            //Get and check if it is the correct answer for question 6;
            RadioButton answerSixC = (RadioButton) findViewById(R.id.question_6_answer_3);
            if (answerSixC.isChecked()) {
                correctAnswers += 1;
            } else {
                RadioButton answerSixA = (RadioButton) findViewById(R.id.question_6_answer_1);
                RadioButton answerSixB = (RadioButton) findViewById(R.id.question_6_answer_2);
                if ((!answerSixA.isChecked()) && (!answerSixB.isChecked())) {
                    Toast.makeText(this, getString(R.string.no_answer_question_6_text), Toast.LENGTH_LONG).show();
                    return;
                }
            }

            //Get and check if it is the correct answer for question 7;
            CheckBox answerSevenA = (CheckBox) findViewById(R.id.question_7_answer_1);
            CheckBox answerSevenB = (CheckBox) findViewById(R.id.question_7_answer_2);
            CheckBox answerSevenC = (CheckBox) findViewById(R.id.question_7_answer_3);
            if ((answerSevenA.isChecked()) && (answerSevenB.isChecked()) && (answerSevenC.isChecked())) {
                correctAnswers += 1;
            } else {
                if ((!answerSevenA.isChecked()) && (!answerSevenB.isChecked()) && (!answerSevenC.isChecked())) {
                    Toast.makeText(this, getString(R.string.no_answer_question_7_text), Toast.LENGTH_LONG).show();
                    return;
                }
            }

            //Get and check if it is the correct answer for question 8;
            RadioButton answerEightB = (RadioButton) findViewById(R.id.question_8_answer_2);
            if (answerEightB.isChecked()) {
                correctAnswers += 1;
            } else {
                RadioButton answerEightA = (RadioButton) findViewById(R.id.question_8_answer_1);
                RadioButton answerEightC = (RadioButton) findViewById(R.id.question_8_answer_3);
                if ((!answerEightA.isChecked()) && (!answerEightC.isChecked())) {
                    Toast.makeText(this, getString(R.string.no_answer_question_8_text), Toast.LENGTH_LONG).show();
                    return;
                }
            }

            //Get and check if it is the correct answer for question 9;
            CheckBox answerNineA = (CheckBox) findViewById(R.id.question_9_answer_1);
            CheckBox answerNineB = (CheckBox) findViewById(R.id.question_9_answer_2);
            CheckBox answerNineC = (CheckBox) findViewById(R.id.question_9_answer_3);
            if ((answerNineA.isChecked()) && (answerNineB.isChecked()) && (!answerNineC.isChecked())) {
                correctAnswers += 1;
            } else {
                if ((!answerNineA.isChecked()) && (!answerNineB.isChecked()) && (!answerNineC.isChecked())) {
                    Toast.makeText(this, getString(R.string.no_answer_question_9_text), Toast.LENGTH_LONG).show();
                    return;
                }
            }

            //Get and check if it is the correct answer for question 10;
            RadioButton answerTenB = (RadioButton) findViewById(R.id.question_10_answer_2);
            if (answerTenB.isChecked()) {
                correctAnswers += 1;
            } else {
                RadioButton answerTenA = (RadioButton) findViewById(R.id.question_10_answer_1);
                RadioButton answerTenC = (RadioButton) findViewById(R.id.question_10_answer_3);
                if ((!answerTenA.isChecked()) && (!answerTenC.isChecked())) {
                    Toast.makeText(this, getString(R.string.no_answer_question_10_text), Toast.LENGTH_LONG).show();
                    return;
                }
            }
            displayResultsMessage(createResultsSummary(studentName, correctAnswers, NUMBER_OF_QUESTIONS));
            testFinished = true;
            if (correctAnswers >= 8) {
                //Show a congrats message as a toast.
                Toast.makeText(this, getString(R.string.congrats_text), Toast.LENGTH_LONG).show();
            } else {
                //Show sorry message as a toast.
                Toast.makeText(this, getString(R.string.sorry_text), Toast.LENGTH_LONG).show();
            }
        }
    }


    /**
     * //     * This method displays the results text on the screen.
     * //
     */
    private void displayResultsMessage(String message) {
        TextView resultsMess = (TextView) findViewById(R.id.results_text);
        resultsMess.setText(message);
    }

    /**
     * This method is called when the test is finished in order to complete ans show the test results.
     *
     * @param student   is name of the student
     * @param answers   of the order
     * @param questions is the Test total number of questions
     * @return results summary
     */
    private String createResultsSummary(String student, int answers, int questions) {
        String results = getString(R.string.results_text);
        results += student;
        results += "\n" + getString(R.string.results_message_one);
        results += answers;
        results += getString(R.string.results_message_two);
        results += questions;
        results += getString(R.string.results_message_three);
        return results;
    }

    /**
     * This method is called when the Send results button is clicked.
     */
    public void sendResults(View view) {
        String studentName = getStudentName();
        String studentEmail = getStudentEmail();
        // Check if the email field is filled in and send email if it is;
        if (studentEmail.matches("")) {
            //Show a error message as a toast - the email field haven't been filled in.
            Toast.makeText(this, getString(R.string.email_error_text), Toast.LENGTH_LONG).show();
        } else {
            if (!testFinished) {
                //Show a error message as a toast when the test is not finished - FINISH TEST button was not pressed.
                Toast.makeText(this, getString(R.string.test_not_finished_text), Toast.LENGTH_LONG).show();
            } else {
                String emailSubject = getString(R.string.email_subject) + " " + studentName;
                String body = getString(R.string.email_begin);
                body += "\n" + "\n" + getString(R.string.results_message_one);
                body += correctAnswers;
                body += getString(R.string.results_message_two);
                body += NUMBER_OF_QUESTIONS;
                body += getString(R.string.results_message_three);
                body += "\n" + "\n" + getString(R.string.thank_you_text);
                composeEmail(studentEmail, emailSubject, body);
            }
        }
    }

    /**
     * This method is creates the email when is called.
     */
    public void composeEmail(String email, String subject, String body) {
        Intent emailIntent = new Intent(Intent.ACTION_SENDTO);
        emailIntent.setData(Uri.parse("mailto:" + email));
        emailIntent.putExtra(Intent.EXTRA_SUBJECT, subject);
        emailIntent.putExtra(Intent.EXTRA_TEXT, body);
        if (emailIntent.resolveActivity(getPackageManager()) != null) {
            startActivity(emailIntent);
        }
    }
}


