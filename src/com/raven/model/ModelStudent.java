package com.raven.model;

import com.raven.swing.table.EventAction;
import com.raven.swing.table.ModelAction;
import com.raven.swing.table.ModelProfile;
import javax.swing.Icon;

public class ModelStudent {

    public Icon getIcon() {
        return icon;
    }

    public void setIcon(Icon icon) {
        this.icon = icon;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public String getCourse() {
        return course;
    }

    public void setCourse(String course) {
        this.course = course;
    }

   
    public ModelStudent(Icon icon, String name, String gender, String course) {
        this.icon = icon;
        this.name = name;
        this.gender = gender;
        this.course = course;
        
    }

    public ModelStudent() {
    }

    private Icon icon;
    private String name;
    private String gender;
    private String course;
   

    public Object[] toRowTable(EventAction event) {
       
        return new Object[]{new ModelProfile(icon, name), gender, course, new ModelAction(this, event)};
    }
}
