package com.example.devanshu.memecreator;

/**
 * Created by devanshu on 6/6/17.
 */

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.view.View;
import android.view.ViewGroup;
import android.view.LayoutInflater;
import android.app.Activity;
import android.widget.Button;
import android.widget.EditText;

public class TopFragment extends Fragment {

    private static EditText TopText;
    private static EditText BottomText;

    TopListener activityCommander;

    public interface TopListener {
        public void createMeme(String top, String Bottom);
    }

    @Override
    public void onAttach(Activity activity) {
        super.onAttach(activity);

        try {
            activityCommander = (TopListener) activity;
        } catch (ClassCastException e) {
            throw new ClassCastException(activity.toString());
        }
    }

    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.top_fragment, container, false);

        TopText = (EditText) view.findViewById(R.id.TopText);
        BottomText = (EditText) view.findViewById(R.id.BottomText);
        final Button button = (Button) view.findViewById(R.id.button);

        button.setOnClickListener(
                new View.OnClickListener() {
                    public void onClick(View v) {
                        buttonClicked(v);
                    }
                }
        );

        return view;
    }


    public void buttonClicked(View view) {
        activityCommander.createMeme(TopText.getText().toString(), BottomText.getText().toString());
    }

}






