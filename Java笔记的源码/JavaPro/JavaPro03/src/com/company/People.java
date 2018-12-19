package com.company;

import java.util.HashSet;


/**
 * @author chengqiwen
 */
public class People {

    //null调用人和方法都会失败

    private String name;
    private HashSet<String> phoneSet = new HashSet<>();

    public People() {
    }

    public People(String name, String phone) {
        this.name = name;
        phoneSet.add(phone);
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public HashSet<String> getPhoneSet() {
        return phoneSet;
    }

    public void setPhoneSet(HashSet<String> phoneSet) {
        this.phoneSet = phoneSet;
    }

    @Override
    public String toString() {
        return "联系人" +
                "姓名" + name +
                " 电话" + phoneSet
                ;
    }
}
