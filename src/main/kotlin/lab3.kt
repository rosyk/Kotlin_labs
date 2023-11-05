data class User(val name: String, val age: Int)

fun findUsersWithMinAgeByName(users: List<User>): List<User> {
    val nameToMinAgeMap = mutableMapOf<String, Int>()
    for (user in users) {
        val currentMinAge = nameToMinAgeMap[user.name]
        if (currentMinAge == null || user.age < currentMinAge) {
            nameToMinAgeMap[user.name] = user.age
        }
    }
    val result = users.filter { user ->
        user.age == nameToMinAgeMap[user.name]
    }
    return result
}

fun main() {
    val users = listOf(
        User("Alice", 25),
        User("Bob", 30),
        User("Alice", 22),
        User("Bob", 28),
        User("Charlie", 35)
    )

    val result = findUsersWithMinAgeByName(users)
    for (user in result) {
        println("${user.name} - ${user.age} years old")
    }
}
