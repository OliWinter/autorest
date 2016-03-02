/**
 * Copyright (c) Microsoft Corporation. All rights reserved.
 * Licensed under the MIT License. See License.txt in the project root for
 * license information.
 *
 * Code generated by Microsoft (R) AutoRest Code Generator.
 * Changes may cause incorrect behavior and will be lost if the code is
 * regenerated.
 */

package fixtures.modelflattening.models;

import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * The product documentation.
 */
public class BaseProduct {
    /**
     * Unique identifier representing a specific product for a given latitude
     * &amp; longitude. For example, uberX in San Francisco will have a
     * different product_id than uberX in Los Angeles.
     */
    @JsonProperty(value = "base_product_id", required = true)
    private String baseProductId;

    /**
     * Description of product.
     */
    @JsonProperty(value = "base_product_description")
    private String baseProductDescription;

    /**
     * Get the baseProductId value.
     *
     * @return the baseProductId value
     */
    public String getBaseProductId() {
        return this.baseProductId;
    }

    /**
     * Set the baseProductId value.
     *
     * @param baseProductId the baseProductId value to set
     */
    public void setBaseProductId(String baseProductId) {
        this.baseProductId = baseProductId;
    }

    /**
     * Get the baseProductDescription value.
     *
     * @return the baseProductDescription value
     */
    public String getBaseProductDescription() {
        return this.baseProductDescription;
    }

    /**
     * Set the baseProductDescription value.
     *
     * @param baseProductDescription the baseProductDescription value to set
     */
    public void setBaseProductDescription(String baseProductDescription) {
        this.baseProductDescription = baseProductDescription;
    }

}