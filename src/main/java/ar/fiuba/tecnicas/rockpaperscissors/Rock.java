package ar.fiuba.tecnicas.rockpaperscissors;

public class Rock {

	public Rock() {
		
	}
	
	public Object vs(Scissor s) {
		return new Rock();
	}
	
	public Object vs(Paper s) {
		return new Paper();
	}
	
	public Object vs(Rock s) {
		return new Rock();
	}
	
	@Override
	public boolean equals(Object o) {
		return o instanceof Rock;
	}
}
