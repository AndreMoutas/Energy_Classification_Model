package com.bnyro.trivia.databinding;
import R.layout.fragment_library;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.LinearLayout;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.recyclerview.widget.RecyclerView;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import com.google.android.material.floatingactionbutton.FloatingActionButton;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.LinearLayout;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.recyclerview.widget.RecyclerView;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import com.bnyro.trivia.R;
import com.google.android.material.floatingactionbutton.FloatingActionButton;
public final class FragmentLibraryBinding implements ViewBinding {
    @NonNull
    private final FrameLayout rootView;

    @NonNull
    public final FloatingActionButton createFAB;

    @NonNull
    public final FloatingActionButton downloadFAB;

    @NonNull
    public final LinearLayout libraryEmpty;

    @NonNull
    public final RecyclerView libraryRV;

    private FragmentLibraryBinding(@NonNull
    FrameLayout rootView, @NonNull
    FloatingActionButton createFAB, @NonNull
    FloatingActionButton downloadFAB, @NonNull
    LinearLayout libraryEmpty, @NonNull
    RecyclerView libraryRV) {
        this.rootView = rootView;
        this.createFAB = createFAB;
        this.downloadFAB = downloadFAB;
        this.libraryEmpty = libraryEmpty;
        this.libraryRV = libraryRV;
    }


    @Override
    @NonNull
    public FrameLayout getRoot() {
        return rootView;
    }


    @NonNull
    public static FragmentLibraryBinding inflate(@NonNull
    LayoutInflater inflater) {
        return inflate(inflater, null, false);
    }


    @NonNull
    public static FragmentLibraryBinding inflate(@NonNull
    LayoutInflater inflater, @Nullable
    ViewGroup parent, boolean attachToParent) {
        View root = inflater.inflate(fragment_library, parent, false);
        if (attachToParent) {
            parent.addView(root);
        }
        return bind(root);
    }


    @NonNull
    public static FragmentLibraryBinding bind(@NonNull
    View rootView) {
        // The body of this method is generated in a way you would not otherwise write.
        // This is done to optimize the compiled bytecode for size and performance.
        int id;
        missingId : {
            id = R.id.createFAB;
            FloatingActionButton createFAB = ViewBindings.findChildViewById(rootView, id);
            if (createFAB == null) {
                break missingId;
            }
            id = R.id.downloadFAB;
            FloatingActionButton downloadFAB = ViewBindings.findChildViewById(rootView, id);
            if (downloadFAB == null) {
                break missingId;
            }
            id = R.id.library_empty;
            LinearLayout libraryEmpty = ViewBindings.findChildViewById(rootView, id);
            if (libraryEmpty == null) {
                break missingId;
            }
            id = R.id.libraryRV;
            RecyclerView libraryRV = ViewBindings.findChildViewById(rootView, id);
            if (libraryRV == null) {
                break missingId;
            }
            return new FragmentLibraryBinding(((FrameLayout) (rootView)), createFAB, downloadFAB, libraryEmpty, libraryRV);
        }
        String missingId = rootView.getResources().getResourceName(id);
        throw new NullPointerException("Missing required view with ID: ".concat(missingId));
    }

}