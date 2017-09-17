package com.example.cheta.myapplication1

import android.support.v7.app.AppCompatActivity
import android.os.Bundle

import kotlinx.android.synthetic.main.activity_main.*


class MainActivity : AppCompatActivity() {

    var msg = "Intial value before creation\n"


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        msg += "onCreate method called\n"
        msgBoard.text = msg

    }

    override fun onStart() {
        super.onStart()
        msg += "onStart method called\n"
        msgBoard.text = msg
    }

    override fun onResume() {
        super.onResume()
        msg+="onResume method called\n"
        msgBoard.text = msg
    }

    override fun onPause() {
        super.onPause()
        msg+="onPause method called\n"
        msgBoard.text = msg
    }

    override fun onStop() {
        super.onStop()
        msg+="onStop method called\n"
        msgBoard.text = msg
    }

    override fun onDestroy() {
        super.onDestroy()
        msg+="onDestroy method called\n"
        msgBoard.text = msg
    }
}



/*
    package com.example.helloworld
import android.os.Bundle
import android.app.Activity
import android.util.Log
class MainActivity:Activity() {
  internal var msg = "Android : "
  /** Called when the activity is first created. */
  fun onCreate(savedInstanceState:Bundle) {
    super.onCreate(savedInstanceState)
    setContentView(R.layout.activity_main)
    Log.d(msg, "The onCreate() event")
  }
  /** Called when the activity is about to become visible. */
  protected fun onStart() {
    super.onStart()
    Log.d(msg, "The onStart() event")
  }
  /** Called when the activity has become visible. */
  protected fun onResume() {
    super.onResume()
    Log.d(msg, "The onResume() event")
  }
  /** Called when another activity is taking focus. */
  protected fun onPause() {
    super.onPause()
    Log.d(msg, "The onPause() event")
  }
  /** Called when the activity is no longer visible. */
  protected fun onStop() {
    super.onStop()
    Log.d(msg, "The onStop() event")
  }
  /** Called just before the activity is destroyed. */
  fun onDestroy() {
    super.onDestroy()
    Log.d(msg, "The onDestroy() event")
  }
}

 */