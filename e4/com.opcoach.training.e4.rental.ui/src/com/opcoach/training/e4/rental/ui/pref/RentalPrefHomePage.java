package com.opcoach.training.e4.rental.ui.pref;

import org.eclipse.jface.preference.BooleanFieldEditor;
import org.eclipse.jface.preference.FieldEditorPreferencePage;
import org.eclipse.swt.SWT;
import org.eclipse.swt.widgets.Composite;
import org.eclipse.swt.widgets.Control;
import org.eclipse.swt.widgets.Label;

import com.opcoach.training.e4.rental.ui.RentalUIConstants;

public class RentalPrefHomePage extends FieldEditorPreferencePage implements  RentalUIConstants

{	
	public RentalPrefHomePage()
	{
		super(GRID);
		// Init of preference store delegated in init (pstore not initialized else)
	}
	

	/* (non-Javadoc)
	 * @see org.eclipse.jface.preference.FieldEditorPreferencePage#createFieldEditors()
	 */
	@Override
	protected void createFieldEditors()
	{
		addField(new BooleanFieldEditor(PREF_DISPLAY_COUNT, "Affiche les totaux par groupes d'objets", getFieldEditorParent()));
		
	}



	@Override
	protected Control createContents(Composite parent)
	{
		Label lab = new Label(parent, SWT.NONE);
		lab.setText("Rental Preference page");
		
		// TODO Auto-generated method stub
		return super.createContents(parent);
	}

}
