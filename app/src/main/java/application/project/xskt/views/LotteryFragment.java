package application.project.xskt.views;

import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import application.project.xskt.R;
import application.project.xskt.listeners.CallbackLottery;
import application.project.xskt.model.Channel;
import application.project.xskt.model.Lottery;
import application.project.xskt.views.presenter.MainPresenter;

public class LotteryFragment extends Fragment {
    TextView giaiTam, giaiBay, giaiSau, giaiNam, giaiBon, giaiBa, giaiNhi, giaiNhat, giaiDacBiet;
    String strGiaiTam = "", strGiaiBay = "", strGiaiSau = "", strGiaiNam = "",
            strGiaiBon = "", strGiaiBa = "", strGiaiNhi = "", strGiaiNhat = "", strGiaiDacBiet = "";
    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        MainPresenter presenter = new MainPresenter();
        presenter.getResultLottery(new CallbackLottery() {
            @Override
            public void onSuccess(Channel resultResponse) {
                Lottery lot = resultResponse.getAnGiang().getLot1();
                for (int i =0; i<lot.getPrize8().size(); i++){
                    strGiaiTam += " "+lot.getPrize8().get(i);
                }
                giaiTam.setText(strGiaiTam);
                for (int i =0; i<lot.getPrize7().size(); i++){
                    strGiaiBay += " "+lot.getPrize7().get(i);
                }
                giaiBay.setText(strGiaiBay);

                for (int i =0; i<lot.getPrize6().size(); i++){
                    strGiaiSau += " "+lot.getPrize6().get(i);
                }
                giaiSau.setText(strGiaiSau);
                for (int i =0; i<lot.getPrize5().size(); i++){
                    strGiaiNam += " "+lot.getPrize5().get(i);
                }
                giaiNam.setText(strGiaiNam);
                for (int i =0; i<lot.getPrize4().size(); i++){
                    strGiaiBon += " "+lot.getPrize4().get(i);
                }
                giaiBon.setText(strGiaiBon);
                for (int i =0; i<lot.getPrize3().size(); i++){
                    strGiaiBa += " "+lot.getPrize3().get(i);
                }
                giaiBa.setText(strGiaiBa);
                for (int i =0; i<lot.getPrize2().size(); i++){
                    strGiaiNhi += " "+lot.getPrize2().get(i);
                }
                giaiNhi.setText(strGiaiNhi);

                for (int i =0; i<lot.getPrize1().size(); i++){
                    strGiaiNhat += " "+lot.getPrize1().get(i);
                }
                giaiNhat.setText(strGiaiNhat);

                for (int i =0; i<lot.getPrizeDB().size(); i++){
                    strGiaiDacBiet += " "+lot.getPrizeDB().get(i);
                }
                giaiDacBiet.setText(strGiaiDacBiet);
            }

            @Override
            public void onFail() {

            }
        });
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View rootView = inflater.inflate(R.layout.fragment_lottery, container, false);
        giaiTam = (TextView) rootView.findViewById(R.id.txt_ketquagiaitam);
        giaiBay = (TextView) rootView.findViewById(R.id.txt_ketquagiaibay);
        giaiSau = (TextView) rootView.findViewById(R.id.txt_ketquagiaisau);
        giaiNam = (TextView) rootView.findViewById(R.id.txt_ketquagiainam);
        giaiBon = (TextView) rootView.findViewById(R.id.txt_ketquagiaibon);
        giaiBa = (TextView) rootView.findViewById(R.id.txt_ketquagiaiba);
        giaiNhi = (TextView) rootView.findViewById(R.id.txt_ketquagiainhi);
        giaiNhat = (TextView) rootView.findViewById(R.id.txt_ketquagiainhat);
        giaiDacBiet = (TextView) rootView.findViewById(R.id.txt_ketquagiaidacbiet);
        return rootView;
    }
}
