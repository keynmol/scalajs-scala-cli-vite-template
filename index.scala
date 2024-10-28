//> using platform scala-js
//> using jsVersion 1.17.0
//> using dep org.scala-js::scalajs-dom::2.8.0
//> using scala 3.5.2

import org.scalajs.dom.*

@main def hello =
  val container = document.getElementById("content")

  val button = document.createElement("button")
  button.innerText = "Click!"
  container.appendChild(button)

  val count = container.appendChild(document.createElement("h2"))
  container.appendChild(count)

  var counter = 250
  def setCounter() =
    counter += 1
    count.innerText = counter.toString()

  setCounter()

  button.addEventListener("click", ev => setCounter())

end hello
