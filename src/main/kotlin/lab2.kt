import java.time.LocalDate

data class Task(val name: String, val executor: String, val deadline: LocalDate)

fun sortTasks(taskList: List<Task>): List<Task> {
    return taskList.sortedBy { it.deadline }
}

fun main() {
    val englishTask = Task("Present Simple", "John", LocalDate.of(2023, 10, 30))
    val mathTask = Task("Extremum", "Mary", LocalDate.of(2023, 10,28))
    val literatureTask = Task("Hamlet", "Garry", LocalDate.of(2023, 11, 7))

    val taskList = listOf(englishTask, mathTask, literatureTask)

    for (task in sortTasks(taskList)) {
        println(task)
    }
}