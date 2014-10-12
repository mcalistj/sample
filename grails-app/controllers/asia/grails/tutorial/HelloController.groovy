package asia.grails.tutorial

class Person {
	String firstName
	String lastName
	int age
}

class HelloController {
	def index() {
		Person person = new Person(firstName: 'John', lastName:'Doe', age:55)
		person.firstName = 'Harry'
		[ person:person ]
	}

}
