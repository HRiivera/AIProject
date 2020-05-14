package Resources;

public class Pair<F, S> {
    private F first; //first member of pair
    private S second; //second member of pair

    public Pair(F first, S second) {
        this.first = first;
        this.second = second;
    }

    public void setFirst(F first) {
        this.first = first;
    }

    public void setSecond(S second) {
        this.second = second;
    }

    public F getFirst() {
        return first;
    }

    public S getSecond() {
        return second;
    }
    
    public boolean isEmpty() {
    	if(first == null && second == null) {
    		return true;
    	}
    	else {
    		return false;
    	}
    }
    
    
    public String toString() {
        return "Distance to " + first + ": " + second ;
    }
}