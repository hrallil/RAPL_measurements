compile:
	javac makeData.java

test:
	java makeData.java 100 sorted
	java makeData.java 100 reverseSorted
	java makeData.java 100 random
	java makeData.java 100 partialSorted

input:
	make input-sorted
	make input-partialSorted
	make input-reverseSorted
	make input-random

input-sorted:
	for number in 25000 50000 75000 100000 200000 300000 400000 500000 600000 700000 800000 900000 1000000; do \
		java makedata.java $$number sorted; \
	done

input-partialSorted:
	for number in 25000 50000 75000 100000 200000 300000 400000 500000 600000 700000 800000 900000 1000000; do \
		java makedata.java $$number partialSorted; \
	done

input-reverseSorted:
	for number in 25000 50000 75000 100000 200000 300000 400000 500000 600000 700000 800000 900000 1000000; do \
		java makedata.java $$number reverseSorted; \
	done

input-random:
	for number in 25000 50000 75000 100000 200000 300000 400000 500000 600000 700000 800000 900000 1000000; do \
		java makedata.java $$number random; \
	done

