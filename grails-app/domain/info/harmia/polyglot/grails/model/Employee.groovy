package info.harmia.polyglot.grails.model

import grails.validation.Validateable
import org.joda.time.LocalDate

@Validateable
class Employee {
    String firstName
    String lastName
    String email
    LocalDate contractBeginDate
    static belongsTo = [
            department: Department,
            municipality: Municipality
    ]

    static mapping = {
        department lazy: false
        municipality lazy: false
    }

    // By default, all domain class properties are not nullable (i.e. they have an implicit nullable: false constraint).
    static constraints = {
        firstName blank: false, minSize: 1, maxSize: 255
        lastName blank: false, minSize: 1, maxSize: 255
        email blank: false, minSize: 1, maxSize: 255, email: true
    }
}