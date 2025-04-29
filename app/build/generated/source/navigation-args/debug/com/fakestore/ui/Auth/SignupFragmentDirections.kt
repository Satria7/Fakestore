package com.fakestore.ui.Auth

import androidx.navigation.ActionOnlyNavDirections
import androidx.navigation.NavDirections
import com.fakestore.R

public class SignupFragmentDirections private constructor() {
  public companion object {
    public fun actionSignupFragmentToLoginFragment(): NavDirections =
        ActionOnlyNavDirections(R.id.action_signupFragment_to_loginFragment)
  }
}
