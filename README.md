# [Scala.js](https://www.scala-js.org/) ❤️ [Scala CLI](https://scala-cli.virtuslab.org/) ❤️ [Vite](https://vitejs.dev/)

Minimal template to get you started with Scala.js, Scala CLI and Vite.

1. Run `npm install`
2. `npm run dev` - this will run both the Vite's dev server _and_ Scala.js continuous packaging, watching for any file changes
3. Happy hacking! Your project will reload automatically as you make changes to [index.scala](./index.scala)

## Demo

https://github.com/keynmol/scalajs-scala-cli-vite-template/assets/1052965/c5447aef-317b-45a9-985d-bfb717d46461

## Caveats

Note that so far Scala CLI reloading is slower than what I usually experience in SBT. It's still fine, but if you want the fastest experience available,
consider using the [Vite plugin](https://github.com/scala-js/vite-plugin-scalajs) and the [SBT Vite template](https://github.com/scala-js/vite.g8) (`sbt new scala-js/vite.g8`)
