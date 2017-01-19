package components;
import components.Colour.Color;
import components.Piece.Content;

public class Square {
	
	public Content content;
	public Color color;
	
	public Square(Content startContent, Color startColor){
		this.content = startContent;
		this.color = startColor;
	}
}
