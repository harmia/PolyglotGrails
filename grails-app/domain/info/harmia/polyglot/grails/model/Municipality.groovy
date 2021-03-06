package info.harmia.polyglot.grails.model

import grails.validation.Validateable

@Validateable
class Municipality {
    String name

    static constraints = {
        name blank: false, minSize: 1, maxSize: 255
    }
}
