run:
	java Idle.java  "../CSV/data/test0-100.csv" "100"

testMeasure: 
	sudo modprobe msr
	sudo ../../RAPL/main "java Idle.java "../CSV/data/test0-100.csv" "100" " Idle/results/test Idle


measure:
	make measureRand
	make measureCountingRand
	make measureCountingBest
	make measureCountingWorst
	make measureMergeWorst
	make measureQuickBest
	make measureReverseSorted
	make measureSorted


measureRand: 
	sudo ifconfig wlp4s0 down
	sudo modprobe msr
	for number in 25000 50000 75000 100000 200000 300000 400000 500000 600000 700000 800000 900000 1000000; do \
		for i in 1 2 3 4 5 6 7 8 9 10; do \
			sudo ../../RAPL/main "java Idle.java "../CSV/data/random0-$$number.csv" "$$number" " Idle/results/readCSV readCSVRand$$number 1;	\
		done
	done
	sudo ifconfig wlp4s0 up
	
	
measureCountingRand: 
	sudo ifconfig wlp4s0 down
	sudo modprobe msr
	for number in 25000 50000 75000 100000 200000 300000 400000 500000 600000 700000 800000 900000 1000000; do \
		for i in 1 2 3 4 5 6 7 8 9 10; do \
			sudo ../../RAPL/main "java Idle.java "../CSV/data/countingRandom$$i-$$number.csv" "$$number" " Idle/results/readCSV readCSVCountingRand$$number 1;	\
		done
	done
	sudo ifconfig wlp4s0 up
	
	
measureCountingBest: 
	sudo ifconfig wlp4s0 down
	sudo modprobe msr
	for number in 25000 50000 75000 100000 200000 300000 400000 500000 600000 700000 800000 900000 1000000; do \
		sudo ../../RAPL/main "java Idle.java "../CSV/data/countingBest0-$$number.csv" "$$number" " Idle/results/readCSV readCSVCountingBest$$number 1; \
	done
	sudo ifconfig wlp4s0 up
	
	
measureCountingWorst: 
	sudo ifconfig wlp4s0 down
	sudo modprobe msr
	for number in 25000 50000 75000 100000 200000 300000 400000 500000 600000 700000 800000 900000 1000000; do \
		sudo ../../RAPL/main "java Idle.java "../CSV/data/countingWorst0-$$number.csv" "$$number" " Idle/results/readCSV readCSVCountingWorst$$number 1; \
	done
	sudo ifconfig wlp4s0 up	
	
measureMergeWorst: 
	sudo ifconfig wlp4s0 down
	sudo modprobe msr
	for number in 25000 50000 75000 100000 200000 300000 400000 500000 600000 700000 800000 900000 1000000; do \
		sudo ../../RAPL/main "java Idle.java "../CSV/data/mergeWorst0-$$number.csv" "$$number" " Idle/results/readCSV readCSVMergeWorst$$number 1; \
	done
	sudo ifconfig wlp4s0 up	
	

measureQuickBest: 
	sudo ifconfig wlp4s0 down
	sudo modprobe msr
	for number in 25000 50000 75000 100000 200000 300000 400000 500000 600000 700000 800000 900000 1000000; do \
		sudo ../../RAPL/main "java Idle.java "../CSV/data/quickBest0-$$number.csv" "$$number" " Idle/results/readCSV readCSVQuickBest$$number 1; \
	done
	sudo ifconfig wlp4s0 up
	
	
measureReverseSorted: 
	sudo ifconfig wlp4s0 down
	sudo modprobe msr
	for number in 25000 50000 75000 100000 200000 300000 400000 500000 600000 700000 800000 900000 1000000; do \
		sudo ../../RAPL/main "java Idle.java "../CSV/data/reverseSorted0-$$number.csv" "$$number" " Idle/results/readCSV readCSVReverseSorted$$number 1; \
	done
	sudo ifconfig wlp4s0 up
	

measureSorted: 
	sudo ifconfig wlp4s0 down
	sudo modprobe msr
	for number in 25000 50000 75000 100000 200000 300000 400000 500000 600000 700000 800000 900000 1000000; do \
		sudo ../../RAPL/main "java Idle.java "../CSV/data/sorted0-$$number.csv" "$$number" " Idle/results/readCSV readCSVReverseSorted$$number 1; \
	done
	sudo ifconfig wlp4s0 up
