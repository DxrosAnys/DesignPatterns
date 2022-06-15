package iterator;

import java.util.Iterator;
import java.util.Spliterator;
import java.util.function.Consumer;

public class StaffListIterator implements Iterator {

    StaffList staffList;
    private int index;

    public StaffListIterator(StaffList staffList) {
        this.staffList = staffList;
        index = 0;
    }

    @Override
    public boolean hasNext() {
        Employee[] employee = staffList.getEmployee();
        return index < employee.length;
    }

    @Override
    public Employee next() {
        Employee[] employees = staffList.getEmployee();

        while(hasNext()){
            Employee employee = employees[index++];
            if(!employee.getName().isEmpty() && !employee.getName().isBlank()) {
                return employee;
            }
            return next();
        }
        return null;
    }

    @Override
    public void remove() {
        Iterator.super.remove();
    }
}
