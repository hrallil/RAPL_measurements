run:
	java mergeSort.java "../CSV/data/test0-100.csv" "100"

testMeasure: 
	modprobe msr
	../../RAPL/main "java mergeSort.java "../CSV/data/test0-100.csv" "100" " Mergesort/results/test mergeSort 1


measure:
	javac mergeSort.java
	make randMeasure
	make worstMeasure
	make bestMeasure

randMeasure: # Random values measurement 
	#sudo ifconfig wlp4s0 down
	#sudo modprobe msr

	for number in 25000 50000 75000 100000 200000 300000 400000 500000 600000 700000 800000 900000 1000000; do 																								\
		for i in 1 2 3 4 5 6 7 8 9 10; do \
			../../RAPL/main "java -Xss515m mergeSort "../CSV/data/random$$i-$$number.csv" "$$number" " Mergesort/results/mergeSort-PC{NUMBER} random$$i-$$number-1 40; 	\
		done																																							\
	done
	#sudo ifconfig wlp4s0 up

bestMeasure: #doesnt work yet, should do the best case
	#sudo ifconfig wlp4s0 down
	#sudo modprobe msr
	for number in 25000 50000 75000 100000 200000 300000 400000 500000 600000 700000 800000 900000 1000000; do 													\
		../../RAPL/main "java -Xss515m mergeSort "../CSV/data/sorted0-$$number.csv" "$$number" " Mergesort/results/mergeSort-PC{NUMBER} best-$$number-1 400; 	\
	done
	#sudo ifconfig wlp4s0 up

worstMeasure: #doesnt work yet, should do the worst case
	#sudo ifconfig wlp4s0 down
	#sudo modprobe msr
	for number in 25000 50000 75000 100000 200000 300000 400000 500000 600000 700000 800000 900000 1000000; do 														\
		../../RAPL/main "java -Xss515m mergeSort "../CSV/data/mergeWorst0-$$number.csv" "$$number" " Mergesort/results/mergeSort-PC{NUMBER} worst-$$number-1 400; 	\
	done
	#sudo ifconfig wlp4s0 up


