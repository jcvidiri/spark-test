
  val text = sc.textFile("hdfs://localhost:9000/jcvidiri/text.txt")
          // sc.textFile("text.txt");
  val counts = text.flatMap(line => line.split(" ")).map(word => (word,1)).reduceByKey(_+_);
  counts.collect;
  counts.saveAsTextFile("outputFile");
  // conts.saveAsTextFile("hdfs://localhost:9000/jcvidiri/outputFile")

  System.exit(0);
