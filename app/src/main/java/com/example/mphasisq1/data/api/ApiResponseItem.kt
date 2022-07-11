package com.example.mphasisq1.data.api


data class ApiResponseItem(
    val emailShortDesc: String,
    val fromDate: Long,
    val id: Int,
    val priorityIndicator: Boolean,
    val readIndicator: Boolean
)