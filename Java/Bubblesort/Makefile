run:
	java bubblesort.java  "../CSV/data/test0-100.csv" "100"

testMeasure: 
	sudo modprobe msr
	sudo ../../RAPL/main "java bubblesort.java "../CSV/data/test0-100.csv" "100" " Bubblesort/results/test bubblesort

measure:
	make randMeasure
	make worstMeasure
	make bestMeasure

randMeasure: # dont run tests: 75000 200000 300000 800000 900000
	sudo ifconfig wlp4s0 down
	sudo modprobe msr
	for number in 25000 50000 75000 100000 200000 300000 400000 500000; do 																											\
		for i in 1 2 3 4 5 6 7 8 9 10; do 																															\
			sudo ../../RAPL/main "java bubblesort.java "../CSV/data/random$$i-$$number.csv" "$$number" " Bubblesort/results/randomBubblesort random$$i-$$number; 	\
			echo "Running random: Array size: $$number iteration: $$i"; 																							\
		done																																						\
	done
	sudo ifconfig wlp4s0 up

bestMeasure: #doesnt do anything significant yet
	sudo ifconfig wlp4s0 down
	sudo modprobe msr
	for number in 25000 50000 75000 100000 200000 300000 400000 500000; do 																							\
		sudo ../../RAPL/main "java bubblesort.java "../CSV/data/0sorted-$$number.csv" "$$number" " Bubblesort/results/bestbubblesort $$number;						\
		echo "Running best: $$number"; 																																\
	done
	sudo ifconfig wlp4s0 up

worstMeasure: #doesnt do anything significant yet
	sudo ifconfig wlp4s0 down
	sudo modprobe msr
	for number in 25000 50000 75000 100000 200000 300000 400000 500000; do 																							\
		sudo ../../RAPL/main "java bubblesort.java "../CSV/data/0sorted-$$number.csv" "$$number" " Bubblesort/results/worstBubblesort $$number; 					\
		echo "Running worst: $$number"; 																																\
	done
	sudo ifconfig wlp4s0 up
