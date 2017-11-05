module service {
    exports nl.ordina.jtech.java9.service.collections;
    exports nl.ordina.jtech.java9.service.collections.impl;
    requires slf4j.api;
    opens nl.ordina.jtech.java9.service.collections.impl.internal;
}