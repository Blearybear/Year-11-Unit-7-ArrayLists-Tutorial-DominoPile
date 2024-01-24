import java.util.ArrayList;
import java.util.Collections;

public class DominoPile {
    private ArrayList<Domino> pile;
    public DominoPile(){
        ArrayList<Domino> temp = new ArrayList<>();
        this.pile = temp;
    }
    public void newStack6(){
        for (int e = 0; e <= 6;e++){
            for (int i = e; i <= 6;i++){
                this.pile.add(new Domino(e, i));
            }
        }
    }
    public ArrayList<Domino> getPile(){
        return this.pile;
    }
    public void shuffle(){
        Collections.shuffle(this.pile);
    }
}
