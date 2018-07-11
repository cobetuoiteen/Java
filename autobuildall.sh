#!/bin/bash

JAVAC=`which javac`
$JAVAC `ls | grep .java`
mkdir bin
mv *.class bin/
