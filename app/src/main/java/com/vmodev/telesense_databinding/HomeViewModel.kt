package com.vmodev.telesense_databinding

import android.util.Log
import android.widget.Toast
import androidx.databinding.BaseObservable
import androidx.databinding.Bindable
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import com.vmodev.telesense_databinding.model.StorageUnit

class HomeViewModel : BaseObservable() {

    val name:MutableLiveData<String> = MutableLiveData()
    val type:MutableLiveData<String> = MutableLiveData()
    val height:MutableLiveData<String> = MutableLiveData()
    val width:MutableLiveData<String> = MutableLiveData()
    val productType:MutableLiveData<String> = MutableLiveData()
    val moisture:MutableLiveData<String> = MutableLiveData()
    val message:MutableLiveData<String> = MutableLiveData()

    public fun onClick(){

        Log.e("ONCLICK", "onClick: ${name.value.toString()}", )
        if(name.value.toString().length<6)
        {
            message.value = "Invalid"
        }
        else
        {
            message.value = "Valid"
        }
        Log.e("ONCLICK", "onClick: ${message.value.toString()}", )

    }
}