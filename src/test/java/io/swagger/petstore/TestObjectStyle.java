package io.swagger.petstore;

import io.swagger.petstore.assertions.pet.PetModelAssert;
import io.swagger.petstore.assertions.pet.PetNotFoundModelAssert;
import io.swagger.petstore.controllers.pet.PetCtrl;
import io.swagger.petstore.models.pet.PetModel;
import io.swagger.petstore.models.pet.PetNotFoundModel;
import org.apache.commons.lang3.RandomStringUtils;
import org.junit.Test;

import java.util.ArrayList;

public class TestObjectStyle {

    @Test
    public void testAddNewPetToStore() {
        String testPetName = RandomStringUtils.randomAlphabetic(5);
        PetModel testPet = new PetModel(new ArrayList<>(), testPetName, 7676, null, new ArrayList<>(), PetModel.Status.AVAILABLE.name());
        PetModel petResponse = new PetCtrl(testPet).addNewPet();
        PetModelAssert.assertThat(petResponse).isEqualTo(testPet);
    }

    @Test
    public void updatePetTest() {
        String testPetName = RandomStringUtils.randomAlphabetic(5);
        int testPetId = Integer.valueOf(RandomStringUtils.randomNumeric(5));

        PetModel testPet = new PetModel(new ArrayList<>(), testPetName, testPetId, null, new ArrayList<>(), PetModel.Status.AVAILABLE.name());
        PetCtrl petController = new PetCtrl(testPet);
        petController.addNewPet();

        testPet.setStatus(PetModel.Status.UNAVAILABLE.name());

        PetModel petResponse = petController.updatePet();

        PetModelAssert.assertThat(petResponse).isEqualTo(testPet);

    }

    @Test
    public void deletePetTest() {
        String testPetName = RandomStringUtils.randomAlphabetic(5);
        int testPetId = Integer.valueOf(RandomStringUtils.randomNumeric(5));

        PetModel testPet = new PetModel(new ArrayList<>(), testPetName, testPetId, null, new ArrayList<>(), PetModel.Status.AVAILABLE.name());
        PetCtrl petController = new PetCtrl(testPet);
        petController.addNewPet();
        petController.deletePet();
        PetNotFoundModel petModel = (PetNotFoundModel) petController.getPet();


        PetNotFoundModelAssert.assertThat(petModel).isEqualTo(
                new PetNotFoundModel.Builder()
                        .withCode(1)
                        .withMessage("Pet not found")
                        .withType("error")
                        .build());

    }

}
