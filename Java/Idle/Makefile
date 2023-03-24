run:
	java Idle.java  "../CSV/data/test0-100.csv" "100"

testMeasure: 
	sudo modprobe msr
	sudo ../../RAPL/main "java Idle.java "../CSV/data/test0-100.csv" "100" " Idle/results/test Idle

measure: 
	sudo ifconfig wlp4s0 down
	sudo modprobe msr
	for number in 25000 50000 75000 100000 200000 300000 400000 500000 600000 700000 800000 900000 1000000; do \
		sudo ../../RAPL/main "java Idle.java "../CSV/data/random0-$$number.csv" "$$number" " Idle/results/Idle Idle$$number; \
	done
	sudo ifconfig wlp4s0 up