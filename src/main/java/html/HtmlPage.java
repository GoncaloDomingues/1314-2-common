package html;

import common.Writable;

public class HtmlPage extends Html{
    
    public HtmlPage(String title, Writable... c) {
        super(
                new HtmlElem("html",
                        new HtmlElem("head", new HtmlElem("Title", new HtmlText(title))),
                        new HtmlElem("body", c)
                )
        );
    }
}
