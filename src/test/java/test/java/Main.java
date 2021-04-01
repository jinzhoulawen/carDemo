package test.java;

import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.JSONArray;
import com.alibaba.fastjson.JSONObject;

import java.util.Scanner;

public class Main {
    private static final String apikey = "4941f35cd43d4f428ccfd5e9265088a4";
    private static final String userId = "jinzhoulawen";

    public static void main(String[] args) {
        RobotApi api = new RobotApi(apikey,userId);
        while (true){
            Scanner input = new Scanner(System.in);

            String word = input.next();

            String backString = api.getRobotResult(word);

            JSONObject jsonObject = JSON.parseObject(backString);
            JSONArray result = jsonObject.getJSONArray("results");
            for (int i = 0;i<result.size();i++){
                System.out.println(result.getJSONObject(0).getJSONObject("values").getString("text"));
            }
        }
    }
}
