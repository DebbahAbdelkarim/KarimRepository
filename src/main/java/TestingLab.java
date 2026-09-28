import com.karimcoding.workoutloggingapp.beans.Exercise;
import org.springframework.ui.Model;

void main() {
    System.out.println("hello");
    Model model;

    List<Person> persons = new ArrayList<>();

    persons.add(new Person("Alice", 43));
    persons.add(new Person("John", 54));
    persons.add(new Person("Mark", 34));
    persons.add(new Person("Elizabeth", 65));
    persons.add(new Person("Alfred", 12));
    persons.add(new Person("Clark", 51));
    persons.add(new Person("Ashley", 23));
    persons.add(new Person("Brenda", 16));
    persons.add(new Person("Mathew", 65));
    persons.add(new Person("Chris", 32));
    persons.add(new Person("Sven", 22));

    persons.stream();
}