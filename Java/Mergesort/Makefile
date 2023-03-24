run:
	java mergeSort.java "../CSV/data/100.csv" "100"

testMeasure: 
	sudo modprobe msr
	sudo ../../RAPL/main "java mergeSort.java "../CSV/data/100.csv" "100" " MergeSort/results/test mergeSort


measure:
	make randMeasure
	make randMeasure
	make bestMeasure

randMeasure: # Random values measurement 
	sudo ifconfig wlp4s0 down
	sudo modprobe msr
	for number in 25000 50000 75000 100000 200000 300000 400000 500000 600000 700000 800000 900000 1000000; do 												\
		sudo ../../RAPL/main "java mergeSort.java "../CSV/data/random0-$$number.csv" "$$number" " MergeSort/results/randomMergeSort $$number; 		\
	done
	sudo ifconfig wlp4s0 up

bestMeasure: #doesnt work yet, should do the best case
	sudo ifconfig wlp4s0 down
	sudo modprobe msr
	for number in 25000 50000 75000 100000 200000 300000 400000 500000 600000 700000 800000 900000 1000000; do 												\
		sudo ../../RAPL/main "java mergeSort.java "../CSV/data/$$number.csv" "$$number" " MergeSort/results/bestMergeSort $$number; 				\
	done
	sudo ifconfig wlp4s0 up

worstMeasure: #doesnt work yet, should do the worst case
	sudo ifconfig wlp4s0 down
	sudo modprobe msr
	for number in 25000 50000 75000 100000 200000 300000 400000 500000 600000 700000 800000 900000 1000000; do 												\
		sudo ../../RAPL/main "java mergeSort.java "../CSV/data/$$number.csv" "$$number" " MergeSort/results/WorstMergeSort $$number; 				\
	done
	sudo ifconfig wlp4s0 up


