package com.IanFlanagan.apps.tipcalculatorapp;


import com.rollbar.api.payload.data.Person;
import com.rollbar.notifier.provider.Provider;

public class MyPersonProvider implements Provider<Person> {

    // @Override
    public Person provide() {

        return new Person.Builder().id("123").email("ian.flanagan@rollbar.com").username("ianianf").build();
    }
}