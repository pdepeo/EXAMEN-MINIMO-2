package com.example.myapplication;

import com.example.myapplication.models.User;
import com.example.myapplication.models.UserData;
import com.google.gson.Gson;
import com.google.gson.GsonBuilder;

import java.util.List;

import retrofit2.Call;
import retrofit2.Retrofit;
import retrofit2.converter.gson.GsonConverterFactory;
import retrofit2.http.Body;
import retrofit2.http.GET;
import retrofit2.http.POST;
import retrofit2.http.Path;


public interface RetrofitAPI {
    public static final String BASE_URL = "http://147.83.7.206:8080/dsaApp/";
    @POST("user/login")
    Call<User> login(@Body UserData user);

    @POST("user/add")
    Call<User> add(@Body UserData user);

    //We add the GET method to obtain the profile of the given user
    @GET("{username}")
    Call<User> getProfile(@Path("username") String username);

    @GET ("/users/{id}")
    {
        name: 'Pepito Grillo',
                email: ‘pepito@grillo.it’
...
        avatar:
        'https://cdn.pixabay.com/photo/2017/07/11/15/51/kermit-2493979_1280.png'}

    //We specify the url

    //We add the GET method to obtain the profile of the given user
    @GET("{username}")
    Call<User> getProfile(@Path("username") String username);

    //We add the GET method to obtain the followers of the user
    @GET("{username}/{id}")
    Call<List<User>> getid (@Path("username") String username);

    static APIRest createAPIRest() {
        Gson gson = new GsonBuilder()
                .setDateFormat("yyyy-MM-dd'T'HH:mm:ssZ")
                .create();

        Retrofit retrofit = new Retrofit.Builder()
                .baseUrl(BASE_URL)
                .addConverterFactory(GsonConverterFactory.create(gson))
                .build();

        return retrofit.create(APIRest.class);
    }
    @GET("{/users/{id}
            {
            name: 'Pepito Grillo',
            email: ‘pepito@grillo.it’
            ...
            avatar:
            'https://cdn.pixabay.com/photo/2017/07/11/15/51/kermit-2493979_1280.png'}


            Call<List<User>> getAvatar(@Path("username") String username);










//
}












}