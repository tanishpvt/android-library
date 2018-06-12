/* ownCloud Android Library is available under MIT license
 *   Copyright (C) 2018 ownCloud GmbH.
 *
 *   Permission is hereby granted, free of charge, to any person obtaining a copy
 *   of this software and associated documentation files (the "Software"), to deal
 *   in the Software without restriction, including without limitation the rights
 *   to use, copy, modify, merge, publish, distribute, sublicense, and/or sell
 *   copies of the Software, and to permit persons to whom the Software is
 *   furnished to do so, subject to the following conditions:
 *
 *   The above copyright notice and this permission notice shall be included in
 *   all copies or substantial portions of the Software.
 *
 *   THE SOFTWARE IS PROVIDED "AS IS", WITHOUT WARRANTY OF ANY KIND,
 *   EXPRESS OR IMPLIED, INCLUDING BUT NOT LIMITED TO THE WARRANTIES OF
 *   MERCHANTABILITY, FITNESS FOR A PARTICULAR PURPOSE AND
 *   NONINFRINGEMENT. IN NO EVENT SHALL THE AUTHORS OR COPYRIGHT HOLDERS
 *   BE LIABLE FOR ANY CLAIM, DAMAGES OR OTHER LIABILITY, WHETHER IN AN
 *   ACTION OF CONTRACT, TORT OR OTHERWISE, ARISING FROM, OUT OF OR IN
 *   CONNECTION WITH THE SOFTWARE OR THE USE OR OTHER DEALINGS IN
 *   THE SOFTWARE.
 *
 */

package com.owncloud.android.lib.common.http.methods.webdav;

import com.owncloud.android.lib.common.http.methods.HttpBaseMethod;

import at.bitfire.dav4android.DavOCResource;
import at.bitfire.dav4android.DavResource;
import okhttp3.HttpUrl;

/**
 * Wrapper to perform WebDAV (dav4android) calls
 * @author David González Verdugo
 */
public abstract class DavMethod extends HttpBaseMethod {

    protected DavOCResource mDavResource;

    protected DavMethod(HttpUrl httpUrl) {
        super(httpUrl);
        mDavResource = new DavOCResource(
                mOkHttpClient,
                httpUrl
        );
    }

    public DavResource getDavResource() {
        return mDavResource;
    }
}