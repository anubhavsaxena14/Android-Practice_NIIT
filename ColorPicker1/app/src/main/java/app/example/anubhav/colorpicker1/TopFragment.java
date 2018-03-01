package app.example.anubhav.colorpicker1;

import android.content.Context;
import android.graphics.Color;
import android.net.Uri;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.LinearLayout;


public class TopFragment extends Fragment {

    static int a=0,b=0,c=0;
    FrameLayout topsection;

    public TopFragment() {
        // Required empty public constructor
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View v = inflater.inflate(R.layout.fragment_top, container, false);
        topsection=(FrameLayout)v.findViewById(R.id.top_fragment);
        topsection.setBackgroundColor(Color.rgb(255, 100, 255));
        computeColor(v1, v2, v3);
        return v;
    }

    public void computeColor(int a, int b, int c){
        topsection.setBackgroundColor(Color.rgb(a, b, c));
    }
}
