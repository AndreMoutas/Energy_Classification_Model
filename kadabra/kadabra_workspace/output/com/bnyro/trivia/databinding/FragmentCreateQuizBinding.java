package com.bnyro.trivia.databinding;
import R.layout.fragment_create_quiz;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import com.google.android.material.textfield.TextInputEditText;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import com.bnyro.trivia.R;
import com.google.android.material.textfield.TextInputEditText;
public final class FragmentCreateQuizBinding implements ViewBinding {
    @NonNull
    private final LinearLayout rootView;

    @NonNull
    public final TextInputEditText correctAnswerET;

    @NonNull
    public final Button finish;

    @NonNull
    public final TextInputEditText incorrectAnswerOne;

    @NonNull
    public final TextInputEditText incorrectAnswerThree;

    @NonNull
    public final TextInputEditText incorrectAnswerTwo;

    @NonNull
    public final TextView questionCount;

    @NonNull
    public final TextInputEditText questionNameET;

    @NonNull
    public final TextView quizName;

    @NonNull
    public final Button save;

    private FragmentCreateQuizBinding(@NonNull
    LinearLayout rootView, @NonNull
    TextInputEditText correctAnswerET, @NonNull
    Button finish, @NonNull
    TextInputEditText incorrectAnswerOne, @NonNull
    TextInputEditText incorrectAnswerThree, @NonNull
    TextInputEditText incorrectAnswerTwo, @NonNull
    TextView questionCount, @NonNull
    TextInputEditText questionNameET, @NonNull
    TextView quizName, @NonNull
    Button save) {
        this.rootView = rootView;
        this.correctAnswerET = correctAnswerET;
        this.finish = finish;
        this.incorrectAnswerOne = incorrectAnswerOne;
        this.incorrectAnswerThree = incorrectAnswerThree;
        this.incorrectAnswerTwo = incorrectAnswerTwo;
        this.questionCount = questionCount;
        this.questionNameET = questionNameET;
        this.quizName = quizName;
        this.save = save;
    }


    @Override
    @NonNull
    public LinearLayout getRoot() {
        return rootView;
    }


    @NonNull
    public static FragmentCreateQuizBinding inflate(@NonNull
    LayoutInflater inflater) {
        return inflate(inflater, null, false);
    }


    @NonNull
    public static FragmentCreateQuizBinding inflate(@NonNull
    LayoutInflater inflater, @Nullable
    ViewGroup parent, boolean attachToParent) {
        View root = inflater.inflate(fragment_create_quiz, parent, false);
        if (attachToParent) {
            parent.addView(root);
        }
        return bind(root);
    }


    @NonNull
    public static FragmentCreateQuizBinding bind(@NonNull
    View rootView) {
        // The body of this method is generated in a way you would not otherwise write.
        // This is done to optimize the compiled bytecode for size and performance.
        int id;
        missingId : {
            id = R.id.correctAnswerET;
            TextInputEditText correctAnswerET = ViewBindings.findChildViewById(rootView, id);
            if (correctAnswerET == null) {
                break missingId;
            }
            id = R.id.finish;
            Button finish = ViewBindings.findChildViewById(rootView, id);
            if (finish == null) {
                break missingId;
            }
            id = R.id.incorrectAnswerOne;
            TextInputEditText incorrectAnswerOne = ViewBindings.findChildViewById(rootView, id);
            if (incorrectAnswerOne == null) {
                break missingId;
            }
            id = R.id.incorrectAnswerThree;
            TextInputEditText incorrectAnswerThree = ViewBindings.findChildViewById(rootView, id);
            if (incorrectAnswerThree == null) {
                break missingId;
            }
            id = R.id.incorrectAnswerTwo;
            TextInputEditText incorrectAnswerTwo = ViewBindings.findChildViewById(rootView, id);
            if (incorrectAnswerTwo == null) {
                break missingId;
            }
            id = R.id.questionCount;
            TextView questionCount = ViewBindings.findChildViewById(rootView, id);
            if (questionCount == null) {
                break missingId;
            }
            id = R.id.questionNameET;
            TextInputEditText questionNameET = ViewBindings.findChildViewById(rootView, id);
            if (questionNameET == null) {
                break missingId;
            }
            id = R.id.quizName;
            TextView quizName = ViewBindings.findChildViewById(rootView, id);
            if (quizName == null) {
                break missingId;
            }
            id = R.id.save;
            Button save = ViewBindings.findChildViewById(rootView, id);
            if (save == null) {
                break missingId;
            }
            return new FragmentCreateQuizBinding(((LinearLayout) (rootView)), correctAnswerET, finish, incorrectAnswerOne, incorrectAnswerThree, incorrectAnswerTwo, questionCount, questionNameET, quizName, save);
        }
        String missingId = rootView.getResources().getResourceName(id);
        throw new NullPointerException("Missing required view with ID: ".concat(missingId));
    }

}