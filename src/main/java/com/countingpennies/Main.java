
package com.countingpennies;

import com.countingpennies.model.Employee;
import java.time.LocalDate;
import java.math.BigDecimal;

public class Main
{
    public static void main(String[] args)
    {
        Employee employee1 = new Employee(
            101,
            "Maria",
            LocalDate.of(2022, 5, 10),
            new BigDecimal("24.00")
        );

        System.out.println("Employee: "
                + employee1.getName());

        System.out.println("Hourly Wage: $"
                + employee1.getHourlyRate());

        System.out.println("Seniority: "
                + employee1.getSeniority().getYears()
                + " years, "
                + employee1.getSeniority().getMonths()
                + " months");
    }
}

