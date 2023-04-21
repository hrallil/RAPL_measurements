run:
	java bubblesort.java  "../CSV/data/test0-100.csv" "100"

testMeasure: 
	sudo modprobe msr
	sudo ../../RAPL/main "java bubblesort.java "../CSV/data/test0-100.csv" "100" " Bubblesort/results/test bubblesort 1

measure:
	make randMeasure
	make worstMeasure
	make bestMeasure

randMeasure: # dont run tests: 600000 700000 800000 900000 1000000
	sudo ifconfig wlp4s0 down
	sudo modprobe msr
	for number in 25000 50000 75000 100000 200000 300000 400000 500000; do 																								\
		for i in 1 2 3 4 5 6 7 8 9 10; do 																																\
			sudo ../../RAPL/main "java bubblesort.java "../CSV/data/random$$i-$$number.csv" "$$number" " Bubblesort/results/bubbleSort-PC{NUMBER} random$$i-$$number-1 40; \
		done																																							\
	done
	sudo ifconfig wlp4s0 up

bestMeasure: # dont run tests: 600000 700000 800000 900000 1000000
	sudo ifconfig wlp4s0 down
	sudo modprobe msr
	for number in 25000 50000 75000 100000 200000 300000 400000 500000; do 																							\
		sudo ../../RAPL/main "java bubblesort.java "../CSV/data/sorted0-$$number.csv" "$$number" " Bubblesort/results/bubbleSort-PC{NUMBER} best$$i-$$number-1 400;		\
	done
	sudo ifconfig wlp4s0 up

worstMeasure: # dont run tests: 600000 700000 800000 900000 1000000
	sudo ifconfig wlp4s0 down
	sudo modprobe msr
	for number in 25000 50000 75000 100000 200000 300000 400000 500000; do 																								\
		sudo ../../RAPL/main "java bubblesort.java "../CSV/data/reverseSorted0-$$number.csv" "$$number" " Bubblesort/results/bubbleSort-PC{NUMBER} worst$$i-$$number-1 400; \
	done
	sudo ifconfig wlp4s0 up
