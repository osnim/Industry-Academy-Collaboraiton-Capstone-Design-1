package com.example.exex;

import java.util.List;

import retrofit2.Call;
import retrofit2.http.GET;

public interface JsonPlaceHolderApi {

    @GET("rmm/v1/data/devices/latestdata?agentId=00000001-0000-0000-0000-00D0C9F6A88D&plugin=HDD_PMQ&sensorld=/Input Register/data/list/ST500DM002-1ER14C/smart9") //포트번호 같은 느낌
    Call<List<Post>> getPosts();


}
