/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.poly.it17322.group1.repository;

import com.poly.it17322.group1.config.HibernateUtil;
import com.poly.it17322.group1.custommodel.ViewProductCustomModel;
import java.util.List;
import org.hibernate.Session;
import org.hibernate.query.Query;

/**
 *
 * @author hangnt
 */
public class ProductRepository {

    private Session session = HibernateUtil.getFACTORY().openSession();

    public List<ViewProductCustomModel> getAll() {
        String sql = "SELECT new com.poly.it17322.group1.custommodel"
                + ".ViewProductCustomModel(p.id AS id ,p.category.categoryName AS categoryName,"
                + "p.productName AS productName , p.price AS price)"
                + " FROM Product p JOIN Category c"
                + " ON p.category.id = c.id";
        Query<ViewProductCustomModel> query = session.createQuery(sql);
        return query.list();
    }
    
    public static void main(String[] args) {
        List<ViewProductCustomModel>lists = new ProductRepository().getAll();
        for (ViewProductCustomModel p : lists) {
            System.out.println(p.toString());
        }
    }
}
