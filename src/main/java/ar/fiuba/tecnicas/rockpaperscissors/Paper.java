package ar.fiuba.tecnicas.rockpaperscissors;

public class Paper {

	public Paper() {
		
	}
	
	public Object vs(Scissor s) {
		return new Scissor();
	}
	
	public Object vs(Paper s) {
		return new Paper();
	}
	
	public Object vs(Rock s) {
		return new Paper();
	}
	
	@Override
	public boolean equals(Object o) {
		return o instanceof Paper;
	}
}
