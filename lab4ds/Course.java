/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lab4ds;

/**
 *
 * @author User
 */
public class Course {
    protected String code;
    protected String name;
    protected Double credit;
    protected char grade;

    public Course(String code, String name, Double credit, char grade) {
        this.code = code;
        this.name = name;
        this.credit=credit;
        this.grade = grade;
    }

    public String getCode() {
        return code;
    }

    public void setCode(String code) {
        this.code = code;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Double getCredit() {
        return credit;
    }

    public void setCredit(Double credit) {
        this.credit = credit;
    }

    public Double getGrade() {
        Double val=0.0;
       
        while(true){
        if(grade=='A')
            val=4.0;
        if(grade=='B')
            val=3.0;
        if(grade=='C')
            val=2.0;
        if(grade=='D')
            val=1.0;
        if(grade=='F')
            val=0.0;
        break;
        }
       return val;
       
    }

    public void setGrade(char grade) {
        this.grade = grade;
    }

    @Override
    public String toString() {
        return "Course : "+ code + " (" + name + ") - " + credit + " credit hours.  Grade : " + grade + " ";
    }
    
}
