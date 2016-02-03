import org.scalatest._
import SizeHandlers._

class FirstTest extends FlatSpec {
  it should "return size of 25 Bytes" in {
    val n = 8
    val fields = (n+2)*(n+2)
    val fieldsPerByte = 4
    val req = SizeHandlers.bytesRequired(fields, fieldsPerByte)
    assert(req===25)
  }

}

