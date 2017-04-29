package application.project.xskt.model;

import com.google.gson.annotations.SerializedName;

/**
 * Created by dkkbg_000 on 26/04/2017.
 */

public class Channel {
    @SerializedName("AG")
    private AnGiang anGiang;
    @SerializedName("BD")
    private BinhDuong binhDuong;
    @SerializedName("BL")
    private BacLieu bacLieu;
    @SerializedName("BP")
    private BinhPhuoc binhPhuoc;
    @SerializedName("BTH")
    private BTH bth;
    @SerializedName("CM")
    private CaMau caMau;
    @SerializedName("CT")
    private CanTho canTho;
    @SerializedName("HCM")
    private HoChiMinh hoChiMinh;

    public AnGiang getAnGiang() {
        return anGiang;
    }

    public BinhDuong getBinhDuong() {
        return binhDuong;
    }

    public BacLieu getBacLieu() {
        return bacLieu;
    }

    public BinhPhuoc getBinhPhuoc() {
        return binhPhuoc;
    }

    public BTH getBth() {
        return bth;
    }

    public CaMau getCaMau() {
        return caMau;
    }

    public CanTho getCanTho() {
        return canTho;
    }

    public HoChiMinh getHoChiMinh() {
        return hoChiMinh;
    }

    public class AnGiang{
        @SerializedName("20-04")
        private Lottery lot1;

        public Lottery getLot1() {
            return lot1;
        }
    }

    public class BinhDuong{
        @SerializedName("14-04")
        private Lottery lot1;
        @SerializedName("21-04")
        private Lottery lot2;

        public Lottery getLot1() {
            return lot1;
        }

        public Lottery getLot2() {
            return lot2;
        }
    }

    public class BacLieu{
        @SerializedName("18-04")
        private Lottery lot1;
        @SerializedName("25-04")
        private Lottery lot2;

        public Lottery getLot1() {
            return lot1;
        }

        public Lottery getLot2() {
            return lot2;
        }
    }

    public class BinhPhuoc{
        @SerializedName("15-04")
        private Lottery lot1;
        @SerializedName("22-04")
        private Lottery lot2;

        public Lottery getLot1() {
            return lot1;
        }

        public Lottery getLot2() {
            return lot2;
        }
    }

    public class BTH{
        @SerializedName("20-04")
        private Lottery lot1;

        public Lottery getLot1() {
            return lot1;
        }
    }

    public class CaMau{
        @SerializedName("17-04")
        private Lottery lot1;
        @SerializedName("24-04")
        private Lottery lot2;

        public Lottery getLot1() {
            return lot1;
        }

        public Lottery getLot2() {
            return lot2;
        }
    }

    public class CanTho{
        @SerializedName("19-04")
        private Lottery lot1;
        @SerializedName("26-04")
        private Lottery lot2;

        public Lottery getLot1() {
            return lot1;
        }

        public Lottery getLot2() {
            return lot2;
        }
    }

    public class HoChiMinh{
        @SerializedName("17-04")
        private Lottery lot1;
        @SerializedName("22-04")
        private Lottery lot2;
        @SerializedName("24-04")
        private Lottery lot3;

        public Lottery getLot1() {
            return lot1;
        }

        public Lottery getLot2() {
            return lot2;
        }

        public Lottery getLot3() {
            return lot3;
        }
    }
}
