
package petswithcomparables;

import java.util.Comparator;

/**
 *
 * @author 5767275
 * Professor: Charters COP 3804
 * Program: Challenge 3 Comparable with pets
 */


public class sortAge implements Comparator<friendsForLyfe> {
    @Override
    public int compare(friendsForLyfe p1, friendsForLyfe p2) {
        if (p1.getAge().compareTo(p2.getAge()) > 0)
            return 1;
        else if (p1.getAge().compareTo(p2.getAge()) < 0)
            return -1;
        else
            return 0;
    }
}
