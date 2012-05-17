/*************************************************************************
 * MineMessageVibrator is an Android App that provides vibrate and 
 * reminder functions for SMS, MMS, Gmail, etc. 
 * Copyright (C) 2010  Lei YU
 *
 * This program is free software: you can redistribute it and/or modify
 * it under the terms of the GNU General Public License as published by
 * the Free Software Foundation, either version 3 of the License, or
 * (at your option) any later version.
 *
 * This program is distributed in the hope that it will be useful,
 * but WITHOUT ANY WARRANTY; without even the implied warranty of
 * MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the
 * GNU General Public License for more details.
 *
 * You should have received a copy of the GNU General Public License
 * along with this program.  If not, see <http://www.gnu.org/licenses/>.
 ************************************************************************/

package com.mine.psf;

import com.mine.psfplayer.R;

import android.os.Bundle;
import android.preference.PreferenceActivity;
import android.preference.PreferenceScreen;

public class PsfSettingsActivity extends PreferenceActivity {
	
	@Override
	protected void onCreate(Bundle icicle) {
		
		super.onCreate(icicle);
		addPreferencesFromResource(R.xml.preferences);
		
		Bundle extras = getIntent().getExtras(); 
		if (extras != null) {
			boolean directShowPsfDialog = extras.getBoolean("DirectShowDlg");
			if (directShowPsfDialog) {
				PreferenceScreen screen = 
						(PreferenceScreen) findPreference(
								getString(R.string.pref_settings));
				int pos = findPreference(
						getString(R.string.key_psf_root_dir)).getOrder();
				screen.onItemClick(null, null, pos, 0);
			}
		}
	}
}
