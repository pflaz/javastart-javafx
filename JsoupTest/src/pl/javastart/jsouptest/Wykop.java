package pl.javastart.jsouptest;

import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;
import org.jsoup.nodes.Element;
import org.jsoup.select.Elements;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.URL;

public class Wykop {
    public static void main(String[] args) throws IOException {
        URL wykopUrl = new URL("https://www.wykop.pl/");
        BufferedReader in = new BufferedReader(new InputStreamReader(wykopUrl.openStream(), "UTF-8"));

        StringBuilder websiteSource = new StringBuilder();

        String tmp = null;
        while ((tmp = in.readLine()) != null) {
            websiteSource.append(tmp);
        }
        in.close();

        Document doc = Jsoup.parse(websiteSource.toString());
        Elements titles = doc.select("div.lcontrast > h2");
        for (Element title: titles) {
            System.out.println(title.text());
        }




    }
}
