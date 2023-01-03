package com.wit.walchand.witchar17.quiz_operations;

import android.app.ProgressDialog;
import android.content.DialogInterface;
import android.os.AsyncTask;
import android.support.v7.app.AlertDialog;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

import com.backendless.Backendless;
import com.wit.walchand.witchar17.R;

public class QuizOperationsAct extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_quiz_operations);


        new NetCheck().execute();

        SignInFragment signInFragment = new SignInFragment();
        android.support.v4.app.FragmentManager fragmentManager = getSupportFragmentManager();
        fragmentManager.beginTransaction().replace(R.id.quizll,signInFragment).commit();

    }



    private class NetCheck extends AsyncTask<String, String, Boolean> {
        private ProgressDialog nDialog;

        @Override
        protected void onPreExecute() {
            super.onPreExecute();
            nDialog = new ProgressDialog(QuizOperationsAct.this);
            nDialog.setTitle("Checking Network");
            nDialog.setMessage("Loading...");
            nDialog.setIndeterminate(false);
            nDialog.setCancelable(true);
            nDialog.show();
        }

        /**
         * Gets current device state and checks for working internet connection by trying Google.
         */

        @Override
        protected Boolean doInBackground(String... args) {

            ConnectionDetector cd = new ConnectionDetector(getApplicationContext());
            return cd.isConnectingToInternet();
        }

        @Override
        protected void onPostExecute(Boolean th) {

            if (th) {
                nDialog.dismiss();

                Backendless.initApp(getApplicationContext(), "B92BA400-617F-07DB-FFC1-3C5576A8F500", "3D4D1B50-A007-635F-FF70-A68363B8EA00", "v1");
            } else {

                nDialog.dismiss();
                new AlertDialog.Builder(QuizOperationsAct.this)
                        .setTitle("Error")
                        .setMessage("You are not connected to internet")
                        .setNegativeButton(android.R.string.yes, new DialogInterface.OnClickListener() {
                            public void onClick(DialogInterface dialog, int which) {
                            }
                        })
                        .setIcon(android.R.drawable.ic_dialog_alert)
                        .show();
            }
        }
    }

}
