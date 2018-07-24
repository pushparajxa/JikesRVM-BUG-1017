Synchronized method performs implicit lock and unlock of the 'this' object. At method entry, Jikes fetches the 'this' 
reference from local variable 0 and acquire a lock on that object. Before each return instruction, Jikes fetches the reference from 
local variable 0 again, and release the lock on that object.
 
 Although at method entry, the 'this' reference is always located in local variable 0 (see [1]), it is wrong to expect the 'this' reference 
 to be still available in variable 0 when the method is about to return.
 
 The Java VM Spec does not forbid the java compiler to reuse the variable 0 to store other references than 'this' (see [2]). 
 Moreover the Spec states "Note that the monitor entry and exit automatically performed by the Java virtual machine when invoking 
 a synchronized method are considered to occur during the calling method's invocation." (see [3]).
 
 The issue have been discovered and discussed before because Soot is producing bytecode that reuse variable 0 (see [4],[5]). 
 Note that the OpenJDK is able to handle such bytecode correctly.
 
 [1] http://docs.oracle.com/javase/specs/jvms/se7/html/jvms-2.html#jvms-2.6.1
 [2] http://docs.oracle.com/javase/specs/jvms/se7/html/jvms-3.html#jvms-3.2
 [3] http://docs.oracle.com/javase/specs/jvms/se7/html/jvms-2.html#jvms-2.11.10
 [4] http://old.nabble.com/-rvm-research--Biased-unlocking-exception-when-using-soot-generated-classes-tt27772333.html#a27772333
 [5] http://www.sable.mcgill.ca/pipermail/soot-list/2010-July/003145.html
 
 http://jira.codehaus.org/browse/RVM-1017


1.The fix for the Optimized Compiler can be obtained by patching the  optDiff.patch available in patches folder.



2.The fix for the BaseLine Compiler can be obtained by patching the  basLine.patch available in patches folder.



3.To run a class file ,with optimized compiler use the command <BASE_DIR>/dist/development_ia32-linux/rvm  -X:aos:initial_compiler=opt <class_name>



4.To run a class file,with baseline compiler use the command <BASE_DIR>/dist/prototype_ia32-linux/rvm <class_name>



5. The dropBox link for the code is https://www.dropbox.com/sh/o2my2853z2abum5/eXxEaLldfH
