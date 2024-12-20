package norbert.dajka.dataprovider;

import org.testng.annotations.DataProvider;

public class UserDataProvider {

    @DataProvider(name = "validUserDataProvider")

    public Object[][] feedUserData(){
        User standardUser = new User("standard_user","secret_sauce");
        User problemUser = new User("problem_user","secret_sauce");
        User performanceGlitchUser = new User ("performance_glitch_user","secret_sauce");
        User errorUser = new User ("error_user","secret_sauce");
        User visualUser = new User ("visual_user","secret_sauce");

        return new Object [][]{
                {standardUser},
                {problemUser},
                {performanceGlitchUser},
                {errorUser},
                {visualUser}
                };
    }
    @DataProvider(name = "invalidUserDataProvider")
    public Object[][] feedInvalidUserData(){
        User terkeberbeUser = new User("terkeberke","merketerke");

        return new Object [][]{
                {terkeberbeUser}

        };

    }
    @DataProvider(name = "lockedUserDataProvider")
    public Object[][] feedLockedUserData(){
        User lockedOutUser = new User("locked_out_user","secret_sauce");

        return new Object [][]{
                {lockedOutUser}

        };

    }
}
