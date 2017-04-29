package application.project.xskt.listeners;

import application.project.xskt.model.Channel;

/**
 * Created by dkkbg_000 on 26/04/2017.
 */

public interface CallbackLottery {
    void onSuccess(Channel resultResponse);
    void onFail();
}
