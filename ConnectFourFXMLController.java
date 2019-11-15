package javaconnectfour;

import java.net.URL;
import java.util.ResourceBundle;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.paint.Color;
import javafx.scene.shape.Circle;

enum Player {
    EMPTY, PLAYERONE, PLAYERTWO;
}

public class ConnectFourFXMLController implements Initializable {

    @FXML
    private Circle circR1C1;
    @FXML
    private Circle circR1C2;
    @FXML
    private Circle circR1C3;
    @FXML
    private Circle circR1C4;
    @FXML
    private Circle circR1C5;
    @FXML
    private Circle circR1C6;
    @FXML
    private Circle circR1C7;
    @FXML
    private Circle circR2C1;
    @FXML
    private Circle circR2C2;
    @FXML
    private Circle circR2C3;
    @FXML
    private Circle circR2C4;
    @FXML
    private Circle circR2C5;
    @FXML
    private Circle circR2C6;
    @FXML
    private Circle circR2C7;
    @FXML
    private Circle circR3C1;
    @FXML
    private Circle circR3C2;
    @FXML
    private Circle circR3C3;
    @FXML
    private Circle circR3C4;
    @FXML
    private Circle circR3C5;
    @FXML
    private Circle circR3C6;
    @FXML
    private Circle circR3C7;
    @FXML
    private Circle circR4C1;
    @FXML
    private Circle circR4C2;
    @FXML
    private Circle circR4C3;
    @FXML
    private Circle circR4C4;
    @FXML
    private Circle circR4C5;
    @FXML
    private Circle circR4C6;
    @FXML
    private Circle circR4C7;
    @FXML
    private Circle circR5C1;
    @FXML
    private Circle circR5C2;
    @FXML
    private Circle circR5C3;
    @FXML
    private Circle circR5C4;
    @FXML
    private Circle circR5C5;
    @FXML
    private Circle circR5C6;
    @FXML
    private Circle circR5C7;
    @FXML
    private Circle circR6C1;
    @FXML
    private Circle circR6C2;
    @FXML
    private Circle circR6C3;
    @FXML
    private Circle circR6C4;
    @FXML
    private Circle circR6C5;
    @FXML
    private Circle circR6C6;
    @FXML
    private Circle circR6C7;

    public final int ROWS = 6;
    public final int COLUMNS = 7;
    public BoardPiece[][] circleArr = new BoardPiece[ROWS][COLUMNS];
    public boolean playerOneTurn = true;    //true is player 1, false is player 2    
    public boolean[] columnFilled = new boolean[COLUMNS];   //true if a particular column is filled
    public int[] columnAmount = new int[COLUMNS];

    @FXML
    private Label playerScreen;
    @FXML
    private Label title;
    @FXML
    private Label stateLabel;
    @FXML
    private Button but1;
    @FXML
    private Button but2;
    @FXML
    private Button but3;
    @FXML
    private Button but4;
    @FXML
    private Button but5;
    @FXML
    private Button but6;
    @FXML
    private Button but7;

