package com.company;

public class Main {

    public static void main(String[] args) {
	// write your code here
        Array number = new Array(3);
        number.insert(10);
        number.insert(20);
        number.insert(30);
        number.insert(40);
        number.insert(50);
        number.insert(60);
        number.removeAt(0);
        number.print();
    }
}
