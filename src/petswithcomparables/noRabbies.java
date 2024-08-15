
package petswithcomparables;

import java.util.Comparator;

/**
 *
 * @author 5767275
 * Professor: Charters COP 3804
 * Program: Challenge 3 Comparable with pets
 */

public class noRabbies implements Comparator<friendsForLyfe> {
    @Override
    public int compare(friendsForLyfe p1, friendsForLyfe p2) {
        if (p1.getYear().compareTo(p2.getYear()) < 0)
            return 1;
        else if (p1.getYear().compareTo(p2.getYear()) > 0)
            return -1;
        else if (p1.getMonth().compareTo(p2.getMonth()) < 0)
            return 1;
        else if (p1.getMonth().compareTo(p2.getMonth()) > 0)
            return -1;
        else if (p1.getDay().compareTo(p2.getDay()) < 0)
            return 1;
        else if (p1.getDay().compareTo(p2.getDay()) > 0)
            return -1;
        else
            return 0;
    }

    
    
}
