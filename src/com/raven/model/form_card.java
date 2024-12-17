
package com.raven.model;

import javax.swing.Icon;
 
public class form_card {
    private String title;
    private Icon icon;

    /**
     * @return the title
     */
    public String getTitle() {
        return title;
    }

    /**
     * @param title the title to set
     */
    public void setTitle(String title) {
        this.title = title;
    }

    /**
     * @return the icon
     */
    public Icon getIcon() {
        return icon;
    }

    /**
     * @param icon the icon to set
     */
    public void setIcon(Icon icon) {
        this.icon = icon;
    }
    
    
    public form_card(String title, Icon icon ) {
           this.title = title;
        this.icon = icon;
  
    }
}
 
