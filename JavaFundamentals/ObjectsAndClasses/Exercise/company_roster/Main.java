package JavaFundamentals.ObjectsAndClasses.Exercise.company_roster;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        List<Employee> employees = new ArrayList<>();
        int n = Integer.parseInt(scanner.nextLine());

        for (int i = 0; i < n; i++) {
            String[] input = scanner.nextLine().split("\\s+");
            Employee employee = new Employee();
            employee.setName(input[0]);
            employee.setSalary(Double.parseDouble(input[1]));
            employee.setPosition(input[2]);
            employee.setDepartment(input[3]);
            if (input.length == 5) {
                if (input[4].contains("@")) {
                    employee.setEmail(input[4]);
                } else {
                    employee.setAge(Integer.parseInt(input[4]));
                }
            } else if (input.length == 6) {
                if (input[4].contains("@")) {
                    employee.setEmail(input[4]);
                    employee.setAge(Integer.parseInt(input[5]));
                } else {
                    employee.setAge(Integer.parseInt(input[4]));
                    employee.setEmail(input[5]);
                }
            }
            employees.add(employee);
        }
        List<String> departmentsList = employees.stream()
                .map(Employee::getDepartment)
                .distinct()
                .collect(Collectors.toList());
        List<Employee.Department> departments = new ArrayList<>();
        for (String department : departmentsList) {
            departments.add(new Employee.Department(department, employees.stream()
                    .filter(employee -> employee.getDepartment()
                            .equals(department)).collect(Collectors.toList())));
        }
        departments.sort(Comparator.comparingDouble(Employee.Department::getAverageSalary).reversed());
        Employee.Department department = departments.get(0);
        department.getEmployee().sort(Comparator.comparingDouble(Employee::getSalary).reversed());
        System.out.printf("Highest Average Salary: %s%n", department.getName());
        for (Employee employee : department.getEmployee()) {
            System.out.printf("%s %.2f %s %d%n", employee.getName(), employee.getSalary(), employee.getEmail(), employee.getAge());
        }
    }
}