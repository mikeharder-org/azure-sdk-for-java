/**
 * Copyright (c) Microsoft Corporation. All rights reserved.
 * Licensed under the MIT License. See License.txt in the project root for
 * license information.
 *
 * Code generated by Microsoft (R) AutoRest Code Generator.
 */

package com.microsoft.azure.management.batch.v2017_09_01;

import com.microsoft.azure.arm.model.HasInner;
import com.microsoft.azure.management.batch.v2017_09_01.implementation.CertificateInner;
import com.microsoft.azure.arm.model.Indexable;
import com.microsoft.azure.arm.model.Refreshable;
import com.microsoft.azure.arm.model.Updatable;
import com.microsoft.azure.arm.model.Appliable;
import com.microsoft.azure.arm.model.Creatable;
import com.microsoft.azure.arm.resources.models.HasManager;
import com.microsoft.azure.management.batch.v2017_09_01.implementation.BatchManager;
import org.joda.time.DateTime;

/**
 * Type representing Certificate.
 */
public interface Certificate extends HasInner<CertificateInner>, Indexable, Refreshable<Certificate>, Updatable<Certificate.Update>, HasManager<BatchManager> {
    /**
     * @return the deleteCertificateError value.
     */
    DeleteCertificateError deleteCertificateError();

    /**
     * @return the etag value.
     */
    String etag();

    /**
     * @return the format value.
     */
    CertificateFormat format();

    /**
     * @return the id value.
     */
    String id();

    /**
     * @return the name value.
     */
    String name();

    /**
     * @return the previousProvisioningState value.
     */
    CertificateProvisioningState previousProvisioningState();

    /**
     * @return the previousProvisioningStateTransitionTime value.
     */
    DateTime previousProvisioningStateTransitionTime();

    /**
     * @return the provisioningState value.
     */
    CertificateProvisioningState provisioningState();

    /**
     * @return the provisioningStateTransitionTime value.
     */
    DateTime provisioningStateTransitionTime();

    /**
     * @return the publicData value.
     */
    String publicData();

    /**
     * @return the thumbprint value.
     */
    String thumbprint();

    /**
     * @return the thumbprintAlgorithm value.
     */
    String thumbprintAlgorithm();

    /**
     * @return the type value.
     */
    String type();

    /**
     * The entirety of the Certificate definition.
     */
    interface Definition extends DefinitionStages.Blank, DefinitionStages.WithBatchAccount, DefinitionStages.WithIfMatch, DefinitionStages.WithIfNoneMatch, DefinitionStages.WithData, DefinitionStages.WithCreate {
    }

    /**
     * Grouping of Certificate definition stages.
     */
    interface DefinitionStages {
        /**
         * The first stage of a Certificate definition.
         */
        interface Blank extends WithBatchAccount {
        }

        /**
         * The stage of the certificate definition allowing to specify BatchAccount.
         */
        interface WithBatchAccount {
           /**
            * Specifies resourceGroupName, accountName.
            * @param resourceGroupName The name of the resource group that contains the Batch account
            * @param accountName The name of the Batch account
            * @return the next definition stage
            */
            WithIfMatch withExistingBatchAccount(String resourceGroupName, String accountName);
        }

        /**
         * The stage of the certificate definition allowing to specify IfMatch.
         */
        interface WithIfMatch {
           /**
            * Specifies ifMatch.
            * @param ifMatch The entity state (ETag) version of the certificate to update. A value of "*" can be used to apply the operation only if the certificate already exists. If omitted, this operation will always be applied
            * @return the next definition stage
            */
            WithIfNoneMatch withIfMatch(String ifMatch);
        }

        /**
         * The stage of the certificate definition allowing to specify IfNoneMatch.
         */
        interface WithIfNoneMatch {
           /**
            * Specifies ifNoneMatch.
            * @param ifNoneMatch Set to '*' to allow a new certificate to be created, but to prevent updating an existing certificate. Other values will be ignored
            * @return the next definition stage
            */
            WithData withIfNoneMatch(String ifNoneMatch);
        }

