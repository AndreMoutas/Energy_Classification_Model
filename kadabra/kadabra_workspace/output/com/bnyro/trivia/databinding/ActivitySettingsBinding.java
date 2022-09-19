package com.bnyro.trivia.databinding;
import R.layout.activity_settings;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageButton;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageButton;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import com.bnyro.trivia.R;
public final class ActivitySettingsBinding implements ViewBinding {
    @NonNull
    private final LinearLayout rootView;

    @NonNull
    public final ImageButton backImageButton;

    @NonNull
    public final LinearLayout settings;

    @NonNull
    public final TextView topBarTextView;

    private ActivitySettingsBinding(@NonNull
    LinearLayout rootView, @NonNull
    ImageButton backImageButton, @NonNull
    LinearLayout settings, @NonNull
    TextView topBarTextView) {
        this.rootView = rootView;
        this.backImageButton = backImageButton;
        this.settings = settings;
        this.topBarTextView = topBarTextView;
    }


    @Override
    @NonNull
    public LinearLayout getRoot() {
        return rootView;
    }


    @NonNull
    public static ActivitySettingsBinding inflate(@NonNull
    LayoutInflater inflater) {
        return inflate(inflater, null, false);
    }


    @NonNull
    public static ActivitySettingsBinding inflate(@NonNull
    LayoutInflater inflater, @Nullable
    ViewGroup parent, boolean attachToParent) {
        View root = inflater.inflate(activity_settings, parent, false);
        if (attachToParent) {
            parent.addView(root);
        }
        return bind(root);
    }


    @NonNull
    public static ActivitySettingsBinding bind(@NonNull
    View rootView) {
        // The body of this method is generated in a way you would not otherwise write.
        // This is done to optimize the compiled bytecode for size and performance.
        int id;
        missingId : {
            id = R.id.back_imageButton;
            ImageButton backImageButton = ViewBindings.findChildViewById(rootView, id);
            if (backImageButton == null) {
                break missingId;
            }
            id = R.id.settings;
            LinearLayout settings = ViewBindings.findChildViewById(rootView, id);
            if (settings == null) {
                break missingId;
            }
            id = R.id.topBar_textView;
            TextView topBarTextView = ViewBindings.findChildViewById(rootView, id);
            if (topBarTextView == null) {
                break missingId;
            }
            return new ActivitySettingsBinding(((LinearLayout) (rootView)), backImageButton, settings, topBarTextView);
        }
        String missingId = rootView.getResources().getResourceName(id);
        throw new NullPointerException("Missing required view with ID: ".concat(missingId));
    }

}