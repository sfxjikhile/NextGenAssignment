public class Salary {
    public void calculateNetSalary(double basicSalary){
        double hra = basicSalary * 0.50;
        double specialAllowance = basicSalary * 0.75;
        double PF = basicSalary * 0.12;

        double netPayableSalary = (basicSalary + hra + specialAllowance) - PF;
        System.out.println(netPayableSalary);

    }
}
