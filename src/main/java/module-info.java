module com.moandjiezana.toml {
    requires com.fasterxml.jackson.core;
    requires com.fasterxml.jackson.databind;
    exports com.moandjiezana.toml;
    opens com.moandjiezana.toml to com.fasterxml.jackson.databind;
    exports com.moandjiezana.toml.testutils to com.fasterxml.jackson.databind;
}