    @Override
    public void initialize(URL url, ResourceBundle rb) {

        //row 1
        circleArr[0][0] = new BoardPiece(circR1C1, false, Player.EMPTY);
        circleArr[0][1] = new BoardPiece(circR1C2, false, Player.EMPTY);
        circleArr[0][2] = new BoardPiece(circR1C3, false, Player.EMPTY);
        circleArr[0][3] = new BoardPiece(circR1C4, false, Player.EMPTY);
        circleArr[0][4] = new BoardPiece(circR1C5, false, Player.EMPTY);
        circleArr[0][5] = new BoardPiece(circR1C6, false, Player.EMPTY);
        circleArr[0][6] = new BoardPiece(circR1C7, false, Player.EMPTY);

        //row 2
        circleArr[1][0] = new BoardPiece(circR2C1, false, Player.EMPTY);
        circleArr[1][1] = new BoardPiece(circR2C2, false, Player.EMPTY);
        circleArr[1][2] = new BoardPiece(circR2C3, false, Player.EMPTY);
        circleArr[1][3] = new BoardPiece(circR2C4, false, Player.EMPTY);
        circleArr[1][4] = new BoardPiece(circR2C5, false, Player.EMPTY);
        circleArr[1][5] = new BoardPiece(circR2C6, false, Player.EMPTY);
        circleArr[1][6] = new BoardPiece(circR2C7, false, Player.EMPTY);

        //row 3
        circleArr[2][0] = new BoardPiece(circR3C1, false, Player.EMPTY);
        circleArr[2][1] = new BoardPiece(circR3C2, false, Player.EMPTY);
        circleArr[2][2] = new BoardPiece(circR3C3, false, Player.EMPTY);
        circleArr[2][3] = new BoardPiece(circR3C4, false, Player.EMPTY);
        circleArr[2][4] = new BoardPiece(circR3C5, false, Player.EMPTY);
        circleArr[2][5] = new BoardPiece(circR3C6, false, Player.EMPTY);
        circleArr[2][6] = new BoardPiece(circR3C7, false, Player.EMPTY);

        //row 4
        circleArr[3][0] = new BoardPiece(circR4C1, false, Player.EMPTY);
        circleArr[3][1] = new BoardPiece(circR4C2, false, Player.EMPTY);
        circleArr[3][2] = new BoardPiece(circR4C3, false, Player.EMPTY);
        circleArr[3][3] = new BoardPiece(circR4C4, false, Player.EMPTY);
        circleArr[3][4] = new BoardPiece(circR4C5, false, Player.EMPTY);
        circleArr[3][5] = new BoardPiece(circR4C6, false, Player.EMPTY);
        circleArr[3][6] = new BoardPiece(circR4C7, false, Player.EMPTY);

        //row 5
        circleArr[4][0] = new BoardPiece(circR5C1, false, Player.EMPTY);
        circleArr[4][1] = new BoardPiece(circR5C2, false, Player.EMPTY);
        circleArr[4][2] = new BoardPiece(circR5C3, false, Player.EMPTY);
        circleArr[4][3] = new BoardPiece(circR5C4, false, Player.EMPTY);
        circleArr[4][4] = new BoardPiece(circR5C5, false, Player.EMPTY);
        circleArr[4][5] = new BoardPiece(circR5C6, false, Player.EMPTY);
        circleArr[4][6] = new BoardPiece(circR5C7, false, Player.EMPTY);

        //row 6
        circleArr[5][0] = new BoardPiece(circR6C1, false, Player.EMPTY);
        circleArr[5][1] = new BoardPiece(circR6C2, false, Player.EMPTY);
        circleArr[5][2] = new BoardPiece(circR6C3, false, Player.EMPTY);
        circleArr[5][3] = new BoardPiece(circR6C4, false, Player.EMPTY);
        circleArr[5][4] = new BoardPiece(circR6C5, false, Player.EMPTY);
        circleArr[5][5] = new BoardPiece(circR6C6, false, Player.EMPTY);
        circleArr[5][6] = new BoardPiece(circR6C7, false, Player.EMPTY);

    }

    //the following methods place a piece in the board    
    @FXML
    private void dropOne(ActionEvent event) {

        if (!columnFilled[0]) {     //column not filled
            for (int i = ROWS - 1; i >= 0; --i) {   //start searching from the bottom of the column

                if (!circleArr[i][0].getIsFilled()) {   //space empty
                    if (playerOneTurn) {
                        circleArr[i][0].setIsFilled(true);
                        circleArr[i][0].setCurrPlayer(Player.PLAYERONE);
                        circleArr[i][0].getBoardCircle().setFill(Color.RED);
                        columnAmount[0]++;
                        if (columnAmount[0] == ROWS) {
                            columnFilled[0] = true;
                        }
                        if (allColumnsFull()) {
                            tieState();
                            return;
                        }

                        if (puzzleSolved(i, 0, Player.PLAYERONE)) {
                            endState();
                            return;
                        }

                        playerOneTurn = false;
                        playerScreen.setText("Player 2");
                        break;
                    } else {
                        circleArr[i][0].setIsFilled(true);
                        circleArr[i][0].setCurrPlayer(Player.PLAYERTWO);
                        circleArr[i][0].getBoardCircle().setFill(Color.BLACK);
                        columnAmount[0]++;
                        if (columnAmount[0] == ROWS) {
                            columnFilled[0] = true;
                        }
                        if (allColumnsFull()) {
                            tieState();
                            return;
                        }

                        if (puzzleSolved(i, 0, Player.PLAYERTWO)) {
                            endState();
                            return;
                        }

                        playerOneTurn = true;
                        playerScreen.setText("Player 1");
                        break;
                    }
                }

            }//end for
        }//end filled column if
    }//end dropOne

