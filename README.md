# Two Dimentional Bin-Packing
In classical bin packing problem, a list of elements [0,1] are given in some order and the motivation is to place those elements into a minimum number of bins with a constraint that the total size of elements in a bin cannot be more than 1. However, vector packing is another variant of the bin packing problem where items are d-dimensional vectors. The goal is to put these items into a minimum number of d-dimensional bins with constraint of the size of each dimension. Let us consider a sequence of n items σ = < (a1, b1), (a2, b2), (a3, b3), (a4, b4), ……, (an, bn) > which is revealed in online manner where each item is a 2-dimensional vector [0,100]^2. The goal is to pack these items into 2-dimensional bins with minimizing the total number of opened bins. Each bin has a capacity of 100 in each of its d dimensions. In this project, we have done an empirical evaluation of the first-fit algorithm and various heuristics of the best-fit algorithm for online 2-dimensional vector packing with bounded and unbounded space. We compared different variants of the best-fit algorithm and found out the heuristic that works best on average. In the end, we observed the anomalous behaviour of the best-fit algorithm for online vector packing with bounded space.
## Technologies and Design  
Project is created with:
* Core Java
* Java 1.7
* Object-Oriented Design 
## Running the application locally
* Install [JDK 1.7](https://www.oracle.com/ca-en/java/technologies/javase/javase-jdk8-downloads.html)
* Run the MainFrame class from your IDE.
