package org.kapunga.thortransit

import android.os.IBinder
import android.app.Service
import android.app.Service._
import android.content.Intent
import android.util.Log

class TransitMonitor extends Service {
  override def onBind(intent: Intent): IBinder = {
    return null
  }
  
  override def onCreate() = {
    
  }
  
  override def onDestroy() = {
    
  }
  
  override def onStartCommand(intent: Intent, flags: Int, startId: Int): Int = {
    return START_STICKY
  }
}