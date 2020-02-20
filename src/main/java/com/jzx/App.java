package com.jzx;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * main code
 * created by jizhenxuan 2020.02.20
 */
public class App {

    //stage1,use dfs
    public ArrayList<String> wordBreak1(String s, List<String> dict) {
        ArrayList<String> list = new ArrayList<>();
        dfs1(s, s.length(), "", dict, list);
        return list;
    }

    private void dfs1(String s, int index, String str, List<String> dict, List<String> list) {
        if (index <= 0) {
            if (str.length() > 0) {
                list.add(str.substring(0, str.length() - 1));
            }
        }
        for (int i = index; i >= 0; i--) {
            if (dict.contains(s.substring(i, index))) {
                dfs1(s, i, s.substring(i, index) + " " + str, dict, list);
            }
        }
    }

}
