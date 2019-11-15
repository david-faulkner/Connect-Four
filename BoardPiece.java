package javaconnectfour;

//import static javaconnectfour.Player.EMPTY;
import javafx.scene.shape.Circle;

public class BoardPiece {

    private Circle boardCircle;
    private boolean isFilled;       //true if the space has a circle stored in it
    private Player currPlayer;      //will indicate which player owns the object for determining circle color

    public Player getCurrPlayer() {
        return currPlayer;
    }

    public void setCurrPlayer(Player currPlayer) {
        this.currPlayer = currPlayer;
    }

    public Circle getBoardCircle() {
        return boardCircle;
    }

    public void setBoardCircle(Circle boardCircle) {
        this.boardCircle = boardCircle;
    }

    public boolean getIsFilled() {
        return isFilled;
    }

    public void setIsFilled(boolean isFilled) {
        this.isFilled = isFilled;
    }

    public BoardPiece(Circle boardCircle, boolean isFilled, Player currPlayer) {
        this.boardCircle = boardCircle;
        this.isFilled = isFilled;
        this.currPlayer = currPlayer;
    }

//    public BoardPiece() {
//        this.isFilled = false;
//        this.currPlayer = EMPTY;
//    }
}
