package gbu.app.activities

import android.os.Bundle
import android.support.v7.app.AppCompatActivity
import android.widget.TextView
import gbu.app.R

abstract class CrashActivity : AppCompatActivity() {
    abstract fun getTitleId(): Int
    abstract fun getContentId(): Int

    private var mContent: TextView? = null

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_crash)
        setTitle(getTitleId())
        mContent = findViewById(R.id.text)
        mContent?.setText(getContentId())
    }
}