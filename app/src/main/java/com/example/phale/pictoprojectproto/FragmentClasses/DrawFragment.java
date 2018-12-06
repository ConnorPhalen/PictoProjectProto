package com.example.phale.pictoprojectproto.FragmentClasses;

import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.util.DisplayMetrics;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.RelativeLayout;

import com.example.phale.pictoprojectproto.ViewClasses.PaintView;
import com.example.phale.pictoprojectproto.R;

public class DrawFragment extends Fragment {

    private PaintView paintView;
    View v;

    @Override
    public void onActivityCreated(Bundle savedInstanceState)
    {
        super.onActivityCreated(savedInstanceState);

        PaintView fragView = new PaintView(getActivity());

        DisplayMetrics metrics = new DisplayMetrics();
        // getActivity().getWindowManager().getDefaultDisplay().getMetrics(metrics);

        metrics = getResources().getDisplayMetrics();

        paintView.init(metrics);

        /*
        setContentView(R.layout.activity_main);
        paintView = (PaintView) findViewById(R.id.paintView);
        DisplayMetrics metrics = new DisplayMetrics();
        getWindowManager().getDefaultDisplay().getMetrics(metrics);
        paintView.init(metrics);
        */
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState)
    {
        PaintView fragView = new PaintView(getActivity());

        // fragView = inflater.inflate(R.layout.activity_draw, container, false);
        v = inflater.inflate(R.layout.activity_draw, container, false);

        return v;
    }


}
