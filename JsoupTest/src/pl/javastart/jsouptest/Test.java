package pl.javastart.jsouptest;

import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;
import org.jsoup.nodes.Element;
import org.jsoup.select.Elements;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.URL;

public class Test {
    public static void main(String[] args) throws IOException {
        URL example = new URL("http://example.com");
        BufferedReader in = new BufferedReader(new InputStreamReader(example.openStream()));

        StringBuilder websiteSource = new StringBuilder();
        String tmp = null;
        while ((tmp = in.readLine()) != null) {
            websiteSource.append(tmp);
        }
        in.close();
        Document doc = Jsoup.parse(websiteSource.toString());
        Elements h1Elements = doc.getElementsByTag("h1");

        for (Element e: h1Elements) {
            System.out.println(e.text());
        }
    }
}
