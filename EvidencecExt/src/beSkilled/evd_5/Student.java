/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package beSkilled.evd_5;

/**
 *
 * @author User
 */
public class Student {
    private String name;
    private String id;
    private String gender;
    private String hobby;

    public Student() {
    }

    public Student(String name, String id, String gender, String hobby) {
        this.name = name;
        this.id = id;
        this.gender = gender;
        this.hobby = hobby;
    }

    public String getName() {
        return name;
    }

    public String getId() {
        return id;
    }

    public String getGender() {
        return gender;
    }

    public String getHobby() {
        return hobby;
    }
    
    
}
