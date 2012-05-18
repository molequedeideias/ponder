/*
 * Copyright (C) NetStruxr, Inc. All rights reserved.
 *
 * This software is published under the terms of the NetStruxr
 * Public Software License version 0.5, a copy of which has been
 * included with this distribution in the LICENSE.NPL file.  */
package er.corebl.preferences;

import com.webobjects.foundation.NSArray;

import er.corebl.model.ERCPreference;

public interface ERCoreUserInterface {
    public NSArray<ERCPreference> preferences();
    public void setPreferences(NSArray<ERCPreference> array);
    public void newPreference(ERCPreference pref);
}
