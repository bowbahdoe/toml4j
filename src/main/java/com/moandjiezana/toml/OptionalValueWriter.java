package com.moandjiezana.toml;

import java.util.Optional;

import static com.moandjiezana.toml.ValueWriters.WRITERS;

class OptionalValueWriter implements ValueWriter {

    public static OptionalValueWriter OPTIONAL_VALUE_WRITER = new OptionalValueWriter();

    @Override
    public boolean canWrite(Object value) {
        return value instanceof Optional;
    }

    @Override
    @SuppressWarnings("unchecked")
    public void write(Object value, WriterContext context) {
        Optional<Object> parsedValue = (Optional<Object>) value;

        parsedValue.ifPresent(o -> WRITERS.findWriterFor(o).write(o, context));
    }

    @Override
    public boolean isPrimitiveType() {
        return false;
    }
}
