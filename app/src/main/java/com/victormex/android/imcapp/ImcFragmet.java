package com.victormex.android.imcapp;

import android.app.Fragment;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

/**
 * Created by Toshiba on 22/03/2018.
 */

public class ImcFragmet extends android.support.v4.app.Fragment{
    @Override
    public void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
    }

    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater,
                             @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
                            View v = inflater.inflate(R.layout.fragment_imc, container, false);
                            return v;
    }
}
