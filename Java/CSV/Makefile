compile:
	javac makeData.java

test:
	java makeData.java 100 sorted 0
	java makeData.java 100 reverseSorted 0
	java makeData.java 100 random 0

input:
	make input-sorted
	make input-reverseSorted
	make input-random
	make input-test
	make input-countingWorst
	make input-countingBest

input-countingBest:
	for number in 25000 50000 75000 100000 200000 300000 400000 500000 600000 700000 800000 900000 1000000; do 	\
		java makeData.java $$number countingBest 0; 															\
	done

input-mergeWorst:
	for number in 25000 50000 75000 100000 200000 300000 400000 500000 600000 700000 800000 900000 1000000; do 	\
		java makeData.java $$number mergeWorst 0; 															\
	done


input-countingWorst:
	for number in 25000 50000 75000 100000 200000 300000 400000 500000 600000 700000 800000 900000 1000000; do 	\
		java makeData.java $$number countingWorst 0; 															\
	done

input-test:
	java makeData.java 100 test 0;

input-sorted:
	for number in 25000 50000 75000 100000 200000 300000 400000 500000 600000 700000 800000 900000 1000000; do 	\
		java makeData.java $$number sorted 0; 																	\
	done

input-reverseSorted:
	for number in 25000 50000 75000 100000 200000 300000 400000 500000 600000 700000 800000 900000 1000000; do 	\
		java makeData.java $$number reverseSorted 0; 															\
	done

input-random:
	for number in 25000 50000 75000 100000 200000 300000 400000 500000 600000 700000 800000 900000 1000000; do  \
		for n in 1 2 3 4 5 6 7 8 9 10; do 																		\
			java makeData.java $$number random $$n; 															\
		done 																									\
	done

input-quickBest:
	for number in 25000 50000 75000 100000 200000 300000 400000 500000 600000 700000 800000 900000 1000000; do  \
		java makeData.java $$number quickBest 0; 															\
	done
