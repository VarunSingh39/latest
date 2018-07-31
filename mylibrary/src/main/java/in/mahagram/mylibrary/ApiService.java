package in.mahagram.mylibrary;

import java.util.ArrayList;

import retrofit2.Call;
import retrofit2.http.GET;

public interface ApiService
{
    @GET("GetState")
    Call<ArrayList<GetStateListModel>> getStateList();
}
