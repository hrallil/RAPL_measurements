run:
	java JavaSort.java "../CSV/data/100.csv" 100

test: 
	sudo modprobe msr
	sudo ../../RAPL/main "java JavaSort.java "../CSV/data/100.csv" "100" " test JavaSort

measure: 
	sudo modprobe msr
	sudo ../../RAPL/main "java JavaSort.java "../CSV/data/10000.csv" "25000" " /JavaSort/results/JavaSort JavaSort25000
	sudo ../../RAPL/main "java JavaSort.java "../CSV/data/20000.csv" "50000" " /JavaSort/results/JavaSort JavaSort50000
	sudo ../../RAPL/main "java JavaSort.java "../CSV/data/30000.csv" "75000" " /JavaSort/results/JavaSort JavaSort75000
	sudo ../../RAPL/main "java JavaSort.java "../CSV/data/40000.csv" "100000" " /JavaSort/results/JavaSort JavaSort100000
	sudo ../../RAPL/main "java JavaSort.java "../CSV/data/40000.csv" "200000" " /JavaSort/results/JavaSort JavaSort200000
	sudo ../../RAPL/main "java JavaSort.java "../CSV/data/40000.csv" "300000" " /JavaSort/results/JavaSort JavaSort300000
	sudo ../../RAPL/main "java JavaSort.java "../CSV/data/40000.csv" "400000" " /JavaSort/results/JavaSort JavaSort400000
	sudo ../../RAPL/main "java JavaSort.java "../CSV/data/50000.csv" "500000" " /JavaSort/results/JavaSort JavaSort500000
	sudo ../../RAPL/main "java JavaSort.java "../CSV/data/60000.csv" "600000" " /JavaSort/results/JavaSort JavaSort600000
	sudo ../../RAPL/main "java JavaSort.java "../CSV/data/70000.csv" "700000" " /JavaSort/results/JavaSort JavaSort700000
	sudo ../../RAPL/main "java JavaSort.java "../CSV/data/80000.csv" "800000" " /JavaSort/results/JavaSort JavaSort800000
	sudo ../../RAPL/main "java JavaSort.java "../CSV/data/90000.csv" "900000" " /JavaSort/results/JavaSort JavaSort900000
	sudo ../../RAPL/main "java JavaSort.java "../CSV/data/100000.csv" "1000000" " /JavaSort/results/JavaSort JavaSort1000000

measurePrelim:
	sudo modprobe msr
	sudo ../../RAPL/main "java JavaSort.java "../CSV/data/10000.csv" "10000" " JavaSortE JavaSort1
	sudo ../../RAPL/main "java JavaSort.java "../CSV/data/20000.csv" "20000" " JavaSortE JavaSort2
	sudo ../../RAPL/main "java JavaSort.java "../CSV/data/30000.csv" "30000" " JavaSortE JavaSort3
	sudo ../../RAPL/main "java JavaSort.java "../CSV/data/40000.csv" "40000" " JavaSortE JavaSort4
	sudo ../../RAPL/main "java JavaSort.java "../CSV/data/50000.csv" "50000" " JavaSortE JavaSort5
	sudo ../../RAPL/main "java JavaSort.java "../CSV/data/60000.csv" "60000" " JavaSortE JavaSort6
	sudo ../../RAPL/main "java JavaSort.java "../CSV/data/70000.csv" "70000" " JavaSortE JavaSort7
	sudo ../../RAPL/main "java JavaSort.java "../CSV/data/80000.csv" "80000" " JavaSortE JavaSort8
	sudo ../../RAPL/main "java JavaSort.java "../CSV/data/90000.csv" "90000" " JavaSortE JavaSort9
	sudo ../../RAPL/main "java JavaSort.java "../CSV/data/100000.csv" "100000" " JavaSortE JavaSort10
