package info.nightscout.utils;

import android.databinding.BindingAdapter;
import android.view.View;
import android.view.ViewGroup;

/**
 * Created by adrian on 04/06/18.
 */

public class DataBinderUtils {

    static public boolean isCompactView(){
        return SP.getBoolean("compact_tabtitles", true);
    }

    @BindingAdapter("android:layout_height")
    public static void setLayoutHeight(View view, float height) {
        ViewGroup.LayoutParams layoutParams = view.getLayoutParams();
        layoutParams.height = (int) height;
        view.setLayoutParams(layoutParams);
    }
}
