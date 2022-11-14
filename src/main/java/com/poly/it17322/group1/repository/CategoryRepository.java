/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.poly.it17322.group1.repository;

import com.poly.it17322.group1.config.HibernateUtil;
import com.poly.it17322.group1.domainmodel.Category;
import java.util.List;
import javax.persistence.Query;
import javax.transaction.Transaction;
import org.hibernate.Session;

/**
 *
 * @author hangnt
 */
public class CategoryRepository {

    private String fromTable = " FROM Category"; // HQL 

    private Session session = HibernateUtil.getFACTORY().openSession();

    public List<Category> getAll() {
        Query query = session.createQuery(fromTable, Category.class);
        List<Category> listCategory = query.getResultList(); // listCategory 
        return listCategory;
    }

    public Category getOne(Long id) {
        String sql = fromTable + " WHERE id =:id";
        Query query = session.createQuery(sql, Category.class);
        query.setParameter("id", id);
        Category category = (Category) query.getSingleResult();
        return category;
    }

    public Boolean add(Category category) {
        Transaction transaction = null;
        try ( Session session = HibernateUtil.getFACTORY().openSession()) {
            transaction = (Transaction) session.beginTransaction();
            session.save(category); // add 
            transaction.commit();
            return true;
        } catch (Exception e) {
            e.printStackTrace(System.out);
        }
        return null;
    }

    public Boolean update(Category category) {
        Transaction transaction = null;
        try ( Session session = HibernateUtil.getFACTORY().openSession()) {
            transaction = (Transaction) session.beginTransaction();
            session.saveOrUpdate(category); // add 
            transaction.commit();
            return true;
        } catch (Exception e) {
            e.printStackTrace(System.out);
        }
        return null;
    }

    public Boolean delete(Category category) {
        Transaction transaction = null;
        try ( Session session = HibernateUtil.getFACTORY().openSession()) {
            transaction = (Transaction) session.beginTransaction();
            session.delete(category); // add 
            transaction.commit();
            return true;
        } catch (Exception e) {
            e.printStackTrace(System.out);
        }
        return null;
    }

    public static void main(String[] args) {
        List<Category> lists = new CategoryRepository().getAll();
        for (Category c : lists) {
            System.out.println(c.toString());
        }
    }
}
