package com.fakestore.ui.Auth

import androidx.navigation.ActionOnlyNavDirections
import androidx.navigation.NavDirections
import com.fakestore.R

public class LoginFragmentDirections private constructor() {
  public companion object {
    public fun actionLoginFragmentToSignupFragment(): NavDirections =
        ActionOnlyNavDirections(R.id.action_loginFragment_to_signupFragment)
  }
}
