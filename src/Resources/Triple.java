package Resources;

public class Triple<F, S, T> {
    private F first; //first member of triple
    private S second; //second member of triple
    private T third; //third member of triple

    public Triple(F first, S second, T third) {
        this.first = first;
        this.second = second;
        this.third = third;
    }

    public void setFirst(F first) {
        this.first = first;
    }

    public void setSecond(S second) {
        this.second = second;
    }
    
    public void setThird(T third) {
        this.third = third;
    }

    public F getFirst() {
        return first;
    }

    public S getSecond() {
        return second;
    }
    
    public T getThird() {
        return third;
    }
    
    public boolean isEmpty() {
    	if(first == null && second == null && third == null) {
    		return true;
    	}
    	else {
    		return false;
    	}
    }
    
    
    public String toStringFirst() {
        return "Currently at: " + first;
    }
    
    public String toStringSecond() {
    	 return "\nPath Cost to Next: " + second;
    }
    
    public String toStringThird() {
   	 return "Total Travel Cost to Next: " + third;
   }
    
}