compile:
	cp bubblesort.java-7.java bubblesort.java
	javac -d . bubblesort.java

measure:
	sudo modprobe msr
	sudo ../../RAPL/main "java bubblesort.java" Java bubblesortDouble1024

idlemeasure:
	sudo modprobe msr
	sudo ../../RAPL/main "java empty.java" Java idle

runSort:
	java bubblesort.java

runIdle:
	java empty.java


