package org.example;

public class MyMainClass {
    public String compareIntegers(int firstInteger, int secondInteger) {
        return (firstInteger > secondInteger) ? "firstInteger is greater than secondInteger" :
                (firstInteger < secondInteger) ? "firstInteger is less than secondInteger" :
                        "firstInteger is equal to secondInteger";
    }
}
