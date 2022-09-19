package com.bnyro.trivia.databinding;
import R.layout.activity_about;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageButton;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import com.google.android.material.floatingactionbutton.FloatingActionButton;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageButton;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import com.bnyro.trivia.R;
import com.google.android.material.floatingactionbutton.FloatingActionButton;
public final class ActivityAboutBinding implements ViewBinding {
    @NonNull
    private final ConstraintLayout rootView;

    @NonNull
    public final ImageView appIcon;

    @NonNull
    public final TextView appName;

    @NonNull
    public final FloatingActionButton author;

    @NonNull
    public final ImageButton back;

    @NonNull
    public final FloatingActionButton github;

    @NonNull
    public final FloatingActionButton license;

    @NonNull
    public final LinearLayout topBar;

    @NonNull
    public final TextView version;

    private ActivityAboutBinding(@NonNull
    ConstraintLayout rootView, @NonNull
    ImageView appIcon, @NonNull
    TextView appName, @NonNull
    FloatingActionButton author, @NonNull
    ImageButton back, @NonNull
    FloatingActionButton github, @NonNull
    FloatingActionButton license, @NonNull
    LinearLayout topBar, @NonNull
    TextView version) {
        this.rootView = rootView;
        this.appIcon = appIcon;
        this.appName = appName;
        this.author = author;
        this.back = back;
        this.github = github;
        this.license = license;
        this.topBar = topBar;
        this.version = version;
    }


    @Override
    @NonNull
    public ConstraintLayout getRoot() {
        return rootView;
    }


    @NonNull
    public static ActivityAboutBinding inflate(@NonNull
    LayoutInflater inflater) {
        return inflate(inflater, null, false);
    }


    @NonNull
    public static ActivityAboutBinding inflate(@NonNull
    LayoutInflater inflater, @Nullable
    ViewGroup parent, boolean attachToParent) {
        View root = inflater.inflate(activity_about, parent, false);
        if (attachToParent) {
            parent.addView(root);
        }
        return bind(root);
    }


    @NonNull
    public static ActivityAboutBinding bind(@NonNull
    View rootView) {
        // The body of this method is generated in a way you would not otherwise write.
        // This is done to optimize the compiled bytecode for size and performance.
        int id;
        missingId : {
            id = R.id.appIcon;
            ImageView appIcon = ViewBindings.findChildViewById(rootView, id);
            if (appIcon == null) {
                break missingId;
            }
            id = R.id.appName;
            TextView appName = ViewBindings.findChildViewById(rootView, id);
            if (appName == null) {
                break missingId;
            }
            id = R.id.author;
            FloatingActionButton author = ViewBindings.findChildViewById(rootView, id);
            if (author == null) {
                break missingId;
            }
            id = R.id.back;
            ImageButton back = ViewBindings.findChildViewById(rootView, id);
            if (back == null) {
                break missingId;
            }
            id = R.id.github;
            FloatingActionButton github = ViewBindings.findChildViewById(rootView, id);
            if (github == null) {
                break missingId;
            }
            id = R.id.license;
            FloatingActionButton license = ViewBindings.findChildViewById(rootView, id);
            if (license == null) {
                break missingId;
            }
            id = R.id.topBar;
            LinearLayout topBar = ViewBindings.findChildViewById(rootView, id);
            if (topBar == null) {
                break missingId;
            }
            id = R.id.version;
            TextView version = ViewBindings.findChildViewById(rootView, id);
            if (version == null) {
                break missingId;
            }
            return new ActivityAboutBinding(((ConstraintLayout) (rootView)), appIcon, appName, author, back, github, license, topBar, version);
        }
        String missingId = rootView.getResources().getResourceName(id);
        throw new NullPointerException("Missing required view with ID: ".concat(missingId));
    }

}