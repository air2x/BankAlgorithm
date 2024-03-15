package ru.maxima.bankalgorithm.models;

import jakarta.xml.bind.annotation.XmlRootElement;
import lombok.Getter;
import lombok.Setter;

@XmlRootElement
@Getter
@Setter
public class Person {

    private String name;
    private Double wallet;
}
