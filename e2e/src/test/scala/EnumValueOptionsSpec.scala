import com.thesamet.proto.e2e.enum_value_options._
import org.scalatest._
import org.scalatest.flatspec.AnyFlatSpec
import org.scalatest.matchers.must.Matchers
import scalapb.GeneratedEnumCompanion

class EnumValueOptionsSpec extends AnyFlatSpec with Matchers with OptionValues {
  "enum values" should "have fields for options" in {
    EnumValueOptions.UNSET.boolOption must be(false)
  }
}
