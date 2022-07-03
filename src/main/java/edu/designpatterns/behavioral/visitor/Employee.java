package edu.designpatterns.behavioral.visitor;

public interface Employee {

  int getSalary();

  void accept(Visitor visitor);

}
