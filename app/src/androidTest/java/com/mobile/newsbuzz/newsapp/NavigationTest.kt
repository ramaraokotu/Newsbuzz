package com.mobile.newsbuzz.newsapp

import androidx.activity.compose.setContent
import androidx.compose.ui.platform.LocalContext
import androidx.compose.ui.test.junit4.createAndroidComposeRule
import androidx.compose.ui.test.onAllNodesWithTag
import androidx.compose.ui.test.onNodeWithTag
import androidx.navigation.compose.ComposeNavigator
import androidx.navigation.testing.TestNavHostController
import com.mobile.newsbuzz.MainActivity
import com.mobile.newsbuzz.presentation.navigation.AppNavHost
import dagger.hilt.android.testing.HiltAndroidRule
import dagger.hilt.android.testing.HiltAndroidTest
import org.junit.Before
import org.junit.Rule
import org.junit.Test

@HiltAndroidTest
class NavigationTest {
    @get:Rule(order = 0)
    val hiltRule = HiltAndroidRule(this)

    @get:Rule(order = 1)
    val composeTestRule = createAndroidComposeRule<MainActivity>()

    private lateinit var navController: TestNavHostController

    @Before
    fun setupAppNavHost() {
        hiltRule.inject()
        composeTestRule.activity.setContent {
            navController = TestNavHostController(LocalContext.current)
            navController.navigatorProvider.addNavigator(ComposeNavigator())
            AppNavHost(navController = navController)
        }
    }

    @Test
    fun appNavHost_verifyStartDestination() {
        val newsListScreenTag =
            composeTestRule.activity.getString(com.mobile.newsbuzz.presentation.R.string.news_list_screen)

        // Wait until the node with the given tag exists
        composeTestRule.waitUntil(timeoutMillis = 5000) {
            composeTestRule.onAllNodesWithTag(newsListScreenTag).fetchSemanticsNodes().isNotEmpty()
        }

        // Assert that the node exists
        composeTestRule.onNodeWithTag(newsListScreenTag)
            .assertExists()
    }
}
