package ar.fiuba.tecnicas.rockpaperscissors;

public class Rock {

	public Rock() {
		
	}
	
	public Object vs(Scissor s) {
		return new Rock();
	}
	
	@Override
	public boolean equals(Object o) {
		return o instanceof Rock;
	}
}
