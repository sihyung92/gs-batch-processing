package com.example.batchprocessing;


import java.util.Locale;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.batch.item.ItemProcessor;

public class PersonItemProcessor implements ItemProcessor<PersonDto, Person> {

    private static final Logger log = LoggerFactory.getLogger(PersonItemProcessor.class);

    @Override
    public Person process(PersonDto person){
        final String lastName = person.getLastName().toUpperCase(Locale.ROOT);
        final String firstName = person.getFirstName().toUpperCase(Locale.ROOT);

        final Person upperCaseNamePerson = new Person(null, firstName, lastName);

        log.info(String.format("Converting (%s) into (%s)", person, upperCaseNamePerson));

        return upperCaseNamePerson;
    }
}
