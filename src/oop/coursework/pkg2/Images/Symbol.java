package oop.coursework.pkg2.Images;

import java.awt.Image;
import javax.swing.ImageIcon;

/**
 *
 * @author Steven
 */
public class Symbol implements ISymbol{
ImageIcon image = new ImageIcon();
	int value;
	String symbolName;

	
	
	public int getValue() {
		return value;
	}

	public void setValue(int value) {
		this.value = value;
		
	}

	public String getSymbolName() {
		return symbolName;
	}

	public void setSymbolName(String symbolName) {
		this.symbolName = symbolName;
	}
	
@Override
	public ImageIcon getImage() {
		return image;
	}

	public void setImage(ImageIcon image) {
		this.image = image;
	}
	
}
