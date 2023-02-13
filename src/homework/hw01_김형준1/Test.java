package homework.hw01_김형준1;

import com.google.gson.Gson;

public class Test {
    public static void main(String[] args) {
        Gson gson = new Gson();

        User user_kbh = new User("강백호", Position.POWER_FORWARD);
        User user_stw = new User("서태웅", Position.SMALL_FORWARD);
        User user_ccs = new User("채치수", Position.CENTER);
        User user_jdm = new User("정대만", Position.SHOOTING_GUARD);
        User user_sts = new User("송태섭", Position.POINT_GUARD);

        String str_kbh = gson.toJson(user_kbh);
        String str_stw = gson.toJson(user_stw);
        String str_ccs = gson.toJson(user_ccs);
        String str_jdm = gson.toJson(user_jdm);
        String str_sts = gson.toJson(user_sts);

        System.out.println(str_kbh);
        System.out.println(str_stw);
        System.out.println(str_ccs);
        System.out.println(str_jdm);
        System.out.println(str_sts);

        String json_kbh = "{\"name\":\"강백호\",\"position\":\"POWER_FORWARD\"}";
        String json_stw = "{\"name\":\"서태웅\",\"position\":\"SMALL_FORWARD\"}";
        String json_ccs = "{\"name\":\"채치수\",\"position\":\"CENTER\"}";
        String json_jdm = "{\"name\":\"정대만\",\"position\":\"SHOOTING_GUARD\"}";
        String json_sts = "{\"name\":\"송태섭\",\"position\":\"POINT_GUARD\"}";

        user_kbh = gson.fromJson(json_kbh, User.class);
        user_stw = gson.fromJson(json_stw, User.class);
        user_ccs = gson.fromJson(json_ccs, User.class);
        user_jdm = gson.fromJson(json_jdm, User.class);
        user_sts = gson.fromJson(json_sts, User.class);

        System.out.println(user_kbh.toString());
        System.out.println(user_stw.toString());
        System.out.println(user_ccs.toString());
        System.out.println(user_jdm.toString());
        System.out.println(user_sts.toString());
    }
}
