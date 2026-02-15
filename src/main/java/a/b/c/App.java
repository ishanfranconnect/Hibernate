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

        // lecture 2 ka object h ye
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

        // try{
        //     Employee eo4=new Employee();
        // eo4.setEmp_id(1);
        // s.delete(eo4);
        // tr.commit();
        // System.out.println("data delted");
        // } catch(Exception e){
        //     tr.rollback();
        //     e.printStackTrace();
        // }


    //    lecture 3 ka object h ye
    //    Annotation ke liye object h ye
    //     Employee eo1=new Employee();
    //     eo1.setEmp_fname("xyz2");
    //     eo1.setEmp_lname("uyt2");
    //     eo1.setEmp_city("Assam2");

    //     Address ao=new Address();
    //     ao.setCity("mumbai2");
    //     ao.setState("maharaastra2");
    //     ao.setCountry("india2");
    //     eo1.setA(ao);




    // lecture 4 ka object h ye

    State s1=new State();
    s1.setS_id(5);
    s1.setS_name("Ishan");

    Capital c1=new Capital();
    c1.setC_id(6);
    c1.setC_name("Ishita");

    s1.setCapital(c1);
    c1.setS(s1);


        try{
            s.save(s1);
            s.save(c1);
            tr.commit();
        } catch(Exception e){
            tr.rollback();
            e.printStackTrace();
        }

        
        


        

    

    }
}
