package com.eone;

public class Main {
  private Main() {}
  public int sum(int a, int b) {
  	return a + b;
  }
  public static void main(String[] args) {
  	Main main = new Main();
  	main.sum(1, 2);
  }
}
