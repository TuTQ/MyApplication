package com.example.tutq.myapplication;

import android.support.v4.app.Fragment;
import android.os.Bundle;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

/**
 * @author tutq
 * A placeholder fragment containing a simple view.
 *
 */
public class FragmentB extends Fragment {

    public FragmentB() {
    }


    /**
     *
     * @param inflater asda
     * @param container asddd
     * @param savedInstanceState asdasdasd
     * @return View
     */
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.fragment_main, container, false);
        TextView tv = (TextView)view.findViewById(R.id.tv_msg);
        tv.setText("B");
        return view;
    }

    @Override
    public void onResume() {
        super.onResume();
        Log.i("17", ">> onResume " + this.getClass().getSimpleName());
    }


}
