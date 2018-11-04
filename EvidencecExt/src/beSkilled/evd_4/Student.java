/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package beSkilled.evd_4;

/**
 *
 * @author User
 */
public class Student {
    private String name;
    private String email;
    private String PassWord;

    public Student() {
    }

    public Student(String name, String email, String PassWord) {
        this.name = name;
        this.email = email;
        this.PassWord = PassWord;
    }

    public String getName() {
        return name;
    }

    public String getEmail() {
        return email;
    }

    public String getPassWord() {
        return PassWord;
    }
    
    
}
