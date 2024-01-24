public class Domino {
    private int top;
    private int bottom;
    public Domino(){
        this.top = 0;
        this.bottom = 0;
    }
    public Domino(int top, int bottom){
        this.top = top;
        this.bottom = bottom;
    }
    public int getTop(){
        return this.top;
    }
    public void setTop(int top){
        this.top = top;
    }
    public int getBottom(){
        return this.bottom;
    }
    public void setBottom(int bottom){
        this.bottom = bottom;
    }
    public String toString(){
        return top + "/" + bottom;
    }
    public void flip(){
        int temp = top;
        top = bottom;
        bottom = temp;
    }
    public void settle(){
        if (top > bottom){
            this.flip();
        }
    }
    public int compareTo(Domino other){
        this.settle();
        other.settle();
        if (this.getTop() < other.getTop()){
            return -1;
        }
        else if (this.getTop() > other.getTop()){
            return 1;
        }
        else if (this.getBottom() < other.getBottom()){
            return -1;
        }
        else if (this.getBottom() > other.getBottom()){
            return 1;
        }
        else return 0;
    }
    public int compareToWeight(Domino other){
        if (this.getTop() + this.getBottom() < other.getTop() + other.getBottom()){
            return -1;
        }
        else if (this.getTop() + this.getBottom() > other.getTop() + other.getBottom()){
            return 1;
        }
        else return 0;
    }
    public boolean canConnect(Domino other){
        if (this.getTop() == other.getTop() || this.getTop() == other.getBottom() || this.getBottom() == other.getTop() || this.getBottom() == other.getBottom()){
            return true;
        }
        else return false;
    }

}
