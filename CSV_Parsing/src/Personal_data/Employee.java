package Personal_data;

import java.util.ArrayList;
import java.util.List;

public class Employee {

private String name;
private int age;
private String occupation;

    public Employee(String name, int age, String job) {
        this.name = name;
        this.age = age;
        this.occupation = job;
    }

    @Override
    public String toString() {
        return "Employers{" +
                "name='" + name + '\'' +
                ", age=" + age +
                ", job='" + occupation + '\'' +
                '}';
    }
    public static List<Employee> getEmployeeData(List<String> data){
        List<Employee> employeeList = new ArrayList<>();
        for(String text : data){
            String[] parts = text.split(" ");
            String name= parts[0];
            int age = Integer.parseInt(parts[1]);
            String occupation= parts[2];
            Employee employee = new Employee(name,age,occupation);
            employeeList.add(employee);
        }
        return employeeList;
    }
}
