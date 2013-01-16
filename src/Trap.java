
public abstract class Trap {
	protected IgelBoard board;
	public Trap(IgelBoard board){
		this.board = board;
	}
	public abstract void trigger(Hedgehog victim);
}
