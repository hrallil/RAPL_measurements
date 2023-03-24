run:
	java JavaSort.java  "../CSV/data/test0-100.csv" "100"

testMeasure: 
	sudo modprobe msr
	sudo ../../RAPL/main "java JavaSort.java "../CSV/data/test0-100.csv" "100" " JavaSort/results/test JavaSort

measure: 
	sudo ifconfig wlp4s0 down
	sudo modprobe msr
	for number in 25000 50000 75000 100000 200000 300000 400000 500000 600000 700000 800000 900000 1000000; do \
		sudo ../../RAPL/main "java JavaSort.java "../CSV/data/$$number.csv" "$$number" " JavaSort/results/JavaSort JavaSort$$number; \
	done
	sudo ifconfig wlp4s0 up
