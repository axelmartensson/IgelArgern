import java.awt.Color;


public class Hedgehog {
	private Player owner;
	private Color color;
	
	public Hedgehog(Player owner, Color color){
		this.owner = owner;
		this.color = color;
	}
	
	public Color getColor(){
		return color;
	}
}
