package com.vsoft.apps.vpicker.activities;

import android.os.Bundle;
import android.view.Menu;

import com.vsoft.apps.vpicker.R;

/**
 * Static methods for specific flavor behaviour of {@link ColorDetailActivity}.
 */
/* package */
final class ColorDetailActivityFlavor {

    /**
     * Called when {@link ColorDetailActivity#onCreate(Bundle)} is called.
     * <p/>
     * <b>Note</b> this should be the last methods called in {@link ColorDetailActivity#onCreate(Bundle)}.
     *
     * @param activity the {@link ColorDetailActivity}.
     */
    /* package */
    static void onCreate(ColorDetailActivity activity) {
        // For the kid version, set the title to null.
        //noinspection ConstantConditions
        activity.getSupportActionBar().setTitle(null);
    }

    /**
     * Called when {@link ColorDetailActivity#onCreateOptionsMenu(Menu)} is called.
     *
     * @param menu the {@link Menu} created.
     */
    /* package */
    static void onCreateOptionsMenu(Menu menu) {
        // For the kid version, hide the edit and share menu items.
        menu.removeItem(R.id.menu_color_detail_action_edit);
        menu.removeItem(R.id.menu_color_detail_action_share);
    }

    private ColorDetailActivityFlavor() {
        // non-instantiable.
    }
}
