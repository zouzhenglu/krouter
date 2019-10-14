package com.kzl.module_course.page

import android.content.Intent
import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import com.google.android.material.snackbar.Snackbar
import com.kzl.module_course.R
import kotlinx.android.synthetic.main.activity_course_home.*

class CourseHomeActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_course_home)
        setSupportActionBar(toolbar)

        fab.setOnClickListener { view ->
            Snackbar.make(view, "Replace with your own action", Snackbar.LENGTH_LONG)
                .setAction("Action", null).show()
            view.postDelayed({
                startActivity(Intent(this, ScrollingActivity::class.java))
            }, 2000)
        }
    }

}
