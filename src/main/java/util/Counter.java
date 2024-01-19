package util;

import java.util.StringTokenizer;

//This is an example (faulty) class to be used for A4 Task1 and Task2
public class Counter {
	public int _ctr;
	public int _multiplier;

	// method increments _ctr
	public void increment() {
		_ctr++; // faulty increment
	}

	// method decrements _ctr
	public void decrement() {
		_ctr--; // faulty decrement
	}

	// method resets _ctr
	public void reset() {
		_ctr = 1; // faulty reset, _ctr should rather be 0
	}

	// method multiplies _ctr by n
	public void multiplyBy(int multiplier) {
		_multiplier = multiplier; // no fault here
		_ctr = _ctr * _multiplier; // no fault here
	}

	// TODO: dev1- method for increment to closest even number
    public void incrementToEven() {
		increment();
        if (_ctr % 2 != 0) {
            // If _ctr is odd, increment to the next even number
            _ctr++;
		}
	}	

	 // TODO: dev1- method for decrement to closest even number
	 public void decrementToEven() {
		decrement();
        if (_ctr % 2 != 0) {
            // If _ctr is odd, decrement to the previous even number
            _ctr--;
        }
	 }
	// TODO: dev2- method for increment to closest prime number
    public void incrementToPrime() {
        if (_ctr < 2) {
            // Handle the case where the counter is less than 2
            _ctr = 2;
        } else {
            // Increment to the closest prime number
            while (!isPrime(_ctr)) {
                _ctr++;
            }
        }
    }
// TODO: dev2- method for decrement to closest prime number
public void decrementToPrime() {
	if (_ctr < 2) {
		// Handle the case where the counter is less than 2
		_ctr = 2;
	} else {
		// Decrement to the closest prime number
		while (!isPrime(_ctr)) {
			_ctr--;
			// Check if the counter goes below 2
			if (_ctr < 2) {
				_ctr = 2;
				break;
			}
		}
	}
}
    // Helper method to check if a number is prime
    private boolean isPrime(int num) {
        if (num < 2) {
            return false;
        }
        for (int i = 2; i <= Math.sqrt(num); i++) {
            if (num % i == 0) {
                return false;
            }
        }
        return true;
    }

	// TODO: dev3- count the frequency of word in sentence,
	// refactor source code from dev1 and dev2
	public void countFrequency(String word, String sentence) {
		String[] words = sentence.split("\\s+");

        // Count the frequency of the given word
        public void countFrequency(String word, String sentence) {
		String[] words = sentence.split("\\s+");

        // Count the frequency of the given word
        for (String w : words) {
            if (w.equalsIgnoreCase(word)) {
                _ctr++;
            }
        }
	}
	}

	public void setCounter(int i) {
		_ctr=i;
	}

	public int getCounter() {
		return _ctr;
	}

}
