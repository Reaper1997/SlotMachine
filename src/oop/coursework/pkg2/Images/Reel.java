package oop.coursework.pkg2.Images;

import java.util.ArrayList;
import java.util.Collections;

/**
 *
 * @author Steven
 */
public class Reel {
    ArrayList<Symbol> list = new ArrayList<Symbol>();
	public Reel(){

		Symbol sevenImage = new Symbol();
		Symbol bellImage = new Symbol();
		Symbol watermelonImage = new Symbol();
		Symbol plumImage = new Symbol();
		Symbol lemonImage = new Symbol();
		Symbol cherryImage = new Symbol();
		
		
		
		sevenImage.setValue(7);
		bellImage.setValue(6);
		watermelonImage.setValue(5);
		plumImage.setValue(4);
		lemonImage.setValue(3);
		cherryImage.setValue(2);
		
		
		
		list.add(sevenImage);
		list.add(bellImage);
		list.add(watermelonImage);
		list.add(plumImage);
		list.add(lemonImage);
		list.add(cherryImage);
		
	}
	public ArrayList<Symbol> Spin(){
		
		
		Collections.shuffle(list);
		
		return list;
		
		
		
	}
	
}

    
   

