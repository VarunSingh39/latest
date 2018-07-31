package in.mahagram.mylibrary;



import java.util.ArrayList;

import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;

public class GetData  {
    ArrayList<GetStateListModel> data;
   // listener listener=GetData.this;

    public GetData()
    {}

    public void getStateList(final listener listener)
    {
        // =new ArrayList<>();
       ApiService apiService=RetroClient.getApiService("http://hybrid.egram.org/MobApi/");
        Call<ArrayList<GetStateListModel>> call=apiService.getStateList();
        call.enqueue(new Callback<ArrayList<GetStateListModel>>() {
            @Override
            public void onResponse(Call<ArrayList<GetStateListModel>> call, Response<ArrayList<GetStateListModel>> response) {
                data=response.body();
                listener.getStateList(response.body());

            }

            @Override
            public void onFailure(Call<ArrayList<GetStateListModel>> call, Throwable t) {

            }
        });




    }


}
