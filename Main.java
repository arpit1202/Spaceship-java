import java.awt.*;
import java.io.*;
import javax.imageio.ImageIO;
import javax.swing.*;

public class Main extends JPanel{
  int x=0;
  int y=0;
  private Image spaceshipImage;

   Main(){
    super();
   try {
    spaceshipImage = ImageIO.read(new File("./spaceship.png"));
   } catch (IOException e) {
    System.out.println(e);
   }
  }

  public void moveleft(){
    x = x-250;
    repaint();
  }

  public void moveright(){
    x = x+250;
    repaint();
  }
 public void paintComponent(Graphics g){
  super.paintComponent(g);
  g.setColor(Color.red);
  //g.fillRect(x, y, 100, 100);
  g.drawImage(spaceshipImage, x, y, this);
 
 }
}
