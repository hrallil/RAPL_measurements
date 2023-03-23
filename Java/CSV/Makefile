test:
	java makeData.java 100 sorted
	java makeData.java 100 reverseSorted
	java makeData.java 100 random
	java makeData.java 100 partialSorted

input:
	input-R

input-R:
	for number in 25000 50000 75000 100000 200000 300000 400000 500000 600000 700000 800000 900000 1000000; do \
		java makedata.java $$number ; \
	done


bin:
	java makeData.java 25000
	java makeData.java 50000
	java makeData.java 75000
	java makeData.java 100000
	java makeData.java 200000
	java makeData.java 300000
	java makeData.java 400000
	java makeData.java 500000
	java makeData.java 600000
	java makeData.java 700000
	java makeData.java 800000
	java makeData.java 900000
	java makeData.java 1000000