    @FXML
    private void dropTwo(ActionEvent event) {

        if (!columnFilled[1]) {     //column not filled
            for (int i = ROWS - 1; i >= 0; --i) {   //start searching from the bottom of the column

                if (!circleArr[i][1].getIsFilled()) {   //space empty
                    if (playerOneTurn) {
                        circleArr[i][1].setIsFilled(true);
                        circleArr[i][1].setCurrPlayer(Player.PLAYERONE);
                        circleArr[i][1].getBoardCircle().setFill(Color.RED);
                        columnAmount[1]++;
                        if (columnAmount[1] == ROWS) {
                            columnFilled[1] = true;
                        }
                        if (allColumnsFull()) {
                            tieState();
                            return;
                        }

                        if (puzzleSolved(i, 1, Player.PLAYERONE)) {
                            endState();
                            return;
                        }

                        playerOneTurn = false;
                        playerScreen.setText("Player 2");
                        break;
                    } else {
                        circleArr[i][1].setIsFilled(true);
                        circleArr[i][1].setCurrPlayer(Player.PLAYERTWO);
                        circleArr[i][1].getBoardCircle().setFill(Color.BLACK);
                        columnAmount[1]++;
                        if (columnAmount[1] == ROWS) {
                            columnFilled[1] = true;
                        }
                        if (allColumnsFull()) {
                            tieState();
                            return;
                        }

                        if (puzzleSolved(i, 1, Player.PLAYERTWO)) {
                            endState();
                            return;
                        }

                        playerOneTurn = true;
                        playerScreen.setText("Player 1");
                        break;
                    }
                }

            }//end for
        }//end filled column if
    }

    @FXML
    private void dropThree(ActionEvent event) {

        if (!columnFilled[2]) {     //column not filled
            for (int i = ROWS - 1; i >= 0; --i) {   //start searching from the bottom of the column

                if (!circleArr[i][2].getIsFilled()) {   //space empty
                    if (playerOneTurn) {
                        circleArr[i][2].setIsFilled(true);
                        circleArr[i][2].setCurrPlayer(Player.PLAYERONE);
                        circleArr[i][2].getBoardCircle().setFill(Color.RED);
                        columnAmount[2]++;
                        if (columnAmount[2] == ROWS) {
                            columnFilled[2] = true;
                        }
                        if (allColumnsFull()) {
                            tieState();
                            return;
                        }

                        if (puzzleSolved(i, 2, Player.PLAYERONE)) {
                            endState();
                            return;
                        }

                        playerOneTurn = false;
                        playerScreen.setText("Player 2");
                        break;
                    } else {
                        circleArr[i][2].setIsFilled(true);
                        circleArr[i][2].setCurrPlayer(Player.PLAYERTWO);
                        circleArr[i][2].getBoardCircle().setFill(Color.BLACK);
                        columnAmount[2]++;
                        if (columnAmount[2] == ROWS) {
                            columnFilled[2] = true;
                        }
                        if (allColumnsFull()) {
                            tieState();
                            return;
                        }

                        if (puzzleSolved(i, 2, Player.PLAYERTWO)) {
                            endState();
                            return;
                        }

                        playerOneTurn = true;
                        playerScreen.setText("Player 1");
                        break;
                    }
                }

            }//end for
        }//end filled column if
    }

    @FXML
    private void dropFour(ActionEvent event) {

        if (!columnFilled[3]) {     //column not filled
            for (int i = ROWS - 1; i >= 0; --i) {   //start searching from the bottom of the column

                if (!circleArr[i][3].getIsFilled()) {   //space empty
                    if (playerOneTurn) {
                        circleArr[i][3].setIsFilled(true);
                        circleArr[i][3].setCurrPlayer(Player.PLAYERONE);
                        circleArr[i][3].getBoardCircle().setFill(Color.RED);
                        columnAmount[3]++;
                        if (columnAmount[3] == ROWS) {
                            columnFilled[3] = true;
                        }
                        if (allColumnsFull()) {
                            tieState();
                            return;
                        }

                        if (puzzleSolved(i, 3, Player.PLAYERONE)) {
                            endState();
                            return;
                        }

                        playerOneTurn = false;
                        playerScreen.setText("Player 2");
                        break;
                    } else {
                        circleArr[i][3].setIsFilled(true);
                        circleArr[i][3].setCurrPlayer(Player.PLAYERTWO);
                        circleArr[i][3].getBoardCircle().setFill(Color.BLACK);
                        columnAmount[3]++;
                        if (columnAmount[3] == ROWS) {
                            columnFilled[3] = true;
                        }
                        if (allColumnsFull()) {
                            tieState();
                            return;
                        }

                        if (puzzleSolved(i, 3, Player.PLAYERTWO)) {
                            endState();
                            return;
                        }

                        playerOneTurn = true;
                        playerScreen.setText("Player 1");
                        break;
                    }
                }

            }//end for
        }//end filled column if
    }

