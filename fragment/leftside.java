package com.asymtask.student.fragment;

import android.os.Bundle;
import android.support.v4.app.ListFragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ListView;

public class leftside extends ListFragment {
    String[] names={"nfak","srk","keanu reeves"};
    String[] occupation={"qawwal","actor","actor"};

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {

        View v=inflater.inflate(R.layout.leftlayout,container,false);
        ArrayAdapter<String> aa=new ArrayAdapter<String>(getActivity(),android.R.layout.simple_list_item_1,names);
        setListAdapter(aa);
        return v;
    }

    @Override
    public void onListItemClick(ListView l, View v, int position, long id) {
        rightside rd=(rightside) getFragmentManager().findFragmentById(R.id.rightFragment);
        rd.change("name"+names[position],"occupation"+occupation[position]);
    }
}
