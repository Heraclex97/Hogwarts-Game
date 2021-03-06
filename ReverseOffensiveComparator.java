import java.util.Comparator;

/**
 * This class compares offensive points of two different characters. If offensive
 * points are the same, it compares their names.
 *
 * @author The Order of the Phoenix: Jorge Cancho Casado, Rubén Costa Barriga and Arturo Mejías Velasco
 * @version 10/01/2020
 */
public class ReverseOffensiveComparator implements Comparator <Character> {
    
    public int compare(Character c1, Character c2) {
        
        if(c1.getOffensive() == c2.getOffensive()) {
            return c1.getCharacterName().compareTo(c2.getCharacterName()); 
        }
        else if(c1.getOffensive() > c2.getOffensive())   
            return -1;
        else
            return 1;
    }
}
