package com.home.lang;

public interface Village
{
    void setNumOfPeople(int num);
    void setName(String name);
    default String getBusinessType(){
        return "Most of the Village people do Farming";
    }
    static int getVillageId(){
        return 1;
    }
}
