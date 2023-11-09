/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package work03;

import java.util.Objects;
import work01.Utilitor;
import work02.Person;

/**
 *
 * @author warvz
 */
public class Account {
    //Field
    private static long nextNo = 100_000_000l;
    private final long no;
    private Person owner;
    private double balance;
    
    //Utilitor
    private Utilitor utilitor = new Utilitor();

    public Account(Person owner) {
        if (owner.equals(null)){
            throw new NullPointerException();
        }
        this.owner = owner;
        this.balance = 0;
        //Set no
        long result = utilitor.computeIsbn10(nextNo);
        while (result == 10) {
            nextNo++;
            result = utilitor.computeIsbn10(nextNo);
        }
        this.no = 10 * nextNo + result;
        nextNo++;
    }

    public long getNo() {
        return no;
    }

    public Person getOwner() {
        return owner;
    }

    public double getBalance() {
        return balance;
    }
    
    public double deposit(double amount) {
        return balance += utilitor.testPositive(amount);
    }
    
    public double withdraw(double amount) {
        return utilitor.testPositive(balance -= utilitor.testPositive(amount));
    }
    
    public void transfer(double amount,Account account){
        if (account.equals(null)) {
            throw new IllegalArgumentException();
        }
        try {
            this.withdraw(amount);
        } catch (Exception e) {
            throw new IllegalArgumentException();
        }
        account.deposit(amount);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("Account(").append(no).append(",").append(balance).append(')');
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        return this == obj;
    }
    
    
    
    
}
