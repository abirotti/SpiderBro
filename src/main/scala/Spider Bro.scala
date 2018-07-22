import net.ruippeixotog.scalascraper.browser.JsoupBrowser

class SpiderBro(start: String) {

  val spiderName = "SpiderBro"
  val browser = JsoupBrowser()
  val robots = browser.get(s"$start/robots.txt")
  println(robots)

  def crawl(): Unit = {
    val index = browser.get(start)
    println(index)
  }
}

object SpiderBro extends App {
  val crawler = new SpiderBro("http://localhost:8000")

  //crawler.crawl()
}
