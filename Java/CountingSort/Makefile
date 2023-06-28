run:
	java CountingSort.java "../CSV/data/test0-100.csv" "100"

testMeasure: 
	sudo modprobe msr
	../../RAPL/main "java CountingSort.java "../CSV/data/test0-100.csv" "100" " CountingSort/results/test countingSort


measure:
	javac CountingSort.java
	make randMeasure
	make worstMeasure
	make bestMeasure

measure400Repeats:
	javac CountingSort.java

	#Heat up:
	for number in 25000 50000 75000 100000 200000; do 															   \
		java -Xss515m CountingSort "../CSV/data/countingWorst0-$$number.csv" "$$number"; \
	done

	#Tests:
	for number in 25000 50000 75000 100000 200000 300000 400000 500000 600000 700000 800000 900000 1000000; do 															 \
		../../RAPL/main "java -Xss515m CountingSort "../CSV/data/countingBest0-$$number.csv" "$$number" " CountingSort/results/countingSort-400repeats-PC{NUMBER} best-$$number-1 30; \
	done
	
	for number in 25000 50000 75000 100000 200000 300000 400000 500000 600000 700000 800000 900000 1000000; do 															   \
		../../RAPL/main "java -Xss515m CountingSort "../CSV/data/countingWorst0-$$number.csv" "$$number" " CountingSort/results/countingSort-400repeats-PC{NUMBER} worst-$$number-1 30; \
	done
	
	for number in 25000 50000 75000 100000 200000 300000 400000 500000 600000 700000 800000 900000 1000000; do 														 	  \
		for i in 1 2 3 4 5 6 7 8 9 10; do																																  \
			../../RAPL/main "java -Xss515m CountingSort "../CSV/data/countingRandom$$i-$$number.csv" "$$number" " CountingSort/results/countingSort-400repeats-PC{NUMBER} random$$i-$$number-1 2; \
		done																																							  \
	done

randMeasure: # Random values measurement 
	#sudo ifconfig wlp4s0 down
	#sudo modprobe msr
	for number in 25000 50000 75000 100000 200000 300000 400000 500000 600000 700000 800000 900000 1000000; do 														 	  \
		for i in 1 2 3 4 5 6 7 8 9 10; do																																  \
			../../RAPL/main "java -Xss515m CountingSort "../CSV/data/countingRandom$$i-$$number.csv" "$$number" " CountingSort/results/countingSort-PC{NUMBER} random$$i-$$number-1 40; \
		done																																							  \
	done
	#sudo ifconfig wlp4s0 up

bestMeasure: #measure the energy consumption of the best case input for counting sort
	#sudo ifconfig wlp4s0 down
	#sudo modprobe msr
	for number in 25000 50000 75000 100000 200000 300000 400000 500000 600000 700000 800000 900000 1000000; do 															 \
		../../RAPL/main "java -Xss515m CountingSort "../CSV/data/countingBest0-$$number.csv" "$$number" " CountingSort/results/countingSort-PC{NUMBER} best-$$number-1 400; \
	done
	#sudo ifconfig wlp4s0 up

worstMeasure: #measure the energy consumption of the worst case input for counting sort
	#sudo ifconfig wlp4s0 down
	#sudo modprobe msr
	for number in 25000 50000 75000 100000 200000 300000 400000 500000 600000 700000 800000 900000 1000000; do 															   \
		../../RAPL/main "java -Xss515m CountingSort "../CSV/data/countingWorst0-$$number.csv" "$$number" " CountingSort/results/countingSort-PC{NUMBER} worst-$$number-1 400; \
	done
	#sudo ifconfig wlp4s0 up
