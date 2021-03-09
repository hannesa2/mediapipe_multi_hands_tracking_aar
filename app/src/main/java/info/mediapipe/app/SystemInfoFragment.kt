package info.mediapipe.app

import android.os.Build
import android.os.Bundle
import androidx.preference.Preference
import androidx.preference.PreferenceFragmentCompat

class SystemInfoFragment : PreferenceFragmentCompat() {

    override fun onCreatePreferences(savedInstanceState: Bundle?, rootKey: String?) {
        // Load the preferences from an XML resource
        addPreferencesFromResource(R.xml.prefs)
        findPreference<Preference>(PREFERENCE_ + "APPVERSION")?.summary = "${BuildConfig.VERSION_NAME}  debug=${BuildConfig.DEBUG}"
        findPreference<Preference>(PREFERENCE_ + "BOARD")?.summary = Build.BOARD
        findPreference<Preference>(PREFERENCE_ + "BRAND")?.summary = Build.BRAND
        findPreference<Preference>(PREFERENCE_ + "CPU_ABI")?.summary = Build.SUPPORTED_ABIS[0]
        findPreference<Preference>(PREFERENCE_ + "DISPLAY")?.summary = Build.DISPLAY
        findPreference<Preference>(PREFERENCE_ + "USER")?.summary = Build.USER
    }

    companion object {
        private const val PREFERENCE_ = "preference_"
    }
}