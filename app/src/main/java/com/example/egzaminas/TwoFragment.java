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
                        new DataPoint(0, number),
                        new DataPoint(1, number+1/1),
                        new DataPoint(2, number+1/2),
                        new DataPoint(3, number+1/3),
                        new DataPoint(4, number+1/4)
                });
                graph.addSeries(series);
            }catch (NumberFormatException e){
                Toast.makeText(getActivity(), "Please enter number", Toast.LENGTH_LONG).show();
            }
        }
        return v;
    }


}