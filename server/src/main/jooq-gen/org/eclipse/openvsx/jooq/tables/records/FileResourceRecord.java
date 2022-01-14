/*
 * This file is generated by jOOQ.
 */
package org.eclipse.openvsx.jooq.tables.records;


import org.eclipse.openvsx.jooq.tables.FileResource;
import org.jooq.Field;
import org.jooq.Record1;
import org.jooq.Record6;
import org.jooq.Row6;
import org.jooq.impl.UpdatableRecordImpl;


/**
 * This class is generated by jOOQ.
 */
@SuppressWarnings({ "all", "unchecked", "rawtypes" })
public class FileResourceRecord extends UpdatableRecordImpl<FileResourceRecord> implements Record6<Long, String, byte[], Long, String, String> {

    private static final long serialVersionUID = 1L;

    /**
     * Setter for <code>public.file_resource.id</code>.
     */
    public void setId(Long value) {
        set(0, value);
    }

    /**
     * Getter for <code>public.file_resource.id</code>.
     */
    public Long getId() {
        return (Long) get(0);
    }

    /**
     * Setter for <code>public.file_resource.type</code>.
     */
    public void setType(String value) {
        set(1, value);
    }

    /**
     * Getter for <code>public.file_resource.type</code>.
     */
    public String getType() {
        return (String) get(1);
    }

    /**
     * Setter for <code>public.file_resource.content</code>.
     */
    public void setContent(byte[] value) {
        set(2, value);
    }

    /**
     * Getter for <code>public.file_resource.content</code>.
     */
    public byte[] getContent() {
        return (byte[]) get(2);
    }

    /**
     * Setter for <code>public.file_resource.extension_id</code>.
     */
    public void setExtensionId(Long value) {
        set(3, value);
    }

    /**
     * Getter for <code>public.file_resource.extension_id</code>.
     */
    public Long getExtensionId() {
        return (Long) get(3);
    }

    /**
     * Setter for <code>public.file_resource.name</code>.
     */
    public void setName(String value) {
        set(4, value);
    }

    /**
     * Getter for <code>public.file_resource.name</code>.
     */
    public String getName() {
        return (String) get(4);
    }

    /**
     * Setter for <code>public.file_resource.storage_type</code>.
     */
    public void setStorageType(String value) {
        set(5, value);
    }

    /**
     * Getter for <code>public.file_resource.storage_type</code>.
     */
    public String getStorageType() {
        return (String) get(5);
    }

    // -------------------------------------------------------------------------
    // Primary key information
    // -------------------------------------------------------------------------

    @Override
    public Record1<Long> key() {
        return (Record1) super.key();
    }

    // -------------------------------------------------------------------------
    // Record6 type implementation
    // -------------------------------------------------------------------------

    @Override
    public Row6<Long, String, byte[], Long, String, String> fieldsRow() {
        return (Row6) super.fieldsRow();
    }

    @Override
    public Row6<Long, String, byte[], Long, String, String> valuesRow() {
        return (Row6) super.valuesRow();
    }

    @Override
    public Field<Long> field1() {
        return FileResource.FILE_RESOURCE.ID;
    }

    @Override
    public Field<String> field2() {
        return FileResource.FILE_RESOURCE.TYPE;
    }

    @Override
    public Field<byte[]> field3() {
        return FileResource.FILE_RESOURCE.CONTENT;
    }

    @Override
    public Field<Long> field4() {
        return FileResource.FILE_RESOURCE.EXTENSION_ID;
    }

    @Override
    public Field<String> field5() {
        return FileResource.FILE_RESOURCE.NAME;
    }

    @Override
    public Field<String> field6() {
        return FileResource.FILE_RESOURCE.STORAGE_TYPE;
    }

    @Override
    public Long component1() {
        return getId();
    }

    @Override
    public String component2() {
        return getType();
    }

    @Override
    public byte[] component3() {
        return getContent();
    }

    @Override
    public Long component4() {
        return getExtensionId();
    }

    @Override
    public String component5() {
        return getName();
    }

    @Override
    public String component6() {
        return getStorageType();
    }

    @Override
    public Long value1() {
        return getId();
    }

    @Override
    public String value2() {
        return getType();
    }

    @Override
    public byte[] value3() {
        return getContent();
    }

    @Override
    public Long value4() {
        return getExtensionId();
    }

    @Override
    public String value5() {
        return getName();
    }

    @Override
    public String value6() {
        return getStorageType();
    }

    @Override
    public FileResourceRecord value1(Long value) {
        setId(value);
        return this;
    }

    @Override
    public FileResourceRecord value2(String value) {
        setType(value);
        return this;
    }

    @Override
    public FileResourceRecord value3(byte[] value) {
        setContent(value);
        return this;
    }

    @Override
    public FileResourceRecord value4(Long value) {
        setExtensionId(value);
        return this;
    }

    @Override
    public FileResourceRecord value5(String value) {
        setName(value);
        return this;
    }

    @Override
    public FileResourceRecord value6(String value) {
        setStorageType(value);
        return this;
    }

    @Override
    public FileResourceRecord values(Long value1, String value2, byte[] value3, Long value4, String value5, String value6) {
        value1(value1);
        value2(value2);
        value3(value3);
        value4(value4);
        value5(value5);
        value6(value6);
        return this;
    }

    // -------------------------------------------------------------------------
    // Constructors
    // -------------------------------------------------------------------------

    /**
     * Create a detached FileResourceRecord
     */
    public FileResourceRecord() {
        super(FileResource.FILE_RESOURCE);
    }

    /**
     * Create a detached, initialised FileResourceRecord
     */
    public FileResourceRecord(Long id, String type, byte[] content, Long extensionId, String name, String storageType) {
        super(FileResource.FILE_RESOURCE);

        setId(id);
        setType(type);
        setContent(content);
        setExtensionId(extensionId);
        setName(name);
        setStorageType(storageType);
    }
}