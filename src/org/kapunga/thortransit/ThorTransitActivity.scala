package org.kapunga.thortransit

import android.app.Activity
import android.os.Bundle
import android.view.Menu
import android.util.Log
import android.content.Intent

class ThorTransitActivity extends Activity {
  override def onCreate(savedInstanceState: Bundle) {
    super.onCreate(savedInstanceState)
    setContentView(R.layout.activity_main)
    
    val intent = new Intent(this, classOf[TransitMonitor])
    
    startService(intent)
  }
  
  override def onCreateOptionsMenu(menu: Menu): Boolean = {
    getMenuInflater().inflate(R.menu.main, menu)
    return true
  }
}