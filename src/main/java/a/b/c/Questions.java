package a.b.c;

import java.util.List;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.OneToMany;

@Entity
public class Questions {
    @Id
    private int Ques_id;
    private String Ques_name;
    @OneToMany
    private List<Answers> ans;

    
    public void setAns(List<Answers> ans){
        this.ans=ans;
    }
    public List<Answers> getAns(){
        return ans;
    }

    public void setQues_id(int Ques_id){
        this.Ques_id=Ques_id;
    }
    public int getQues_id(){
        return Ques_id;
    }

    public void setQues_name(String Ques_name){
        this.Ques_name=Ques_name;
    }
    public String getQues_name(){
        return Ques_name;
    }




}
