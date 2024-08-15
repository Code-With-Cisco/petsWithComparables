
package petswithcomparables;

/**
 *
 * @author 5767275
 * Professor: Charters COP 3804
 * Program: Challenge 3 Comparable with pets
 */

import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class PetsWithComparables {

    public static ArrayList<friendsForLyfe> createfriendsForLyfe() throws IOException {
        Scanner inFile = new Scanner(new File("friendsForLyfe.txt"));
        
        ArrayList<friendsForLyfe> array = new ArrayList<friendsForLyfe>();
            String petName = "";
            String species = "";
            Integer petAge = 0;
            Integer petYear = 0;
            Integer petMonth = 0;
            Integer petDay = 0;
            String ownerLast = "";
            String ownerFirst = "";
            String ownerEmail= "";
        while (inFile.hasNext()){
            petName = inFile.next();
            species = inFile.next();
            petAge = inFile.nextInt();
            petYear = inFile.nextInt();
            petMonth = inFile.nextInt();
            petDay = inFile.nextInt();
            ownerLast = inFile.next();
            ownerFirst = inFile.next();
            ownerEmail = inFile.next();
            array.add(new friendsForLyfe(petName, species, petAge, petYear, petMonth, petDay, ownerLast, ownerFirst, ownerEmail));
            inFile.nextLine();
        }
        
        inFile.close();
        return array;
    }
    
    public static ArrayList<friendsForLyfe> sortAge(ArrayList<friendsForLyfe> friendsForLyfe){
        Collections.sort(friendsForLyfe, new sortAge());
        
        return friendsForLyfe;
    }
    
    public static void printOldiesVYoungies(ArrayList<friendsForLyfe> friendsForLyfe){
        
        System.out.println("The youngest pet is: " + friendsForLyfe.get(0).printOldiesVYoungies());
        System.out.println("The oldest pet is: " + friendsForLyfe.get(friendsForLyfe.size() - 1).printOldiesVYoungies());
        System.out.println();
    }
    
    public static ArrayList<friendsForLyfe> noRabbies(ArrayList<friendsForLyfe> friendsForLyfe) {
        
       Collections.sort(friendsForLyfe, new noRabbies());
       Collections.reverse(friendsForLyfe);
       return friendsForLyfe;
    }
    
    public static void printNoRabbies(ArrayList<friendsForLyfe> friendsForLyfe){
        
        for (int b = 0; b < friendsForLyfe.size(); b++){
            System.out.println(friendsForLyfe.get(b));
        }
    }
    
    public static void main(String[] args) throws IOException{
        ArrayList<friendsForLyfe> friendsForLyfe = createfriendsForLyfe();
        sortAge(friendsForLyfe);
        printOldiesVYoungies(friendsForLyfe);
        noRabbies(friendsForLyfe);
        printNoRabbies(friendsForLyfe);
    }
    
}
