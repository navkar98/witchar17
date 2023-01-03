package com.wit.walchand.witchar17.quiz_operations;

/**
 * Created by navkar98 on 13/03/2017.
 */

import android.app.ProgressDialog;
import android.content.DialogInterface;
import android.os.AsyncTask;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.support.v7.app.AlertDialog;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;

import com.backendless.Backendless;
import com.backendless.BackendlessUser;
import com.backendless.async.callback.BackendlessCallback;
import com.backendless.exceptions.BackendlessFault;
import com.wit.walchand.witchar17.R;


/**
 * A simple {@link Fragment} subclass.
 */
public class SignInFragment extends Fragment {

    View v;
    TextView textView, textView1;

    EditText userEmail, userPass;
    ImageView signIn;


    public SignInFragment() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {

        View v = inflater.inflate(R.layout.sign_in, container, false);

        userEmail = (EditText) v.findViewById(R.id.userEmail);
        userPass = (EditText) v.findViewById(R.id.userPass);

        signIn = (ImageView) v.findViewById(R.id.signIn);

        signIn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                new NetCheck().execute();
            }
        });


        textView = (TextView) v.findViewById(R.id.signUp);
        textView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                SignUpFragment signUpFragment = new SignUpFragment();
                android.support.v4.app.FragmentManager fragmentManager = getFragmentManager();
                fragmentManager.beginTransaction().replace(R.id.quizll, signUpFragment).commit();

            }
        });


        textView1 = (TextView) v.findViewById(R.id.forgotPass);
        textView1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                ForgotPassFragment forgotPassFragment = new ForgotPassFragment();
                android.support.v4.app.FragmentManager fragmentManager = getFragmentManager();
                fragmentManager.beginTransaction().replace(R.id.quizll, forgotPassFragment).commit();
            }
        });
        // Inflate the layout for this fragment
        return v;
    }


    private class NetCheck extends AsyncTask<String, String, Boolean> {
        private ProgressDialog nDialog;

        @Override
        protected void onPreExecute() {
        /*    super.onPreExecute();
            nDialog = new ProgressDialog(getActivity().getApplicationContext());
            nDialog.setTitle("Checking Network");
            nDialog.setMessage("Loading...");
            nDialog.setIndeterminate(false);
            nDialog.setCancelable(true);
            nDialog.show();
        */}

        /**
         * Gets current device state and checks for working internet connection by trying Google.
         */

        @Override
        protected Boolean doInBackground(String... args) {

            ConnectionDetector cd = new ConnectionDetector(getActivity().getApplicationContext());
            return cd.isConnectingToInternet();
        }

        @Override
        protected void onPostExecute(Boolean th) {

            if (th) {
          //      nDialog.dismiss();
                new ProcessLogin().execute();
            } else {
                nDialog.dismiss();
                new AlertDialog.Builder(getActivity().getApplicationContext())
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

    private class ProcessLogin extends AsyncTask<String, String, Integer> {

        private ProgressDialog pDialog;
        BackendlessUser user;

        String emailid, userpassword;
        int i = 0;

        @Override
        protected void onPreExecute() {
            super.onPreExecute();
            emailid = userEmail.getText().toString();
            userpassword = userPass.getText().toString();

            /*
            pDialog = new ProgressDialog(SignInAct.this);
            pDialog.setTitle("Contacting Servers");
            pDialog.setMessage("Logging in ...");
            pDialog.setIndeterminate(false);
            pDialog.setCancelable(false);
            pDialog.show();
  */
        }

        @Override
        protected Integer doInBackground(String... args) {

            boolean bit;
            //BackendlessUser us = Backendless.UserService.CurrentUser();

            Backendless.UserService.login(emailid, userpassword, new BackendlessCallback<BackendlessUser>() {

                @Override
                public void handleResponse(BackendlessUser response) {
                    //Toast.makeText(getApplicationContext(), "Logged In", Toast.LENGTH_SHORT).show();
                    i = 0;
                }

                @Override
                public void handleFault(BackendlessFault fault) {
                    super.handleFault(fault);
                    Toast.makeText(getActivity().getApplicationContext(), "Cant log in", Toast.LENGTH_SHORT).show();
                    i = Integer.parseInt(fault.getCode());
                }

            }, false);
            return i;
        }

        @Override
        protected void onPostExecute(Integer i) {
            //   pDialog.dismiss();

            if (i == 0) {

                //user = Backendless.UserService.CurrentUser();

                Toast.makeText(getActivity().getApplicationContext(), "Logged In: " , Toast.LENGTH_LONG).show();

                //     startActivity(new Intent(getActivity().getApplicationContext(),LoggedInAct.class));


            } else {
                Toast.makeText(getActivity().getApplicationContext(), "Error code: " + i, Toast.LENGTH_LONG).show();
            }
        }
    }

}