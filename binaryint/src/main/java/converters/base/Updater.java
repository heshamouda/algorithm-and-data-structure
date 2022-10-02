package converters.base;

import javax.swing.text.Document;

/*
 * Created on 02.10.2022
 */
/**
 * @author Ouda Hesham
 */
public interface Updater<E> {
	Document getDocument();

	void update(E value);
}
