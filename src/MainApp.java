public class MainApp {
    public static void main(String[] args) {
        Employee emp = new Employee("Natania Oktaviani", 5000000, "Staff");

        System.out.println("=== BEFORE PROMOTION ===");
        emp.displayInfo();

        emp.giveBonus();
        emp.promote("Supervisor", 1000000);

        System.out.println("\n=== AFTER PROMOTION ===");
        emp.displayInfo();
    }
}
