def square(number: Double): Double = number * number

def abs(n: Double): Double = if (n > 0) {
  n
} else if (n == 0) {
  0
} else {
  -n
}

def goodEnough(guess: Double, number: Double): Boolean = abs(square(guess) - number) < 0.00001

def squareRootIterative(guess: Double, number: Double): Double = if (goodEnough(guess, number)) {
  guess
} else {
  def newGuess = (guess + (number / guess)) / 2
  squareRootIterative(newGuess, number)
}

squareRootIterative(1, 25)
squareRootIterative(1, 9)
squareRootIterative(1, 2)

def squareRoot(number: Double): Double = squareRootIterative(1, number)


def calculateCableLength(bridgeLength: Double, columnHeight: Double) = squareRoot(square(bridgeLength / 2) + square(columnHeight)) * 2

calculateCableLength(10, 4)