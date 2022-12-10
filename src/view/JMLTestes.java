
package view;



public class JMLTestes {
	//@ public invariant i >= 0;
	//@ public invariant i >= j;
	public int i = 0;
	public int j = 0;
	
	//@ requires x > 0;
	//@ ensures i == \old(i) + x;
	public void add(int x) {
		this.i = this.i + x;
	}

    
    public static void main(String[] args) {
    	(new JMLTestes()).add(0);
    	System.out.println("Finalizou");
    }
    
}
