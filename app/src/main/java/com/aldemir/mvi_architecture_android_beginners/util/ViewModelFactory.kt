package com.aldemir.mvi_architecture_android_beginners.util

import androidx.lifecycle.ViewModel
import androidx.lifecycle.ViewModelProvider
import com.aldemir.mvi_architecture_android_beginners.data.api.ApiHelper
import com.aldemir.mvi_architecture_android_beginners.data.repository.MainRepository
import com.aldemir.mvi_architecture_android_beginners.ui.main.viewmodel.MainViewModel

class ViewModelFactory(private val apiHelper: ApiHelper) : ViewModelProvider.Factory {

    override fun <T : ViewModel?> create(modelClass: Class<T>): T {
        if (modelClass.isAssignableFrom(MainViewModel::class.java)) {
            return MainViewModel(MainRepository(apiHelper)) as T
        }
        throw IllegalArgumentException("Unknown class name")
    }

}