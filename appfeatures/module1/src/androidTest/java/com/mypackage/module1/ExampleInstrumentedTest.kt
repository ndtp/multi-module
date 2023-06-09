package com.mypackage.module1

import androidx.test.ext.junit.runners.AndroidJUnit4
import dev.testify.ScreenshotRule
import dev.testify.annotation.ScreenshotInstrumentation
import org.junit.Assert.*
import org.junit.Rule
import org.junit.Test
import org.junit.runner.RunWith

@RunWith(AndroidJUnit4::class)
class ExampleInstrumentedTest {

    @get:Rule
    val rule = ScreenshotRule(ModuleOneActivity::class.java)

    @ScreenshotInstrumentation
    @Test
    fun moduleOne() {
        rule.assertSame()
    }
}