        /**
         * The stage of the certificate definition allowing to specify Data.
         */
        interface WithData {
           /**
            * Specifies data.
            * @param data The maximum size is 10KB
            * @return the next definition stage
            */
            WithCreate withData(String data);
        }

        /**
         * The stage of the certificate definition allowing to specify Format.
         */
        interface WithFormat {
            /**
             * Specifies format.
             * @param format The format of the certificate - either Pfx or Cer. If omitted, the default is Pfx. Possible values include: 'Pfx', 'Cer'
             * @return the next definition stage
             */
            WithCreate withFormat(CertificateFormat format);
        }

        /**
         * The stage of the certificate definition allowing to specify Password.
         */
        interface WithPassword {
            /**
             * Specifies password.
             * @param password This is required if the certificate format is pfx and must be omitted if the certificate format is cer
             * @return the next definition stage
             */
            WithCreate withPassword(String password);
        }

        /**
         * The stage of the certificate definition allowing to specify Thumbprint.
         */
        interface WithThumbprint {
            /**
             * Specifies thumbprint.
             * @param thumbprint This must match the thumbprint from the name
             * @return the next definition stage
             */
            WithCreate withThumbprint(String thumbprint);
        }

        /**
         * The stage of the certificate definition allowing to specify ThumbprintAlgorithm.
         */
        interface WithThumbprintAlgorithm {
            /**
             * Specifies thumbprintAlgorithm.
             * @param thumbprintAlgorithm This must match the first portion of the certificate name. Currently required to be 'SHA1'
             * @return the next definition stage
             */
            WithCreate withThumbprintAlgorithm(String thumbprintAlgorithm);
        }

        /**
         * The stage of the definition which contains all the minimum required inputs for
         * the resource to be created (via {@link WithCreate#create()}), but also allows
         * for any other optional settings to be specified.
         */
        interface WithCreate extends Creatable<Certificate>, DefinitionStages.WithFormat, DefinitionStages.WithPassword, DefinitionStages.WithThumbprint, DefinitionStages.WithThumbprintAlgorithm {
        }
    }
    /**
     * The template for a Certificate update operation, containing all the settings that can be modified.
     */
    interface Update extends Appliable<Certificate>, UpdateStages.WithIfMatch, UpdateStages.WithFormat, UpdateStages.WithPassword, UpdateStages.WithThumbprint, UpdateStages.WithThumbprintAlgorithm {
    }

    /**
     * Grouping of Certificate update stages.
     */
    interface UpdateStages {
        /**
         * The stage of the certificate update allowing to specify IfMatch.
         */
        interface WithIfMatch {
            /**
             * Specifies ifMatch.
             * @param ifMatch The entity state (ETag) version of the certificate to update. This value can be omitted or set to "*" to apply the operation unconditionally
             * @return the next update stage
             */
            Update withIfMatch(String ifMatch);
        }

        /**
         * The stage of the certificate update allowing to specify Format.
         */
        interface WithFormat {
            /**
             * Specifies format.
             * @param format The format of the certificate - either Pfx or Cer. If omitted, the default is Pfx. Possible values include: 'Pfx', 'Cer'
             * @return the next update stage
             */
            Update withFormat(CertificateFormat format);
        }

        /**
         * The stage of the certificate update allowing to specify Password.
         */
        interface WithPassword {
            /**
             * Specifies password.
             * @param password This is required if the certificate format is pfx and must be omitted if the certificate format is cer
             * @return the next update stage
             */
            Update withPassword(String password);
        }

        /**
         * The stage of the certificate update allowing to specify Thumbprint.
         */
        interface WithThumbprint {
            /**
             * Specifies thumbprint.
             * @param thumbprint This must match the thumbprint from the name
             * @return the next update stage
             */
            Update withThumbprint(String thumbprint);
        }

        /**
         * The stage of the certificate update allowing to specify ThumbprintAlgorithm.
         */
        interface WithThumbprintAlgorithm {
            /**
             * Specifies thumbprintAlgorithm.
             * @param thumbprintAlgorithm This must match the first portion of the certificate name. Currently required to be 'SHA1'
             * @return the next update stage
             */
            Update withThumbprintAlgorithm(String thumbprintAlgorithm);
        }

    }
}