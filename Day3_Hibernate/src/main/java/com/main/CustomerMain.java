package com.main;

import java.util.Scanner;

import com.entity.Customer;
import com.service.DeleteData;
import com.service.DisplayData;
import com.service.InsertData;
import com.service.UpdateData;

public class CustomerMain {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
//for insert data
   /*     System.out.print("Enter Id : ");
        int id = sc.nextInt();
        sc.nextLine();

        System.out.print("Enter Name : ");
        String name = sc.nextLine();

        System.out.print("Enter Email : ");
        String email = sc.nextLine();

        System.out.print("Enter Mobile : ");
        String mobile = sc.nextLine();

        System.out.print("Enter Gender : ");
        String gender = sc.nextLine();

        System.out.print("Enter Age : ");
        int age = sc.nextInt();
        sc.nextLine();

        System.out.print("Enter City : ");
        String city = sc.nextLine();

        System.out.print("Enter State : ");
        String state = sc.nextLine();

        System.out.print("Enter Country : ");
        String country = sc.nextLine();

        System.out.print("Enter Pincode : ");
        String pincode = sc.nextLine();

        System.out.print("Enter Address : ");
        String address = sc.nextLine();

        System.out.print("Enter Occupation : ");
        String occupation = sc.nextLine();

        System.out.print("Enter Salary : ");
        double salary = sc.nextDouble();
        sc.nextLine();

        System.out.print("Enter Username : ");
        String username = sc.nextLine();

        System.out.print("Enter Password : ");
        String password = sc.nextLine();

        Customer c = new Customer(
                id,
                name,
                email,
                mobile,
                gender,
                age,
                city,
                state,
                country,
                pincode,
                address,
                occupation,
                salary,
                username,
                password);

        InsertData insert = new InsertData();
        insert.insert(c);

        sc.close();
        
        
        
      */
        
        
        
        
        
        
        /*for delete data
        
        System.out.print("Enter Customer Id to Delete : ");
        int id = sc.nextInt();

        DeleteData delete = new DeleteData();
        delete.delete(id);

        sc.close();*/
        
        
        
        
        
        
    /*for update data
     *     
     
        System.out.print("Enter Id : ");
        int id = sc.nextInt();
        sc.nextLine();

        System.out.print("Enter New Name : ");
        String newName = sc.nextLine();

        UpdateData update = new UpdateData();
        update.update(id, newName);

        sc.close();
    }
        
        */
        
        
        
      

            DisplayData display = new DisplayData();
            display.display();
        
        
        
    } 
        
    }
