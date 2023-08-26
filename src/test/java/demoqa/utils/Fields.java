package demoqa.utils;

public class Fields {

    RandomGenerationUtils randomUtils = new RandomGenerationUtils();

    public String
            userFirstName = randomUtils.getFirstName(),
            userLastName = randomUtils.getLastName(),
            userEmail = randomUtils.getUserEmail(),
            userGender = randomUtils.getUserGender(),
            userBirthDay = randomUtils.getUserBirthDay(),
            userBirthMonth = randomUtils.getUserBirthMonth(),
            userBirthYear = randomUtils.getUserBirthYear(),
            userMobileNumber = randomUtils.getUserMobileNumber(),
            userPhoto = "ONYX.png",
            userSubject = randomUtils.getUserSubject(),
            userHobby = randomUtils.getUserHobby(),
            userAddress = randomUtils.getUserAddress(),
            userState = randomUtils.getUserState(),
            userCity = randomUtils.getUserCity(userState),
            userFullName = userFirstName+" "+ userLastName,
            userFullBirthday = userBirthDay+" "+ userBirthMonth +","+ userBirthYear,
            userStateAndCity = userState+" "+userCity;
}