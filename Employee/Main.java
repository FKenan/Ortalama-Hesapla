package Employee;

public class Main {
    public static void main(String[] args) {
        Employee calısan1 = new Employee("A",1500,43,1990);
        calısan1.calculateTax();
        calısan1.bonus();                       // 40 saaatin üzerine fazla para
        calısan1.raiseSalary();                 // çalıştığı yıla göre bonus
        calısan1.calculateFinalSalary();

        calısan1.toString1();
    }
}