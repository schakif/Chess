package Chess;

import info.gridworld.grid.Location;

import java.awt.Color;
import java.util.ArrayList;

public class Pawn extends ChessPiece {
	public Pawn(ChessBoard<ChessPiece> board, Color color){
		super.setColor(color);
		super.setHasMoved(false);
		super.setChessBoard(board);
	}
	@Override
	public ArrayList<Location> getValidMoveLocations() {
		// TODO Auto-generated method stub
		return null;
	}

}