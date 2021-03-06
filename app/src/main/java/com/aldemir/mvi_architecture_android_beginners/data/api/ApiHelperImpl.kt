package com.aldemir.mvi_architecture_android_beginners.data.api

import com.aldemir.mvi_architecture_android_beginners.data.model.User

class ApiHelperImpl(private val apiService: ApiService) : ApiHelper {

    override suspend fun getUsers(): List<User> {
        return apiService.getUsers()
    }
}