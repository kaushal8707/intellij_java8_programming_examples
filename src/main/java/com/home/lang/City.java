package com.home.lang;

public interface City
{
    void setName(String name);
    void setArea(int area);
    default String getBusinessType(){
        return "Service";
    }
}
