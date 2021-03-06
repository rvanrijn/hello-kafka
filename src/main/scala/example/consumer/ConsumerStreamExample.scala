package example.consumer

object ConsumerStreamExample {
  def main(args: Array[String]): Unit = {
    val topicNames = if(args.length == 0) {
      "TutorialTopic"
    } else {
      args.head
    }

    val consumer = SingleTopicConsumer(topicNames)

    consumer.read().foreach(println)
  }
}
