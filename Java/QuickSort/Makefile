run:
	java QuickSort.java  "../CSV/data/test0-100.csv" "100"

testMeasure: 
	sudo modprobe msr
	javac QuickSort.java;
	sudo ../../RAPL/main "java -Xss515m QuickSort "../CSV/data/test0-100.csv" "100" " QuickSort/results/test Quicksort 1;

measure:
	make randMeasure
	make worstMeasure
	make bestMeasure

randMeasure: # runs quicksort with random arrays as input
	sudo ifconfig wlp4s0 down
	sudo modprobe msr
	for number in 25000 50000 75000 100000 200000 300000 400000 500000 600000 700000 800000 900000 1000000; do 																\
		for i in 1 2 3 4 5 6 7 8 9 10; do 																																	\
			javac QuickSort.java;																																			\
			sudo ../../RAPL/main "java -Xss515m QuickSort "../CSV/data/random$$i-$$number.csv" "$$number" " QuickSort/results/QuickSort-PC{NUMBER} random$$i-$$number-1 3; 	\
		done																																								\
	done
	sudo ifconfig wlp4s0 up

bestMeasure: #DOES NOTHING SO FAR
	sudo ifconfig wlp4s0 down
	sudo modprobe msr
	javac QuickSort.java; 																																   				\
	for number in 25000 50000 75000 100000 200000 300000 400000 500000 600000 700000 800000 900000 1000000; do 															\
		sudo ../../RAPL/main "java -Xss515m QuickSort "../CSV/data/quickBest0-$$number.csv" "$$number" " QuickSort/results/QuickSort-PC{NUMBER} best$$i-$$number-1 400; 	\
	done
	sudo ifconfig wlp4s0 up

worstMeasure: #runs quicksort with the worst arrays for quicksort as input
	sudo ifconfig wlp4s0 down
	sudo modprobe msr
	for number in 25000 50000 75000 100000 200000 300000 400000 500000 600000 700000 800000 900000 1000000; do 														  \
		javac QuickSort.java; 																																		  \
		sudo ../../RAPL/main "java -Xss515m QuickSort "../CSV/data/reverseSorted0-$$number.csv" "$$number" " QuickSort/results/QuickSort-PC{NUMBER} worst-$$number-1 400; \
	done
	sudo ifconfig wlp4s0 up




