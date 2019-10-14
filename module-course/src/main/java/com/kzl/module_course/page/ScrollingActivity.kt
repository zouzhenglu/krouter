package com.kzl.module_course.page

import android.content.Intent
import android.net.Uri
import android.os.Bundle
import android.util.Log
import androidx.appcompat.app.AppCompatActivity
import com.google.android.material.snackbar.Snackbar
import com.kzl.module_course.R
import com.kzl.module_course.topicService
import kotlinx.android.synthetic.main.activity_scrolling.*

class ScrollingActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_scrolling)
        setSupportActionBar(toolbar)

        handleIntent(intent)

        fab.setOnClickListener { view ->
            handleIntent(intent)
            Snackbar.make(view, "Replace with your own action", Snackbar.LENGTH_LONG)
                .setAction("Action", null).show()
            topicService.sayHello(this)
        }
    }

    override fun onNewIntent(intent: Intent) {
        super.onNewIntent(intent)
        handleIntent(intent)
    }

    private fun handleIntent(intent: Intent) {
        val appLinkAction = intent.action
        val appLinkData: Uri? = intent.data

        Log.d("LINK", "appLinkAction:${appLinkAction}")
        Log.d("LINK", "appLinkData:${appLinkData}")

        if (Intent.ACTION_VIEW == appLinkAction) {
            appLinkData?.lastPathSegment?.also { recipeId ->
                Uri.parse("content://com.recipe_app/recipe/")
                    .buildUpon()
                    .appendPath(recipeId)
                    .build().also { appData ->
                        Log.d("LINK", "showRecipe:${appData}")
                    }
            }
        }
    }
}
