package com.fujimic.hss3.view.viewmodel;

import androidx.databinding.ObservableInt;

import com.example.myapplication.R;
import com.fujimic.hss3.view.viewmodel.base.BaseViewModel;

public class SettingsTopViewModel extends BaseViewModel {
    public ObservableInt backlightBrightness;

    public SettingsTopViewModel(){

    }

    public int setBackGroundImage(int i){
//        if(i==1){
//        }
//        else{
//            return R.drawable.base_background;
//        }
        return R.drawable.base_background;
    }

    public void onModifyButtonClicked(){

        System.out.println("modifyボタン押下");
    }
}
