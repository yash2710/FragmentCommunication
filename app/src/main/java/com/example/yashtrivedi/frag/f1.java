package com.example.yashtrivedi.frag;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.EditText;

/**
 * Created by yashtrivedi on 29/02/16.
 */
public class f1 extends Fragment {

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        View v =  inflater.inflate(R.layout.frag_1, container, false);
        Button button = (Button) v.findViewById(R.id.btn);
        final EditText editText = (EditText) v.findViewById(R.id.t1);
        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Bundle b = new Bundle();
                b.putString("text", editText.getText().toString());
                Fragment f2 = new f2();
                f2.setArguments(b);
                FragmentManager fm = getActivity().getSupportFragmentManager();
                fm.beginTransaction().replace(R.id.f2,f2).commit();
            }
        });

        return v;
    }
}
