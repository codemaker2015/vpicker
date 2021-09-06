package com.vsoft.apps.vpicker.activities;

import com.vsoft.apps.vpicker.R;
import com.vsoft.apps.vpicker.data.Palette;
import com.vsoft.apps.vpicker.data.Palettes;
import com.vsoft.apps.vpicker.views.PaletteMakerView;

/**
 * The flavor implementation of {@link PaletteCreationBaseActivity}.
 *
 * In the kids version, a default name is used.
 */
public class PaletteCreationActivity extends PaletteCreationBaseActivity {

    @Override
    protected void createPalette(PaletteMakerView paletteMakerView) {
        final Palette newPalette = paletteMakerView.make(getString(R.string.activity_palette_creation_default_palette_name, System.currentTimeMillis()));
        if (Palettes.saveColorPalette(this, newPalette)) {
            finish();
        }
    }

}
