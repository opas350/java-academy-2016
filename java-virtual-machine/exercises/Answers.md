# In your own words what is the JVM?</br>
It's an enviroment that as an abstraction layer between the target device and the bytecode. </br>
This makes possible to use the same code across multiple devices.

# What about JIT? What is it?
Just in time compilation that can compile a part of the bytecode into native code, </br>
this helps the execution of the program by compiling some resource intensive parts or </br>
portions of code that are called frequently.

# How can you execute GC?
The garbage collector executes automatically, some options are avalible to modify the </br>
behavior of the GC. The GC can also be called by System.gc()

# What are the downsides of GC?
The fact that is an automated process makes difficult to have control over the resources the </br>
program uses, this could cause the GC to impact the performance by creating and eliminating objects. </br>
Understand how the GC works is important to write programs that take advange on the automated process.

# In few words what can you say about the heap space?
The memory space that is reserved for the execution of the java application by the JVM.

# What about PermGen? How to increase?
This memory space contains information of the loaded classes, but the GC doesn't collect as often in this </br>
memory space. To avoid the over-fill or "java.lang.OutOfMemoryError" the memory size can be extende by </br>
java -XX:MaxPermSize.

# How to increase Java heap?
To increase the size the command -Xmx can be used.

# Explain Hotspot Heap structure
<h1> * Young Generation</h1>
<h3>	  * Eden space</h3>
<h3>	  * Survivor space (S0 & S1)</h3>
<h1> * Old Generation</h1>
<h1> * Permanent Generation</h1>

# Give two scenarios where you can get an OutOfMemoryError error
As discussed previously there are two main memory spaces: Heap and PermGen
* Out of Heap memory space: can occur when trying to run an application that consumes more  </br>
memory than what is configured. </br>
* Out of permGen memory space: can occur when there are too many classes or the classes are too big </br>
for the allocated space.

# How can VM technology be beneficial for slow programs? 
The JVM gives options to configure the environment in order to optimize it when necessary, </br>
also as previously mentioned understanding the GC and its options can help the developer to </br>
make a better use of it, lastly the JIT can offer a good alternative to reduce the workload caused by the </br>
bytecode and using a compiled code that runs natively in the device.

