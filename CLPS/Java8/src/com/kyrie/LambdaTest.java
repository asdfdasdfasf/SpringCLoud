package com.kyrie;

import org.junit.Test;

import java.beans.PropertyEditor;
import java.util.*;
import java.util.function.Predicate;

/**
 * @author KyrieStudy
 * @version 1.0
 * @date 2022/3/24 15:47
 */
public class LambdaTest {
    static List<Employee> emps = Arrays.asList(
            new Employee(101, "张三", 18, 9999.99),
            new Employee(102, "李四", 59, 6666.66),
            new Employee(103, "王五", 28, 3333.33),
            new Employee(104, "赵六", 8, 7777.77),
            new Employee(105, "田七", 38, 5555.55));
    public static void main(String[] args) {

    }

    @Test
    public void test1(){
        List<Employee> employees = filterEmployee(emps, (x) -> x.getAge() <35);
        System.out.println(employees.toString());
    }

    public List<Employee> filterEmployee(List<Employee> list, Predicate<Employee> predicate){
        List<Employee> result=new ArrayList<>();
        for (Employee employee : list) {
            if(predicate.test(employee)){
                result.add(employee);
            }
        }
        return result;
    }
}
