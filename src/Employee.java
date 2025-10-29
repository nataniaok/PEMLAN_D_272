public class Employee {
    private String name;
    private double salary;
    private String position;

    private static final double BONUS_RATE = 0.2;

    public Employee(String name, double salary, String position) {
        this.name = name;
        this.salary = salary;
        this.position = position;
    }

    public String getName() { return name; }
    public double getSalary() { return salary; }
    public String getPosition() { return position; }

    public void setPosition(String position) {
        this.position = position;
    }

    // Extract Method
    private double calculateBonus(double rate) {
        return salary * rate;
    }

    // Inline Variable + Use Constant
    public void giveBonus() {
        salary += calculateBonus(BONUS_RATE);
    }

    public void promote(String newPosition, double raise) {
        position = newPosition;
        salary += raise;
    }

    // Rename Method
    public void displayInfo() {
        System.out.println("Employee Name: " + name);
        System.out.println("Position: " + position);
        System.out.println("Salary: " + salary);
    }
}
