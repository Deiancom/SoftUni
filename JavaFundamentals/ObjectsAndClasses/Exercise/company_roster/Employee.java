package JavaFundamentals.ObjectsAndClasses.Exercise.company_roster;

import java.util.List;

public class Employee {
    String name;
    double salary;
    String position;
    String department;
    String email;
    int age;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getSalary() {
        return salary;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }


    public void setPosition(String position) {
        this.position = position;
    }

    public String getDepartment() {
        return department;
    }

    public void setDepartment(String department) {
        this.department = department;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public Employee() {
        this.email = "n/a";
        this.age = -1;
    }

    static class Department {
        String name;
        List<Employee> employee;
        double averageSalary;

        public String getName() {
            return name;
        }

        public void setName(String name) {
            this.name = name;
        }

        public List<Employee> getEmployee() {
            return employee;
        }


        public double getAverageSalary() {
            return averageSalary;
        }


        public Department(String name, List<Employee> employee) {
            this.name = name;
            this.employee = employee;
            this.averageSalary = employee.stream().mapToDouble(Employee::getSalary).average().getAsDouble();
        }
    }
}
