package com.bnyro.trivia.databinding;
import R.layout.spinner_item;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.viewbinding.ViewBinding;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.viewbinding.ViewBinding;
import com.bnyro.trivia.R;
public final class SpinnerItemBinding implements ViewBinding {
    @NonNull
    private final TextView rootView;

    @NonNull
    public final TextView text1;

    private SpinnerItemBinding(@NonNull
    TextView rootView, @NonNull
    TextView text1) {
        this.rootView = rootView;
        this.text1 = text1;
    }


    @Override
    @NonNull
    public TextView getRoot() {
        return rootView;
    }


    @NonNull
    public static SpinnerItemBinding inflate(@NonNull
    LayoutInflater inflater) {
        return inflate(inflater, null, false);
    }


    @NonNull
    public static SpinnerItemBinding inflate(@NonNull
    LayoutInflater inflater, @Nullable
    ViewGroup parent, boolean attachToParent) {
        View root = inflater.inflate(spinner_item, parent, false);
        if (attachToParent) {
            parent.addView(root);
        }
        return bind(root);
    }


    @NonNull
    public static SpinnerItemBinding bind(@NonNull
    View rootView) {
        if (rootView == null) {
            throw new NullPointerException("rootView");
        }
        TextView text1 = ((TextView) (rootView));
        return new SpinnerItemBinding(((TextView) (rootView)), text1);
    }

}