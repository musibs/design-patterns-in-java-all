package io.thebongcoder.patterns.adapter;

import java.util.ArrayList;
import java.util.List;

public class EmployeeClient {



    private static List<Employee> employeeList = new ArrayList<>();
    public static void main(String[] args) {

        Employee employeeDB = new EmployeeDB("1256", "John", "Doe", "jon.doe@example.com");
        employeeList.add(employeeDB);

        EmployeeLdap employeeLdap = new EmployeeLdap("Jane", "Doe", "Jane", "jane.doe@example.com");

        //  Need an adapter
        // employeeList.add(employeeLdap);

        employeeList.add(new EmployeeAdapterLdap(employeeLdap));

        EmployeeCsv employeeCsv = new EmployeeCsv("1908,Luis,Serena,luis987@gmail.com");
        employeeList.add(new EmployeeAdapterCsv(employeeCsv));

        System.out.println(employeeList);

    }
}
