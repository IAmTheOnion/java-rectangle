public class rectangle {
	private int x;
	private int y;
	private char fillSymbol;
	private char borderSymbol;
	private boolean border = true;
	
	public rectangle(int x, int y, char fsymbol, char bsymbol) {
		set(y, x, fsymbol, bsymbol); 
	}
	
	public void set(int x, int y, char fsymbol, char bsymbol) {
		this.x = x;
		this.y = y;
		this.fillSymbol = fsymbol;
		this.borderSymbol = bsymbol;
	}
	
	public void show() {
		for (int i = 1; i <= y; i++) {
			for (int j = 1; j <= x; j++) {
				if (checkIfBorder(j, i)) {
					System.out.print(borderSymbol + " ");
				} else {
					System.out.print(fillSymbol + " ");
				}
				
				
			}
			System.out.print("\n");
		}
		System.out.print("\n");
	}
	
	public void enableBorder() {
		if (border == false) {
			border = true;
		} else {
			border = false;
		}
	}
	
	private boolean checkIfBorder(int j, int i) {
		if (border == true) {
			if (j == 1 || i == 1 || j == this.x || i == this.y) {
				return true;
			} else {
				return false;
			}
		} else {
			return false;
		}
	}
}
