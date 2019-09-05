// Copyright (c) Microsoft Corporation.
// Licensed under the MIT license.

package com.microsoft.azure.spark.tools.restapi.livy.batches.api.batchid;

import java.util.Collections;
import java.util.List;

@SuppressWarnings("nullness")
public class GetLogResponse {
    private int id;
    private int from;
    private int total;
    private List<String> log;

    public int getId() {
        return id;
    }

    public int getFrom() {
        return from;
    }

    public int getTotal() {
        return total;
    }

    public List<String> getLog() {
        return log != null ? log : Collections.emptyList();
    }
}
