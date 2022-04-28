package com.example.homework3_1

import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel

class ViewModelData : ViewModel() {
    var textMutableLiveData = MutableLiveData<String>()

    fun setText(s: String?) {
        textMutableLiveData.value = s
    }
}