    @FXML
    private void dropFive(ActionEvent event) {

        if (!columnFilled[4]) {     //column not filled
            for (int i = ROWS - 1; i >= 0; --i) {   //start searching from the bottom of the column

                if (!circleArr[i][4].getIsFilled()) {   //space empty
                    if (playerOneTurn) {
                        circleArr[i][4].setIsFilled(true);
                        circleArr[i][4].setCurrPlayer(Player.PLAYERONE);
                        circleArr[i][4].getBoardCircle().setFill(Color.RED);
                        columnAmount[4]++;
                        if (columnAmount[4] == ROWS) {
                            columnFilled[4] = true;
                        }
                        if (allColumnsFull()) {
                            tieState();
                            return;
                        }

                        if (puzzleSolved(i, 4, Player.PLAYERONE)) {
                            endState();
                            return;
                        }

                        playerOneTurn = false;
                        playerScreen.setText("Player 2");
                        break;
                    } else {
                        circleArr[i][4].setIsFilled(true);
                        circleArr[i][4].setCurrPlayer(Player.PLAYERTWO);
                        circleArr[i][4].getBoardCircle().setFill(Color.BLACK);
                        columnAmount[4]++;
                        if (columnAmount[4] == ROWS) {
                            columnFilled[4] = true;
                        }
                        if (allColumnsFull()) {
                            tieState();
                            return;
                        }

                        if (puzzleSolved(i, 4, Player.PLAYERTWO)) {
                            endState();
                            return;
                        }

                        playerOneTurn = true;
                        playerScreen.setText("Player 1");
                        break;
                    }
                }

            }//end for
        }//end filled column if
    }

    @FXML
    private void dropSix(ActionEvent event) {

        if (!columnFilled[5]) {     //column not filled
            for (int i = ROWS - 1; i >= 0; --i) {   //start searching from the bottom of the column

                if (!circleArr[i][5].getIsFilled()) {   //space empty
                    if (playerOneTurn) {
                        circleArr[i][5].setIsFilled(true);
                        circleArr[i][5].setCurrPlayer(Player.PLAYERONE);
                        circleArr[i][5].getBoardCircle().setFill(Color.RED);
                        columnAmount[5]++;
                        if (columnAmount[5] == ROWS) {
                            columnFilled[5] = true;
                        }
                        if (allColumnsFull()) {
                            tieState();
                            return;
                        }

                        if (puzzleSolved(i, 5, Player.PLAYERONE)) {
                            endState();
                            return;
                        }

                        playerOneTurn = false;
                        playerScreen.setText("Player 2");
                        break;
                    } else {
                        circleArr[i][5].setIsFilled(true);
                        circleArr[i][5].setCurrPlayer(Player.PLAYERTWO);
                        circleArr[i][5].getBoardCircle().setFill(Color.BLACK);
                        columnAmount[5]++;
                        if (columnAmount[5] == ROWS) {
                            columnFilled[5] = true;
                        }
                        if (allColumnsFull()) {
                            tieState();
                            return;
                        }

                        if (puzzleSolved(i, 5, Player.PLAYERTWO)) {
                            endState();
                            return;
                        }

                        playerOneTurn = true;
                        playerScreen.setText("Player 1");
                        break;
                    }
                }

            }//end for
        }//end filled column if
    }

    @FXML
    private void dropSeven(ActionEvent event) {

        if (!columnFilled[6]) {     //column not filled
            for (int i = ROWS - 1; i >= 0; --i) {   //start searching from the bottom of the column

                if (!circleArr[i][6].getIsFilled()) {   //space empty
                    if (playerOneTurn) {
                        circleArr[i][6].setIsFilled(true);
                        circleArr[i][6].setCurrPlayer(Player.PLAYERONE);
                        circleArr[i][6].getBoardCircle().setFill(Color.RED);
                        columnAmount[6]++;
                        if (columnAmount[6] == ROWS) {
                            columnFilled[6] = true;
                        }
                        if (allColumnsFull()) {
                            tieState();
                            return;
                        }

                        if (puzzleSolved(i, 6, Player.PLAYERONE)) {
                            endState();
                            return;
                        }

                        playerOneTurn = false;
                        playerScreen.setText("Player 2");
                        break;
                    } else {
                        circleArr[i][6].setIsFilled(true);
                        circleArr[i][6].setCurrPlayer(Player.PLAYERTWO);
                        circleArr[i][6].getBoardCircle().setFill(Color.BLACK);
                        columnAmount[6]++;
                        if (columnAmount[6] == ROWS) {
                            columnFilled[6] = true;
                        }
                        if (allColumnsFull()) {
                            tieState();
                            return;
                        }

                        if (puzzleSolved(i, 6, Player.PLAYERTWO)) {
                            endState();
                            return;
                        }

                        playerOneTurn = true;
                        playerScreen.setText("Player 1");
                        break;
                    }
                }

            }//end for
        }//end filled column if
    }

