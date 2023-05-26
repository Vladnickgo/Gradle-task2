package com.vgolubkov902.api;

import com.example.utils.StringUtil;

public class Utils {
    public static boolean isAllPositiveNumbers(String... strings) {
        if(strings==null){
            return false;
        }
        for (String string : strings) {
            if (!StringUtil.isPositiveNumber(string)) {
                return false;
            }
        }
        return true;
    }
}
