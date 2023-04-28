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
	$(MAKE) -C CountingSort worstMeasure
	$(MAKE) -C Mergesort worstMeasure
	$(MAKE) -C ReadCSV measure
	$(MAKE) -C QuickSort worstMeasure
	$(MAKE) -C QuickSort bestMeasure
	$(MAKE) -C Bubblesort bestMeasure
	$(MAKE) -C Bubblesort worstMeasure
	# $(MAKE) -C JavaSort measure
	sudo ifconfig wlp4s0 up
