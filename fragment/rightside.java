package com.asymtask.student.fragment;

import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

public class rightside extends Fragment {
    TextView nm,occ;

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        View v=inflater.inflate(R.layout.rightlayout,container,false);
        nm=(TextView)v.findViewById(R.id.name);
        occ=(TextView)v.findViewById(R.id.occupation);
        return v;
    }

    public void change(String name,String occupation){
        nm.setText(name);
        occ.setText(occupation);
    }
}
