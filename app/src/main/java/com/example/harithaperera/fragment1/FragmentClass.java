package com.example.harithaperera.fragment1;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

/**
 * Created by harithaperera on 2/17/17.
 */
public class FragmentClass extends Fragment{//STATIC WAY OF FRAGMNERT
//last

    @Nullable
    @Override//linking XML
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        return inflater.inflate(R.layout.fragmentlayout,container,false);
    }
}
