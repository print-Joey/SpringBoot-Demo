package com.joey.pojo;

import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.stereotype.Component;

@Component
//第三种
@ConfigurationProperties(prefix = "enterprise")
public class Enterprise {
    private String name;
    private String age;
    private String tel;
    private String[] subject;

    public Enterprise() {
    }

    public Enterprise(String name, String age, String tel, String[] subject) {
        this.name = name;
        this.age = age;
        this.tel = tel;
        this.subject = subject;
    }


    /**
     * 获取
     * @return name
     */
    public String getName() {
        return name;
    }

    /**
     * 设置
     * @param name
     */
    public void setName(String name) {
        this.name = name;
    }

    /**
     * 获取
     * @return age
     */
    public String getAge() {
        return age;
    }

    /**
     * 设置
     * @param age
     */
    public void setAge(String age) {
        this.age = age;
    }

    /**
     * 获取
     * @return tel
     */
    public String getTel() {
        return tel;
    }

    /**
     * 设置
     * @param tel
     */
    public void setTel(String tel) {
        this.tel = tel;
    }

    /**
     * 获取
     * @return subject
     */
    public String[] getSubject() {
        return subject;
    }

    /**
     * 设置
     * @param subject
     */
    public void setSubject(String[] subject) {
        this.subject = subject;
    }

    public String toString() {
        return "Enterprise{name = " + name + ", age = " + age + ", tel = " + tel + ", subject = " + subject + "}";
    }
}
