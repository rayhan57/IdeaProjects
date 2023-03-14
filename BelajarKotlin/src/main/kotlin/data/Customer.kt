package data

open class Customer(val name: String, val gender: String, val status: String) {
    constructor(name: String, gender: String) : this(name, gender, "")
    constructor(name: String) : this(name, "")
}

class VIPCustomer : Customer {
    constructor(name: String) : super(name, "")
    constructor(name: String, status: String) : super(name, "", status)
}