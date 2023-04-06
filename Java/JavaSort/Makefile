run:
	java JavaSort.java  "../CSV/data/test0-100.csv" "100"

testMeasure: 
	sudo modprobe msr
	sudo ../../RAPL/main "java JavaSort.java "../CSV/data/test0-100.csv" "100" " JavaSort/results/test JavaSort
	sudo ../../RAPL/main "java JavaSort.java "../CSV/data/random1-25000.csv" "25000" " JavaSort/results/randomJavaSort random1-25000;

measure:
	make randMeasure
	make randMeasure
	make bestMeasure

randMeasure: # dont run tests: 75000 200000 300000 800000 900000
	sudo ifconfig wlp4s0 down
	sudo modprobe msr
	for number in 25000 50000 75000 100000 200000 300000 400000 500000 600000 700000 800000 900000 1000000; do 													\
		for i in 1 2 3 4 5 6 7 8 9 10; do 																														\
			echo "Running: $$i"; 																																\
			sudo ../../RAPL/main "java JavaSort.java "../CSV/data/random$$i-$$number.csv" "$$number" " JavaSort/results/randomJavaSort random$$i-$$number; 		\
		done 																																					\
	done
	sudo ifconfig wlp4s0 up

pcChoice:
	sudo ifconfig wlp4s0 down
	sudo modprobe msr
	for number in 25000 50000 75000 100000 200000 300000 400000 500000 600000 700000 800000 900000 1000000; do 													\
		sudo ../../RAPL/main "java JavaSort.java "../CSV/data/random1-$$number.csv" "$$number" " JavaSort/results/pcTest-HERE pcTest-$$number; 					\
	done
	sudo ifconfig wlp4s0 up

bestMeasure: #doesnt do anything significant yet
	sudo ifconfig wlp4s0 down
	sudo modprobe msr
	for number in 25000 50000 75000 100000 200000 300000 400000 500000 600000 700000 800000 900000 1000000; do 													\
		sudo ../../RAPL/main "java JavaSort.java "../CSV/data/$$number.csv" "$$number" " JavaSort/results/bestJavaSort $$number; 								\
	done
	sudo ifconfig wlp4s0 up

worstMeasure: #runs javasort with the worst arrays for quicksort as input
	sudo ifconfig wlp4s0 down
	sudo modprobe msr
	for number in 25000 50000 75000 100000 200000 300000 400000 500000 600000 700000 800000 900000 1000000; do 											\
		sudo ../../RAPL/main "java javasort.java "../CSV/data/reverseSorted0-$$number.csv" "$$number" " JavaSort/results/Javasort worst-$$number-1; 	\
	done
	sudo ifconfig wlp4s0 up
