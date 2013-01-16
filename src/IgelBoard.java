import java.util.EmptyStackException;
import java.util.Stack;

public class IgelBoard {
	private Stack<Hedgehog>[][] board;
	private Trap[][] traps;
	
	public static final int ROWS = 6;
	public static final int COLS = 9;
	public IgelBoard(){
		board = (Stack<Hedgehog>[][]) new Object[ROWS][COLS];
		
		for(int i=0;i<ROWS;i++){
			for(int j=0;j<COLS;j++){
				board[i][j] = new Stack<Hedgehog>();
			}
		}
		
		traps = new Trap[ROWS][COLS];
		
	}
	
	public boolean isTrap(int x, int y){
		return (traps[y][x] != null);
	}
	
	public void move(int x, int y, int newX, int newY){
		Hedgehog h = null;
		try {
			h = board[y][x].pop();
		} catch(EmptyStackException e){
			return;
		}
		board[newY][newX].push(h);
		if(isTrap(newX,newY)){
			traps[newY][newX].trigger(h);
		}
	}
}
