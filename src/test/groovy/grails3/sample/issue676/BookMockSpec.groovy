package grails3.sample.issue676

import grails.test.mixin.Mock
import grails.test.mixin.TestMixin
import grails.test.mixin.support.GrailsUnitTestMixin
import spock.lang.Specification

@TestMixin(GrailsUnitTestMixin)
@Mock(Book)
class BookMockSpec extends Specification {

    void "Mock doesn't work"() {
        when:
        def book = new Book().save(flush: true)

        then:
        book.dateCreated != null
    }
}
