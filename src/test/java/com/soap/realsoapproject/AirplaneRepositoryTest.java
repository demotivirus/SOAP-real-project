package com.soap.realsoapproject;

import com.soap.realsoapproject.dao.AirplaneDao;
import com.soap.realsoapproject.model.dictionary.Airplane;
import com.soap.realsoapproject.model.dictionary.Company;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.Mockito;
import org.mockito.junit.jupiter.MockitoExtension;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.mock.mockito.MockBean;
import org.springframework.test.context.junit.jupiter.SpringExtension;

@ExtendWith(MockitoExtension.class)
@ExtendWith(SpringExtension.class)
public class AirplaneRepositoryTest {
    @MockBean
    private AirplaneDao airplaneDao;

    @Test
    public void simpleDaoTest(){
        Airplane airplane = new Airplane();
        airplane.setCompany(new Company());
        airplane.setAirplaneModel("Boeing");
        airplane.setDescr("Super flight");
        airplane.setId(1L);

        Mockito.when(airplaneDao.getOne(1L)).thenReturn(airplane);
        Airplane airplaneFromRepository = airplaneDao.getOne(1L);
        System.err.println(airplaneFromRepository);
        Assertions.assertEquals(airplaneDao.getOne(1L).toString(),
                "Airplane(id=1, airplaneModel=Boeing, places=null, " +
                        "company=Company(id=0, name=null, descr=null), descr=Super flight)");

    }
}
