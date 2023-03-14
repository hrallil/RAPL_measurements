run:
	java QuickSort.java  "../CSV/data/100.csv" "100"

testMeasure: 
	sudo modprobe msr
	sudo ../../RAPL/main "java QuickSort.java "../CSV/data/100.csv" "100" " test Quicksort

measurePrelim: 
	sudo modprobe msr
	sudo ../../RAPL/main "java QuickSort.java "../CSV/data/10000.csv" "10000" " JavaqE quicksort10000
	sudo ../../RAPL/main "java QuickSort.java "../CSV/data/20000.csv" "20000" " JavaqE quicksort20000
	sudo ../../RAPL/main "java QuickSort.java "../CSV/data/30000.csv" "30000" " JavaqE quicksort30000
	sudo ../../RAPL/main "java QuickSort.java "../CSV/data/40000.csv" "40000" " JavaqE quicksort40000
	sudo ../../RAPL/main "java QuickSort.java "../CSV/data/50000.csv" "50000" " JavaqE quicksort50000
	sudo ../../RAPL/main "java QuickSort.java "../CSV/data/60000.csv" "60000" " JavaqE quicksort60000
	sudo ../../RAPL/main "java QuickSort.java "../CSV/data/70000.csv" "70000" " JavaqE quicksort70000
	sudo ../../RAPL/main "java QuickSort.java "../CSV/data/80000.csv" "80000" " JavaqE quicksort80000
	sudo ../../RAPL/main "java QuickSort.java "../CSV/data/90000.csv" "90000" " JavaqE quicksort90000
	sudo ../../RAPL/main "java QuickSort.java "../CSV/data/100000.csv" "100000" " JavaqE quicksort100000

measure: 
	sudo modprobe msr
	sudo ../../RAPL/main "java QuickSort.java "../CSV/data/10000.csv" "25000" " /QuickSort/results/quicksort quicksort25000
	sudo ../../RAPL/main "java QuickSort.java "../CSV/data/20000.csv" "50000" " /QuickSort/results/quicksort quicksort50000
	sudo ../../RAPL/main "java QuickSort.java "../CSV/data/30000.csv" "75000" " /QuickSort/results/quicksort quicksort75000
	sudo ../../RAPL/main "java QuickSort.java "../CSV/data/40000.csv" "100000" " /QuickSort/results/quicksort quicksort100000
	sudo ../../RAPL/main "java QuickSort.java "../CSV/data/40000.csv" "200000" " /QuickSort/results/quicksort quicksort200000
	sudo ../../RAPL/main "java QuickSort.java "../CSV/data/40000.csv" "300000" " /QuickSort/results/quicksort quicksort300000
	sudo ../../RAPL/main "java QuickSort.java "../CSV/data/40000.csv" "400000" " /QuickSort/results/quicksort quicksort400000
	sudo ../../RAPL/main "java QuickSort.java "../CSV/data/50000.csv" "500000" " /QuickSort/results/quicksort quicksort500000
	sudo ../../RAPL/main "java QuickSort.java "../CSV/data/60000.csv" "600000" " /QuickSort/results/quicksort quicksort600000
	sudo ../../RAPL/main "java QuickSort.java "../CSV/data/70000.csv" "700000" " /QuickSort/results/quicksort quicksort700000
	sudo ../../RAPL/main "java QuickSort.java "../CSV/data/80000.csv" "800000" " /QuickSort/results/quicksort quicksort800000
	sudo ../../RAPL/main "java QuickSort.java "../CSV/data/90000.csv" "900000" " /QuickSort/results/quicksort quicksort900000
	sudo ../../RAPL/main "java QuickSort.java "../CSV/data/100000.csv" "1000000" " /QuickSort/results/quicksort quicksort1000000