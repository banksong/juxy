package org.tigris.juxy.verifier;

import javax.xml.transform.URIResolver;
import java.io.File;
import java.util.List;

/**
 * XSLT stylesheets verifier.
 * Verifies that all specified stylesheets are successfully compiled by XSLT transformer.
 */
public interface Verifier {
    void setErrorReporter(ErrorReporter er);

    /**
     * Sets URIResolver to use for imports and includes resolution.
     * @param resolver
     */
    void setURIResolver(URIResolver resolver);

    /**
     * Sets files to verify.
     * @param files list of File objects
     */
    void setFiles(List files);

    /**
     * Starts process of stylesheets verification.
     * @param failFast whether to stop verification after the first error, or not.
     * @return true if verification was successful and false otherwise
     */
    boolean verify(boolean failFast);
}