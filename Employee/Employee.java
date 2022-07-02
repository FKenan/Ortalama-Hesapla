package Employee;

public class Employee {
    String name;
    int salary;
    int calculatedSalary;
    int workHours;
    int hireYear;
    double tax;
    int extraWorkPrice;
    double workYearBonus;

    public Employee(String name, int salary, int workHours, int hireYear){
        this.name = name;
        this.salary = salary;
        this.hireYear = hireYear;
        this.workHours = workHours;
    }

    public void calculateTax(){
        if (salary >=1000)
           this.tax = this.salary * 0.03;
        else
            this.tax= 0;
    }

    public void bonus(){
        int extraWorkHours =  workHours - 40;
        if (extraWorkHours >0)
             extraWorkPrice += 30 * extraWorkHours;
        else
            extraWorkPrice = 0;
    }

    public void raiseSalary(){
        int workYears = 2021 - hireYear;
        if (workYears <10)
            salary += salary * 0.05;
        else if(workYears<=10 && workYears < 20)
            workYearBonus= salary * 0.1;
        else
            workYearBonus = salary * 0.15;
    }

    public void calculateFinalSalary(){
        this.calculatedSalary =(int) (this.salary + this.workYearBonus + this.extraWorkPrice - this.tax) ;
    }

    public void toString1(){
        System.out.println("Adı: " + this.name);
        System.out.println("Maaşı: " + this.salary);
        System.out.println("Başlangıç yılı: " + this.hireYear);
        System.out.println("Vergi: " +this.tax);
        System.out.println("Bonus: " + this.extraWorkPrice);
        System.out.println("Maaş artışı: " + this.workYearBonus);
        System.out.println("Vergi ve bonuslar ile birlikte maaş: "+ (this.calculatedSalary - this.workYearBonus));
        System.out.println("Toplam maaş: "+ calculatedSalary);
    }
}
