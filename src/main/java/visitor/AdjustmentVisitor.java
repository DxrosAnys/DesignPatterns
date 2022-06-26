package visitor;

public class AdjustmentVisitor implements Visitor{
    @Override
    public void visit(Manager manager) {
        manager.setSalary(65000);
    }

    @Override
    public void visit(SalesPerson salesPerson) {
        salesPerson.setSalary(57000);
    }

    @Override
    public void visit(StaffList staffList) {
        System.out.println("It had an adjustment of the salary employees.");
    }
}
