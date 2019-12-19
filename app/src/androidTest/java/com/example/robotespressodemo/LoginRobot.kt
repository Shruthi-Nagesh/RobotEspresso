package com.example.robotespressodemo

class LoginRobot : BaseTestRobot() {

    fun setUserame(email: String) = fillEditText(R.id.userame, email);

    fun setPassword(pass: String) = fillEditText(R.id.password, pass)

    fun clickLogin() = clickButton(R.id.login)

    fun clickForgotBtn() = clickButton(R.id.forgotpassword)

    fun clickDoneBtn() = clickButton(R.id.done)

    fun setNewPassword(newPass: String) = fillEditText(R.id.new_password, newPass);

    fun setConnfirmPassword(confirmPassword: String) = fillEditText(R.id.cofirm_password, confirmPassword);

    fun matchErrorText(err: String) = matchText(R.id.error_message, err)

}