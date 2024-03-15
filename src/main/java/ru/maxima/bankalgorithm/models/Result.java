package ru.maxima.bankalgorithm.models;

import jakarta.xml.bind.annotation.XmlRootElement;
import lombok.Getter;
import lombok.Setter;

import java.util.List;

@Getter
@Setter
@XmlRootElement
public class Result {

    private List<Person> result;
    private List<Person> minimum;
}
