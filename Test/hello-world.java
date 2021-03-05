#!/usr/bin/env sh -c exec tail -qn +3 $1 | java

class HelloWorld {
    public static void main(String[] args) {
        System.out.println("Hello world!");
    }
}
