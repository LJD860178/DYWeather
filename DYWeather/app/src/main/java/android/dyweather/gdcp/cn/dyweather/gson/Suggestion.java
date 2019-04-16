package android.dyweather.gdcp.cn.dyweather.gson;

import com.google.gson.annotations.SerializedName;

public class Suggestion {
    @SerializedName("comf")
    public Conmf comf;
    @SerializedName("cw")
    public CarWash carWash;
    public Sport sport;
    public class Conmf{
        @SerializedName("txt")
        public String info;
    }
    public class CarWash{
        @SerializedName("txt")
        public String info;
    }
    public class Sport{
        @SerializedName("txt")
        public String info;
    }

}
