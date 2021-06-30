package chapterTen;

import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.List;

public class PayRollSystem {

    @Test
    void testForPolymorphism(){
        SalariedEmployee salariedEmployee = new SalariedEmployee
                ("mercy", "aigbe", "1109-1290-1922", 800);
        HourlyPaidEmployee hourlyPaidEmployee = new HourlyPaidEmployee
                ("Kate", "Peter", "7722-6552-1822", 16.75, 40);
        CommissionEmployee commissionEmployee = new CommissionEmployee
                ("Sussy", "Jones", "3551-2366-1232", 10000, .06);
        BaseCommission baseCommission = new BaseCommission
                ("Akeem", "Ten", "4223-5566-1773", 5000, .04, 300);

        List<Employee> employees = new ArrayList<>();
        employees.add(salariedEmployee);
        employees.add(hourlyPaidEmployee);
        employees.add(commissionEmployee);
        employees.add(baseCommission);

//        employees.forEach(System.out::println);

        for (Employee employee: employees) {
            System.out.println(employee);

            System.out.println(employee.earnings());

            if (employee instanceof BaseCommission baseCommissionEmployee){

                baseCommissionEmployee.setBaseSalary(1.3 * baseCommissionEmployee.getBaseSalary());
                System.out.print(baseCommissionEmployee.getBaseSalary());
            }
        }
    }
}
