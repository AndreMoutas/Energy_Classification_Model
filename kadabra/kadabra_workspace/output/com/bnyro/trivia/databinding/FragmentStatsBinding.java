package com.bnyro.trivia.databinding;
import R.layout.fragment_stats;
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
public final class FragmentStatsBinding implements ViewBinding {
    @NonNull
    private final FrameLayout rootView;

    @NonNull
    public final ListView apiStats;

    @NonNull
    public final ProgressBar progress;

    private FragmentStatsBinding(@NonNull
    FrameLayout rootView, @NonNull
    ListView apiStats, @NonNull
    ProgressBar progress) {
        this.rootView = rootView;
        this.apiStats = apiStats;
        this.progress = progress;
    }


    @Override
    @NonNull
    public FrameLayout getRoot() {
        return rootView;
    }


    @NonNull
    public static FragmentStatsBinding inflate(@NonNull
    LayoutInflater inflater) {
        return inflate(inflater, null, false);
    }


    @NonNull
    public static FragmentStatsBinding inflate(@NonNull
    LayoutInflater inflater, @Nullable
    ViewGroup parent, boolean attachToParent) {
        View root = inflater.inflate(fragment_stats, parent, false);
        if (attachToParent) {
            parent.addView(root);
        }
        return bind(root);
    }


    @NonNull
    public static FragmentStatsBinding bind(@NonNull
    View rootView) {
        // The body of this method is generated in a way you would not otherwise write.
        // This is done to optimize the compiled bytecode for size and performance.
        int id;
        missingId : {
            id = R.id.apiStats;
            ListView apiStats = ViewBindings.findChildViewById(rootView, id);
            if (apiStats == null) {
                break missingId;
            }
            id = R.id.progress;
            ProgressBar progress = ViewBindings.findChildViewById(rootView, id);
            if (progress == null) {
                break missingId;
            }
            return new FragmentStatsBinding(((FrameLayout) (rootView)), apiStats, progress);
        }
        String missingId = rootView.getResources().getResourceName(id);
        throw new NullPointerException("Missing required view with ID: ".concat(missingId));
    }

}