package grailsdefaultconstraint

class DomainB {

    String name

    String someOther

    static belongsTo = [domainB: DomainB]

    static constraints = {
        name nullable: false, blank: false, unique: "domainB"
        someOther nullable: false, blank: false, unique: true
    }
}
