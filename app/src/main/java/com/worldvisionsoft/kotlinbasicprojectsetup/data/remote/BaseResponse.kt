package com.worldvisionsoft.kotlinbasicprojectsetup.data.remote

import com.google.gson.annotations.Expose
import com.google.gson.annotations.SerializedName

class BaseResponse {
    @Expose
    @SerializedName("code")
    var statusCode: Int = 0

    @Expose
    @SerializedName("data")
    var data: Any? = null

    @Expose
    @SerializedName("message")
    var message: String? = null
}