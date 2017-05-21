/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.ubt.healthcare.business;

import com.ubt.healthcare.ui.util.InputValidation;
import com.ubt.healthcare.dao.SQLRepository;
import com.ubt.healthcare.dto.Address;
import com.ubt.healthcare.dto.City;
import com.ubt.healthcare.dto.Country;
import com.ubt.healthcare.dto.Doctor;
import com.ubt.healthcare.dto.Education;
import com.ubt.healthcare.dto.EducationProgram;
import com.ubt.healthcare.dto.EducationType;
import com.ubt.healthcare.dto.Gender;
import com.ubt.healthcare.dto.MartialStatus;
import com.ubt.healthcare.dto.Person;
import com.ubt.healthcare.dto.PersonEducation;
import com.ubt.healthcare.dto.Religion;
import com.ubt.healthcare.dto.UserGroup;
import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import javax.swing.JOptionPane;

/**
 *
 * @author F
 */
public class GenderService {

    private SQLRepository sqlRepository;
    private InputValidation inputValidation;
    private List<PersonEducation> personEducation;
    private List<Doctor> doctorRepo;
    private UserValidation userValidation;
    private boolean personEducationChanged;//use it as synchronization mechanizm...
    private boolean doctorRepoChanged;

    public GenderService() {
        sqlRepository = new SQLRepository();
        inputValidation = new InputValidation();
        userValidation = new UserValidation();
    }

  
    public Gender findTheGender(String gender) {
        Gender msg = null;
        List<Object> docs = (List<Object>) sqlRepository.findAll("Gender.findAll");
        for (Object o : docs) {
            if (((Gender) o).getGenderName().trim().equals(gender.trim())) {
                msg = (Gender) o;
            }
        }

        return msg;
    }
}
