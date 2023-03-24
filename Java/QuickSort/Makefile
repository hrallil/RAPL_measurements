run:
	java QuickSort.java  "../CSV/data/100.csv" "100"

testMeasure: 
	sudo modprobe msr
	sudo ../../RAPL/main "java QuickSort.java "../CSV/data/100.csv" "100" " QuickSort/results/test Quicksort

measure:
	make randMeasure
	make randMeasure
	make bestMeasure

randMeasure: # dont run tests: 75000 200000 300000 800000 900000
	sudo ifconfig wlp4s0 down
	sudo modprobe msr
	for number in 25000 50000  100000  400000 500000 600000 700000  1000000; do 																				\
		for i in 1 2 3 4 5 6 7 8 9 10; do 																														\
			sudo ../../RAPL/main "java QuickSort.java "../CSV/data/random$$i-$$number.csv" "$$number" " QuickSort/results/randomQuicksort random$$i-$$number; 	\
			echo "Running: $$i"; 																																\
		done 																																					\
	done
	sudo ifconfig wlp4s0 up

bestMeasure: #doesnt do anything significant yet
	sudo ifconfig wlp4s0 down
	sudo modprobe msr
	for number in 25000 50000 75000 100000 200000 300000 400000 500000 600000 700000 800000 900000 1000000; do 										\
		sudo ../../RAPL/main "java QuickSort.java "../CSV/data/$$number.csv" "$$number" " QuickSort/results/bestQuicksort $$number; 				\
	done
	sudo ifconfig wlp4s0 up

worstMeasure: #doesnt do anything significant yet
	sudo ifconfig wlp4s0 down
	sudo modprobe msr
	for number in 25000 50000 75000 100000 200000 300000 400000 500000 600000 700000 800000 900000 1000000; do 										\
		sudo ../../RAPL/main "java QuickSort.java "../CSV/data/$$number.csv" "$$number" " QuickSort/results/WorstQuicksort $$number; 				\
	done
	sudo ifconfig wlp4s0 up




