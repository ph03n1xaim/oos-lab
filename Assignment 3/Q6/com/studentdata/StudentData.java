package com.studentdata;
import java.util.*;

public class StudentData {
    private String id;
    private String name;

    protected StudentData(String id, String name) {
        this.id = id;
        this.name = name;
    }

    public String getId() {
        return this.id;
    }

    public String getName() {
        return this.name;
    }
}
