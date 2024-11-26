
package Controlador;

import java.awt.Graphics;
import javax.swing.ImageIcon;
import javax.swing.JLabel;
import javax.swing.JPanel;

/**
 * @author Benjamin
 * Version 26-11-2024
 */

// Adapta el tamaño de las imagenes a un objeto normalmente se usa en JPanel
public class JpanelImage extends JLabel{
    
    private int x,y;
    private final String path;
    
    public JpanelImage(JPanel panel , String path){
        this.path = path;
        this.x = panel.getWidth();
        this.y = panel.getHeight();
        this.setSize(x, y);
    }
    @Override
    public void paint(Graphics g){
    
        ImageIcon img = new ImageIcon(getClass().getResource(path));
        g.drawImage(img.getImage(), 0 , 0, x, y, null);
    
    
    }  
}
