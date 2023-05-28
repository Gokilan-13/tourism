package tourismManagement.tourismapp.validationpurpose.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import tourismManagement.tourismapp.validationpurpose.entity.ValEntity;
import tourismManagement.tourismapp.validationpurpose.repository.ValRepository;

import java.util.Date;

@Service
public class ValServiceImple {
    @Autowired
    private ValRepository valRepository;

    public ValEntity getValEntityById(Date date){
        return valRepository.findById(date).get();
    }
    public void saveValEntity(ValEntity valEntity){
        valRepository.save(valEntity);
    }
}
