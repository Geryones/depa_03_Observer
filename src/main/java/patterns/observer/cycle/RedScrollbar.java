package patterns.observer.cycle;

import java.awt.Color;

public class RedScrollbar extends Observable {
	
	private int value;
	
	public RedScrollbar(ColorModel model) {
		this.value = model.getColor().getRed();
	}

	public int getValue() {
		return value;
	}

	public void setValue(int value) {
		System.out.println("RedScrollbar.setValue");
		this.value = value;
	}

	public void updateValue (int value) {
	    this.setValue(value);
        this.notifyObservers(value);
    }
}
