package com.company;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.TreeMap;

/**
 * 通讯录类，封装相关的通讯录操作
 *
 * @author chengqiwen
 */
public class AddressList {
    private TreeMap<String, ArrayList<People>> treeMap = new TreeMap<>();

    public AddressList() {
    }

    /**
     * 添加联系人
     *
     * @param name  联系人姓名
     * @param phone 联系人电话
     */
    public void addPeople(String name, String phone) {
        //第三方：汉字转拼音

        //获取姓名的首字母名
        String firstLetter = PinYinUtils.getFirstLetter(name);
        //获取分组名
        firstLetter = getGroupName(firstLetter);
        //创建People对象
        People people = new People(name, phone);
        //判断分组是否存在
        if (treeMap.containsKey(firstLetter)) {
            //存在
            treeMap.get(firstLetter).add(people);
        } else {
            //不存在
            ArrayList<People> arrayList = new ArrayList<>();
            arrayList.add(people);
            treeMap.put(firstLetter, arrayList);
        }

    }

    /**
     * 添加联系人
     * @param people 联系人信息
     */
    private void addPeople(People people) {
        //第三方：汉字转拼音
        //获取姓名的首字母名
        String firstLetter = PinYinUtils.getFirstLetter(people.getName());
        //获取分组名
        firstLetter = getGroupName(firstLetter);
        //判断分组是否存在
        if (treeMap.containsKey(firstLetter)) {
            //存在
            treeMap.get(firstLetter).add(people);
        } else {
            //不存在
            ArrayList<People> arrayList = new ArrayList<>();
            arrayList.add(people);
            treeMap.put(firstLetter, arrayList);
        }

    }

    /**
     * 获取分组名
     *
     * @param letter
     * @return 如果A-Z ，返回字母，否则返回#
     */
    private String getGroupName(String letter) {
        char c = letter.toUpperCase().charAt(0);
        if (c >= 'A' && c <= 'Z') {
            return c + "";
        } else {
            return "#";
        }
    }

    /**
     * 显示所有联系人
     */
    public void show() {
        for (String key : treeMap.keySet()) {
            System.out.println("序号\t" + key + "分组下的联系人有:");
            int index = 0;
            for (People people : treeMap.get(key)) {
                System.out.println(index + "\t" + people);
                index++;
            }
        }
    }

    /**
     * 判断是否重复
     * @param groupName 获取组名
     * @param index 序号
     * @return 是否重复
     */
    private boolean isExists(String groupName, int index){
        if (!treeMap.containsKey(groupName)) {
            return false;
        }
        ArrayList<People> arrayList = treeMap.get(groupName);
        if (index < 0 || index > arrayList.size() - 1) {
            return false;
        }
        return true;
    }

    /**
     * 删除指定联系人
     * @param groupName 联系人所在分组
     * @param index     联系人
     * @return 是否删除
     */
    public boolean romvePeople(String groupName, int index) {
        if ( ! isExists(groupName,index)){
            return false;
        }
        ArrayList<People> arrayList = treeMap.get(groupName);
        if (arrayList.size() == 1) {
            treeMap.remove(groupName);
        } else {
            arrayList.remove(index);
        }
        return true;
    }

    /**
     * 根据关键字模糊查找
     * @param keyword 支持 姓名，手机号，姓名拼音， 姓名首字母
     */
    public void findPeoole(String keyword){
        for (String key : treeMap.keySet()) {
            for (People people : treeMap.get(key)) {
                boolean has = false;
                for (String phone : people.getPhoneSet()) {
                    if(phone.contains(keyword)){
                        has = true;
                        break;
                    }
                }
                if(people.getName().contains(keyword) || has || PinYinUtils.getPinyinString(people.getName()).contains(keyword)|| PinYinUtils.getFirstLettersUp(people.getName()).contains(keyword.toUpperCase())){
                    System.out.println(people);
                }
            }
        }
    }

    /**
     * 修改联系人姓名
     * @param groupName 获取组名
     * @param index 序号
     * @param name 联系人名字
     */
    public boolean modifyPeopleName(String groupName,int index ,String name){
        if(!isExists(groupName,index)){
                return false;
        }
        People people = treeMap.get(groupName).get(index);
        people.setName(name);
        romvePeople(groupName,index);
        addPeople(people);
        return true;
    }

    /**
     * 修改联系人姓名
     * @param groupName 获取组名
     * @param index 序号
     * @param oldPhone 旧的手机号
     * @param newPhone 新的手机号
     */
      boolean modifyPeoplePhone(String groupName,int index ,String oldPhone,String newPhone){
        if(!isExists(groupName,index)){
            return false;
        }
        treeMap.get(groupName).get(index).getPhoneSet().remove(oldPhone);
        treeMap.get(groupName).get(index).getPhoneSet().add(newPhone);
            return true;
    }

    /**
     * 增加手机号
     * @param groupName 获取是组名
     * @param index     序号
     * @param phone  手机号
     */
    public boolean addPeoplePhone(String groupName,int index ,String phone){
        if(!isExists(groupName,index)){
            return false;
        }
        treeMap.get(groupName).get(index).getPhoneSet().add(phone);
        return true;
    }

    /**
     * 删除联系人手机号
     * @param groupName 获取组名
     * @param index  序列
     * @param phone 手机号
     * @return
     */
    public boolean removePeoplePhone(String groupName,int index ,String phone){
        if(!isExists(groupName,index)){
            return false;
        }
        treeMap.get(groupName).get(index).getPhoneSet().remove(phone);
        return true;
    }

}
