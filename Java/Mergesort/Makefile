run:
	java mergeSort.java "../CSV/100.csv" "10"

measure:
	sudo modprobe msr
	sudo ../../RAPL/main "java mergeSort.java "../CSV/data/25000.csv" "25000" " merge25k-1M merge-sort25000
	sudo ../../RAPL/main "java mergeSort.java "../CSV/data/50000.csv" "50000" " merge25k-1M merge-sort50000
	sudo ../../RAPL/main "java mergeSort.java "../CSV/data/75000.csv" "75000" " merge25k-1M merge-sort75000
	sudo ../../RAPL/main "java mergeSort.java "../CSV/data/100000.csv" "100000" " merge25k-1M merge-sort100000
	sudo ../../RAPL/main "java mergeSort.java "../CSV/data/200000.csv" "200000" " merge25k-1M merge-sort200000
	sudo ../../RAPL/main "java mergeSort.java "../CSV/data/300000.csv" "300000" " merge25k-1M merge-sort300000
	sudo ../../RAPL/main "java mergeSort.java "../CSV/data/400000.csv" "400000" " merge25k-1M merge-sort400000
	sudo ../../RAPL/main "java mergeSort.java "../CSV/data/500000.csv" "500000" " merge25k-1M merge-sort500000
	sudo ../../RAPL/main "java mergeSort.java "../CSV/data/600000.csv" "600000" " merge25k-1M merge-sort600000
	sudo ../../RAPL/main "java mergeSort.java "../CSV/data/700000.csv" "700000" " merge25k-1M merge-sort700000
	sudo ../../RAPL/main "java mergeSort.java "../CSV/data/800000.csv" "800000" " merge25k-1M merge-sort800000
	sudo ../../RAPL/main "java mergeSort.java "../CSV/data/900000.csv" "900000" " merge25k-1M merge-sort900000
	sudo ../../RAPL/main "java mergeSort.java "../CSV/data/1000000.csv" "1000000" " merge25k-1M merge-sort1000000

measureS:
	sudo modprobe msr
	sudo ../../RAPL/main "java mergeSort.java "../CSV/100.csv" "100" " JavaMs merge-sort100
	sudo ../../RAPL/main "java mergeSort.java "../CSV/200.csv" "200" " JavaMs merge-sort200
	sudo ../../RAPL/main "java mergeSort.java "../CSV/300.csv" "300" " JavaMs merge-sort300
	sudo ../../RAPL/main "java mergeSort.java "../CSV/400.csv" "400" " JavaMs merge-sort400
	sudo ../../RAPL/main "java mergeSort.java "../CSV/500.csv" "500" " JavaMs merge-sort500
	sudo ../../RAPL/main "java mergeSort.java "../CSV/600.csv" "600" " JavaMs merge-sort600
	sudo ../../RAPL/main "java mergeSort.java "../CSV/700.csv" "700" " JavaMs merge-sort700
	sudo ../../RAPL/main "java mergeSort.java "../CSV/800.csv" "800" " JavaMs merge-sort800
	sudo ../../RAPL/main "java mergeSort.java "../CSV/900.csv" "900" " JavaMs merge-sort900
	sudo ../../RAPL/main "java mergeSort.java "../CSV/1000.csv" "1000" " JavaMs merge-sort1000

measureTest:
	sudo ../../RAPL/main "java mergeSort.java "../CSV/100.csv" "100" " /merge-sort/Test Test100


