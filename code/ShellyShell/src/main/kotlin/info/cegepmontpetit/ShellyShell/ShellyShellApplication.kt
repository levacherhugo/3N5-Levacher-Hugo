package info.cegepmontpetit.ShellyShell

import org.springframework.boot.autoconfigure.SpringBootApplication
import org.springframework.boot.runApplication
import org.springframework.shell.standard.ShellComponent
import org.springframework.shell.standard.ShellMethod
import org.springframework.shell.standard.ShellOption

@SpringBootApplication
@ShellComponent
class ShellyShellApplication{
	@ShellMethod(key = ["hello-world"], value = "Prints hello world")
	fun helloWorld(@ShellOption(defaultValue = "spring") arg: String): String {
		return "Hello world $arg"
	}
	@ShellMethod(key = ["hi"], value = "Prints hi")
	fun hi(): String {
		return "hi"
	}
}



fun main(args: Array<String>) {
	runApplication<ShellyShellApplication>(*args)
}
