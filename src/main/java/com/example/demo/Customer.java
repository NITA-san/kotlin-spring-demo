package com.example.demo;

public class Customer {
  private String name;

  public Customer(String s) {
    name = s;
  }

  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

  public void placeOrder() {
    System.out.println("A new order is place by " + name);
  }


}
