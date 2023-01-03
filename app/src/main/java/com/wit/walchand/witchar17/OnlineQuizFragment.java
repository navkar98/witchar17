package com.wit.walchand.witchar17;


import android.content.Intent;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;

import com.wit.walchand.witchar17.quiz_operations.QuizOperationsAct;


/**
 * A simple {@link Fragment} subclass.
 */
public class OnlineQuizFragment extends Fragment {

    View v;
    Button button;
    public OnlineQuizFragment() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        v = inflater.inflate(R.layout.fragment_online_quiz, container, false);
        button = (Button)v.findViewById(R.id.gotoquiz);

        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                startActivity(new Intent(getActivity().getApplicationContext(), QuizOperationsAct.class));

                     }
        });
        return v;
    }

}
