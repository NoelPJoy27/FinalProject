package algonquin.cst2335.finalproject.NewYorkTimes.UI;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import androidx.fragment.app.Fragment;


import algonquin.cst2335.finalproject.NewYorkTimes.Data.NewsData;
import algonquin.cst2335.finalproject.databinding.DetailsLayoutBinding;

public class NewsDetailsFragment extends Fragment {

    NewsData selected;


    public NewsDetailsFragment(NewsData n){
        selected = n;
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        super.onCreateView(inflater, container, savedInstanceState);
        DetailsLayoutBinding binding = DetailsLayoutBinding.inflate(inflater);

        binding.nameId.setText("Title : " + selected.getHeadline());
        binding.dateId.setText("Date : " + selected.getPubDate());
        binding.urlId.setText("URL : " + selected.getWebUrl());

        return binding.getRoot();
    }
}
