package com.dongduong.designpattern.decorator.example2;

public interface DataSource {
    void writeData(String data);

    String readData();
}
