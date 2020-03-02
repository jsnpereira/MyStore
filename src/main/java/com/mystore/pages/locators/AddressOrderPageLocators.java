package com.mystore.pages.locators;

/**
 * This class is set the variable of the locators on page.
 */
public class AddressOrderPageLocators {
    /**
     * The constructor as initial.
     */
    protected AddressOrderPageLocators() {
    }

    /**
     * PROCEED_CHECKOUT_BUTTON_NAME is locate of the proceed checkout button.
     */
    public static final String PROCEED_CHECKOUT_BUTTON_NAME = "processAddress";

    /**
     * This class is delivery address section.
     */
    public class DeliveryAddress {
        /**
         * The constructor as initial.
         */
        protected DeliveryAddress() {
        }

        /**
         * NAME_VALUE_XPATH is locate of full name.
         */
        public static final String NAME_VALUE_XPATH =
                ".//ul[@id='address_delivery']/li[2]";
        /**
         *COMPANY_VALUE_XPATH is locate of the company value.
         */
        public static final String COMPANY_VALUE_XPATH =
                ".//ul[@id='address_delivery']/li[3]";
        /**
         *ADDRESS_VALUE_XPATH is locate of the full address value.
         */
        public static final String ADDRESS_VALUE_XPATH =
                ".//ul[@id='address_delivery']/li[4]";
        /**
         *CITY_AND_STATE_VALUE_XPATH is locate of the city and state values.
         */
        public static final String CITY_AND_STATE_VALUE_XPATH =
                ".//ul[@id='address_delivery']/li[5]";
        /**
         *COUNTRY_VALUE_XPATH is locate of the country value.
         */
        public static final String COUNTRY_VALUE_XPATH =
                ".//ul[@id='address_delivery']/li[6]";
        /**
         *PHONE_VALUE_XPATH is locate of the phone number value.
         */
        public static final String PHONE_VALUE_XPATH =
                ".//ul[@id='address_delivery']/li[7]";
        /**
         *PHONE_MOBILE_VALUE_XPATH is locate of the phone mobile number value.
         */
        public static final String PHONE_MOBILE_VALUE_XPATH =
                ".//ul[@id='address_delivery']/li[8]";
    }

    /**
     * This class is billing address section.
     */
    public class BillingAddress {
        /**
         * The constructor as initial.
         */
        protected BillingAddress() {
        }

        /**
         * NAME_VALUE_XPATH is locate of full name value.
         */
        public static final String NAME_VALUE_XPATH =
                ".//ul[@id='address_invoice']/li[2]";
        /**
         *COMPANY_VALUE_XPATH is locate of the company value.
         */
        public static final String COMPANY_VALUE_XPATH =
                ".//ul[@id='address_invoice']/li[3]";
        /**
         *ADDRESS_VALUE_XPATH is locate of the full address value.
         */
        public static final String ADDRESS_VALUE_XPATH =
                ".//ul[@id='address_invoice']/li[4]";
        /**
         *CITY_AND_STATE_VALUE_XPATH is locate of the city and state values.
         */
        public static final String CITY_AND_STATE_VALUE_XPATH =
                ".//ul[@id='address_invoice']/li[5]";
        /**
         *COUNTRY_VALUE_XPATH is locate of the country value.
         */
        public static final String COUNTRY_VALUE_XPATH =
                ".//ul[@id='address_invoice']/li[6]";
        /**
         *PHONE_VALUE_XPATH is locate of the phone number value.
         */
        public static final String PHONE_VALUE_XPATH =
                ".//ul[@id='address_invoice']/li[7]";
        /**
         *PHONE_MOBILE_VALUE_XPATH is locate of the phone mobile number value.
         */
        public static final String PHONE_MOBILE_VALUE_XPATH =
                ".//ul[@id='address_invoice']/li[8]";
    }
}
