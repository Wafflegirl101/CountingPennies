
package com.countingpennies.model;

import java.time.LocalDate;
import java.time.Period;
import java.math.BigDecimal;

public class Employee
{
    private int employeeId;
    private String name;
    private LocalDate hireDate;
    private BigDecimal hourlyRate;
    private boolean active;

    public Employee(int employeeId, String name,
                    LocalDate hireDate, BigDecimal hourlyRate)
    {
        this.employeeId = employeeId;
        this.name = name;
        this.hireDate = hireDate;
        this.hourlyRate = hourlyRate;
        this.active = true;
    }

    public int getEmployeeId()
    {
        return employeeId;
    }

    public String getName()
    {
        return name;
    }

    public LocalDate getHireDate()
    {
        return hireDate;
    }

    public BigDecimal getHourlyRate()
    {
        return hourlyRate;
    }

    public boolean isActive()
    {
        return active;
    }

    public Period getSeniority()
    {
        return Period.between(hireDate, LocalDate.now());
    }

    public long getSeniorityDays()
    {
        return java.time.temporal.ChronoUnit.DAYS
                .between(hireDate, LocalDate.now());
    }

    public void terminate()
    {
        active = false;
    }

    public void rehire(LocalDate newHireDate)
    {
        hireDate = newHireDate;
        active = true;
    }

    public void setHourlyRate(BigDecimal newRate)
    {
        hourlyRate = newRate;
    }

    public BigDecimal calculateRegularPay(double hours)
    {
        return hourlyRate.multiply(
            BigDecimal.valueOf(hours));
    }
}
