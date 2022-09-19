package com.bnyro.trivia.databinding;
import R.layout.fragment_search;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.recyclerview.widget.RecyclerView;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.recyclerview.widget.RecyclerView;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import com.bnyro.trivia.R;
public final class FragmentSearchBinding implements ViewBinding {
    @NonNull
    private final FrameLayout rootView;

    @NonNull
    public final RecyclerView searchResults;

    private FragmentSearchBinding(@NonNull
    FrameLayout rootView, @NonNull
    RecyclerView searchResults) {
        this.rootView = rootView;
        this.searchResults = searchResults;
    }


    @Override
    @NonNull
    public FrameLayout getRoot() {
        return rootView;
    }


    @NonNull
    public static FragmentSearchBinding inflate(@NonNull
    LayoutInflater inflater) {
        return inflate(inflater, null, false);
    }


    @NonNull
    public static FragmentSearchBinding inflate(@NonNull
    LayoutInflater inflater, @Nullable
    ViewGroup parent, boolean attachToParent) {
        View root = inflater.inflate(fragment_search, parent, false);
        if (attachToParent) {
            parent.addView(root);
        }
        return bind(root);
    }


    @NonNull
    public static FragmentSearchBinding bind(@NonNull
    View rootView) {
        // The body of this method is generated in a way you would not otherwise write.
        // This is done to optimize the compiled bytecode for size and performance.
        int id;
        missingId : {
            id = R.id.searchResults;
            RecyclerView searchResults = ViewBindings.findChildViewById(rootView, id);
            if (searchResults == null) {
                break missingId;
            }
            return new FragmentSearchBinding(((FrameLayout) (rootView)), searchResults);
        }
        String missingId = rootView.getResources().getResourceName(id);
        throw new NullPointerException("Missing required view with ID: ".concat(missingId));
    }

}