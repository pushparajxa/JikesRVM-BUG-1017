#########################Virtual Execution Project#####################################
##
##########################Fix for the RVM-1017 BUG################################

1.The fix for the Optimized Compiler can be obtained by patching the  optDiff.patch available in patches folder.



2.The fix for the BaseLine Compiler can be obtained by patching the  basLine.patch available in patches folder.



3.To run a class file ,with optimized compiler use the command <BASE_DIR>/dist/development_ia32-linux/rvm  -X:aos:initial_compiler=opt <class_name>



4.To run a class file,with baseline compiler use the command <BASE_DIR>/dist/prototype_ia32-linux/rvm <class_name>



5. The dropBox link for the code is https://www.dropbox.com/sh/o2my2853z2abum5/eXxEaLldfH