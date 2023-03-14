run:
	java QuickSort.java  "../CSV/data/100.csv" "100"

testMeasure: 
	sudo modprobe msr
	sudo ../../RAPL/main "java QuickSort.java "../CSV/data/100.csv" "100" " test testQuicksort

measurePrelim: 
	sudo modprobe msr
	sudo ../../RAPL/main "java QuickSort.java "../CSV/data/10000.csv" "10000" " JavaqE quicksort1
	sudo ../../RAPL/main "java QuickSort.java "../CSV/data/20000.csv" "20000" " JavaqE quicksort2
	sudo ../../RAPL/main "java QuickSort.java "../CSV/data/30000.csv" "30000" " JavaqE quicksort3
	sudo ../../RAPL/main "java QuickSort.java "../CSV/data/40000.csv" "40000" " JavaqE quicksort4
	sudo ../../RAPL/main "java QuickSort.java "../CSV/data/50000.csv" "50000" " JavaqE quicksort5
	sudo ../../RAPL/main "java QuickSort.java "../CSV/data/60000.csv" "60000" " JavaqE quicksort6
	sudo ../../RAPL/main "java QuickSort.java "../CSV/data/70000.csv" "70000" " JavaqE quicksort7
	sudo ../../RAPL/main "java QuickSort.java "../CSV/data/80000.csv" "80000" " JavaqE quicksort8
	sudo ../../RAPL/main "java QuickSort.java "../CSV/data/90000.csv" "90000" " JavaqE quicksort9
	sudo ../../RAPL/main "java QuickSort.java "../CSV/data/100000.csv" "100000" " JavaqE quicksort10

measure: 
	sudo modprobe msr
	sudo ../../RAPL/main "java QuickSort.java "../CSV/10000.csv" "10000" " JavaqE quicksort1
	sudo ../../RAPL/main "java QuickSort.java "../CSV/20000.csv" "20000" " JavaqE quicksort2
	sudo ../../RAPL/main "java QuickSort.java "../CSV/30000.csv" "30000" " JavaqE quicksort3
	sudo ../../RAPL/main "java QuickSort.java "../CSV/40000.csv" "40000" " JavaqE quicksort4
	sudo ../../RAPL/main "java QuickSort.java "../CSV/50000.csv" "50000" " JavaqE quicksort5
	sudo ../../RAPL/main "java QuickSort.java "../CSV/60000.csv" "60000" " JavaqE quicksort6
	sudo ../../RAPL/main "java QuickSort.java "../CSV/70000.csv" "70000" " JavaqE quicksort7
	sudo ../../RAPL/main "java QuickSort.java "../CSV/80000.csv" "80000" " JavaqE quicksort8
	sudo ../../RAPL/main "java QuickSort.java "../CSV/90000.csv" "90000" " JavaqE quicksort9
	sudo ../../RAPL/main "java QuickSort.java "../CSV/100000.csv" "100000" " JavaqE quicksort10