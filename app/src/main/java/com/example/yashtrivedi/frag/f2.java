package com.example.yashtrivedi.frag;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

/**
 * Created by yashtrivedi on 29/02/16.
 */
public class f2 extends Fragment {

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        View v = inflater.inflate(R.layout.frag_2,container,false);
        Bundle b = getArguments();
        TextView t = (TextView) v.findViewById(R.id.t2);
        t.setText(b.getString("text"));
        return v;
    }
}
