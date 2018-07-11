#!/bin/bash

JAVAC=`which javac`
$JAVAC `ls | grep .java`
