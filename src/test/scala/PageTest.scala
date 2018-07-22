import org.scalatest.{FreeSpec, Matchers}

class PageTest extends FreeSpec with Matchers {

  "A page" - {
    "with title 'Success' is processable" in {
      Page("Success") should be(ProcessablePage("Success"))
    }
    "with a tragic title is a dead end" in {
      val tragicTitle = "Oh no! SpiderBro is sick"
      Page(tragicTitle) should be(DeadEnd(tragicTitle))
    }
  }
}
