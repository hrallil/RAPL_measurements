# Energy Efficiency in Programming Languages using RAPL
#### Checking Energy Consumption in Programming Languages Using the _Computer Language Benchmark Game_ as a case study.

### What is this?

This repo contains the source code of 4 distinct benchmarks implimented in Java.

It also contains tools which provide support, for each benchmark of each language, to 4 operations: *(1)* **run**, *(2)* **test**, *(3)* **measure** and *(4)* **memory peak detection**.

### How is it structured and hows does it work?

This framework follows a specific folder structure, which guarantees the correct workflow when the goal is to perform and operation for all benchmarks at once.
Moreover, it must be defined, for each benchmark, how to perform the 4 operations considered.

Next, we explain the folder structure and how to specify, for each language benchmark, the execution of each operation.

#### The Structure
The main folder contains 3 elements: 
1. A `java` subfolder; which contains a sub-folder for each considered benchmark (namely java.util.Arrays.sort(), Quicksort, Mergesort, Bubblesort) and data analysis tools.
2. A `Python` script `compile_all.py`, capable of building, running and measuring the energy and memory usage of every benchmark in all considered languages.
3. A `RAPL` sub-folder, containing the code of the energy measurement framework.

Basically, the directories tree will look something like this:

```Java
| Java
	| <benchmark-1>
		| <source>
		| Makefile
		| [input]
	| ...
	| <benchmark-i>
		| <source>
		| Makefile
		| [input]
	
	| <dataMaster>
		| DataProcessing.ipynb
		| main.py
	| <CSV>
		| <data>
		| Makefile
		| makedata.java

| RAPL
	| main.c
	| main*
	| Makefile
	| rapl.c
	| rapl.o
	| rapl.h
| compile_all.py
| gen-input.sh

```




#### The Operations

Each benchmark sub-folder containing an algorithm a `Makefile` can be found.
This is the file where is stated how to perform the 3 supported operations: *(1)* **run**, *(2)* **test**, *(3)* **measure** and (4)**mem**. 
Basically, each `Makefile` **must** contains 3 rules, one for each operations:

| Rule | Description |
| -------- | -------- |
| `run` | This rule specifies how the algorithm should be executed; It is used to test whether the algorithm runs with no errors. |
| `test` | This rule specifies how the benchmark should be executed; It is used to test whether the benchmark of the algorithm runs with no errors, and gives an expected output into a csv file. |
| `measure` | This rule shows how to use the framework included in the `RAPL` folder to measure the energy of executing the task specified in the `run` rule. With possibly varying  inputs. |
| `mem` | Similar to `measure`, this rule executes the task specified in the `run` rule but with support for memory peak detection. |

To better understand it, here's the `Makefile` for the `Quicksort` benchmark:

```Makefile
run:
	java QuickSort.java  "../CSV/data/100.csv" "100"

testMeasure: 
	sudo modprobe msr
	sudo ../../RAPL/main "java QuickSort.java "../CSV/data/100.csv" "100" " test Quicksort

measure: 
	sudo modprobe msr
	sudo ../../RAPL/main "java QuickSort.java "../CSV/data/25000.csv" "25000" " quicksort quicksort25000
	^
	...
	v
	sudo ../../RAPL/main "java QuickSort.java "../CSV/data/1000000.csv" "1000000" " quicksort quicksort1000000


```

### Running an example.

*First things first:* We must give sudo access to the energy registers for RAPL to access
```
sudo modprobe msr
```
and then generate the input files, with the makefile in the <CSV> directory.

```PowerShell
make data
```
This will generate the necessary input files and save the values in CSV files which will later be read by the algorithms.

We included a main Python script, `compile_all.py`, that you can either call from the main folder or from inside a language folder, and it can be executed as follows:

```PowerShell
python compile_all.py [rule]
```

You can provide a rule from the available 4 referenced before, and the script will perform it using **every** `Makefile` found in the same folder level and bellow.

The default rule is `compile`, which means that if you run it with no arguments provided (`python compile_all.py`) the script will try to compile all benchmarks.

The results of the energy measurements will be stored in files with the name `<algorithm>.csv`, where `<algorithm>` is the name of the running algorithm. 
You will find such file inside of corresponding algorithm folder.

You can also run each algorithm individually by calling the following line in any algorithm folder.

```PowerShell
make measure
```

Each <algorithm>.csv will contain a line with the following: 

```benchmark-name ; PKG (Joules) ; CPU (J) ; GPU (J) ; DRAM (J) ; Time (ms)```

Do note that the availability of GPU/DRAM measurements depend on your machine's architecture. These are requirements from RAPL itself.

### Add your own example!
#### Wanna know your own code's energy behavior? We can help you!
#### Follow this steps:

##### 1. Create a folder with the name of you benchmark, such as `test-benchmark`, in the <Java> folder.

##### 2. Follow the instructions presented in the [Operations](#the-operations) section, and fill the `Makefile`.

##### 3. Use the [`make measure`] to measure its energy consumption! Or run it yourself using the [`make run`] command.

### Further Reading
Wanna know more? Check [this website](TBA)!

There you will find our paper which will include the results of a successful experimental setup using the contents of this repo, and the used machine, compilers specifications, discussions regarding the our results, and more.

#### IMPORTANT NOTE:
The `Makefiles` have specified, for some cases, the path for the language's compiler/runner. 
It is likely that you will not have them in the same path of your machine.
If you would like to properly test every benchmark of every language, please make sure you have all compilers/runners installed, and adapt the `Makefiles` accordingly.

### Contacts and References

[ROSKILDE university ](https://ruc.dk)

Supervisor of bachelor project: [@mhkirkeby](http://github.com/mhkirkeby)

Main contributors: [@Hrallil](http://github.com/Hrallil, mamaar@ruc.dk), [@gho8888](http://github.com/gho8888, smgho@ruc.dk), [@k2carter2341](http://github.com/k2carter2341, kcarter@ruc.dk) and [@SundmanDK](http://github.com/sundmanDK, sundman@ruc.dk)


[The Computer Language Benchmark Game](https://benchmarksgame-team.pages.debian.net/benchmarksgame/)

