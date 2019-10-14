package com.kzl.module_topic.page

import android.os.Bundle
import android.view.View
import android.widget.Toast
import androidx.fragment.app.Fragment
import com.kzl.module_topic.R


class TopicFragment : Fragment(R.layout.topic_fragment_list) {
    companion object {
        fun newInstance() = TopicFragment()
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        view.findViewById<View>(R.id.btn).setOnClickListener {
            Toast.makeText(activity, "topic fragment", Toast.LENGTH_LONG).show()
        }
    }

}