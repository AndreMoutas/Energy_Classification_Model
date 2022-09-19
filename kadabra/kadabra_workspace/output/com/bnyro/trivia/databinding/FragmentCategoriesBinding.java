package com.bnyro.trivia.databinding;
import R.layout.fragment_categories;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.ListView;
import android.widget.ProgressBar;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.ListView;
import android.widget.ProgressBar;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import com.bnyro.trivia.R;
public final class FragmentCategoriesBinding implements ViewBinding {
    @NonNull
    private final FrameLayout rootView;

    @NonNull
    public final ListView categoriesLV;

    @NonNull
    public final ProgressBar progress;

    private FragmentCategoriesBinding(@NonNull
    FrameLayout rootView, @NonNull
    ListView categoriesLV, @NonNull
    ProgressBar progress) {
        this.rootView = rootView;
        this.categoriesLV = categoriesLV;
        this.progress = progress;
    }


    @Override
    @NonNull
    public FrameLayout getRoot() {
        return rootView;
    }


    @NonNull
    public static FragmentCategoriesBinding inflate(@NonNull
    LayoutInflater inflater) {
        return inflate(inflater, null, false);
    }


    @NonNull
    public static FragmentCategoriesBinding inflate(@NonNull
    LayoutInflater inflater, @Nullable
    ViewGroup parent, boolean attachToParent) {
        View root = inflater.inflate(fragment_categories, parent, false);
        if (attachToParent) {
            parent.addView(root);
        }
        return bind(root);
    }


    @NonNull
    public static FragmentCategoriesBinding bind(@NonNull
    View rootView) {
        // The body of this method is generated in a way you would not otherwise write.
        // This is done to optimize the compiled bytecode for size and performance.
        int id;
        missingId : {
            id = R.id.categoriesLV;
            ListView categoriesLV = ViewBindings.findChildViewById(rootView, id);
            if (categoriesLV == null) {
                break missingId;
            }
            id = R.id.progress;
            ProgressBar progress = ViewBindings.findChildViewById(rootView, id);
            if (progress == null) {
                break missingId;
            }
            return new FragmentCategoriesBinding(((FrameLayout) (rootView)), categoriesLV, progress);
        }
        String missingId = rootView.getResources().getResourceName(id);
        throw new NullPointerException("Missing required view with ID: ".concat(missingId));
    }

}