package com.example.demo;


    public class CanonPrinter implements Printer {

        @Override
        public void print(String message) {
            System.out.println("Canon printer ===> " + message);
        }
    }

