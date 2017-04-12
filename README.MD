## SIMPLE SPARK WORDCOUNT
After installing Hadoop (Pseudo-Distributed), Scala & Spark we can proceed with the following

```
  $ ssh localhost
```
Format the filesystem:
```
  $ bin/hdfs namenode -format
```
Start NameNode daemon and DataNode daemon:
```
  $ sbin/start-dfs.sh
```
Browse the web interface for the NameNode; by default it is available at:
```
  NameNode - http://localhost:50070/
```
Make the HDFS directories required to execute MapReduce jobs:
```
  $ bin/hdfs dfs -mkdir /jcvidiri
```
Copy files into the HDFS directory
```
  $ bin/hdfs dfs -put /home/jcv/Desktop/SPARK/text.txt jcvidiri/
```
See the files in the HDFS directory
```
  $ bin/hdfs dfs -ls /
```
With HDFS running on localhost:9000, we can now run a simple wordcount:
 ```
   $ spark-shell -i wc2.scala
 ```
