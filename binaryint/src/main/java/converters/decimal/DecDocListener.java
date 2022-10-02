package converters.decimal;

import javax.swing.event.DocumentEvent;
import javax.swing.text.BadLocationException;
import javax.swing.text.Document;

import converters.base.AbstractDocListener;
import converters.base.ConverterModel;

/*
 * Created on 02.10.2022
 */
/**
 * @author Ouda Hesham
 */
public class DecDocListener extends AbstractDocListener<Integer> {
	public DecDocListener(ConverterModel<Integer> model) {
		super(model);
	}

	@Override
	protected void anyUpdate(DocumentEvent e) {
		try {
			final Document doc = e.getDocument();
			final String s = doc.getText(0, doc.getLength());
			final int x = (s.length() == 0 || s.equals("-")) ? 0
					: DecConverter
							.fromString(s);
			updateModel(e, x);
		} catch (BadLocationException e1) {
			e1.printStackTrace();
		}
	}
}
