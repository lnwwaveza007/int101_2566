/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package work02;

import java.util.Objects;
import work01.Utilitor;

/**
 *
 * @author warvz
 */
public class Person {
    //Field
    private static int nextId = 1;
    private final int id;
    private String firstname;
    private String lastname;
    
    //Utilitor
    Utilitor utilitor = new Utilitor();

    public Person(String firstname, String lastname) {
        this.firstname = utilitor.testString(firstname);
        this.lastname = utilitor.testString(lastname);
        id = nextId;
        nextId++;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("Person(").append(id).append(",").append(firstname).append(",").append(lastname).append(")");
        return sb.toString();
    }

    public int getId() {
        return id;
    }

    public String getFirstname() {
        return firstname;
    }

    public void setFirstname(String firstname) {
        this.firstname = utilitor.testString(firstname);
    }

    public String getLastname() {
        return lastname;
    }

    public void setLastname(String lastname) {
        this.lastname = utilitor.testString(lastname);;
    }

    @Override
    public boolean equals(Object obj) {
        return this == obj;
    }
    
}
