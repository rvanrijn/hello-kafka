package example.producer

object ProducerExample {
  def main(args: Array[String]): Unit = {
    val topicName =
      if(args.length == 0) "jsonTopic"
      else args(0)

    val strProducer = Producer[String](topicName)

    for (ln <- io.Source.stdin.getLines) strProducer.send("testA")
  }
}
