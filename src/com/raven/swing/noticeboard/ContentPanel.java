package com.raven.swing.noticeboard;

  

public class ContentPanel {
    private String title;
    private String content; 

    public ContentPanel(String title, String content) {
        this.title = title;
        this.content = content;
    }

    // Getters for title and content
    public String getTitle() {
        return title;
    }
    public String getContent() {
        return content;
    }
}