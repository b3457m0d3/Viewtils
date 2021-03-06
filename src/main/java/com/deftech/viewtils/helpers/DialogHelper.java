package com.deftech.viewtils.helpers;

import android.app.Dialog;
import android.view.ViewGroup;

/***
 * Helps interact with an {@link android.app.Dialog}. When
 * searching for a view, it starts at the view returned
 * by {@code dialog.findViewById(android.R.id.content)}
 * @see com.deftech.viewtils.helpers.ViewGroupHelper
 */
public class DialogHelper extends ViewGroupHelper {
    private final Dialog dialog;

    /***
     * Create a new instance to help interact with the
     * provided {@link Dialog}
     * @param instance Dialog to be used for carrying out operations
     */
    DialogHelper(Dialog instance) {
        super((ViewGroup)instance.findViewById(android.R.id.content));
        this.dialog = instance;
    }
}
