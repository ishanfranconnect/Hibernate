package a.b.c;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class Student {
    @Id
    private int s_id;
    private String S_name;
    private String City;
    
    public void setS_id(int s_id){
        this.s_id=s_id;
    }
    public int getS_id(){
        return s_id;
    }
    public void setS_name(String S_name){
        this.S_name=S_name;
    }
    public String getS_name(){
        return S_name;
    }
    public void setCity(String City){
        this.City=City;
    }
    public String getCity(){
        return City;
    }
}
