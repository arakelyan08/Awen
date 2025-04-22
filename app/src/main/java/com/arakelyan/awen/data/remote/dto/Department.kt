package com.arakelyan.awen.data.remote.dto

import kotlinx.serialization.SerialName
import kotlinx.serialization.Serializable

@Serializable
data class Department(
    @SerialName("departmentId")
    val id: Int,
    @SerialName("displayName")
    val name: String
)