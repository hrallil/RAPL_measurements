compile:
	javac makeData.java

test:
	java makeData.java 100 sorted
	java makeData.java 100 reverseSorted
	java makeData.java 100 random

input:
	make input-sorted
	make input-reverseSorted
	make input-random

input-sorted:
	for number in 25000 50000 75000 100000 200000 300000 400000 500000 600000 700000 800000 900000 1000000; do \
		java makeData.java $$number sorted; \
	done

input-reverseSorted:
	for number in 25000 50000 75000 100000 200000 300000 400000 500000 600000 700000 800000 900000 1000000; do \
		java makeData.java $$number reverseSorted; \
	done

input-random:
	for number in 25000 50000 75000 100000 200000 300000 400000 500000 600000 700000 800000 900000 1000000; do \
		for n in 1 2 3 4 5 6 7 8 9 10; do \
			java makeData.java $$number random $$n; \
		done\
	done

