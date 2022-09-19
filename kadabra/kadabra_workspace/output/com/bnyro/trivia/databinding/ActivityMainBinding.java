package com.bnyro.trivia.databinding;
import R.layout.activity_main;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import com.google.android.material.appbar.AppBarLayout;
import com.google.android.material.appbar.MaterialToolbar;
import com.google.android.material.bottomnavigation.BottomNavigationView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import com.bnyro.trivia.R;
import com.google.android.material.appbar.AppBarLayout;
import com.google.android.material.appbar.MaterialToolbar;
import com.google.android.material.bottomnavigation.BottomNavigationView;
public final class ActivityMainBinding implements ViewBinding {
    @NonNull
    private final ConstraintLayout rootView;

    @NonNull
    public final AppBarLayout appBarLayout;

    @NonNull
    public final BottomNavigationView bottomNavigationView;

    @NonNull
    public final MaterialToolbar toolbar;

    private ActivityMainBinding(@NonNull
    ConstraintLayout rootView, @NonNull
    AppBarLayout appBarLayout, @NonNull
    BottomNavigationView bottomNavigationView, @NonNull
    MaterialToolbar toolbar) {
        this.rootView = rootView;
        this.appBarLayout = appBarLayout;
        this.bottomNavigationView = bottomNavigationView;
        this.toolbar = toolbar;
    }


    @Override
    @NonNull
    public ConstraintLayout getRoot() {
        return rootView;
    }


    @NonNull
    public static ActivityMainBinding inflate(@NonNull
    LayoutInflater inflater) {
        return inflate(inflater, null, false);
    }


    @NonNull
    public static ActivityMainBinding inflate(@NonNull
    LayoutInflater inflater, @Nullable
    ViewGroup parent, boolean attachToParent) {
        View root = inflater.inflate(activity_main, parent, false);
        if (attachToParent) {
            parent.addView(root);
        }
        return bind(root);
    }


    @NonNull
    public static ActivityMainBinding bind(@NonNull
    View rootView) {
        // The body of this method is generated in a way you would not otherwise write.
        // This is done to optimize the compiled bytecode for size and performance.
        int id;
        missingId : {
            id = R.id.appBarLayout;
            AppBarLayout appBarLayout = ViewBindings.findChildViewById(rootView, id);
            if (appBarLayout == null) {
                break missingId;
            }
            id = R.id.bottomNavigationView;
            BottomNavigationView bottomNavigationView = ViewBindings.findChildViewById(rootView, id);
            if (bottomNavigationView == null) {
                break missingId;
            }
            id = R.id.toolbar;
            MaterialToolbar toolbar = ViewBindings.findChildViewById(rootView, id);
            if (toolbar == null) {
                break missingId;
            }
            return new ActivityMainBinding(((ConstraintLayout) (rootView)), appBarLayout, bottomNavigationView, toolbar);
        }
        String missingId = rootView.getResources().getResourceName(id);
        throw new NullPointerException("Missing required view with ID: ".concat(missingId));
    }

}