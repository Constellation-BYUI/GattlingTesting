package default

import scala.concurrent.duration._

import io.gatling.core.Predef._
import io.gatling.http.Predef._
import io.gatling.jdbc.Predef._

class RecordedSimulation extends Simulation {

	val httpProtocol = http
		.baseUrl("http://dev-constellation.citwdd.net")
		.inferHtmlResources()
		.acceptHeader("text/html,application/xhtml+xml,application/xml;q=0.9,image/webp,*/*;q=0.8")
		.acceptEncodingHeader("gzip, deflate")
		.acceptLanguageHeader("en-US,en;q=0.5")
		.userAgentHeader("Mozilla/5.0 (Windows NT 10.0; Win64; x64; rv:74.0) Gecko/20100101 Firefox/74.0")

	val headers_0 = Map("Upgrade-Insecure-Requests" -> "1")

	val headers_1 = Map("Accept" -> "*/*")

	val headers_2 = Map("Accept" -> "text/css,*/*;q=0.1")

	val headers_8 = Map("Accept" -> "image/webp,*/*")

	val headers_13 = Map(
		"Origin" -> "http://dev-constellation.citwdd.net",
		"Upgrade-Insecure-Requests" -> "1")

	val headers_25 = Map(
		"Content-Type" -> "multipart/form-data; boundary=---------------------------277236950112770332422185530802",
		"Origin" -> "http://dev-constellation.citwdd.net",
		"Upgrade-Insecure-Requests" -> "1")

	val headers_28 = Map(
		"Content-Type" -> "multipart/form-data; boundary=---------------------------16950173513507192165480482663",
		"Origin" -> "http://dev-constellation.citwdd.net",
		"Upgrade-Insecure-Requests" -> "1")

	val headers_31 = Map(
		"Content-Type" -> "multipart/form-data; boundary=---------------------------301934251619656321383579675070",
		"Origin" -> "http://dev-constellation.citwdd.net",
		"Upgrade-Insecure-Requests" -> "1")

    val uri2 = "http://ciscobinary.openh264.org/openh264-win64-2e1774ab6dc6c43debb0b5b628bdf122a391d521.zip"

