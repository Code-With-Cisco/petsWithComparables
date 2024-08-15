
package petswithcomparables;

import java.text.DecimalFormat;

/**
 *
 * @author 5767275
 * Professor: Charters COP 3804
 * Program: Challenge 3 Comparable with pets
 */


public class friendsForLyfe {
    public String petName;
    public String species;
    public Integer petAge;
    public Integer petYear;
    public Integer petMonth;
    public Integer petDay;
    public String ownerLast;
    public String ownerFirst;
    public String ownerEmail;
    
    friendsForLyfe(String petName, String species, Integer petAge, Integer petYear, Integer petMonth, Integer petDay, String ownerLast, String ownerFirst, String ownerEmail){
        this.petName = petName;
        this.species = species;
        this.petAge = petAge;
        this.petYear = petYear;
        this.petMonth = petMonth;
        this.petDay = petDay;
        this.ownerLast = ownerLast;
        this.ownerFirst = ownerFirst;
        this.ownerEmail = ownerEmail;
    }
    
    public Integer getAge() {
        return petAge;
    }
    
    public Integer getYear(){
        return petYear;
    }
    
    public Integer getMonth(){
        return petMonth;
    }
    
    public Integer getDay(){
        return petDay;
    }
    
    public String printOldiesVYoungies(){
        return petName + ". A " + species + " owned by: " +
                ownerLast + ", " + ownerFirst + ".";
    }
    
    @Override
    public String toString() {
        DecimalFormat formatter = new DecimalFormat("00");
        return ownerFirst + " " + ownerLast + ", your best friend " + petName +
                " was last vaccinated on " + petYear + "/" + formatter.format(petMonth) +
                "/" + petDay + ".";
    }
}
