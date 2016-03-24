package com.example.tutq.myapplication.Test;

import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import com.example.tutq.myapplication.R;

/**
 * @author tutq
 * A placeholder fragment containing a simple view.
 *
 */
public class FragmentC extends Fragment {

    public FragmentC() {
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
        tv.setText("C");
        return view;
    }

    @Override
    public void onResume() {
        super.onResume();
        Log.i("17", ">> onResume " + this.getClass().getSimpleName());
    }


}
