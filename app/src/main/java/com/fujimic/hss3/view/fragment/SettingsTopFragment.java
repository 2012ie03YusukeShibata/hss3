package com.fujimic.hss3.view.fragment;

import android.app.Activity;
import android.app.Application;
import android.content.Context;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import androidx.annotation.NonNull;
import androidx.navigation.fragment.NavHostFragment;

import com.example.myapplication.R;
import com.example.myapplication.databinding.SettingsTopFragmentBinding;
import com.fujimic.hss3.model.ModelController;
import com.fujimic.hss3.view.activity.MainActivity;
import com.fujimic.hss3.view.fragment.base.BaseFragment;
import com.fujimic.hss3.view.viewmodel.SettingsTopViewModel;

public class SettingsTopFragment extends BaseFragment {

    private SettingsTopFragmentBinding binding;

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,Bundle savedInstanceState) {
        binding = SettingsTopFragmentBinding.inflate(inflater,container, false);

        // ViewModelのセット
        binding.setViewModel(new SettingsTopViewModel());

        // データのセット
        ModelController modelController = (ModelController)getActivity().getApplicationContext();
        binding.setSettingModel(modelController.settingsModel);

        return binding.getRoot();

    }

    public void onViewCreated(@NonNull View view, Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);

        binding.buttonSetting.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                NavHostFragment.findNavController(SettingsTopFragment.this)
                        .navigate(R.id.action_return_TOP);
            }
        });
    }

    @Override
    public void onDestroyView() {
        super.onDestroyView();
        binding = null;
    }
}