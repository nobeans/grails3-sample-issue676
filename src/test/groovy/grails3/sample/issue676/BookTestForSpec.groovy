package grails3.sample.issue676

import grails.test.mixin.TestFor
import spock.lang.Specification

@TestFor(Book)
class BookTestForSpec extends Specification {

    void "TestFor works well"() {
        when:
        def book = new Book().save(flush: true)

        then:
        book.dateCreated != null
    }
}
