package edu.designpatterns.behavioral.interpreter;

public class Main {

  public static void main(String[] args) {

    String context = "this is a a sentence";

    Expresion expresion = new EndsWithPeriod();
   //EndsWithPeriod expresion = new EndsWithPeriod();
    context = expresion.interpret(context);

    System.out.println(context);

  }

}
