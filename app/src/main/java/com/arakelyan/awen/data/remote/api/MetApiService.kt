package com.arakelyan.awen.data.remote.api

import MetObject
import com.arakelyan.awen.data.remote.dto.Department
import retrofit2.http.GET
import retrofit2.http.Query


interface AwenApiService {
    @GET("/departments")
    suspend fun getDepartments(): List<Department>

    @GET("/objects?")
    suspend fun getObjects(@Query("departmentIds") departmentId: Int): List<MetObject>
}