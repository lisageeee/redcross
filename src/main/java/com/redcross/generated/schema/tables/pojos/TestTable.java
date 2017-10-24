/*
 * This file is generated by jOOQ.
*/
package com.redcross.generated.schema.tables.pojos;


import java.io.Serializable;

import javax.annotation.Generated;


/**
 * This class is generated by jOOQ.
 */
@Generated(
    value = {
        "http://www.jooq.org",
        "jOOQ version:3.9.1"
    },
    comments = "This class is generated by jOOQ"
)
@SuppressWarnings({ "all", "unchecked", "rawtypes" })
public class TestTable implements Serializable {

    private static final long serialVersionUID = 765780103;

    private final Integer id;
    private final String  firstName;
    private final String  lastName;

    public TestTable(TestTable value) {
        this.id = value.id;
        this.firstName = value.firstName;
        this.lastName = value.lastName;
    }

    public TestTable(
        Integer id,
        String  firstName,
        String  lastName
    ) {
        this.id = id;
        this.firstName = firstName;
        this.lastName = lastName;
    }

    public Integer getId() {
        return this.id;
    }

    public String getFirstName() {
        return this.firstName;
    }

    public String getLastName() {
        return this.lastName;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder("TestTable (");

        sb.append(id);
        sb.append(", ").append(firstName);
        sb.append(", ").append(lastName);

        sb.append(")");
        return sb.toString();
    }
}
