package com.amozh;

/**
 * Created by Andrii Mozharovskyi on 11.04.2016.
 */
public final class Api {

    private Api() {
    }

    public static final String CONTEXT = "api_v1";

    /* Resources mappings */

    public static final String RES_COLLECTION_STOCK_OPERATIONS = "operations";
    public static final String RES_SINGLE_STOCK_OPERATION = "operation";

    public static final String RES_COLLECTION_CATEGORIES = "categories";
    public static final String RES_SINGLE_CATEGORY = "category";

    public static final String RES_COLLECTION_STOCK_OPERATION_ITEMS = "opitems";
    public static final String RES_SINGLE_STOCK_OPERATION_ITEM = "opitems";

    public static final String RES_COLLECTION_SUPPLIERS = "suppliers";
    public static final String RES_SINGLE_SUPPLIER = "supplier";

    public static final String RES_COLLECTION_UNITS = "units";
    public static final String RES_SINGLE_UNIT = "unit";

    public static final String RES_COLLECTION_STORAGES = "storages";
    public static final String RES_SINGLE_STORAGE = "storage";

    /* Resources mappings END */
}
