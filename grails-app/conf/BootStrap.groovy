import grails.converters.JSON
import info.harmia.polyglot.grails.domain.Municipality

class BootStrap {

    def init = { servletContext ->
        // Check whether the test data already exists.
        if (!Municipality.count()) {
            def json = JSON.parse(new FileInputStream("web-app/data/data.json"), "UTF-8")

            json.each() {object ->
                def municipality = new Municipality(name: object.getAt("name"))
                municipality.save()
            }

            //System.out.println JSONBuilder.getResource("classpath:data/data.json").text


            //new Book(author: "Stephen King", title: "The Shining").save(failOnError: true)
            //new Book(author: "James Patterson", title: "Along Came a Spider").save(failOnError: true)
        }
    }
    def destroy = {
    }
}
