# JVM Versions
### 32 bit
+ Might be faster if heap < 3GB
+ Max heap size = 4GB
+ Client compiler only
+ 
### 64 bit
+ Might be faster if using long/double
+ Necessary if heap > 4GB
+ Max heap size - OS dependent
+ Client & server compiler

# VM Options:
## Compilation Logs
+ -XX:+PrintCompilation

By default, JIT compilation logs are disabled. To enable them, we can **set the -XX:+PrintCompilation** flag. The compilation logs are formatted as:

+ Timestamp – In milliseconds since application start-up
+ Compile ID – Incremental ID for each compiled method
+ Attributes – The state of the compilation with five possible values:
  - % – On-stack replacement occurred
  - s – The method is synchronized
  - ! – The method contains an exception handler
  - b – Compilation occurred in blocking mode
  - n – Compilation transformed a wrapper to a native method

#### Compilation Levels – Between 0 and 4
- Level 0 – Interpreted Code
- Level 1 – Simple C1 Compiled Code
- Level 2 – Limited C1 Compiled Code
- Level 3 – Full C1 Compiled Code
- Level 4 – C2 Compiled Code

+ Method name
+ Bytecode size
+ Deoptimisation indicator – With two possible values:
  - Made not entrant: Standard C1 deoptimization or the compiler’s optimistic assumptions proven wrong
  - Made zombie: A cleanup mechanism for the garbage collector to free space from the code cache

#### Other commands:
+ -XX:+UnlockDiagnosticVMOptions
+ -XX:+LogCompilation

#### Code Cache has a space assigned:
+ -XX:+PrintCodeCache
1. -XX:InitialCodeCacheSize=1126kb
2. -XX:ReservedCodeCacheSize=28m
3. CodeCacheExpansionSize

VM WARNING: CodeCache is full. Compiler has been disabled.

k: kilobytes
m: megabytes
g: gigabytes

uppercase or lowercase are accepted.
default cache often around  about 160kB.