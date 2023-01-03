package com.wit.walchand.witchar17.quiz_operations;


import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.Toast;

import com.backendless.Backendless;
import com.backendless.BackendlessUser;
import com.backendless.async.callback.AsyncCallback;
import com.backendless.async.callback.BackendlessCallback;
import com.backendless.exceptions.BackendlessFault;
import com.wit.walchand.witchar17.R;


/**
 * A simple {@link Fragment} subclass.
 */
public class ForgotPassFragment extends Fragment {

    View v;
    EditText emailIdfor;

    ImageView nextForgetBtn;

    public ForgotPassFragment() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        v = inflater.inflate(R.layout.forgot_password, container, false);

        emailIdfor = (EditText) v.findViewById(R.id.emailforforget);

        nextForgetBtn = (ImageView) v.findViewById(R.id.nextForgetBtn);

        nextForgetBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {


                String forEmailId = emailIdfor.getText().toString();

                Backendless.UserService.restorePassword(forEmailId, new AsyncCallback<Void>() {

                    @Override
                    public void handleResponse(Void response) {

                        Toast.makeText(getActivity().getApplicationContext(), "Password Reset Link is sent to your email id", Toast.LENGTH_LONG).show();
                    }

                    @Override
                    public void handleFault(BackendlessFault fault) {

                    }
                });
            }
        });

        return v;

    }
}