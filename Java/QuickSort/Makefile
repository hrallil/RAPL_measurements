run:
	java QuickSort.java  "../CSV/data/100.csv" "100"

testMeasure: 
	sudo modprobe msr
	sudo ../../RAPL/main "java QuickSort.java "../CSV/data/100.csv" "100" " test Quicksort

measure: 
	sudo ifconfig wlp4s0 down
	sudo modprobe msr
	

	for number in 25000 50000 75000 100000 200000 300000 400000 500000 600000 700000 800000 900000 1000000; do \
		sudo ../../RAPL/main "java QuickSort.java "../CSV/data/$$number.csv" "$$number" " quicksort quicksort$$number \
	done

bin:
	sudo ../../RAPL/main "java QuickSort.java "../CSV/data/25000.csv" "25000" " quicksort quicksort25000
	sudo ../../RAPL/main "java QuickSort.java "../CSV/data/50000.csv" "50000" " quicksort quicksort50000
	sudo ../../RAPL/main "java QuickSort.java "../CSV/data/75000.csv" "75000" " quicksort quicksort75000
	sudo ../../RAPL/main "java QuickSort.java "../CSV/data/100000.csv" "100000" " quicksort quicksort100000
	sudo ../../RAPL/main "java QuickSort.java "../CSV/data/200000.csv" "200000" " quicksort quicksort200000
	sudo ../../RAPL/main "java QuickSort.java "../CSV/data/300000.csv" "300000" " quicksort quicksort300000
	sudo ../../RAPL/main "java QuickSort.java "../CSV/data/400000.csv" "400000" " quicksort quicksort400000
	sudo ../../RAPL/main "java QuickSort.java "../CSV/data/500000.csv" "500000" " quicksort quicksort500000
	sudo ../../RAPL/main "java QuickSort.java "../CSV/data/600000.csv" "600000" " quicksort quicksort600000
	sudo ../../RAPL/main "java QuickSort.java "../CSV/data/700000.csv" "700000" " quicksort quicksort700000
	sudo ../../RAPL/main "java QuickSort.java "../CSV/data/800000.csv" "800000" " quicksort quicksort800000
	sudo ../../RAPL/main "java QuickSort.java "../CSV/data/900000.csv" "900000" " quicksort quicksort900000
	sudo ../../RAPL/main "java QuickSort.java "../CSV/data/1000000.csv" "1000000" " quicksort quicksort1000000