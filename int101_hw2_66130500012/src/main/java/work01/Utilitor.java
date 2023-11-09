/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package work01;

/**
 *
 * @author warvz
 */
public class Utilitor {
    public String testString(String value) {
        if (value.equals(null)) {
            throw new NullPointerException();
        }
        if (value.isBlank()) {
            throw new IllegalArgumentException();
        }
        return value;
    }
    
    public double testPositive(double value) {
        if (value > 0) {
            return value;
        }else{
            throw new IllegalArgumentException();
        }
    }
    
    public long computeIsbn10(long isbn10) {
        long result = 0l;
        for (long i = 2; i < 11; i++) {
            result += isbn10%10l * i;
            isbn10 /= 10l;
        }
        return 11-(result%11);
    }
}
