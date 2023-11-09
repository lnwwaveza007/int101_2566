/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */
package int101.homework2;

import work01.Utilitor;
import work02.Person;
import work03.Account;

/**
 *
 * @author warvz
 */
public class Homework2 {

    public static void main(String[] args) {
        work01Utilitor();
        work02Person();
        work03Account();
    }

    static void work01Utilitor() {
        Utilitor utilitor = new Utilitor();
        
        //Test String
        System.out.println("------===== work01Utilitor =====------");
        System.out.println("===== Test String =====");
        try {
            System.out.println("TestString 1 : "+utilitor.testString("Hello"));
            System.out.println("TestString 2 : "+utilitor.testString("    "));
        } catch (Exception e) {
            System.out.println("Error : "+e);
        }
        
        //Test Positive
        System.out.println("===== Test Positive =====");
        try {
            System.out.println("TestPositive 1 : "+utilitor.testPositive(4));
            System.out.println("TestPositive 2 : "+utilitor.testPositive(-5));
        } catch (Exception e) {
            System.out.println("Error : "+e);
        }
        
        System.out.println("===== Test computeIsbn10 =====");
        System.out.println("computeIsbn10 of 520367082 : "+utilitor.computeIsbn10(520367082l));
    }

    static void work02Person() {
        System.out.println("------===== work02Person =====------");
        System.out.println("===== Create a Person =====");
        Person person1 = new Person("Charana", "Sukroat");
        Person person2 = new Person("David", "Matinaze");
        try {
            System.out.println("Create a Person that Last name is blank string");
            Person person3 = new Person("Emma", "  ");
        } catch (Exception e) {
            System.out.println("Error : "+e);
        }
        
        System.out.println("===== toString =====");
        System.out.println(person1.toString());
        System.out.println(person2.toString());
        
        System.out.println("===== Getter =====");
        System.out.println("Id of person 1 : "+person1.getId());
        System.out.println("First Name of person 1 : "+person1.getFirstname());
        System.out.println("Last Name of person 1 : "+person1.getLastname());
        
        System.out.println("===== Setter =====");
        System.out.println("First Name of person 1 : "+person1.getFirstname());
        System.out.println("Set First Name of Person 1 to Somsak");
        person1.setFirstname("Somsak");
        System.out.println("First Name of person 1 : "+person1.getFirstname());
        //Error Check
        System.out.println("===== Setter Error =====");
        System.out.println("Set First name of Person 1 to blank string");
        try {
            person1.setFirstname("      ");
        } catch (Exception e) {
            System.out.println("Error : "+e);
        }
        System.out.println("===== Equals =====");
        System.out.println("Person 1 Equals Person 2 : "+person1.equals(person2));
        System.out.println("Person 2 Equals Person 2 : "+person2.equals(person2));
    }

    static void work03Account() {
        System.out.println("------===== work03Account =====------");
        System.out.println("===== Create a Person =====");
        Person person1 = new Person("Charana", "Sukroat");
        Person person2 = new Person("David", "Matinaze");
        System.out.println("Person 1 of : "+person1);
        System.out.println("Person 2 of : "+person2);
        System.out.println("===== Create Account and toString =====");
        Account account1 = new Account(person1);
        Account account2 = new Account(person2);
        System.out.println("Account 1 : "+account1.toString());
        System.out.println("Account 2 : "+account2.toString());
        try {
            System.out.println("===== Create Account Error =====");
            Account account3 = new Account(null);
        } catch (Exception e) {
            System.out.println("Error : "+e);
        }
        System.out.println("===== Getter =====");
        System.out.println("no of account 1 : "+account1.getNo());
        System.out.println("owner of account 1 : "+account1.getOwner());
        System.out.println("balance of account 1 : "+account1.getBalance());
        System.out.println("===== Deposit =====");
        System.out.println("balance of account 1 : "+account1.getBalance());
        System.out.println("deposit 150 to account 1 : "+account1.deposit(100));
        System.out.println("===== Withdraw =====");
        System.out.println("balance of account 1 : "+account1.getBalance());
        System.out.println("withdraw 45 to account 1 : "+account1.withdraw(45));
        System.out.println("===== Transfer =====");
        System.out.println("balance of account 1 : "+account1.getBalance());
        System.out.println("balance of account 2 : "+account2.getBalance());
        System.out.println("transfer 50 from account 1 to account 2");
        account1.transfer(50,account2);
        System.out.println("balance of account 1 : "+account1.getBalance());
        System.out.println("balance of account 2 : "+account2.getBalance());
        System.out.println("===== Equals =====");
        System.out.println("account 1 and account 2 is equal : "+account1.equals(account2));
        System.out.println("account 2 and account 2 is equal : "+account2.equals(account2));
    }
}
