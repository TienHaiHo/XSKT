package application.project.xskt.listeners;

import application.project.xskt.utils.Constant;
import okhttp3.ResponseBody;
import retrofit2.Call;
import retrofit2.http.GET;

/**
 * Created by dkkbg_000 on 26/04/2017.
 */

public interface LotteryListener {
    @GET(Constant.KQXS)
    Call<ResponseBody> getResultLottery();
}
