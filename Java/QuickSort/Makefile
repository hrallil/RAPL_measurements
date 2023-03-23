run:
	java QuickSort.java  "../CSV/data/100.csv" "100"

testMeasure: 
	sudo modprobe msr
	sudo ../../RAPL/main "java QuickSort.java "../CSV/data/100.csv" "100" " QuickSort/results/test Quicksort

measure: 
	sudo ifconfig wlp4s0 down
	sudo modprobe msr
	for number in 25000 50000 75000 100000 200000 300000 400000 500000 600000 700000 800000 900000 1000000; do \
		sudo ../../RAPL/main "java QuickSort.java "../CSV/data/$$number.csv" "$$number" " QuickSort/results/quicksort quicksort$$number; \
	done
	sudo ifconfig wlp4s0 up
