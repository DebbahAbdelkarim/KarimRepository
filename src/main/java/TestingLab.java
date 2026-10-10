import com.karimcoding.workoutloggingapp.beans.Exercise;
import org.springframework.ui.Model;

import java.sql.SQLOutput;

void main() {

    record DogRecord (String DogName, int DogNumber){}
    DogRecord dog1 = new DogRecord("spike", 1);

    System.out.println(dog1.hashCode());
    System.out.println(dog1.DogName.hashCode());
    System.out.println(dog1);
}