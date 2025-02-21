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
