package com.example.egzaminas;

import android.os.Bundle;

import androidx.fragment.app.Fragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import android.widget.Toast;

import com.jjoe64.graphview.GraphView;
import com.jjoe64.graphview.series.DataPoint;
import com.jjoe64.graphview.series.LineGraphSeries;

public class TwoFragment extends Fragment {

    TextView textView;

    public TwoFragment() {
        // Required empty public constructor
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View v = inflater.inflate(R.layout.fragment_two, container, false);
        Bundle bundle = this.getArguments();
        if(bundle != null){
            String data = bundle.getString("key");
            try{
                double number = Double.parseDouble(data);
                GraphView graph = (GraphView) v.findViewById(R.id.functionGraph);
                LineGraphSeries<DataPoint> series = new LineGraphSeries<>(new DataPoint[] {
                        new DataPoint(0, 1/0+number),
                        new DataPoint(1, 1/1+number),
                        new DataPoint(2, 1/2+number),
                        new DataPoint(3, 1/3+number),
                        new DataPoint(4, 1/4+number)
                });
                graph.addSeries(series);
            }catch (NumberFormatException e){
                Toast.makeText(getActivity(), "Please enter number", Toast.LENGTH_LONG).show();
            }
        }
        return v;
    }


}