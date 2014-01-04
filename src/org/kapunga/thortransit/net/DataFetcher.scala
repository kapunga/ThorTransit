package org.kapunga.thortransit.net

import scala.io.Source.{fromInputStream}
import java.net.URL

object DataFetcher {
	def getRoutes() = {
		val myUrl = new URL("http://realtime.mbta.com/developer/api/v1/routes?api_key=wX9NwuHnZU2ToO7GmGR9uw")
		
		fromInputStream( myUrl.openStream ).getLines.mkString("\n")
	}
}