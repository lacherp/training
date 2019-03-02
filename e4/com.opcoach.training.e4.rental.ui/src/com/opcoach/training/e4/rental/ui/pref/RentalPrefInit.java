package com.opcoach.training.e4.rental.ui.pref;

import org.eclipse.core.runtime.preferences.AbstractPreferenceInitializer;
import org.eclipse.core.runtime.preferences.DefaultScope;
import org.eclipse.core.runtime.preferences.IEclipsePreferences;
import org.eclipse.core.runtime.preferences.InstanceScope;
import org.eclipse.jface.preference.IPreferenceStore;
import org.eclipse.jface.resource.StringConverter;
import org.eclipse.swt.SWT;
import org.eclipse.swt.graphics.Color;
import org.eclipse.swt.graphics.RGB;
import org.eclipse.swt.widgets.Display;
import org.osgi.framework.FrameworkUtil;
import org.osgi.service.prefs.BackingStoreException;

import com.opcoach.e4.preferences.ScopedPreferenceStore;
import com.opcoach.training.e4.rental.ui.RentalUIConstants;

public class RentalPrefInit extends AbstractPreferenceInitializer implements RentalUIConstants
{

	public RentalPrefInit()
	{
	}

	@Override
	public void initializeDefaultPreferences()
	{
		IEclipsePreferences node = DefaultScope.INSTANCE.getNode(PLUGIN_ID);
		
		if (node != null)
		{
			node.put(PREF_CUSTOMER_COLOR, StringConverter.asString(new RGB(0, 0, 255)));
			node.put(PREF_RENTAL_COLOR, StringConverter.asString(new RGB(255, 0, 0)));
			node.put(PREF_RENTAL_OBJECT_COLOR, StringConverter.asString(new RGB(0, 255, 0)));
			node.put(PREF_PALETTE, NONE_PALETTE);
			
			node.put(PREF_DISPLAY_COUNT, StringConverter.asString(false));
			
			
			try { node.flush();  }  catch (BackingStoreException e) { }
		}	
		
	}

}
