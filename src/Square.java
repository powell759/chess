public class Square {
	public enum Content {PAWN, KNIGHT, BISHOP, ROOK, QUEEN, KING, EMPTY}
	public enum Color {BLACK, WHITE, NONE}
	
	public Content content;
	public Color color;
	
	public Square(Content startContent, Color startColor){
		content = startContent;
		color = startColor;
	}
}
