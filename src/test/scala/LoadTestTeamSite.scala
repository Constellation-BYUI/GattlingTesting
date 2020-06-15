package default

import io.gatling.core.Predef._
import io.gatling.http.Predef._
import io.gatling.jdbc.Predef._

import scala.concurrent.duration.DurationInt

class LoadTestTeamSite extends Simulation {

	val httpProtocol = http
		.baseUrl("http://team1.cit262.com")
		.inferHtmlResources(BlackList(""".*\.js""", """.*\.css""", """.*\.gif""", """.*\.jpeg""", """.*\.jpg""", """.*\.ico""", """.*\.woff""", """.*\.woff2""", """.*\.(t|o)tf""", """.*\.png""", """.*detectportal\.firefox\.com.*"""), WhiteList())
		.acceptHeader("text/html,application/xhtml+xml,application/xml;q=0.9,image/webp,image/apng,*/*;q=0.8,application/signed-exchange;v=b3;q=0.9")
		.acceptEncodingHeader("gzip, deflate")
		.acceptLanguageHeader("en-GB,en-US;q=0.9,en;q=0.8")
		.upgradeInsecureRequestsHeader("1")
		.userAgentHeader("Mozilla/5.0 (Macintosh; Intel Mac OS X 10_15_4) AppleWebKit/537.36 (KHTML, like Gecko) Chrome/81.0.4044.138 Safari/537.36")


	val scn = scenario("CIT262 Team Page")
			.exec(http("LoadHomePage")
                        .get("/"))

	setUp(
		scn.inject(
			nothingFor(5 seconds),
			atOnceUsers(1),
			rampUsers(500) during (10 seconds),
			constantUsersPerSec(1000) during (20 seconds)
		).protocols(httpProtocol)
	)

}
