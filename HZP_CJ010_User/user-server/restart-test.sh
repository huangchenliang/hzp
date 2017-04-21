#!/bin/bash
#pname=$1
pname=com.hzp.user-server-1.0.1-RELEASE.jar
puser=root

 
pid=`ps aux | grep $pname | grep $puser | grep -v grep | awk '{print $2}'`
 
if [[ -z $pid ]]; then
    echo "I can NOT find $pname running by $puser"
fi
 
kill -9 $pid >/dev/null 2>&1
exec java -server -Xverify:none -XX:+UseParallelGC -jar $pname --spring.profiles.active=test >server.log 2>&1 &
tail -f server.log
