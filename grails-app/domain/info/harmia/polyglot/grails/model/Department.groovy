package info.harmia.polyglot.grails.model

import grails.validation.Validateable

@Validateable
class Department {
    String name
    List employees

    static hasMany = [employees: Employee]

    static mapping = {
        employees lazy: false
    }

    static constraints = {
        name blank: false, minSize: 1, maxSize: 255
        employees nullable: true
    }
}
