package com.example.robotespressodemo

import androidx.test.ext.junit.runners.AndroidJUnit4
import org.junit.Rule
import org.junit.Test
import org.junit.runner.RunWith
import androidx.test.rule.ActivityTestRule


@RunWith(AndroidJUnit4::class)

class loginProfileAndSettings {


    @get:Rule
    var activityRule: ActivityTestRule<LoginActivity>
            = ActivityTestRule(LoginActivity::class.java)



    fun login(func: LoginRobot.() -> Unit) = LoginRobot()
            .apply { func() }

    @Test
    fun loginChecks() {
        login {
            setUserame("mail@example.com")
            clickLogin()
            matchErrorText("Please fill the madatory fields")
        }

        try {
            Thread.sleep(700)
        } catch (e: InterruptedException) {
            e.printStackTrace()
        }


        login {
            clickForgotBtn()
            setNewPassword("1234")
            setConnfirmPassword("1234")
            try {
                Thread.sleep(200)
            } catch (e: InterruptedException) {
                e.printStackTrace()
            }
            clickDoneBtn()
        }

        try {
            Thread.sleep(700)
        } catch (e: InterruptedException) {
            e.printStackTrace()
        }

            login {
            setUserame("mail@example.com")

            setPassword("123456")
            try {
                Thread.sleep(200)
            } catch (e: InterruptedException) {
                e.printStackTrace()
            }
            clickLogin()

        }

    }

}