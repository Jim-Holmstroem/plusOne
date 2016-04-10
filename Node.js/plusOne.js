process.stdin.pipe(require('split')(Number)).on('data', processLine)

function processLine (x) {
      console.log(x + 1)
}
