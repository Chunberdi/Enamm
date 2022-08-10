package com.componu;

public enum Size1 {
    LARGE("400 gram"),
    MEDIUM("300 gram"),
    SMALL("200 gram");

    private String size1;

    Size1(String size1) {
        this.size1 = size1;
    }

    public String getSize1() {
        return size1;
    }

    public void setSize1(String size1) {
        this.size1 = size1;
    }

    @Override
    public String toString() {
        return "Size1{" +
                "size1='" + size1 + '\'' +
                '}';
    }
}

