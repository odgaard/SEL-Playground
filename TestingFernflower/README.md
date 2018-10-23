## Purpose
Showcase that some information is lost from pure Java code when decompiling, and there is no way to trace the execution of JNI calls (in this case to the C hello world program)
Related to a research topic on dynamic slicing.

### Compiling the source code
set your JAVA_HOME env var
Change to the directory of the c files
```
gcc -fPIC -I"$JAVA_HOME/include" -I"$JAVA_HOME/include/linux" -shared -o libhello.so HelloWorldImpl.c
```

### Run the compiled code
Use the same shell and directory as when you compiled and run
```
java -Djava.library.path=. com.company.Main
```

### Decompilation
Just use the built-in Fernflower decompiler in the IntelliJ IDEA. It should automatically decompile the .class file when you try to the open the file.
