sealed trait Page
case class DeadEnd(title: String) extends Page
case class ProcessablePage(title: String) extends Page

object Page {
  def apply(title: String): Page =
    title match {
      case deadSpider if title.startsWith("Oh no!") => DeadEnd(deadSpider)
      case _                                        => ProcessablePage(title)
    }
}
