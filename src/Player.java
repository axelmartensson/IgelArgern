import java.awt.Color;


public class Player {
	private Color color;
	private Hedgehog[] hedgehogs;
	
	public static final int INITIAL_HEDGEHOGS = 5;
	
	public Player(Color color){
		this.color = color;
		hedgehogs = new Hedgehog[INITIAL_HEDGEHOGS];
		
		for(int i=0;i<INITIAL_HEDGEHOGS;i++){
			hedgehogs[i] = new Hedgehog(this, color);
		}
	}
}
