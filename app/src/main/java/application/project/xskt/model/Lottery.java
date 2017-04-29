package application.project.xskt.model;

import com.google.gson.annotations.SerializedName;

import java.util.List;

/**
 * Created by dkkbg_000 on 26/04/2017.
 */

public class Lottery {
    @SerializedName("1")
    List<String> prize1;
    @SerializedName("2")
    List<String> prize2;
    @SerializedName("3")
    List<String> prize3;
    @SerializedName("4")
    List<String> prize4;
    @SerializedName("5")
    List<String> prize5;
    @SerializedName("6")
    List<String> prize6;
    @SerializedName("7")
    List<String> prize7;
    @SerializedName("8")
    List<String> prize8;
    @SerializedName("DB")
    List<String> prizeDB;

    public List<String> getPrize1() {
        return prize1;
    }

    public List<String> getPrize2() {
        return prize2;
    }

    public List<String> getPrize3() {
        return prize3;
    }

    public List<String> getPrize4() {
        return prize4;
    }

    public List<String> getPrize5() {
        return prize5;
    }

    public List<String> getPrize6() {
        return prize6;
    }

    public List<String> getPrize7() {
        return prize7;
    }

    public List<String> getPrize8() {
        return prize8;
    }

    public List<String> getPrizeDB() {
        return prizeDB;
    }
//    List<String> 1
//    AG: {
//        20-04: {
//            1: [
//            "32025"
//],
//            2: [
//            "41796"
//],
//            3: [
//            "24077",
//                    "25939"
//],
//            4: [
//            "14723",
//                    "84344",
//                    "57866",
//                    "55883",
//                    "93963",
//                    "87384",
//                    "17889"
//],
//            5: [
//            "9020"
//],
//            6: [
//            "3421",
//                    "7679",
//                    "8389"
//],
//            7: [
//            "795"
//],
//            8: [
//            "92"
//],

        }
