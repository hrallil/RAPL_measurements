run:
	java bubblesort.java

test:
	sudo modprobe msr
	sudo ../../RAPL/main "java bubblesort.java "../CSV/data/100.csv" "100" " /bubblesort/results/test bubblesort100

measure:
	sudo modprobe msr
	sudo ../../RAPL/main "java bubblesort.java"../CSV/data/25000.csv" "25000" " bubblesort bubblesort25000
	sudo ../../RAPL/main "java bubblesort.java "../CSV/data/50000.csv" "50000" " bubblesort bubblesort50000
	sudo ../../RAPL/main "java bubblesort.java "../CSV/data/75000.csv" "75000" " bubblesort bubblesort75000
	sudo ../../RAPL/main "java bubblesort.java "../CSV/data/100000.csv" "100000" " bubblesort bubblesort100000
	sudo ../../RAPL/main "java bubblesort.java "../CSV/data/100000.csv" "200000" " bubblesort bubblesort200000
	sudo ../../RAPL/main "java bubblesort.java "../CSV/data/100000.csv" "300000" " bubblesort bubblesort300000
	sudo ../../RAPL/main "java bubblesort.java "../CSV/data/100000.csv" "400000" " bubblesort bubblesort400000
	sudo ../../RAPL/main "java bubblesort.java "../CSV/data/500000.csv" "500000" " bubblesort bubblesort500000
	sudo ../../RAPL/main "java bubblesort.java "../CSV/data/600000.csv" "600000" " bubblesort bubblesort600000
	sudo ../../RAPL/main "java bubblesort.java "../CSV/data/700000.csv" "700000" " bubblesort bubblesort700000
	sudo ../../RAPL/main "java bubblesort.java "../CSV/data/800000.csv" "800000" " bubblesort bubblesort800000
	sudo ../../RAPL/main "java bubblesort.java "../CSV/data/900000.csv" "900000" " bubblesort bubblesort900000
	sudo ../../RAPL/main "java bubblesort.java "../CSV/data/1000000.csv" "1000000" " bubblesort bubblesort1000000

