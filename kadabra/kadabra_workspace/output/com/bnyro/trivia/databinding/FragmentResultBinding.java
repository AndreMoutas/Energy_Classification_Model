package com.bnyro.trivia.databinding;
import R.layout.fragment_result;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.FrameLayout;
import android.widget.TextView;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.FrameLayout;
import android.widget.TextView;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import com.bnyro.trivia.R;
public final class FragmentResultBinding implements ViewBinding {
    @NonNull
    private final FrameLayout rootView;

    @NonNull
    public final TextView resultStats;

    @NonNull
    public final TextView resultText;

    @NonNull
    public final Button retry;

    private FragmentResultBinding(@NonNull
    FrameLayout rootView, @NonNull
    TextView resultStats, @NonNull
    TextView resultText, @NonNull
    Button retry) {
        this.rootView = rootView;
        this.resultStats = resultStats;
        this.resultText = resultText;
        this.retry = retry;
    }


    @Override
    @NonNull
    public FrameLayout getRoot() {
        return rootView;
    }


    @NonNull
    public static FragmentResultBinding inflate(@NonNull
    LayoutInflater inflater) {
        return inflate(inflater, null, false);
    }


    @NonNull
    public static FragmentResultBinding inflate(@NonNull
    LayoutInflater inflater, @Nullable
    ViewGroup parent, boolean attachToParent) {
        View root = inflater.inflate(fragment_result, parent, false);
        if (attachToParent) {
            parent.addView(root);
        }
        return bind(root);
    }


    @NonNull
    public static FragmentResultBinding bind(@NonNull
    View rootView) {
        // The body of this method is generated in a way you would not otherwise write.
        // This is done to optimize the compiled bytecode for size and performance.
        int id;
        missingId : {
            id = R.id.resultStats;
            TextView resultStats = ViewBindings.findChildViewById(rootView, id);
            if (resultStats == null) {
                break missingId;
            }
            id = R.id.resultText;
            TextView resultText = ViewBindings.findChildViewById(rootView, id);
            if (resultText == null) {
                break missingId;
            }
            id = R.id.retry;
            Button retry = ViewBindings.findChildViewById(rootView, id);
            if (retry == null) {
                break missingId;
            }
            return new FragmentResultBinding(((FrameLayout) (rootView)), resultStats, resultText, retry);
        }
        String missingId = rootView.getResources().getResourceName(id);
        throw new NullPointerException("Missing required view with ID: ".concat(missingId));
    }

}