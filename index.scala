//> using platform scala-js
//> using dep org.scala-js::scalajs-dom::2.8.0
//> using scala 3.4.2

import org.scalajs.dom.*

@main def hello =
  val container = document.getElementById("content")
  val button = document.createElement("button")
  button.innerText = "Click me!"
  container.appendChild(button)

  button.addEventListener(
    "click",
    ev => window.alert("Clicked: " + ev.toString())
  )
end hello
