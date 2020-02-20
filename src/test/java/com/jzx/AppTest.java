package com.jzx;

import org.junit.Test;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import static org.junit.Assert.*;

public class AppTest {

    @Test
    public void wordBreak1() {
        App app = new App();
        List<String> dictionary = Arrays.asList(new String[]{"i","like","sam","sung","samsung","mobile","ice","cream","man","go"});
        //stage1
        ArrayList<String> wordBreak1 = app.wordBreak1("ilikesamsungmobile", dictionary);
        for (String s : wordBreak1) {
            System.out.println(s);
        }
    }

}