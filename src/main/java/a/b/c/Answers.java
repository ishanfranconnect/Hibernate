package a.b.c;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
@Entity
public class Answers {
    @Id
    private int Ans_id;
    private String Ans_name;
    @ManyToOne
    private Questions ques;
    public void setQues(Questions ques){
        this.ques=ques;
    }
    public Questions getQues(){
        return ques;
    }

    public void setAns_id(int Ans_id){
        this.Ans_id=Ans_id;
    }
    public int getAns_id(){
        return Ans_id;
    }

    public void setAns_name(String Ans_name){
        this.Ans_name=Ans_name;
    }
    public String getAns_name(){
        return Ans_name;
    }
}
