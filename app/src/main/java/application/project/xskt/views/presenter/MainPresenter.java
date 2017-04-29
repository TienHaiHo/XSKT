package application.project.xskt.views.presenter;

import com.google.gson.Gson;

import java.io.IOException;

import application.project.xskt.listeners.CallbackLottery;
import application.project.xskt.listeners.LotteryListener;
import application.project.xskt.model.Channel;
import application.project.xskt.utils.Constant;
import okhttp3.ResponseBody;
import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;
import retrofit2.Retrofit;

/**
 * Created by dkkbg_000 on 26/04/2017.
 */

public class MainPresenter {
    private Retrofit retrofit;
    private LotteryListener client;

    public MainPresenter(){
        retrofit = new Retrofit.Builder().baseUrl(Constant.URL_SERVER).build();
        client = retrofit.create(LotteryListener.class);
    }

    public void getResultLottery(final CallbackLottery callbackLottery){
        Call<ResponseBody> call = client.getResultLottery();
        call.enqueue(new Callback<ResponseBody>() {
            @Override
            public void onResponse(Call<ResponseBody> call, Response<ResponseBody> response) {
                try {
                    String responseString = response.body().string();
                    Channel responseChannel = new Gson().fromJson(responseString, Channel.class);
                    callbackLottery.onSuccess(responseChannel);
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }

            @Override
            public void onFailure(Call<ResponseBody> call, Throwable t) {
                callbackLottery.onFail();
            }
        });
    }
}
