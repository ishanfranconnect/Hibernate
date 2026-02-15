package a.b.c;

import javax.persistence.Embeddable;
import javax.persistence.Entity;

@Embeddable
public class Address {
    private String city,state,country;

    public void setCity(String city){
        this.city=city;
    }
    public String getCity(){
        return city;
    }
    public void setState(String state){
        this.state=state;
    }
    public String getState(){
        return state;
    }
    public void setCountry(String country){
        this.country=country;
    }
    public String getCountry(){
        return country;
    }
}
