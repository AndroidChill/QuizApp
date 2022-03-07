// Generated by view binder compiler. Do not edit!
package work.sample.auth.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import com.google.android.material.button.MaterialButton;
import com.google.android.material.textfield.TextInputEditText;
import com.google.android.material.textfield.TextInputLayout;
import java.lang.NullPointerException;
import java.lang.Override;
import java.lang.String;
import work.sample.auth.R;

public final class FragmentSignInBinding implements ViewBinding {
  @NonNull
  private final LinearLayout rootView;

  @NonNull
  public final MaterialButton btnChild;

  @NonNull
  public final MaterialButton btnParent;

  @NonNull
  public final TextInputEditText etEmail;

  @NonNull
  public final TextInputEditText etPassword;

  @NonNull
  public final TextView textView2;

  @NonNull
  public final TextInputLayout tlEmail;

  @NonNull
  public final TextInputLayout tlPassword;

  private FragmentSignInBinding(@NonNull LinearLayout rootView, @NonNull MaterialButton btnChild,
      @NonNull MaterialButton btnParent, @NonNull TextInputEditText etEmail,
      @NonNull TextInputEditText etPassword, @NonNull TextView textView2,
      @NonNull TextInputLayout tlEmail, @NonNull TextInputLayout tlPassword) {
    this.rootView = rootView;
    this.btnChild = btnChild;
    this.btnParent = btnParent;
    this.etEmail = etEmail;
    this.etPassword = etPassword;
    this.textView2 = textView2;
    this.tlEmail = tlEmail;
    this.tlPassword = tlPassword;
  }

  @Override
  @NonNull
  public LinearLayout getRoot() {
    return rootView;
  }

  @NonNull
  public static FragmentSignInBinding inflate(@NonNull LayoutInflater inflater) {
    return inflate(inflater, null, false);
  }

  @NonNull
  public static FragmentSignInBinding inflate(@NonNull LayoutInflater inflater,
      @Nullable ViewGroup parent, boolean attachToParent) {
    View root = inflater.inflate(R.layout.fragment_sign_in, parent, false);
    if (attachToParent) {
      parent.addView(root);
    }
    return bind(root);
  }

  @NonNull
  public static FragmentSignInBinding bind(@NonNull View rootView) {
    // The body of this method is generated in a way you would not otherwise write.
    // This is done to optimize the compiled bytecode for size and performance.
    int id;
    missingId: {
      id = R.id.btn_child;
      MaterialButton btnChild = ViewBindings.findChildViewById(rootView, id);
      if (btnChild == null) {
        break missingId;
      }

      id = R.id.btn_parent;
      MaterialButton btnParent = ViewBindings.findChildViewById(rootView, id);
      if (btnParent == null) {
        break missingId;
      }

      id = R.id.et_email;
      TextInputEditText etEmail = ViewBindings.findChildViewById(rootView, id);
      if (etEmail == null) {
        break missingId;
      }

      id = R.id.et_password;
      TextInputEditText etPassword = ViewBindings.findChildViewById(rootView, id);
      if (etPassword == null) {
        break missingId;
      }

      id = R.id.textView2;
      TextView textView2 = ViewBindings.findChildViewById(rootView, id);
      if (textView2 == null) {
        break missingId;
      }

      id = R.id.tl_email;
      TextInputLayout tlEmail = ViewBindings.findChildViewById(rootView, id);
      if (tlEmail == null) {
        break missingId;
      }

      id = R.id.tl_password;
      TextInputLayout tlPassword = ViewBindings.findChildViewById(rootView, id);
      if (tlPassword == null) {
        break missingId;
      }

      return new FragmentSignInBinding((LinearLayout) rootView, btnChild, btnParent, etEmail,
          etPassword, textView2, tlEmail, tlPassword);
    }
    String missingId = rootView.getResources().getResourceName(id);
    throw new NullPointerException("Missing required view with ID: ".concat(missingId));
  }
}
