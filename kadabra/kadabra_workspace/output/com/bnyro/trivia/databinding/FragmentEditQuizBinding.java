package com.bnyro.trivia.databinding;
import R.layout.fragment_edit_quiz;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.ListView;
import android.widget.TextView;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import com.google.android.material.floatingactionbutton.FloatingActionButton;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.ListView;
import android.widget.TextView;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import com.bnyro.trivia.R;
import com.google.android.material.floatingactionbutton.FloatingActionButton;
public final class FragmentEditQuizBinding implements ViewBinding {
    @NonNull
    private final FrameLayout rootView;

    @NonNull
    public final FloatingActionButton newQuestionFAB;

    @NonNull
    public final TextView questionCount;

    @NonNull
    public final ListView questionsList;

    @NonNull
    public final TextView quizName;

    private FragmentEditQuizBinding(@NonNull
    FrameLayout rootView, @NonNull
    FloatingActionButton newQuestionFAB, @NonNull
    TextView questionCount, @NonNull
    ListView questionsList, @NonNull
    TextView quizName) {
        this.rootView = rootView;
        this.newQuestionFAB = newQuestionFAB;
        this.questionCount = questionCount;
        this.questionsList = questionsList;
        this.quizName = quizName;
    }


    @Override
    @NonNull
    public FrameLayout getRoot() {
        return rootView;
    }


    @NonNull
    public static FragmentEditQuizBinding inflate(@NonNull
    LayoutInflater inflater) {
        return inflate(inflater, null, false);
    }


    @NonNull
    public static FragmentEditQuizBinding inflate(@NonNull
    LayoutInflater inflater, @Nullable
    ViewGroup parent, boolean attachToParent) {
        View root = inflater.inflate(fragment_edit_quiz, parent, false);
        if (attachToParent) {
            parent.addView(root);
        }
        return bind(root);
    }


    @NonNull
    public static FragmentEditQuizBinding bind(@NonNull
    View rootView) {
        // The body of this method is generated in a way you would not otherwise write.
        // This is done to optimize the compiled bytecode for size and performance.
        int id;
        missingId : {
            id = R.id.newQuestionFAB;
            FloatingActionButton newQuestionFAB = ViewBindings.findChildViewById(rootView, id);
            if (newQuestionFAB == null) {
                break missingId;
            }
            id = R.id.questionCount;
            TextView questionCount = ViewBindings.findChildViewById(rootView, id);
            if (questionCount == null) {
                break missingId;
            }
            id = R.id.questionsList;
            ListView questionsList = ViewBindings.findChildViewById(rootView, id);
            if (questionsList == null) {
                break missingId;
            }
            id = R.id.quizName;
            TextView quizName = ViewBindings.findChildViewById(rootView, id);
            if (quizName == null) {
                break missingId;
            }
            return new FragmentEditQuizBinding(((FrameLayout) (rootView)), newQuestionFAB, questionCount, questionsList, quizName);
        }
        String missingId = rootView.getResources().getResourceName(id);
        throw new NullPointerException("Missing required view with ID: ".concat(missingId));
    }

}