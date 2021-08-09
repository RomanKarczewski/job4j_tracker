package ru.job4j.tracker.oop.pojo;

import java.util.Date;

public class Student {
    private String FIO;
    private String group;
    private Date postupl;

    public String getFIO() {
        return FIO;
    }

    public void setFIO(String FIO) {
        this.FIO = FIO;
    }

    public String getGroup() {
        return group;
    }

    public void setGroup(String group) {
        this.group = group;
    }

    public Date getPostupl() {
        return postupl;
    }

    public void setPostupl(Date postupl) {
        this.postupl = postupl;
    }
}
