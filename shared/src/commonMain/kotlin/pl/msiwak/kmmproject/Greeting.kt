package pl.msiwak.kmmproject

class Greeting {
    fun greeting(): String {
        return "Hello, ${Platform().platform}!"
    }
}