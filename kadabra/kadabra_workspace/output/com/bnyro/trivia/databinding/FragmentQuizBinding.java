package com.bnyro.trivia.databinding;
import R.layout.fragment_quiz;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.LinearLayout;
import android.widget.ProgressBar;
import android.widget.TextView;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.LinearLayout;
import android.widget.ProgressBar;
import android.widget.TextView;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import com.bnyro.trivia.R;
public final class FragmentQuizBinding implements ViewBinding {
    @NonNull
    private final FrameLayout rootView;

    @NonNull
    public final LinearLayout answersLL;

    @NonNull
    public final ProgressBar progress;

    @NonNull
    public final LinearLayout questionLL;

    @NonNull
    public final TextView questionTV;

    private FragmentQuizBinding(@NonNull
    FrameLayout rootView, @NonNull
    LinearLayout answersLL, @NonNull
    ProgressBar progress, @NonNull
    LinearLayout questionLL, @NonNull
    TextView questionTV) {
        this.rootView = rootView;
        this.answersLL = answersLL;
        this.progress = progress;
        this.questionLL = questionLL;
        this.questionTV = questionTV;
    }


    @Override
    @NonNull
    public FrameLayout getRoot() {
        return rootView;
    }


    @NonNull
    public static FragmentQuizBinding inflate(@NonNull
    LayoutInflater inflater) {
        return inflate(inflater, null, false);
    }


    @NonNull
    public static FragmentQuizBinding inflate(@NonNull
    LayoutInflater inflater, @Nullable
    ViewGroup parent, boolean attachToParent) {
        View root = inflater.inflate(fragment_quiz, parent, false);
        if (attachToParent) {
            parent.addView(root);
        }
        return bind(root);
    }


    @NonNull
    public static FragmentQuizBinding bind(@NonNull
    View rootView) {
        // The body of this method is generated in a way you would not otherwise write.
        // This is done to optimize the compiled bytecode for size and performance.
        int id;
        missingId : {
            id = R.id.answersLL;
            LinearLayout answersLL = ViewBindings.findChildViewById(rootView, id);
            if (answersLL == null) {
                break missingId;
            }
            id = R.id.progress;
            ProgressBar progress = ViewBindings.findChildViewById(rootView, id);
            if (progress == null) {
                break missingId;
            }
            id = R.id.questionLL;
            LinearLayout questionLL = ViewBindings.findChildViewById(rootView, id);
            if (questionLL == null) {
                break missingId;
            }
            id = R.id.questionTV;
            TextView questionTV = ViewBindings.findChildViewById(rootView, id);
            if (questionTV == null) {
                break missingId;
            }
            return new FragmentQuizBinding(((FrameLayout) (rootView)), answersLL, progress, questionLL, questionTV);
        }
        String missingId = rootView.getResources().getResourceName(id);
        throw new NullPointerException("Missing required view with ID: ".concat(missingId));
    }

}