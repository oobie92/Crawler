package com.agile.crawler.service;

import com.agile.crawler.exceptions.HandlerHtmlException;
import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;

import java.io.File;

import static com.agile.crawler.utilities.Constant.*;

public class LittleCrawler {

/**
 * <h1>getWebSite<h1/>
 *
 * Reads a html file
 * @param htmlFile type of File to be received
 * @return Document from Jsoup library
 * */
    public static Document getWebSite(File htmlFile) throws HandlerHtmlException {
        Document doc;
        try {
            doc = Jsoup.parse(htmlFile, CHARSET);
        }catch (Exception ex) {
           throw new HandlerHtmlException("Error reading html");
        }
        return doc;
    }

    /**
     * <h1>getWebSite<h1/>
     *
     * Reads a html file
     * @param doc type of Jsoup's Documents
     * @return bolean true if matches the condition, false otherwise
     * */
    public static boolean validateCases(Document doc){
        return doc.getElementsByClass(CLASS_CASE_ERROR).isEmpty() &&
            doc.getElementsByClass(CLASS_CASE_WARNING).isEmpty();
    }

}
