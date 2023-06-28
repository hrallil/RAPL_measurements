run:
	java BubbleSort.java  "../CSV/data/test0-100.csv" "100"

testMeasure: 
	 modprobe msr
	 ../../RAPL/main "java BubbleSort.java "../CSV/data/test0-100.csv" "100" " Bubblesort/results/test bubblesort 1

measure:
	javac BubbleSort.java
	make randMeasure
	make worstMeasure
	make bestMeasure
																																				\

measure400Repeats:
	javac BubbleSort.java

	#Heat up:
	java -Xss515m BubbleSort "../CSV/data/sorted0-25000.csv" "25000";

	# Tests:
	for number in 25000 50000 75000 100000 125000 150000 175000 200000; do 																							\
		 ../../RAPL/main "java -Xss515m BubbleSort "../CSV/data/sorted0-$$number.csv" "$$number" " Bubblesort/results/bubbleSort-400repeats-PC16 best$$i-$$number-1 30;		\
	done

	for number in 25000 50000 75000 100000 125000 150000 175000 200000; do 																								\
		 ../../RAPL/main "java -Xss515m BubbleSort "../CSV/data/reverseSorted0-$$number.csv" "$$number" " Bubblesort/results/bubbleSort-400repeats-PC16 worst$$i-$$number-1 30; \
	done

	for number in 25000 50000 75000 100000 125000 150000 175000 200000; do 																								\
		for i in 1 2 3 4 5 6 7 8 9 10; do 																																\
			 ../../RAPL/main "java -Xss515m BubbleSort "../CSV/data/random$$i-$$number.csv" "$$number" " Bubblesort/results/bubbleSort-400repeats-PC16 random$$i-$$number-1 3; \
		done																																							\
	done

measureBranchMispredictions:
	javac BubbleSort.java
	javac BubbleSortBAD.java

	#Heat up:
	java -Xss515m BubbleSort "../CSV/data/sorted0-10000.csv" "10000";

	#Tests:
	for number in 10000 20000 30000 40000 50000; do 																							\
		 ../../RAPL/main "java -Xss515m BubbleSort "../CSV/data/branchPredict0-$$number.csv" "$$number" " Bubblesort/results/bubbleSort-branchMispredict-PC16 greaterThan0-$$number-1 30;		\
	done

	for number in 10000 20000 30000 40000 50000; do 																							\
		 ../../RAPL/main "java -Xss515m BubbleSortBAD "../CSV/data/branchPredict0-$$number.csv" "$$number" " Bubblesort/results/bubbleSort-branchMispredict-PC16 greaterThanEquals0-$$number-1 30;		\
	done



randMeasure: # dont run tests: 600000 700000 800000 900000 1000000
	#sudo ifconfig wlp4s0 down
	#sudo modprobe msr
	for number in 25000 50000 75000 100000 200000 300000 400000 500000; do 																								\
		for i in 1 2 3 4 5 6 7 8 9 10; do 																																\
			 ../../RAPL/main "java -Xss515m Bubblesort "../CSV/data/random$$i-$$number.csv" "$$number" " Bubblesort/results/bubbleSort-PC{NUMBER} random$$i-$$number-1 40; \
		done																																							\
	done
	#sudo ifconfig wlp4s0 up

bestMeasure: # dont run tests: 600000 700000 800000 900000 1000000
	#sudo ifconfig wlp4s0 down
	#sudo modprobe msr
	for number in 25000 50000 75000 100000 200000 300000 400000 500000; do 																							\
		 ../../RAPL/main "java -Xss515m Bubblesort "../CSV/data/sorted0-$$number.csv" "$$number" " Bubblesort/results/bubbleSort-PC{NUMBER} best$$i-$$number-1 400;		\
	done
	#sudo ifconfig wlp4s0 up

worstMeasure: # dont run tests: 600000 700000 800000 900000 1000000
	#sudo ifconfig wlp4s0 down
	#sudo modprobe msr
	for number in 25000 50000 75000 100000 200000 300000 400000 500000; do 																								\
		 ../../RAPL/main "java -Xss515m Bubblesort "../CSV/data/reverseSorted0-$$number.csv" "$$number" " Bubblesort/results/bubbleSort-PC{NUMBER} worst$$i-$$number-1 400; \
	done
	#sudo ifconfig wlp4s0 up
