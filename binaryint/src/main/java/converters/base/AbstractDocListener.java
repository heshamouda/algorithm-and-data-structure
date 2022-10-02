package converters.base;

import javax.swing.event.DocumentEvent;
import javax.swing.event.DocumentListener;

/*
 * Created on 02.10.20222
 */
/**
 * @author Ouda Hesham
 */
public abstract class AbstractDocListener<E> implements DocumentListener {
	private final ConverterModel<E> model;

	public AbstractDocListener(ConverterModel<E> model) {
		this.model = model;
	}

	@Override
	public void insertUpdate(DocumentEvent e) {
		anyUpdate(e);
	}

	@Override
	public void removeUpdate(DocumentEvent e) {
		anyUpdate(e);
	}

	@Override
	public void changedUpdate(DocumentEvent e) {
		anyUpdate(e);
	}

	protected void anyUpdate(DocumentEvent e) {
	}

	protected final void updateModel(DocumentEvent e, E value) {
		model.updateAllExceptSource(e.getDocument(), value);
	}
}
