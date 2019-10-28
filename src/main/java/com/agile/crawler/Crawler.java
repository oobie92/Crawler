package com.agile.crawler;

import org.jsoup.nodes.Document;
import java.io.File;

import static com.agile.crawler.service.LittleCrawler.getWebSite;
import static com.agile.crawler.service.LittleCrawler.validateCases;

public class Crawler {

    public static void main(String[] args) throws Exception {

        for (String arg: args) {
            Document doc = getWebSite(new File(arg));
            System.out.println(validateCases(doc));

        }

    }
}
