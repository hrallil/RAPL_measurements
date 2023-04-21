main : main.c rapl.o
	gcc -O2 -Wall -o main main.c rapl.o -lm
	sudo chown root:root main
	# mark the main as setuserid root, so it will run with root permissions
	sudo chmod u+s main 
	
	# chmod 777 main

rapl.o : rapl.c rapl.h
	gcc -O2 -Wall -c rapl.c  -lm

clean:
	rm -rf main.o rapl.o

recompile:
	make clean
	make rapl.o
	make main
