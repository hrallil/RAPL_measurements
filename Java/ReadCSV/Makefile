run:
	java readCSV.java  "../CSV/data/test0-100.csv" "100"

testMeasure: 
	#sudo modprobe msr
	../../RAPL/main "java readCSV.java "../CSV/data/test0-100.csv" "100" " ReadCSV/results/test ReadCSV


measure:
	javac readCSV.java
	make measureRand
	make measureCountingRand
	make measureCountingBest
	make measureCountingWorst
	make measureMergeWorst
	make measureQuickBest
	make measureReverseSorted
	make measureSorted


measureRand: 
	#sudo ifconfig wlp4s0 down
	#sudo modprobe msr
	for number in 25000 50000 75000 100000 200000 300000 400000 500000 600000 700000 800000 900000 1000000; do \
		for i in 1 2 3 4 5 6 7 8 9 10; do \
			../../RAPL/main "java -Xss515m readCSV "../CSV/data/random$$i-$$number.csv" "$$number" " ReadCSV/results/readCSV-PC{HERE} readCSV-Random$$i-$$number 40;	\
		done	\
	done
	#sudo ifconfig wlp4s0 up
	
	
measureCountingRand: 
	#sudo ifconfig wlp4s0 down
	#sudo modprobe msr
	for number in 25000 50000 75000 100000 200000 300000 400000 500000 600000 700000 800000 900000 1000000; do \
		for i in 1 2 3 4 5 6 7 8 9 10; do \
			../../RAPL/main "java -Xss515m readCSV "../CSV/data/countingRandom$$i-$$number.csv" "$$number" " ReadCSV/results/readCSV-PC{HERE} readCSV-CountingRandom$$i-$$number 40;	\
		done	\
	done
	#sudo ifconfig wlp4s0 up
	
	
measureCountingBest: 
	#sudo ifconfig wlp4s0 down
	#sudo modprobe msr
	for number in 25000 50000 75000 100000 200000 300000 400000 500000 600000 700000 800000 900000 1000000; do \
		../../RAPL/main "java -Xss515m readCSV "../CSV/data/countingBest0-$$number.csv" "$$number" " ReadCSV/results/readCSV-PC{HERE} readCSV-CountingBest-$$number 400; \
	done
	#sudo ifconfig wlp4s0 up
	
	
measureCountingWorst: 
	#sudo ifconfig wlp4s0 down
	#sudo modprobe msr
	for number in 25000 50000 75000 100000 200000 300000 400000 500000 600000 700000 800000 900000 1000000; do \
		../../RAPL/main "java -Xss515m readCSV "../CSV/data/countingWorst0-$$number.csv" "$$number" " ReadCSV/results/readCSV-PC{HERE} readCSV-CountingWorst-$$number 400; \
	done
	#sudo ifconfig wlp4s0 up	
	
measureMergeWorst: 
	#sudo ifconfig wlp4s0 down
	#sudo modprobe msr
	for number in 25000 50000 75000 100000 200000 300000 400000 500000 600000 700000 800000 900000 1000000; do \
		../../RAPL/main "java -Xss515m readCSV "../CSV/data/mergeWorst0-$$number.csv" "$$number" " ReadCSV/results/readCSV-PC{HERE} readCSV-MergeWorst-$$number 400; \
	done
	#sudo ifconfig wlp4s0 up	
	

measureQuickBest: 
	#sudo ifconfig wlp4s0 down
	#sudo modprobe msr
	for number in 25000 50000 75000 100000 200000 300000 400000 500000 600000 700000 800000 900000 1000000; do \
		../../RAPL/main "java -Xss515m readCSV "../CSV/data/quickBest0-$$number.csv" "$$number" " ReadCSV/results/readCSV-PC{HERE} readCSV-QuickBest-$$number 400; \
	done
	#sudo ifconfig wlp4s0 up
	
	
measureReverseSorted: 
	#sudo ifconfig wlp4s0 down
	#sudo modprobe msr
	for number in 25000 50000 75000 100000 200000 300000 400000 500000 600000 700000 800000 900000 1000000; do \
		../../RAPL/main "java -Xss515m readCSV "../CSV/data/reverseSorted0-$$number.csv" "$$number" " ReadCSV/results/readCSV-PC{HERE} readCSV-ReverseSorted-$$number 400; \
	done
	#sudo ifconfig wlp4s0 up
	

measureSorted: 
	#sudo ifconfig wlp4s0 down
	#sudo modprobe msr
	for number in 25000 50000 75000 100000 200000 300000 400000 500000 600000 700000 800000 900000 1000000; do \
		../../RAPL/main "java -Xss515m readCSV "../CSV/data/sorted0-$$number.csv" "$$number" " ReadCSV/results/readCSV-PC{HERE} readCSV-Sorted-$$number 400; \
	done
	#sudo ifconfig wlp4s0 up
