package com.bnyro.trivia.databinding;
import R.layout.row_quiz;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import com.bnyro.trivia.R;
public final class RowQuizBinding implements ViewBinding {
    @NonNull
    private final LinearLayout rootView;

    @NonNull
    public final TextView quizName;

    @NonNull
    public final TextView quizSize;

    @NonNull
    public final ImageView quizType;

    private RowQuizBinding(@NonNull
    LinearLayout rootView, @NonNull
    TextView quizName, @NonNull
    TextView quizSize, @NonNull
    ImageView quizType) {
        this.rootView = rootView;
        this.quizName = quizName;
        this.quizSize = quizSize;
        this.quizType = quizType;
    }


    @Override
    @NonNull
    public LinearLayout getRoot() {
        return rootView;
    }


    @NonNull
    public static RowQuizBinding inflate(@NonNull
    LayoutInflater inflater) {
        return inflate(inflater, null, false);
    }


    @NonNull
    public static RowQuizBinding inflate(@NonNull
    LayoutInflater inflater, @Nullable
    ViewGroup parent, boolean attachToParent) {
        View root = inflater.inflate(row_quiz, parent, false);
        if (attachToParent) {
            parent.addView(root);
        }
        return bind(root);
    }


    @NonNull
    public static RowQuizBinding bind(@NonNull
    View rootView) {
        // The body of this method is generated in a way you would not otherwise write.
        // This is done to optimize the compiled bytecode for size and performance.
        int id;
        missingId : {
            id = R.id.quizName;
            TextView quizName = ViewBindings.findChildViewById(rootView, id);
            if (quizName == null) {
                break missingId;
            }
            id = R.id.quizSize;
            TextView quizSize = ViewBindings.findChildViewById(rootView, id);
            if (quizSize == null) {
                break missingId;
            }
            id = R.id.quizType;
            ImageView quizType = ViewBindings.findChildViewById(rootView, id);
            if (quizType == null) {
                break missingId;
            }
            return new RowQuizBinding(((LinearLayout) (rootView)), quizName, quizSize, quizType);
        }
        String missingId = rootView.getResources().getResourceName(id);
        throw new NullPointerException("Missing required view with ID: ".concat(missingId));
    }

}