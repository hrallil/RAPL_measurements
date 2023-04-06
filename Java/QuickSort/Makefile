run:
	java QuickSort.java  "../CSV/data/test0-100.csv" "100"

testMeasure: 
	sudo modprobe msr
	sudo ../../RAPL/main "java QuickSort.java "../CSV/data/test0-100.csv" "100" " QuickSort/results/test Quicksort
	sudo ../../RAPL/main "java QuickSort.java "../CSV/data/random1-25000.csv" "25000" " QuickSort/results/randomQuickSort random1-25000

measure:
	make randMeasure
	make worstMeasure
	make bestMeasure

randMeasure: # runs quicksort with random arrays as input
	sudo ifconfig wlp4s0 down
	sudo modprobe msr
	for number in 25000 50000 75000 100000 200000 300000 400000 500000 600000 700000 800000 900000 1000000; do 																				\
			echo "Running: $$number"; 																													\
			sudo ../../RAPL/main "java QuickSort.java "../CSV/data/random1-$$number.csv" "$$number" " QuickSort/results/Quicksort random-$$number-1; 	\
	done
	sudo ifconfig wlp4s0 up

bestMeasure: #runs quicksort with the best arrays for quicksort as input
	sudo ifconfig wlp4s0 down
	sudo modprobe msr
	for number in 25000 50000 75000 100000 200000 300000 400000 500000 600000 700000 800000 900000 1000000; do 										\
		sudo ../../RAPL/main "java QuickSort.java "../CSV/data/$$number.csv" "$$number" " QuickSort/results/Quicksort $$number; 				\
	done
	sudo ifconfig wlp4s0 up

worstMeasure: #runs quicksort with the worst arrays for quicksort as input
	sudo ifconfig wlp4s0 down
	sudo modprobe msr
	for number in 25000 50000 75000 100000 200000 300000 400000 500000 600000 700000 800000 900000 1000000; do 											\
		sudo ../../RAPL/main "java QuickSort.java "../CSV/data/reverseSorted0-$$number.csv" "$$number" " QuickSort/results/QuickSort worst-$$number-1; 	\
	done
	sudo ifconfig wlp4s0 up




