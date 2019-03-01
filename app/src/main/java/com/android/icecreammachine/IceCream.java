package com.android.icecreammachine;

import java.io.Serializable;

public class IceCream implements Serializable {
    private String name;
    private boolean withExtraChocolate;
    private String size;
    private String comments;

    public IceCream(String name, boolean withExtraChocolate, String size, String comments) {
        this.name = name;
        this.withExtraChocolate = withExtraChocolate;
        this.size = size;
        this.comments = comments;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public boolean isWithExtraChocolate() {
        return withExtraChocolate;
    }

    public void setWithExtraChocolate(boolean withExtraChocolate) {
        this.withExtraChocolate = withExtraChocolate;
    }

    public String getSize() {
        return size;
    }

    public void setSize(String size) {
        this.size = size;
    }

    public String getComments() {
        return comments;
    }

    public void setComments(String comments) {
        this.comments = comments;
    }

    @Override
    public String toString() {
        return "IceCream: \n" +
                "    name: " + name + "\n" +
                "    with extra chocolate: " + withExtraChocolate + "\n" +
                "    size: " + size + "\n" +
                "    comments: " + comments;
    }
}
