import java.awt.Color;
import java.awt.Graphics;
import java.awt.Font;
import javax.swing.JPanel;

public class HangmanPanel extends JPanel {
   
    @Override
    public void paintComponent(Graphics g) {
        super.paintComponent(g);
        g.setColor(Color.black);
        g.fillRect(40, 10, 10, 280);
        g.fillRect(10, 10, 160, 10);
        g.fillRect(10, 280, 70, 10);

        if(Hangman.tries > 0){
            g.drawRect(120, 30, 40, 40);
        }
        if(Hangman.tries > 1){
            g.drawRect(135, 70, 10, 110);
        }
        if(Hangman.tries > 2){
            g.drawRect(85, 85, 50, 10);
        }
        if(Hangman.tries > 3){
            g.drawRect(145, 85, 50, 10);
        }
        if(Hangman.tries > 4){
            g.drawRect(124, 155, 10, 90);
        }
        if(Hangman.tries > 5){
            g.drawRect(144, 155, 10, 90);
        }

        int space = 230;
        for(int i = 0; i < Hangman.current.size(); i++){
            g.drawString(Hangman.current.get(i), space, 30);
            space += 10;
        }

        g.drawString("Wrong letters: " + Hangman.guessedLetters, 100, 330);

    }
}