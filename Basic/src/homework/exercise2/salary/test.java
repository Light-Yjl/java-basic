package homework.exercise2.salary;

import java.util.Scanner;

public class test {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        Employee[] employees = new Employee[n];
        for (int i = 0; i < n; i++) {
            String type = sc.next();
            String name = sc.next();
            int base = sc.nextInt();
            if(type.equals("E")){
                employees[i] = new Employee(name,base);

            }else if(type.equals("B")){
                int bonus = sc.nextInt();
                employees[i] = new BonusEmployee(name,base,bonus);

            }else if(type.equals("H")){
                int hours = sc.nextInt();
                int rate = sc.nextInt();
                employees[i] = new HourlyEmployee(name,base,hours,rate);
            }
        }

        long total = 0;
        for (int i = 0; i < employees.length; i++) {
            showOne(employees[i]);
            total += employees[i].getPay();
        }
        System.out.println("TOTAL " + total);

    }

    public static void showOne(Employee em){
        System.out.println(em.getName() + " " + em.getPay());
    }
}
