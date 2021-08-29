package com.pcmiguel.dogwalkers;

import android.os.Bundle;

import androidx.fragment.app.Fragment;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import java.util.ArrayList;
import java.util.List;


public class HomeFragment extends Fragment {

    private View view;
    private RecyclerView recyclerViewRecommend, recyclerViewNearby;
    private List<Walker> walkerList;
    private AdapterRecommend adapterRecommend;
    private AdapterNearby adapterNearby;
    private LinearLayoutManager layoutManager;

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        view = inflater.inflate(R.layout.fragment_home, container, false);

        initData();
        initRecyclerViewRecommend();

        initRecyclerViewNearby();

        return view;
    }

    private void initData() {

        walkerList = new ArrayList<>();
        walkerList.clear();

        walkerList.add(new Walker(1, "Dan Wells", R.drawable.me, "Affenpinscher, Afghan Hound, +1", "$45.00/h"));
        walkerList.add(new Walker(1, "Dan Wells", R.drawable.me, "Affenpinscher, Afghan Hound, +1", "$45.00/h"));
        walkerList.add(new Walker(1, "Dan Wells", R.drawable.me, "Affenpinscher, Afghan Hound, +1", "$45.00/h"));
        walkerList.add(new Walker(1, "Dan Wells", R.drawable.me, "Affenpinscher, Afghan Hound, +1", "$45.00/h"));
        walkerList.add(new Walker(1, "Dan Wells", R.drawable.me, "Affenpinscher, Afghan Hound, +1", "$45.00/h"));
        walkerList.add(new Walker(1, "Dan Wells", R.drawable.me, "Affenpinscher, Afghan Hound, +1", "$45.00/h"));
        walkerList.add(new Walker(1, "Dan Wells", R.drawable.me, "Affenpinscher, Afghan Hound, +1", "$45.00/h"));

    }

    private void initRecyclerViewRecommend() {

        recyclerViewRecommend = view.findViewById(R.id.list_recommended);
        layoutManager = new LinearLayoutManager(getActivity());
        layoutManager.setOrientation(RecyclerView.VERTICAL);
        recyclerViewRecommend.setLayoutManager(layoutManager);
        adapterRecommend = new AdapterRecommend(walkerList);
        recyclerViewRecommend.setAdapter(adapterRecommend);
        adapterRecommend.notifyDataSetChanged();

    }

    private void initRecyclerViewNearby() {

        recyclerViewNearby = view.findViewById(R.id.list_nearby);
        layoutManager = new LinearLayoutManager(getActivity());
        layoutManager.setOrientation(RecyclerView.HORIZONTAL);
        recyclerViewNearby.setLayoutManager(layoutManager);
        adapterNearby = new AdapterNearby(walkerList);
        recyclerViewNearby.setAdapter(adapterNearby);
        adapterNearby.notifyDataSetChanged();

    }

}