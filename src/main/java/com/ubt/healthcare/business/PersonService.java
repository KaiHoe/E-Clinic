/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.ubt.healthcare.business;

import com.ubt.healthcare.ui.util.InputValidation;
import com.ubt.healthcare.dao.SQLRepository;
import com.ubt.healthcare.dto.Doctor;
import com.ubt.healthcare.dto.Person;
import com.ubt.healthcare.dto.PersonEducation;
import java.util.List;

/**
 *
 * @author F
 */
public class PersonService {

    private SQLRepository sqlRepository;
    private InputValidation inputValidation;
    private List<PersonEducation> personEducation;
    private List<Doctor> doctorRepo;
    private UserValidation userValidation;
    private boolean personEducationChanged;//use it as synchronization mechanizm...
    private boolean doctorRepoChanged;

    public PersonService() {
        sqlRepository = new SQLRepository();
        inputValidation = new InputValidation();
        userValidation = new UserValidation();
    }

    public String checkIfUserExists(Person p) {
        String msg = "Save";
        List<Object> docs = (List<Object>) sqlRepository.findAll("Person.findAll");
        for (Object o : docs) {
            if (((Person) o).getPersonId().equals(p.getPersonId())) {
                msg = "Exist";
            }
        }

        return msg;
    }
}
