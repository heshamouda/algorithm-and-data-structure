package converters.decimal;

import javax.swing.text.BadLocationException;
import javax.swing.text.Document;
import javax.swing.text.PlainDocument;

import converters.base.Updater;

/*
 * Created on 02.10.2022
 */
/**
 * @author Ouda Hesham
 */
public class DecUpdater implements Updater<Integer> {
	private final Document doc;

	public DecUpdater(Document doc) {
		this.doc = doc;
	}

	@Override
	public Document getDocument() {
		return doc;
	}

	@Override
	public void update(Integer val) {
		try {
			((PlainDocument) doc).replace(0, doc.getLength(), DecConverter
					.toString(val), doc.getDefaultRootElement().getAttributes());
		} catch (BadLocationException e) {
			e.printStackTrace();
		}
	}
}
