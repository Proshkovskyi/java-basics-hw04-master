public abstract class Employee implements Payable {

    private String name;
    private String employeeId;
    protected double averageMonthlySalary;

    public Employee(String employeeId, String name) {
        this.name = name;
        this.employeeId = employeeId;
    }

    public String getEmployeeId() {
        return employeeId;
    }

    public void setEmployeeId(String employeeId) {
        this.employeeId = employeeId;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;

    }

    public double getAverageMonthlySalary() {
        return averageMonthlySalary;
    }

    @Override
    public String toString() {
        return name + String.format("%.2f", getAverageMonthlySalary());
    }

}
