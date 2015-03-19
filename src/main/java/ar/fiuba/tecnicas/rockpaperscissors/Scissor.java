package ar.fiuba.tecnicas.rockpaperscissors;

public class Scissor {

	public Scissor() {
	
	}
	
	public Object vs(Scissor s) {
		return new Scissor();
	}
	
	public Object vs(Paper s) {
		return new Scissor();
	}
	
	public Object vs(Rock s) {
		return new Rock();
	}
	
	@Override
	public boolean equals(Object o) {
		return o instanceof Scissor;
	}
}
