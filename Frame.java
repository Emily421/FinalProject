import java.awt.Container;
import java.util.ArrayList;
import javax.swing.JFrame;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.awt.GridLayout;
import java.awt.BorderLayout;
import javax.swing.JPanel;

public class Frame extends JFrame {
    Frame() {
        ArrayList<TicTacToePanel> tileList;
        JPanel TicTacToePanel = new JPanel();
        JPanel buttonPanel = new JPanel();

        setBounds(35, 35, 500, 500);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setResizable(false);
        
        Container contentPane = getContentPane();
        contentPane.setLayout(new BorderLayout());

        contentPane.add(TicTacToePanel, BorderLayout.CENTER);
        contentPane.add(buttonPanel, BorderLayout.SOUTH);
        TicTacToePanel.setLayout(new GridLayout(3, 3));

        tileList = new ArrayList<TicTacToePanel>();

        for(int i = 0; i <  9; i++) {
            TicTacToePanel tile = new TicTacToePanel(i);
            tileList.add(tile);
            TicTacToePanel.add(tile);
        }

        JButton reset = new JButton("Reset");
        buttonPanel.add(reset);
        reset.addActionListener(new ActionListener(){
            public void actionPerformed(ActionEvent e) {
                for(int i = 0; i < 9; i++){
                    TicTacToe.board[i] = 0;
                }
                for(TicTacToePanel tile:tileList) {
                    tile.setPanelState(0);
                }
            }
        });
    }
}