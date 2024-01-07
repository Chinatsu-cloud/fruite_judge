package org.example;

import java.util.HashMap;
import java.util.Map;

public class MapMain{

    public static void main(String[] args){
        Map<String,String>thingsMap =new HashMap<>();
        thingsMap.put("リンゴ","果物");
        thingsMap.put("ミカン","果物");
        thingsMap.put("バナナ","果物");
        thingsMap.put("スイカ","野菜");
        thingsMap.put("イチゴ","野菜");
        thingsMap.put("トマト","野菜");
        thingsMap.put("レモン","果物");
        thingsMap.put("メロン","野菜");

        System.out.println(thingsMap.get("ミカン"));
        System.out.println(thingsMap.get("トマト"));
        System.out.println(thingsMap.get("イチゴ"));
    }
}