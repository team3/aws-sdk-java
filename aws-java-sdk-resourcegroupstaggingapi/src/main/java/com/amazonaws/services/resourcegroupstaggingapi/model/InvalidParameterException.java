/*
 * Copyright 2014-2019 Amazon.com, Inc. or its affiliates. All Rights Reserved.
 * 
 * Licensed under the Apache License, Version 2.0 (the "License"). You may not use this file except in compliance with
 * the License. A copy of the License is located at
 * 
 * http://aws.amazon.com/apache2.0
 * 
 * or in the "license" file accompanying this file. This file is distributed on an "AS IS" BASIS, WITHOUT WARRANTIES OR
 * CONDITIONS OF ANY KIND, either express or implied. See the License for the specific language governing permissions
 * and limitations under the License.
 */
package com.amazonaws.services.resourcegroupstaggingapi.model;

import javax.annotation.Generated;

/**
 * <p>
 * This error indicates one of the following:
 * </p>
 * <ul>
 * <li>
 * <p>
 * A parameter is missing.
 * </p>
 * </li>
 * <li>
 * <p>
 * A malformed string was supplied for the request parameter.
 * </p>
 * </li>
 * <li>
 * <p>
 * An out-of-range value was supplied for the request parameter.
 * </p>
 * </li>
 * <li>
 * <p>
 * The target ID is invalid, unsupported, or doesn't exist.
 * </p>
 * </li>
 * <li>
 * <p>
 * There is an issue with the tag policy: It exceeds the maximum size limit, is invalid, or doesn't use JSON syntax.
 * </p>
 * </li>
 * <li>
 * <p>
 * You can't access the Amazon S3 bucket for report storage. For more information, see <a
 * href="http://docs.aws.amazon.com/ARG/latest/userguide/tag-policies-prereqs.html#bucket-policy-org-report">Additional
 * Requirements for Running Organization-Wide Tag Compliance Report</a> in the <i>AWS Resource Groups User Guide.</i>
 * </p>
 * </li>
 * </ul>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class InvalidParameterException extends com.amazonaws.services.resourcegroupstaggingapi.model.AWSResourceGroupsTaggingAPIException {
    private static final long serialVersionUID = 1L;

    /**
     * Constructs a new InvalidParameterException with the specified error message.
     *
     * @param message
     *        Describes the error encountered.
     */
    public InvalidParameterException(String message) {
        super(message);
    }

}
