import spock.lang.Shared
import spock.lang.Specification
import spock.lang.Stepwise
import app.Addition;

@Stepwise
class HelloSpockSpec extends Specification {

    @Shared
    Addition add = new Addition()

    def setupSpec() {
        reportInfo "create test data"
    }

    def cleanupSpec() {
        reportInfo "clean test data"

    }

    def "length of Spock's and his friends' names"() {
        given: "xx"

        expect:
        add.add(a, b) == result

        where:
        a   | b   | result
        1   | 5   | 6
        10  | 50  | 60
        100 | 500 | 600

    }


}
