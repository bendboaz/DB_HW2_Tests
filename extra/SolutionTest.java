package extra;

import org.junit.Test;

import static org.junit.Assert.*;

/**
 * Few additional tests for CRUD API, some more thorough tests for basic and advanced API.
 */
public class SolutionTest extends AbstractTest {

    @Test
    public void addLab() {
        /*
        Additional tests:
            - error order (BAD_PARAMS > ALREADY_EXISTS > ERROR)
         */
    }

    @Test
    public void deleteLab() {
        /*
        Additional tests:
            - Delete by ID only (not based off of some other equality notion).
         */
    }

    /**
     * This method assumes the lab CRUD methods (add, delete, getProfile) pass their unit tests.
     * Ideally this would come as with mocking the DB inside the deleteLab test, but that's overkill.
     */
    @Test
    public void testLabDeletionWorks() {

    }

    @Test
    public void addEmployee() {
        /*
        Additional tests:
            - error order (BAD_PARAMS > ALREADY_EXISTS > ERROR)
         */
    }

    @Test
    public void deleteEmployee() {
        /*
        Additional tests:
            - Delete by ID only (not based off of some other equality notion).
         */
    }

    /**
     * This method assumes the employee CRUD methods (add, delete, getProfile) pass their unit tests.
     * Ideally this would come as with mocking the DB inside the deleteEmployee test, but that's overkill.
     */
    @Test
    public void testEmpDeletionWorks() {

    }

    @Test
    public void addVaccine() {
        /*
        Additional tests:
            - error order (BAD_PARAMS > ALREADY_EXISTS > ERROR)
         */
    }

    @Test
    public void deleteVaccine() {
        /*
        Additional tests:
            - Delete by ID only (not based off of some other equality notion).
         */
    }

    /**
     * This method assumes the vaccine CRUD methods (add, delete, getProfile) pass their unit tests.
     * Ideally this would come as with mocking the DB inside the deleteVaccine test, but that's overkill.
     */
    @Test
    public void testVacDeletionWorks() {

    }

    @Test
    public void employeeJoinLab() {
        /*
            - Error order (BAD_PARAMS > NOT_EXIST > ALREADY_EXISTS > ERROR).
            - Later: check that it works with close employees and with wages.
         */
    }

    @Test
    public void employeeLeftLab() {
        /*
            - Later: Check that it works with close employees and with wages.
         */
    }

    @Test
    public void labProduceVaccine() {
        /*
            - Error order: NOT_EXISTS > ALREADY_EXISTS > ERROR.
            - Later: works with lab popularity.
         */
    }

    @Test
    public void labStoppedProducingVaccine() {
        /*
            - Later: works with lab popularity.
         */
    }

    @Test
    public void vaccineSold() {
        /*
            - Check updates.
            - Check update borders.
         */
    }

    @Test
    public void vaccineProduced() {
        /*
            - Check negative amount.
            - Check updates.
            - Check update borders.
         */
    }

    @Test
    public void isLabPopular() {
        /*
            - Empty case (lab with no vaccines).
         */
    }

    @Test
    public void getIncomeFromVaccine() {
        /*
            - Check multiple transactions with same vaccine.
         */
    }

    @Test
    public void getTotalNumberOfWorkingVaccines() {
        /*
            - Check different error cases
            - Making a vaccine effective/ineffective
         */
    }

    @Test
    public void getTotalWages() {
        /*
            - Active and inactive labs
            - Labs with no employees.
         */
    }

    @Test
    public void getBestLab() {
        /*
            - Check different error cases: failure, no working employees, no labs.
            - Check that the method works for employee city and not lab city.
         */
    }

    @Test
    public void getMostPopularCity() {
        /*

         */
    }

    @Test
    public void getPopularLabs() {
    }

    @Test
    public void getMostRatedVaccines() {
    }

    @Test
    public void getCloseEmployees() {
    }
}