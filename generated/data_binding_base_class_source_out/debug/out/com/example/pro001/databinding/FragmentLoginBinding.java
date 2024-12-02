// Generated by view binder compiler. Do not edit!
package com.example.pro001.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ProgressBar;
import android.widget.RelativeLayout;
import android.widget.TextView;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.appcompat.widget.AppCompatButton;
import androidx.cardview.widget.CardView;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import com.example.pro001.R;
import com.google.android.material.textfield.TextInputEditText;
import com.google.android.material.textfield.TextInputLayout;
import java.lang.NullPointerException;
import java.lang.Override;
import java.lang.String;

public final class FragmentLoginBinding implements ViewBinding {
  @NonNull
  private final RelativeLayout rootView;

  @NonNull
  public final TextInputEditText EmailEditText;

  @NonNull
  public final TextInputLayout EmailTextInputLayout;

  @NonNull
  public final TextInputEditText PasswordEditText;

  @NonNull
  public final TextInputLayout PasswordTextInputLayout;

  @NonNull
  public final AppCompatButton btnForgetPassword;

  @NonNull
  public final AppCompatButton btnShowPassword;

  @NonNull
  public final CardView card;

  @NonNull
  public final CardView cardView;

  @NonNull
  public final AppCompatButton login;

  @NonNull
  public final ProgressBar progressBar;

  @NonNull
  public final TextView textLogin;

  private FragmentLoginBinding(@NonNull RelativeLayout rootView,
      @NonNull TextInputEditText EmailEditText, @NonNull TextInputLayout EmailTextInputLayout,
      @NonNull TextInputEditText PasswordEditText, @NonNull TextInputLayout PasswordTextInputLayout,
      @NonNull AppCompatButton btnForgetPassword, @NonNull AppCompatButton btnShowPassword,
      @NonNull CardView card, @NonNull CardView cardView, @NonNull AppCompatButton login,
      @NonNull ProgressBar progressBar, @NonNull TextView textLogin) {
    this.rootView = rootView;
    this.EmailEditText = EmailEditText;
    this.EmailTextInputLayout = EmailTextInputLayout;
    this.PasswordEditText = PasswordEditText;
    this.PasswordTextInputLayout = PasswordTextInputLayout;
    this.btnForgetPassword = btnForgetPassword;
    this.btnShowPassword = btnShowPassword;
    this.card = card;
    this.cardView = cardView;
    this.login = login;
    this.progressBar = progressBar;
    this.textLogin = textLogin;
  }

  @Override
  @NonNull
  public RelativeLayout getRoot() {
    return rootView;
  }

  @NonNull
  public static FragmentLoginBinding inflate(@NonNull LayoutInflater inflater) {
    return inflate(inflater, null, false);
  }

  @NonNull
  public static FragmentLoginBinding inflate(@NonNull LayoutInflater inflater,
      @Nullable ViewGroup parent, boolean attachToParent) {
    View root = inflater.inflate(R.layout.fragment_login, parent, false);
    if (attachToParent) {
      parent.addView(root);
    }
    return bind(root);
  }

  @NonNull
  public static FragmentLoginBinding bind(@NonNull View rootView) {
    // The body of this method is generated in a way you would not otherwise write.
    // This is done to optimize the compiled bytecode for size and performance.
    int id;
    missingId: {
      id = R.id.EmailEditText;
      TextInputEditText EmailEditText = ViewBindings.findChildViewById(rootView, id);
      if (EmailEditText == null) {
        break missingId;
      }

      id = R.id.EmailTextInputLayout;
      TextInputLayout EmailTextInputLayout = ViewBindings.findChildViewById(rootView, id);
      if (EmailTextInputLayout == null) {
        break missingId;
      }

      id = R.id.PasswordEditText;
      TextInputEditText PasswordEditText = ViewBindings.findChildViewById(rootView, id);
      if (PasswordEditText == null) {
        break missingId;
      }

      id = R.id.PasswordTextInputLayout;
      TextInputLayout PasswordTextInputLayout = ViewBindings.findChildViewById(rootView, id);
      if (PasswordTextInputLayout == null) {
        break missingId;
      }

      id = R.id.btn_forget_password;
      AppCompatButton btnForgetPassword = ViewBindings.findChildViewById(rootView, id);
      if (btnForgetPassword == null) {
        break missingId;
      }

      id = R.id.btn_show_password;
      AppCompatButton btnShowPassword = ViewBindings.findChildViewById(rootView, id);
      if (btnShowPassword == null) {
        break missingId;
      }

      id = R.id.card;
      CardView card = ViewBindings.findChildViewById(rootView, id);
      if (card == null) {
        break missingId;
      }

      id = R.id.card_view;
      CardView cardView = ViewBindings.findChildViewById(rootView, id);
      if (cardView == null) {
        break missingId;
      }

      id = R.id.login;
      AppCompatButton login = ViewBindings.findChildViewById(rootView, id);
      if (login == null) {
        break missingId;
      }

      id = R.id.progressBar;
      ProgressBar progressBar = ViewBindings.findChildViewById(rootView, id);
      if (progressBar == null) {
        break missingId;
      }

      id = R.id.text_login;
      TextView textLogin = ViewBindings.findChildViewById(rootView, id);
      if (textLogin == null) {
        break missingId;
      }

      return new FragmentLoginBinding((RelativeLayout) rootView, EmailEditText,
          EmailTextInputLayout, PasswordEditText, PasswordTextInputLayout, btnForgetPassword,
          btnShowPassword, card, cardView, login, progressBar, textLogin);
    }
    String missingId = rootView.getResources().getResourceName(id);
    throw new NullPointerException("Missing required view with ID: ".concat(missingId));
  }
}
