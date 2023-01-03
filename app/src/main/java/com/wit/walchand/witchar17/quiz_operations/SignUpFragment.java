package com.wit.walchand.witchar17.quiz_operations;

import android.app.ProgressDialog;
import android.content.DialogInterface;
import android.content.Intent;
import android.os.AsyncTask;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.support.v7.app.AlertDialog;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.Toast;

import com.backendless.Backendless;
import com.backendless.BackendlessUser;
import com.backendless.async.callback.BackendlessCallback;
import com.backendless.exceptions.BackendlessFault;
import com.wit.walchand.witchar17.R;
import com.wit.walchand.witchar17.quiz_operations.SignInFragment;

import static com.wit.walchand.witchar17.R.id.userEmail;
import static com.wit.walchand.witchar17.R.id.userPass;

/**
 * Created by navkar98 on 13/03/2017.
 */

public class SignUpFragment extends Fragment {

    View v;
    ImageView back;
    EditText name_s, email_s, pass_s, rePass_s, branch_s, mobile_s, college_s;
    ImageView signUpBtn;

    public SignUpFragment() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {

        initiaize();
        v = inflater.inflate(R.layout.sign_up, container, false);

        back = (ImageView) v.findViewById(R.id.back);


        name_s = (EditText) v.findViewById(R.id.stud_name);
        email_s = (EditText) v.findViewById(R.id.stud_email);
        pass_s = (EditText) v.findViewById(R.id.stud_pass);
        rePass_s = (EditText) v.findViewById(R.id.stud_repass);
        college_s = (EditText) v.findViewById(R.id.stud_college);
        branch_s = (EditText) v.findViewById(R.id.stud_branch);
        mobile_s = (EditText) v.findViewById(R.id.stud_mobile);

        signUpBtn = (ImageView) v.findViewById(R.id.signUpBtn);


        signUpBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
               // new NetCheck().execute();
                registere();
                Toast.makeText(getActivity().getApplicationContext(),"Hello",Toast.LENGTH_SHORT).show();

            }
        });

        back.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                SignInFragment signInFragment = new SignInFragment();
                android.support.v4.app.FragmentManager fragmentManager = getFragmentManager();
                fragmentManager.beginTransaction().replace(R.id.quizll, signInFragment).commit();
            }
        });

        // Inflate the layout for this fragment
        return v;
    }

    private void initiaize() {


    }


    private class NetCheck extends AsyncTask<String, String, Boolean> {
        private ProgressDialog nDialog;

        @Override
        protected void onPreExecute() {
            super.onPreExecute();
          /*  nDialog = new ProgressDialog(getActivity().getApplicationContext());
            nDialog.setTitle("Checking Network");
            nDialog.setMessage("Loading...");
            nDialog.setIndeterminate(false);
            nDialog.setCancelable(true);
            nDialog.show();
        */
        }

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
                //    nDialog.dismiss();
                //new ProcessLogin().execute();

                int a = registere();
            } else {

                Toast.makeText(getActivity().getApplicationContext(), "network not available", Toast.LENGTH_SHORT).show();
          /*     nDialog.dismiss();
                new AlertDialog.Builder(getActivity().getApplicationContext())
                        .setTitle("Error")
                        .setMessage("You are not connected to internet")
                        .setNegativeButton(android.R.string.yes, new DialogInterface.OnClickListener() {
                            public void onClick(DialogInterface dialog, int which) {
                            }
                        })
                        .setIcon(android.R.drawable.ic_dialog_alert)
                        .show();
                     */
            }
        }
    }

    public int registere() {


        String studname, emailid, userpassword, mobile, branch, college;
        int i = 0;

        studname = name_s.getText().toString();
        emailid = email_s.getText().toString();
        userpassword = pass_s.getText().toString();
        mobile = mobile_s.getText().toString();
        college = college_s.getText().toString();
        branch = branch_s.getText().toString();

        BackendlessUser user = new BackendlessUser();

        user.setEmail(emailid);
        user.setPassword(userpassword);

        user.setProperty("branch", branch);
        user.setProperty("College", college);
        user.setProperty("mobile", mobile);
        user.setProperty("name", studname);
        user.setProperty("points", 0);
        user.setProperty("time", 0);


        Backendless.UserService.register(user, new BackendlessCallback<BackendlessUser>() {

            @Override
            public void handleResponse(BackendlessUser response) {

                Toast.makeText(getActivity().getApplicationContext(), "done", Toast.LENGTH_SHORT).show();
                //         i=0;
            }

            @Override
            public void handleFault(BackendlessFault fault) {
                super.handleFault(fault);
                Toast.makeText(getActivity().getApplicationContext(), "Cant" + fault.getCode(), Toast.LENGTH_SHORT).show();
                //       i=1;
            }
        });
        return 1;
    }

    private class ProcessLogin extends AsyncTask<String, String, Integer> {

        private ProgressDialog pDialog;
        BackendlessUser user;

        String studname,emailid,userpassword,mobile,branch,college;
        int i = 0;

        @Override
        protected void onPreExecute() {
            super.onPreExecute();

            studname= name_s.getText().toString();
            emailid=email_s.getText().toString();
            userpassword=pass_s.getText().toString();
            mobile=mobile_s.getText().toString();
            college=college_s.getText().toString();
            branch=branch_s.getText().toString();



            BackendlessUser user=new BackendlessUser();

            user.setEmail(emailid);
            user.setPassword(userpassword);

            user.setProperty("branch",branch);
            user.setProperty("College",college);
            user.setProperty("mobile",mobile);
            user.setProperty("name",studname);
            user.setProperty("points",0);
            user.setProperty("time",0);


            Backendless.UserService.register(user, new BackendlessCallback<BackendlessUser>(){

                @Override
                public void handleResponse(BackendlessUser response) {

                    Toast.makeText(getActivity().getApplicationContext(),"done",Toast.LENGTH_SHORT).show();
                    i=0;
                }

                @Override
                public void handleFault(BackendlessFault fault) {
                    super.handleFault(fault);
                    Toast.makeText(getActivity().getApplicationContext(),"Cant"+fault.getCode(),Toast.LENGTH_SHORT).show();
                    i=1;
                }
            });

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



            BackendlessUser user=new BackendlessUser();

            user.setEmail(emailid);
            user.setPassword(userpassword);

            user.setProperty("branch",branch);
            user.setProperty("College",college);
            user.setProperty("mobile",mobile);
            user.setProperty("name",studname);
            user.setProperty("points",0);
            user.setProperty("time",0);


            Backendless.UserService.register(user, new BackendlessCallback<BackendlessUser>(){

                @Override
                public void handleResponse(BackendlessUser response) {

                    Toast.makeText(getActivity().getApplicationContext(),"done",Toast.LENGTH_SHORT).show();
                    i=0;
                }

                @Override
                public void handleFault(BackendlessFault fault) {
                    super.handleFault(fault);
                    Toast.makeText(getActivity().getApplicationContext(),"Cant"+fault.getCode(),Toast.LENGTH_SHORT).show();
                i=1;
                }
            });

            return i;
        }

        @Override
        protected void onPostExecute(Integer i) {
            //   pDialog.dismiss();

        }
    }


}
