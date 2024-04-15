package seedu.address.model.util;

import java.util.Arrays;
import java.util.Set;
import java.util.stream.Collectors;

import seedu.address.model.AddressBook;
import seedu.address.model.ReadOnlyAddressBook;
import seedu.address.model.employee.Address;
import seedu.address.model.employee.Email;
import seedu.address.model.employee.Employee;
import seedu.address.model.employee.Name;
import seedu.address.model.employee.Phone;
import seedu.address.model.employee.Role;
import seedu.address.model.employee.Team;
import seedu.address.model.employee.UniqueId;
import seedu.address.model.tag.Tag;
import seedu.address.model.task.Description;

/**
 * Contains utility methods for populating {@code AddressBook} with sample data.
 */
public class SampleDataUtil {
    public static Employee[] getSampleEmployees() {
        Employee employee1 = new Employee(new Name("Elle Meyer"), new Phone("94821224"),
                new Email("elle.meyer@example.com"),
                new Address("123 Michigan Ave, Chicago, IL"), new Team("2"), new Role("Cleaner"),
                getTagSet("pendingPayment", "colleague"), new UniqueId("1004"));

        employee1.addTask(new Description("Inventory check"));
        employee1.addTask(new Description("Restock cleaning supplies"));
        employee1.addTask(new Description("Clean conference room"));
        employee1.addTask(new Description("Organize storage closet"));
        employee1.markTask(1);
        employee1.markTask(2);

        Employee employee2 = new Employee(new Name("Fiona Kunz"), new Phone("94821427"),
                new Email("fiona.k@example.com"),
                new Address("456 Little Tokyo St, Los Angeles, CA"), new Team("3"), new Role("Cook"),
                getTagSet(), new UniqueId("1005"));

        employee2.addTask(new Description("Prep for lunch service"));
        employee2.addTask(new Description("Order vegetables"));
        employee2.addTask(new Description("Update recipe book"));
        employee2.addTask(new Description("Clean kitchen"));
        employee2.markTask(1);
        employee2.markTask(3);

        Employee employee3 = new Employee(new Name("George Best"), new Phone("94821442"),
                new Email("george.b@example.com"),
                new Address("789 4th St, New York, NY"), new Team("4"), new Role("Planner"),
                getTagSet("teamLead"), new UniqueId("1006"));

        employee3.addTask(new Description("Schedule weekly meeting"));
        employee3.addTask(new Description("Review project timeline"));
        employee3.addTask(new Description("Update event calendar"));
        employee3.markTask(1);

        Employee employee4 = new Employee(new Name("John Doe"), new Phone("98765432"), new Email("john.d@example.com"),
                new Address("311, Clementi Ave 2, #02-25, Singapore"), new Team("A"), new Role("Manager"),
                getTagSet("mentor", "urgent"), new UniqueId("1007"));

        employee4.addTask(new Description("Review team performance"));
        employee4.addTask(new Description("One on one with Sarah"));
        employee4.addTask(new Description("Budget planning"));
        employee4.markTask(1);

        Employee employee5 = new Employee(new Name("Hannah Stone"), new Phone("98765098"),
                new Email("hannah.s@example.com"),
                new Address("987 North Bridge Rd, #05-12, Singapore"), new Team("A"), new Role("Assistant Manager"),
                getTagSet("newHire", "trainingRequired"), new UniqueId("1008"));

        employee5.addTask(new Description("Onboarding new employees"));
        employee5.addTask(new Description("Arrange training sessions"));
        employee5.addTask(new Description("Update HR policies"));
        employee5.markTask(2);

        Employee employee6 = new Employee(new Name("Ian Smith"), new Phone("98765512"), new Email("ian.s@example.com"),
                new Address("122 South St, Boston, MA"), new Team("B"), new Role("Technician"),
                getTagSet("fieldWork", "fullTime"), new UniqueId("1009"));

        employee6.addTask(new Description("Repair HVAC system"));
        employee6.addTask(new Description("Inspect wiring at new site"));
        employee6.addTask(new Description("Submit maintenance report"));
        employee6.markTask(2);

        Employee employee7 = new Employee(new Name("Julie Tan"), new Phone("98765411"),
                new Email("julie.t@example.com"), new Address("123 Orchard Road, Singapore"), new Team("A"),
                new Role("Manager"), getTagSet("pendingReview", "teamLead"), new UniqueId("1010"));

        employee7.addTask(new Description("Finalize quarterly report"));
        employee7.addTask(new Description("Plan team outing"));
        employee7.addTask(new Description("Conduct performance reviews"));
        employee7.markTask(1);
        employee7.markTask(3);

        Employee employee8 = new Employee(new Name("John Doe"), new Phone("98765432"),
                new Email("johnd@example.com"), new Address("John street, block 123, #01-01"), new Team("A"),
                new Role("Manager"), getTagSet(), new UniqueId("1011"));

        Employee employee9 = new Employee(new Name("John Doe"), new Phone("98765432"),
                new Email("johnd@example.com"), new Address("John street, block 123, #01-01"), new Team("A"),
                new Role("Manager"), getTagSet(), new UniqueId("1012"));

        return new Employee[] {
            employee1,
            employee2,
            employee3,
            employee4,
            employee5,
            employee6,
            employee7,
            employee8,
            employee9
        };
    }

    public static ReadOnlyAddressBook getSampleAddressBook() {
        AddressBook sampleAb = new AddressBook();
        for (Employee sampleEmployee : getSampleEmployees()) {
            sampleAb.addEmployee(sampleEmployee);
        }
        return sampleAb;
    }

    /**
     * Returns a tag set containing the list of strings given.
     */
    public static Set<Tag> getTagSet(String... strings) {
        return Arrays.stream(strings)
                .map(Tag::new)
                .collect(Collectors.toSet());
    }

}
