package com.yadavsk.csjm.ui.about;

import android.os.Bundle;

import androidx.fragment.app.Fragment;
import androidx.viewpager.widget.ViewPager;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;

import com.bumptech.glide.Glide;
import com.example.collegeapp.R;

import java.util.ArrayList;
import java.util.List;

public class AboutFragment extends Fragment {

    private ViewPager viewPager;
    private BranchAdapter adapter;
    private List<BranchModal> list;

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View view = inflater.inflate(R.layout.fragment_about, container, false);

        list = new ArrayList<>();
        list.add(new BranchModal(R.drawable.ic_computer,"Computer Science","Computer Science and Engineering Started in year 2005.At present intake sheet in year is 60 student, and in lateral entry is 6"));
        list.add(new BranchModal(R.drawable.ic_it,"Information Technolgy","Information Technology Started in year 2005.At present intake sheet in year is 60 student, and in lateral entry is 6"));

        adapter = new BranchAdapter(getContext(), list);

        viewPager = view.findViewById(R.id.viewpager);

        viewPager.setAdapter(adapter);

        ImageView imageView = view.findViewById(R.id.college_image);
        Glide.with(getContext())
                .load("https://firebasestorage.googleapis.com/v0/b/my-college-app-2d467.appspot.com/o/gallery%2F%5BB%40da8b9e2jpg?alt=media&token=b84deb04-4816-49c5-943f-fba220f25756").into(imageView);

        return view;
    }
}