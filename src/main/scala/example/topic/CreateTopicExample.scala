package example.topic

import scala.util.Random
import example.topic.ZookeeperUtils._

object CreateTopicExample {
  def main(args: Array[String]): Unit = {
    val topicName = "jsonTopic"

    println(s"Creating topic with name: $topicName")
    val zookeeperClient = createClient()
    TopicAdmin(zookeeperClient).createTopic("page_visits")
    println(s"Created topic $topicName")
  }
}