from runtime import Runtime
from PageInterfaceModule import PageInterface
from file import File
from time import Time 


type Params {
    location:string
    root:string
    contentDir:string
    servicesDir:string
    defaultPage:string
}

service Main( params:Params ) {
	embed Runtime as Runtime
	embed File as File
	embed Time as Time 


	define operations {
		document += "\n"
document += "\n<!DOCTYPE html>\n<html>\n\t<head>\n\t\t<link rel=\"stylesheet\" type=\"text/css\" href=\"style.css\" />\n\t</head>\n\t<body>\n\t\t<!-- Testing comment... -->\n\t\t\n\t\t"
getCurrentDateTime@Time()(time)
document += "\n\t\t<h1>Welcome, "
document += users.name
document += "</h1>\n\n\t\t"
a=7
document += "\n\t\t"
b=3
document += "\n\t\t<h1>"
document += a
document += " + "
document += b
document += " = "
document += a+b
document += "</h1>\n\t\t<h1>"
document += a
document += " / "
document += b
document += " = "
document += a/b
document += "</h1>\n\t\t<h1>"
document += a
document += " * "
document += b
document += " = "
document += a*b
document += "</h1>\n\t\t<h1>"
document += a
document += " - "
document += b
document += " = "
document += a-b
document += "</h1>\n\n\t\t<p>The time is: "
document += time
document += "</p>\n\t</body>\n</html>"

	}

	execution { single }

	inputPort Local {
		location: "local"
		interfaces: PageInterface
	}

	outputPort Page {
		interfaces: PageInterface
	}

	init {
		getLocalLocation@Runtime()(Page.location)
		document = ""
	}

	main {
		getDocument(request)(response) {

			readFile@File( {filename = params.root + "data/users.json", format = "json"} )( users ) 


			operations
			response = document
		}
	}
}