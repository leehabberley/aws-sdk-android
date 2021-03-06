/*
 * Copyright 2010-2018 Amazon.com, Inc. or its affiliates. All Rights Reserved.
 *
 * Licensed under the Apache License, Version 2.0 (the "License").
 * You may not use this file except in compliance with the License.
 * A copy of the License is located at
 *
 *  http://aws.amazon.com/apache2.0
 *
 * or in the "license" file accompanying this file. This file is distributed
 * on an "AS IS" BASIS, WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either
 * express or implied. See the License for the specific language governing
 * permissions and limitations under the License.
 */

package com.amazonaws.services.pinpoint.model;

import java.io.Serializable;

import com.amazonaws.AmazonWebServiceRequest;

/**
 * Creates or updates an import job.
 */
public class CreateImportJobRequest extends AmazonWebServiceRequest implements Serializable {
    /**
     * The new value for the applicationId property for this object.
     */
    private String applicationId;

    /**
     * The new value for the importJobRequest property for this object.
     */
    private ImportJobRequest importJobRequest;

    /**
     * Returns the value of the applicationId property for this object.
     *
     * @return The value of the applicationId property for this object.
     */
    public String getApplicationId() {
        return applicationId;
    }

    /**
     * Sets the value of applicationId
     *
     * @param applicationId The new value for the applicationId property for
     *            this object.
     */
    public void setApplicationId(String applicationId) {
        this.applicationId = applicationId;
    }

    /**
     * Sets the value of the applicationId property for this object.
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param applicationId The new value for the applicationId property for
     *            this object.
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public CreateImportJobRequest withApplicationId(String applicationId) {
        this.applicationId = applicationId;
        return this;
    }

    /**
     * Returns the value of the importJobRequest property for this object.
     *
     * @return The value of the importJobRequest property for this object.
     */
    public ImportJobRequest getImportJobRequest() {
        return importJobRequest;
    }

    /**
     * Sets the value of importJobRequest
     *
     * @param importJobRequest The new value for the importJobRequest property
     *            for this object.
     */
    public void setImportJobRequest(ImportJobRequest importJobRequest) {
        this.importJobRequest = importJobRequest;
    }

    /**
     * Sets the value of the importJobRequest property for this object.
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param importJobRequest The new value for the importJobRequest property
     *            for this object.
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public CreateImportJobRequest withImportJobRequest(ImportJobRequest importJobRequest) {
        this.importJobRequest = importJobRequest;
        return this;
    }

    /**
     * Returns a string representation of this object; useful for testing and
     * debugging.
     *
     * @return A string representation of this object.
     * @see java.lang.Object#toString()
     */
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("{");
        if (getApplicationId() != null)
            sb.append("ApplicationId: " + getApplicationId() + ",");
        if (getImportJobRequest() != null)
            sb.append("ImportJobRequest: " + getImportJobRequest());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode
                + ((getApplicationId() == null) ? 0 : getApplicationId().hashCode());
        hashCode = prime * hashCode
                + ((getImportJobRequest() == null) ? 0 : getImportJobRequest().hashCode());
        return hashCode;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof CreateImportJobRequest == false)
            return false;
        CreateImportJobRequest other = (CreateImportJobRequest) obj;

        if (other.getApplicationId() == null ^ this.getApplicationId() == null)
            return false;
        if (other.getApplicationId() != null
                && other.getApplicationId().equals(this.getApplicationId()) == false)
            return false;
        if (other.getImportJobRequest() == null ^ this.getImportJobRequest() == null)
            return false;
        if (other.getImportJobRequest() != null
                && other.getImportJobRequest().equals(this.getImportJobRequest()) == false)
            return false;
        return true;
    }
}
