package com.JScrapper;

import org.junit.Assert;
import org.junit.Test;

import com.gargoylesoftware.htmlunit.BrowserVersion;
import com.gargoylesoftware.htmlunit.WebClient;
import com.gargoylesoftware.htmlunit.html.HtmlPage;

class Testhtmlunit {
	
	@Test
	public void homePage() throws Exception {
	    try (final WebClient webClient = new WebClient()) {
	        final HtmlPage page = webClient.getPage("https://htmlunit.sourceforge.io/");
	        Assert.assertEquals("HtmlUnit – Welcome to HtmlUnit", page.getTitleText());

	        final String pageAsXml = page.asXml();
	        Assert.assertTrue(pageAsXml.contains("<body class=\"topBarDisabled\">"));

	        final String pageAsText = page.asNormalizedText();
	        Assert.assertTrue(pageAsText.contains("Support for the HTTP and HTTPS protocols"));
	    }
	}
	@Test
	public void homePage_Firefox() throws Exception {
	    try (final WebClient webClient = new WebClient(BrowserVersion.FIREFOX)) {
	        final HtmlPage page = webClient.getPage("https://htmlunit.sourceforge.io/");
	        Assert.assertEquals("HtmlUnit – Welcome to HtmlUnit", page.getTitleText());
	    }
	}
	
	
    public static void main(String args[])
    {
    	Testhtmlunit testhtmlunit = new Testhtmlunit();
    	try {
			testhtmlunit.homePage_Firefox();
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
//        int value = 25;
//        assert value >= 20 : " Underweight";
//        System.out.println("value is " + value);
    }
}