package oop.coursework.pkg2.Images;

import javax.swing.ImageIcon;

/**
 *
 * @author Steven
 */
public interface ISymbol{
    
    public abstract void setImage(ImageIcon img);
    public abstract ImageIcon getImage();
    public abstract void setValue(int v);
    public abstract int getValue();
        
    
}
 