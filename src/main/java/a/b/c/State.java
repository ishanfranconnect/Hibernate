package a.b.c;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.OneToOne;

@Entity
public class State {
    @Id
    private int S_id;
    private String S_name;
    @OneToOne
    private Capital c;
    public void setCapital(Capital c){
        this.c=c;
    }
    public Capital getCapital(){
        return c;
    }

    
    public void setS_id(int S_id){
        this.S_id=S_id;
    }
    public int getS_id(){
        return S_id;
    }
    public void setS_name(String S_name){
        this.S_name=S_name;
    }
    public String getS_name(){
        return S_name;
    }
}
