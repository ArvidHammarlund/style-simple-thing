package foo.bar;
import javax.swing.JFrame;
import java.awt.*;
import java.util.*;

/** 
 * Program to draw polygons in a 2-dimensional space using swing.
 */
public abstract class View {
    
}

class ViewSwing extends View {
    // Attributes
    /**
     *  Main module from Swing
     */
    JFrame frame = new JFrame();

    // Constructor
    /**
     * Main constuctor.
     */
    public ViewSwing() {

    }

    // Methods
    /**
     *  Applying default configures for frame
     */
    private void conf(Model model) {
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setBounds(30,30,300,300);
        frame.getContentPane().add(model);
        frame.setVisible(true);
    }

    /**
     *  Swings default renderings method
     */
    @Override
    public void paint(Graphics g) {
        
    }
}
