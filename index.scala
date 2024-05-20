//> using platform scala-js
//> using dep org.scala-js::scalajs-dom::2.8.0
//> using scala 3.4.2

import org.scalajs.dom.*

@main def hello =
  val container = document.getElementById("content")

  val button = document.createElement("button")
  button.innerText = "Click me!"
  container.appendChild(button)

  val count = container.appendChild(document.createElement("p"))
  container.appendChild(count)

  var counter = 0
  def setCounter() =
    counter += 1
    count.innerText = counter.toString()

  setCounter()

  button.addEventListener("click", ev => setCounter())

end hello
