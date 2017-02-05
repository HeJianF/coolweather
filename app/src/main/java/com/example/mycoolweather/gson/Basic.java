package com.example.mycoolweather.gson;

import com.google.gson.annotations.SerializedName;

/**
 * Created by Lenovo on 2017/2/5.
 */

public class Basic {

    @SerializedName("city")
    public String cityName;

    @SerializedName("id")
    public String weatherId;

    public Update update;

    public class Update{

        @SerializedName("loc")
        public String updateTime;

    }
}
