import example.utils.KafkaConfig
import org.scalatest.FunSuite

class KafkaConfigSpec extends FunSuite {
  val config = new KafkaConfig {}

  test("Consumer config should be read") {
    assert(config.getProperty("group.id") == "test-consumer-group")
    assert(config.getProperty("zookeeper.connect") == "127.0.0.1:2181")
  }

  test("example.producer.Producer config should be read") {
    assert(config.getProperty("metadata.broker.list") == "127.0.0.1:9092")
    assert(config.getProperty("serializer.class") == "kafka.serializer.StringEncoder")
    assert(config.getProperty("partitioner.class") == "example.producer.SimplePartitioner")
    assert(config.getProperty("request.required.acks") == "1")
  }

  test("Missing keys should be null") {
    assert(config.getProperty("some.other.key") == null)
  }
}