	val scn = scenario("RecordedSimulation")
		// search
		.exec(http("request_0")
			.get("/")
			.headers(headers_0))
		.pause(2)
		.exec(http("request_1")
			.get("/js/site.js?v=40SUCmDcd4jFQNTUAFf2HHu_kGR0BiWy9YHQTyYV1TU")
			.headers(headers_1)
			.resources(http("request_2")
			.get("/css/site.css")
			.headers(headers_2),
            http("request_3")
			.get("/lib/jquery-validation-unobtrusive//jquery.validate.unobtrusive.js")
			.headers(headers_1),
            http("request_4")
			.get("/lib/jquery-validate/jquery.validate.js")
			.headers(headers_1),
            http("request_5")
			.get("/lib/bootstrap/dist/js/bootstrap.bundle.min.js")
			.headers(headers_1),
            http("request_6")
			.get("/lib/jquery/dist/jquery.min.js")
			.headers(headers_1),
            http("request_7")
			.get("/lib/bootstrap/dist/css/bootstrap.min.css")
			.headers(headers_2),
            http("request_8")
			.get("/image/cit3.jpg")
			.headers(headers_8),
            http("request_9")
			.get("/image/cit.jpg")
			.headers(headers_8),
            http("request_10")
			.get("/image/cit2.jpg")
			.headers(headers_8),
            http("request_11")
			.get("/favicon.ico")
			.headers(headers_8)))
		.pause(95)
		// Login
		.exec(http("request_12")
			.get("/account/login")
			.headers(headers_0))
		.pause(14)
		.exec(http("request_13")
			.post("/Account/Login")
			.headers(headers_13)
			.formParam("Email", "Ryanharris@constellation.com")
			.formParam("Password", "Ryanharris@constellation.com")
			.formParam("__RequestVerificationToken", "CfDJ8AH5oq6N8RhMitx9UTTv_yQ6b4PTV2k2x4XBnnuH4stkh_F3a8jiN0Oy2xhxGb6q7Zu4tjLb1VRA3xCF4YsAAcs142I-Ke56W6XfLupKjpClLuPnp8kuBuv6KyKJZJb99z3W7c59pwJjV2n6lqi6cFg")
			.formParam("RememberMe", "false"))
		.pause(25)
		// Postings
		.exec(http("request_14")
			.get("/Postings")
			.headers(headers_0))
		.pause(6)
		.exec(http("request_15")
			.get("/Postings/Create")
			.headers(headers_0))
		.pause(52)
		.exec(http("request_16")
			.post("/Postings/Create")
			.headers(headers_13)
			.formParam("PostingTitle", "Q/A Team Member")
			.formParam("Description", "Help identify unsucessful part of a website")
			.formParam("PostingFor", "Constellation Web App: Development")
			.formParam("selectedTypes", "3")
			.formParam("selectedTypes", "6")
			.formParam("__RequestVerificationToken", "CfDJ8AH5oq6N8RhMitx9UTTv_yQNLZCse5GC3sz1Ft7CG5hBfuVOL9pSQ5ymCDzMpCpYvGMsh9hnRp1IS88B_H0I9HCr3_7RdxVwD_FUHNYFcwbMju2R3ZJ5eIi9IImNQi7E0hPmWtY-ocVZ4n9Kb7oE_7C8wZwloN72TA-OMI-hIOFV4djWjRcoaHuQYzluoAzZKQ"))
		.pause(20)
		.exec(http("request_17")
			.get("/Postings/Edit/3")
			.headers(headers_0))
		.pause(17)
		.exec(http("request_18")
			.post("/Postings/Edit/3")
			.headers(headers_13)
			.formParam("PostingID", "3")
			.formParam("PostingTitle", "Front-End Developer")
			.formParam("Description", "Help identify unsucessful part of a website")
			.formParam("PostingFor", "Constellation Web App: Development")
			.formParam("selectedTypes", "3")
			.formParam("selectedTypes", "6")
			.formParam("selectedTypes", "7")
			.formParam("__RequestVerificationToken", "CfDJ8AH5oq6N8RhMitx9UTTv_yRBlzrgozzK78n-EKCOW-jqXrHNtzknqNCYFLKEVzkvIlwiCNcPjebMO6ACO4Tfj9_WA5ZcKeKfk5F7VcWQml3vJTlusUbimQWXhKqJSg4N0Clay6mVq1p_yAU2bt5DGBtG9yajFGBSS1kCCcgoTY5tfH7RXHFmxW9BPkEVsNpIoA"))
		.pause(4)
		.exec(http("request_19")
			.get("/Postings/Details/2")
			.headers(headers_0))
		.pause(3)
		.exec(http("request_20")
			.get("/Postings")
			.headers(headers_0))
		.pause(1)
		.exec(http("request_21")
			.get("/Postings/Delete/3")
			.headers(headers_0))
		.pause(1)
		.exec(http("request_22")
			.post("/Postings/Delete/3")
			.headers(headers_13)
			.formParam("PostingID", "3")
			.formParam("__RequestVerificationToken", "CfDJ8AH5oq6N8RhMitx9UTTv_ySs0a94kpSTJbdveSD3GqSAl_FEMO0YuuQDsIou6iI3fJms2mJBquJ52YeK95sb9cPJ4hZ9Jajqi1gJ7XdjE1ZpIHrbil35HK8ZIYcRo60pAli4It8MDjaPVk-fCytzYafsvu4L8bQ7S0Lroable_h8QxNjFANigP5HfAgBcPYPug"))
		.pause(19)
		// End of Posting
		// Users
		.exec(http("request_23")
			.get("/Users")
			.headers(headers_0))
		.pause(4)
		.exec(http("request_24")
			.get("/Users/Edit/da8121d1-72df-43ee-ad16-20a112e313f9")
			.headers(headers_0))
		.pause(23)
		.exec(http("request_25")
			.post("/Users/Edit/da8121d1-72df-43ee-ad16-20a112e313f9")
			.headers(headers_25)
			.body(RawFileBody("default/recordedsimulation/0025_request.dat")))
		.pause(25)
		// Projects
		.exec(http("request_26")
			.get("/Projects")
			.headers(headers_0))
		.pause(3)
		.exec(http("request_27")
			.get("/Projects/Edit/1")
			.headers(headers_0))
		.pause(12)
		.exec(http("request_28")
			.post("/Projects/Edit/1")
			.headers(headers_28)
			.body(RawFileBody("default/recordedsimulation/0028_request.dat"))
			.check(status.is(500)))
		.pause(2)
		.exec(http("request_29")
			.get("/Projects/Edit/1")
			.headers(headers_0))
		.pause(2)
		.exec(http("request_30")
			.get(uri2)
			.headers(headers_1))
		.pause(4)
		.exec(http("request_31")
			.post("/Projects/Edit/1")
			.headers(headers_31)
			.body(RawFileBody("default/recordedsimulation/0031_request.dat")))

	setUp(scn.inject(atOnceUsers(1))).protocols(httpProtocol)
}
