package components;
import components.Colour.Color;

public class Square {
	
	public Piece content;
	public Color tileColor;
	public Square northwest;
	public Square north;
	public Square northeast;
	public Square west;
	public Square southwest;
	public Square south;
	public Square southeast;
	public Square east;
	public int row;
	public int column;
		
	public Square(Piece startContent, Color startColor){
		this.content = startContent;
		this.tileColor = startColor;
	}
}
