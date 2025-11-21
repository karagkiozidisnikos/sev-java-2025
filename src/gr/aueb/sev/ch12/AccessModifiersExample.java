package gr.aueb.sev.ch12;

public class AccessModifiersExample {
    // 1. Public field
    // Accessible from anywhere (any class, any package, any project)
    public String publicName = "I am PUBLIC";

    // 2. Private field
    // Accessible ONLY inside this class (AccessModifiersExample)
    // Used to protect sensitive data
    private int secretCode = 1821;

    // 3. Protected field
    // Accessible:
    // - inside this class
    // - inside the subclasses (even in other packages)
    // - inside the same package
    protected String protectedInfo = "Iam PROTECTED";

    // 4. Default (Package-Private) field
    // No keyword
    // Accessible ONLY within the same package
    String defaultMessage = "I am DEFAULT";
}
