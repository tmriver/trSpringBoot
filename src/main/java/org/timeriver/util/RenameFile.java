package org.timeriver.util;

import java.io.File;
import java.util.Date;

public class RenameFile {
    private static final String DIR = "F:/2/";
    public static void main(String[] args) throws Exception {
        File dir = new File(DIR);
        File[] files = dir.listFiles();
        for (File file : files) {
            String name = file.getName();
            String finalName = null;
            if(name.matches("\\d{13}\\..{3}")){
                String[] split = name.split("\\.");
                Date date = new Date(Long.valueOf(split[0]));
                String formatTime = DateUtil.formatTime(date);
                finalName = formatTime + "." + split[1];
            }else if(name.startsWith("IMG_20191010_000635.jpg")){
                String year = name.substring(4, 8);
                String month = name.substring(8, 10);
                String day = name.substring(10, 12);
                String nameTail = name.substring(12);
                finalName = year + "-" + month + "-" + day + nameTail;
            }
            if(finalName != null){
                String fullName = DIR + finalName;
                file.renameTo(new File(fullName));
            }
        }

    }
}
