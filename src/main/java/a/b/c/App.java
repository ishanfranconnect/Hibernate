package a.b.c;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

public class App 
{
    public static void main( String[] args )
    {
        // Student so1=new Student();
        // so1.setS_id(2);
        // so1.setS_name("Ishita");
        // so1.setCity("Muzaffarpur");
        Configuration cfg= new Configuration();
        cfg.configure();
        SessionFactory sf=cfg.buildSessionFactory();
        Session s=sf.openSession();
        Transaction tr=s.beginTransaction();

        // Employee eo1=new Employee();
        // eo1.setEmp_fname("Ishita");
        // eo1.setEmp_lname("Anand");
        // eo1.setEmp_city("Muzaffarpur");

        // fetch the data from database
        // try{
        //     Employee eo2=s.get(Employee.class, 1);
        //     if(eo2!=null){
        //         System.out.println("Id:"+eo2.getEmp_id());
        //         System.out.println("Fname:"+eo2.getEmp_fname());
        //         System.out.println("Lname:"+eo2.getEmp_lname());
        //         System.out.println("City:"+eo2.getEmp_city());
        //     } else{
        //         System.out.println("Data is not found");
        //     }
        // } catch(Exception e){
        //     e.printStackTrace();
        // }

        // update data to the database
        // try{
        //     Employee eo3=s.get(Employee.class, 1);
        //     eo3.setEmp_city("NewDelhi");
        //     s.saveOrUpdate(eo3);
        //     tr.commit();
        //     System.out.println("city updated");
        // } catch(Exception e){
        //     tr.rollback();
        //     e.printStackTrace();
        // }

        // delete data from the database;

        try{
            Employee eo4=new Employee();
        eo4.setEmp_id(1);
        s.delete(eo4);
        tr.commit();
        System.out.println("data delted");
        } catch(Exception e){
            tr.rollback();
            e.printStackTrace();
        }
        


        // try{
        //     s.save(eo1);
        //     tr.commit();
        // } catch(Exception e){
        //     tr.rollback();
        //     e.printStackTrace();
        // }

    

    }
}
