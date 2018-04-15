package io.swagger.petstore;

import io.restassured.RestAssured;
import io.restassured.builder.RequestSpecBuilder;
import io.restassured.http.ContentType;
import io.swagger.petstore.models.pet.PetModel;
import org.apache.commons.lang3.RandomStringUtils;
import org.apache.commons.lang3.RandomUtils;
import org.hamcrest.Matchers;
import org.junit.Test;

public class TestPet {

    @Test
    public void petTest() {

        int idTestValue = RandomUtils.nextInt(0, 9000);
        String testPetName = RandomStringUtils.randomAlphabetic(5);
        //PetModel testPet = new PetModel(null, testPetName, idTestValue, null, null, "AVAILABLE");

        RestAssured.requestSpecification = new RequestSpecBuilder()
                .setBaseUri("http://petstore.swagger.io")
                .setContentType(ContentType.JSON)
                .addCookie("coook", "adasd")
                .addHeader("api_key", "1qa2ws3ed4rfvcxz").build();

/*
        RestAssured.given()
                .log().all()
                .basePath("/v2/pet")
                .body(testPet)
                .when().post()
                .then()
                .body(Matchers.equalTo(testPet));*/

        //large-rafted-monkey-layer-hair

    }

}
