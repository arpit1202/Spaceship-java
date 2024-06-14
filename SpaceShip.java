import java.awt.BorderLayout;
import java.awt.Dimension;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.*;

public class SpaceShip{
    public static void main(String[] args) {
        JFrame frame = new JFrame("SpaceShip");
        Main m = new Main();
        m.setPreferredSize(new Dimension(500,300));
        frame.add(m,BorderLayout.NORTH);
        frame.setSize(500, 500);
       frame.setVisible(true);
       JButton leftbtn = new JButton("left");
       JButton rightbtn = new JButton("right");

       leftbtn.addActionListener(new ActionListener(){
            public void actionPerformed(ActionEvent e){
                System.out.println("left");
                m.moveleft();
            }
       });

       rightbtn.addActionListener(new ActionListener(){
        public void actionPerformed(ActionEvent e){
            System.out.println("right");
            m.moveright();
        }
   });
       JPanel buttonpanel = new JPanel();
       buttonpanel.add(leftbtn);
       buttonpanel.add(rightbtn);
       frame.add(buttonpanel,BorderLayout.SOUTH);

      

    }
}