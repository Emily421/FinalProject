import java.awt.Color;
import java.awt.Graphics;
import java.awt.Font;
import javax.swing.JPanel;
import java.awt.event.MouseListener;
import java.awt.event.MouseEvent;

public class TicTacToePanel extends JPanel implements MouseListener  {
    int panelState;
    int boardLocation;

    public TicTacToePanel(int boardLocation) {
        panelState = 0;
        this.boardLocation = boardLocation;
        addMouseListener(this);
    }

    public void setPanelState(int state){
        panelState = state;
        repaint();
    }

    @Override
    public void paintComponent(Graphics g) {
        super.paintComponent(g);
        g.setFont(new Font("ComicSans", Font.PLAIN, 130));

        if(panelState == 1){
            g.setColor(Color.red);
            g.drawString("X", 40, 130);
        }else if(panelState == 2){
            g.setColor(Color.blue);
            g.drawString("O", 40, 130);
        }
        g.setColor(Color.BLACK);
        g.drawRect(10, 10, getWidth() - 10, getHeight() - 10);
    }

    @Override
    public void mousePressed(MouseEvent e){

    }

    @Override
    public void mouseReleased(MouseEvent e){

    }

    @Override
    public void mouseClicked(MouseEvent e){
       if(TicTacToe.board[boardLocation] == 0 && TicTacToe.checkIfWinner() == 0){
            if(TicTacToe.isPlayerOneTurn){
                panelState = 1;
                TicTacToe.board[boardLocation] = 1;
                TicTacToe.isPlayerOneTurn = false;
            }else{
                panelState = 2;
                TicTacToe.board[boardLocation] = 2;
                TicTacToe.isPlayerOneTurn = true;
            }
       }
       repaint();
    }

    @Override
    public void mouseExited(MouseEvent e){
   
    }

    @Override
    public void mouseEntered(MouseEvent e){
      
    }
}