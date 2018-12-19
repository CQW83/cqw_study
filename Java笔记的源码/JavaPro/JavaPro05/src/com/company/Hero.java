package com.company;

public class Hero {
    private String nickname;
    private String name;
    private String weapon;

    public Hero() {
    }

    public Hero(String nickname, String name, String weapon) {
        this.nickname = nickname;
        this.name = name;
        this.weapon = weapon;
    }

    public String getNickname() {
        return nickname;
    }

    public void setNickname(String nickname) {
        this.nickname = nickname;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getWeapon() {
        return weapon;
    }

    public void setWeapon(String weapon) {
        this.weapon = weapon;
    }

    @Override
    public String toString() {
        return "Hero{" +
                "nickname='" + nickname + '\'' +
                ", name='" + name + '\'' +
                ", weapon='" + weapon + '\'' +
                '}';
    }
}
