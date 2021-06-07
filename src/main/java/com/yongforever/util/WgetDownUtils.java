package com.yongforever.util;

public  class WgetDownUtils {

    public static void downFile(String wgetUrl){
        Runtime runtime = Runtime.getRuntime();
        try {
            Process process = runtime.exec(wgetUrl);
            process.waitFor();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
