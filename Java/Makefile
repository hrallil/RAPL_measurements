runAll:
	#$(MAKE) -C JavaSort run
	$(MAKE) -C Bubblesort run
	$(MAKE) -C QuickSort run
	$(MAKE) -C Mergesort run
	$(MAKE) -C CountingSort run
	$(MAKE) -C Idle run

measureAll:
	sudo ifconfig wlp4s0 down
	sudo modprobe msr
	$(MAKE) -C Mergesort measure
	#$(MAKE) -C JavaSort measure
	$(MAKE) -C CountingSort measure
	$(MAKE) -C Bubblesort measure
	$(MAKE) -C QuickSort measure
	$(MAKE) -C Idle measure
	sudo ifconfig wlp4s0 up
