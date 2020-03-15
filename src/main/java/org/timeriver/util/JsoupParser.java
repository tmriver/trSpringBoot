package org.timeriver.util;

import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;
import org.jsoup.nodes.Element;
import org.jsoup.select.Elements;

import java.util.ArrayList;
import java.util.List;

public class JsoupParser {
    static String url = "https://www.douban.com/doulist/44514376/?start=index&sort=seq&playable=0&sub_type=";
    public static void main(String[] args) throws Exception {
        List<String> list = new ArrayList();
        for (int i = 0; i < 9 ; i++) {
            String indexStr = String.valueOf(i * 25);
            String finalUrl = url.replace("index", indexStr);
            Document doc = Jsoup.connect(finalUrl).get();
            Elements itemList = doc.getElementsByClass("doulist-item");
            for (Element element : itemList) {
                Elements title = element.select("[class=title]");
                String name = title.text().replace("播放全片","").trim();
                Elements rating = element.select("[class=rating]");
                String rate = rating.text().trim();
                list.add(rate+"=="+name);
            }
        }
        for (String s : list) {
            System.out.println(s);
        }
    }
}
