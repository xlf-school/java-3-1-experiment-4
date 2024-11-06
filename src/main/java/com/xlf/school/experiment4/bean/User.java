package com.xlf.school.experiment4.experiment4.bean;

/**
 * User
 * <p>
 * 用户实体类，用于存储用户信息
 *
 * @version v1.0.0
 * @since v1.0.0
 * @author xiao_lfeng
 */
public class User {
    private int userid;
    private String username;
    private String gender;
    private int age;
    private Boolean member;

    public int getUserid() {
        return userid;
    }

    public void setUserid(int userid) {
        this.userid = userid;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public Boolean getMember() {
        return member;
    }

    public void setMember(Boolean member) {
        this.member = member;
    }
}
