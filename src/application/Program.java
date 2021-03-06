/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package application;

import java.util.Date;
import java.util.List;
import java.util.Scanner;
import model.dao.DaoFactory;
import model.dao.SellerDao;
import model.entities.Department;
import model.entities.Seller;

/**
 *
 * @author Christian
 */
public class Program {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
      //  Department obj = new Department(1, "Books");
        
     //   Seller seller = new Seller(21, "Bob", "bob@gmail.com", new Date(), 3000.0, obj);
        
       // System.out.println(obj);
       SellerDao sellerDao = DaoFactory.createSellerDao();
       
        System.out.println("=== Test 1: findById =====");
       Seller seller = sellerDao.findById(3);
        System.out.println(seller);
        
        System.out.println("\n=== Test 2: seller findByDepartment =====");
        Department department = new Department(2, null);
        List<Seller> list = sellerDao.findByDepartment(department);
        for(Seller obj : list) {
            System.out.println(obj);
        }
        
        System.out.println("\n=== Test 3: seller findAll =====");
         list = sellerDao.findAll();
        for(Seller obj : list) {
            System.out.println(obj);
        }
        
        System.out.println("\n=== Test 4: seller insert =====");
        Seller newSeller = new Seller(null, "Greg", "greg@gmail.com", new Date(), 4000.0, department);
        sellerDao.insert(newSeller);
        System.out.println("Inserido! Novo id = " + newSeller.getId());
        
        System.out.println("\n=== Test 5: seller update =====");
        seller = sellerDao.findById(1);
        seller.setName("Martha Waine");
        sellerDao.update(seller);
        System.out.println("Update completo.");
        
        System.out.println("\n=== Test 6: seller delete =====");
        System.out.print("Insira o id para deletar: ");
        int id = sc.nextInt();
        sellerDao.deleteById(id);
        System.out.println("ID DELETADO.");
    }
}
