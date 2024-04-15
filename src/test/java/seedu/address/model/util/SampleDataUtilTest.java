package seedu.address.model.util;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;

import java.util.Set;

import org.junit.jupiter.api.Test;

import seedu.address.model.AddressBook;
import seedu.address.model.ReadOnlyAddressBook;
import seedu.address.model.employee.Employee;
import seedu.address.model.employee.UniqueId;
import seedu.address.model.tag.Tag;

public class SampleDataUtilTest {
    @Test
    public void getSampleEmployees() {
        Employee[] sampleEmployees = SampleDataUtil.getSampleEmployees();
        assertEquals(9, sampleEmployees.length);
        assertEquals(new UniqueId("1004"), sampleEmployees[0].getUid());
        assertEquals(new UniqueId("1009"), sampleEmployees[5].getUid());
    }

    @Test
    public void getSampleAddressBook() {
        ReadOnlyAddressBook sampleAb = SampleDataUtil.getSampleAddressBook();
        assertTrue(sampleAb instanceof AddressBook);
        assertEquals(9, sampleAb.getEmployeeList().size());
    }

    @Test
    public void getTagSet() {
        Set<Tag> tagSet = SampleDataUtil.getTagSet("friends", "colleagues");
        assertEquals(2, tagSet.size());
        assertTrue(tagSet.contains(new Tag("friends")));
        assertTrue(tagSet.contains(new Tag("colleagues")));
    }
}
