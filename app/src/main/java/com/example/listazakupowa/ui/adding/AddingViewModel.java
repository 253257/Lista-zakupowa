package com.example.listazakupowa.ui.adding;

import androidx.lifecycle.LiveData;
import androidx.lifecycle.MutableLiveData;
import androidx.lifecycle.ViewModel;

public class AddingViewModel extends ViewModel {

    private final MutableLiveData<String> mText;

    public AddingViewModel() {
        mText = new MutableLiveData<>();
      //  mText.setValue("This is gallery fragment");
    }

    public LiveData<String> getText() {
        return mText;
    }
}