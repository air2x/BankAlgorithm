package ru.maxima.bankalgorithm.models;

import jakarta.xml.bind.annotation.XmlRootElement;
import lombok.Getter;
import lombok.Setter;

import java.util.List;

@XmlRootElement
@Getter
@Setter
public class Bank {

    private Double wallet;
    private List<Person> persons;
}
