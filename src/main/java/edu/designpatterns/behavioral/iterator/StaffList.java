package edu.designpatterns.behavioral.iterator;

public class StaffList implements Iterable {

    Employee[] employee;

    public StaffList(Employee... employee) {
        this.employee = employee;
    }

    public Employee[] getEmployee() {
        return employee;
    }

    @Override
    public StaffListIterator iterator() {
        return new StaffListIterator(this);
    }
}
