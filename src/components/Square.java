package components;
import components.Colour.Color;

public class Square {
	
	public Piece content;
	public Color color;
	
	public Square(Piece startContent, Color startColor){
		this.content = startContent;
		this.color = startColor;
	}
}
