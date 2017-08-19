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
import android.widget.TextView;


public class BottomFragment extends Fragment {

    private static TextView topmemetext;
    private static TextView bottommemetext;

    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.bottom_fragment, container ,false);

        topmemetext = (TextView) view.findViewById(R.id.topmemetext);
        bottommemetext = (TextView) view.findViewById(R.id.bottommemetext);

        return view;
    }

    public void setMemeText(String top, String bottom){

        topmemetext.setText(top);
        bottommemetext.setText(bottom);

    }

}
