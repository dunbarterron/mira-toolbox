package org.mira.companion.Fragments;


import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import org.mira.companion.R;

import butterknife.BindView;
import butterknife.ButterKnife;

/**
 * A simple {@link Fragment} subclass.
 */
public class DevicesFragment extends Fragment {


    @BindView(R.id.devicesRecyclerView)
    RecyclerView devicesRecyclerView;


    public DevicesFragment() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View v =  inflater.inflate(R.layout.fragment_devices, container, false);
        ButterKnife.bind(this, v);
        // For debuggin purpose
        ButterKnife.setDebug(true);

        return v;

    }

}
