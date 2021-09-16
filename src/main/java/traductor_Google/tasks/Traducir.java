package traductor_Google.tasks;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.Tasks;
import net.serenitybdd.screenplay.actions.Enter;
import net.serenitybdd.screenplay.waits.WaitUntil;
import traductor_Google.model.GoogleTraslateData;
import traductor_Google.userinterface.traductorGoogleText;

import java.util.List;

import static net.serenitybdd.screenplay.matchers.WebElementStateMatchers.isVisible;

public class Traducir implements Task {
    List<GoogleTraslateData> GoogletraslateData;
    public Traducir(List<GoogleTraslateData> googletraslateData) {
        this.GoogletraslateData = googletraslateData;
    }
    public static Traducir DeInglesAEspanol(List<GoogleTraslateData> googletraslateData) {
        return Tasks.instrumented(Traducir.class, googletraslateData);
    }

    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(
                Enter.theValue(GoogletraslateData.get(1).getPalabrai()).into(traductorGoogleText.INPUT_TEXT)
        );
        try {
            Thread.sleep (2000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}