    public boolean puzzleSolved(int indexRow, int indexCol, Player thisPlayer) {
        return (solveColumn(indexRow, indexCol, thisPlayer)
                || solveRow(indexRow, indexCol, thisPlayer)
                || solveDiagonal(indexRow, indexCol, thisPlayer));
    }

    public boolean solveColumn(int indexRow, int indexCol, Player thisPlayer) {

        int counter = 0;

        if (indexRow <= 2) { //search from minimum height to obtain a column win
            for (int x = indexRow; x < ROWS; ++x) {
                if (circleArr[x][indexCol].getCurrPlayer() == thisPlayer) {  //current board position is current player's piece
                    counter++;
                    if (counter == 4) {
                        return true;
                    }
                } else {  //not a valid answer
                    break;
                }
            }//end for
        }//end if

        return false;
    }

    public boolean solveRow(int indexRow, int indexCol, Player thisPlayer) {

        int counter = 0;

        for (int x = indexCol; x < COLUMNS; ++x) { //solve to the right
            if (circleArr[indexRow][x].getCurrPlayer() == thisPlayer) { //current board position is current player's piece
                counter++;
                if (counter == 4) {
                    return true;
                }
            } else { //not a valid answer
                break;
            }
        }

        for (int x = indexCol - 1; x >= 0; --x) { //solve to the left
            if (circleArr[indexRow][x].getCurrPlayer() == thisPlayer) { //current board position is current player's piece
                counter++;
                if (counter == 4) {
                    return true;
                }
            } else { //not a valid answer
                break;
            }
        }

        return false;
    }

    public boolean solveDiagonal(int indexRow, int indexCol, Player thisPlayer) {

        int counter = 0;
        int row = indexRow, col = indexCol;

        while (row < ROWS && col < COLUMNS) { //down to the right
            if (circleArr[row++][col++].getCurrPlayer() == thisPlayer) {
                counter++;
                if (counter == 4) {
                    return true;
                }
            } else {
                break;
            }
        }
        row = indexRow - 1;   //do not double count starting piece
        col = indexCol - 1;
        while (row >= 0 && col >= 0) { //up to the left
            if (circleArr[row--][col--].getCurrPlayer() == thisPlayer) {
                counter++;
                if (counter == 4) {
                    return true;
                }
            } else {
                break;
            }
        }

        //reset counter to check other diagonal direction
        counter = 0;
        row = indexRow;
        col = indexCol;
        while (row < ROWS && col >= 0) { //up to the right
            if (circleArr[row++][col--].getCurrPlayer() == thisPlayer) {
                counter++;
                if (counter == 4) {
                    return true;
                }
            } else {
                break;
            }
        }
        row = indexRow - 1;
        col = indexCol + 1;
        while (row >= 0 && col < COLUMNS) { //down to the left
            if (circleArr[row--][col++].getCurrPlayer() == thisPlayer) {
                counter++;
                if (counter == 4) {
                    return true;
                }
            } else {
                break;
            }
        }

        return false;
    }

    public void endState() {
        stateLabel.setText("Winner:");

        //disable buttons
        but1.setDisable(true);
        but2.setDisable(true);
        but3.setDisable(true);
        but4.setDisable(true);
        but5.setDisable(true);
        but6.setDisable(true);
        but7.setDisable(true);
    }

    public void tieState() {
        stateLabel.setText("Winner:");
        playerScreen.setText("Tie");

        //disable buttons
        but1.setDisable(true);
        but2.setDisable(true);
        but3.setDisable(true);
        but4.setDisable(true);
        but5.setDisable(true);
        but6.setDisable(true);
        but7.setDisable(true);
    }

    public boolean allColumnsFull() {
        return columnFilled[0]
                && columnFilled[1]
                && columnFilled[2]
                && columnFilled[3]
                && columnFilled[4]
                && columnFilled[5]
                && columnFilled[6];
    }
}
