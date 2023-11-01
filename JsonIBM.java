package com.stunnedjava;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Scanner;
//{"hacker":"rank","input":"output"}
//{"hacker":"ranked","input":"output"}
//{"hacker":"rank","input":"output"}
//{"hacker":"ranked","input":"wrong"}
//{"hacker":"rank","input":"output"}
//{"hacker":"rank","input":"output"}
//{"hello":"world","hi":"hello","you":"me"}
//{"hello":"world","hi":"helloo","you":"me"}
//{"hello":"world","hi":"hello","you":"me"}
//{"hello":"world","hi":"helloo","you":"me","and":"fun"}
// all input are correct and accepted
public class Main {
    public static String getValue(String json,int index){
//        int i=index;
        for (int i = index; i < json.length(); i++) {
            if (json.charAt(i) == ',') {
                return  json.substring(index,i-1);
            }
            if (json.charAt(i) == '}') {
                return  json.substring(index,i-1);
            }

        }
        return "";
    }
    public static List<String> jsonquestion(String json1,String json2){
        List<String> list = new ArrayList<>();
        HashMap<String,String> map= new HashMap<>();
        int index=0;
        String str="";
        for (int i = 0; i < json1.length(); i++) {
            if (json1.charAt(i)=='{'||json1.charAt(i)=='"'||json1.charAt(i)==',') {
                if (json1.charAt(i+1) != ':') {
                    index=i+1;
                }
                continue;
            }
            if (json1.charAt(i)==':') {
                str=json1.substring(index,i-1);
                map.put(str,getValue(json1,i+2));
            }
        }
        index=0;
        for (int i = 0; i < json2.length(); i++) {
            if (json2.charAt(i)=='{'||json2.charAt(i)=='"'||json2.charAt(i)==',') {
                if (json2.charAt(i+1) != ':') {
                    index=i+1;
                }
                continue;
            }
            if (json2.charAt(i)==':') {
                str=json2.substring(index,i-1);
                String str1=map.get(str);
                String str2=getValue(json2,i+2);
                if (str1 == null) {
                    continue;
                }
                if (!str1.equals(str2)) {
                    list.add(str);
                }
                map.put(str,getValue(json1,i+2));
            }
        }

        return list;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String json1= sc.next();
        String json2= sc.next();
        List<String> list=jsonquestion(json1,json2);
        for (String i:list) {
            System.out.println(i);
        }
    }
}
