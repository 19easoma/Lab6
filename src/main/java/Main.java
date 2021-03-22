/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author antho
 */
public class Main {
    public static void main(String[] args) {
        Employee Susan = new Employee("Susan Meyers", 47899, "Accounting", "Vice President");
        Employee Mark = new Employee("Mark Jones", 39119, "IT", "Programmer");
        Employee Joy = new Employee("Joy Rogers", 81774, "Manufacturing", "Engineer");
        
        System.out.println(Susan.getName());
        System.out.println("ID: " + Susan.getIdNumber());
        System.out.println("Department: " + Susan.getDepartment());
        System.out.println("Position: " + Susan.getPosition());
        
        System.out.println("");
        
        System.out.println(Mark.getName());
        System.out.println("ID: " + Mark.getIdNumber());
        System.out.println("Department: " + Mark.getDepartment());
        System.out.println("Position: " + Mark.getPosition());
        
        System.out.println("");
        
        System.out.println(Joy.getName());
        System.out.println("ID: " + Joy.getIdNumber());
        System.out.println("Department: " + Joy.getDepartment());
        System.out.println("Position: " + Joy.getPosition());
    }
}