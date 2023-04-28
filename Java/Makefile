runAll:
	#$(MAKE) -C JavaSort run
	$(MAKE) -C Bubblesort run
	$(MAKE) -C QuickSort run
	$(MAKE) -C Mergesort run
	$(MAKE) -C CountingSort run
	$(MAKE) -C ReadCSV run

measureAll:
	sudo ifconfig wlp4s0 down
	sudo modprobe msr
	$(MAKE) -C CountingSort measure
	$(MAKE) -C Mergesort measure
	$(MAKE) -C ReadCSV measure
	$(MAKE) -C QuickSort measure
	$(MAKE) -C Bubblesort measure
	#$(MAKE) -C JavaSort measure
	sudo ifconfig wlp4s0 up
