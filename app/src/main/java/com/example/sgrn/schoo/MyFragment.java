package com.example.sgrn.schoo;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import android.widget.Toast;

import com.android.volley.Request;
import com.android.volley.RequestQueue;
import com.android.volley.toolbox.StringRequest;
import com.android.volley.toolbox.Volley;

/**
 * Created by sgrn on 2015-03-19.
 */
public class MyFragment extends Fragment{
    private TextView textView;

    public static MyFragment getInstance(int position){
        MyFragment myFragment = new MyFragment();
        Bundle args = new Bundle();
        args.putInt("position", position);
        myFragment.setArguments(args);
        return myFragment;
    }

    @Override
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        View Layout = inflater.inflate(R.layout.upcoming_match_day, container, false);
        textView = (TextView) layout.findViewById(R.id.position);
        Bundle bundle = getArguments();
        if (bundle != null) {
            textView.setText("The Page Selected Is " + bundle.getInt("position"));
        }
        RequestQueue requestQueue= Volley.newRequestQueue(getActivity());
        StringRequest request=new StringRequest(Request.Method.GET,"http://php.net/",(response) -> {
            Toast.makeText(getActivity(),"RESPONSE "+response, Toast.LENGTH_SHORT),show();
        }, (error) -> {
            Toast.makeText(getActivity(),"ERROR "+error, Toast.LENGTH_SHORT),show();

        });
        requestQueue.add(request);
        return layout;
        /*3:23*/
    }
}
