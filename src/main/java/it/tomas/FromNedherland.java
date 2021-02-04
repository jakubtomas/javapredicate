package it.tomas;


import java.util.function.Predicate;

public class FromNedherland<T> implements Predicate<City> {
// potrebujem implementovat predicat

    // metoda test testuje hodnotu ktorej pride parameter
    //primate parameter City
    @Override
    public boolean test(City city) {

        // podmienkah holandsko
        return city.getCode().equals("NLD");
//        return false;
    }

    @Override
    public Predicate<City> and(Predicate<? super City> other) {
        return null;
    }

    @Override
    public Predicate<City> negate() {
        return null;
    }

    @Override
    public Predicate<City> or(Predicate<? super City> other) {
        return null;
    }
}
