/*
 *
 *   Copyright 2017 the original author or authors.
 *
 *   Licensed under the Apache License, Version 2.0 (the "License");
 *   you may not use this file except in compliance with the License.
 *   You may obtain a copy of the License at
 *
 *        http://www.apache.org/licenses/LICENSE-2.0
 *
 *   Unless required by applicable law or agreed to in writing, software
 *   distributed under the License is distributed on an "AS IS" BASIS,
 *   WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 *   See the License for the specific language governing permissions and
 *   limitations under the License.
 *
 */

package org.springframework.data.mybatis.samples.security;

import org.springframework.data.mybatis.annotations.*;

import javax.validation.constraints.NotNull;
import java.util.List;


@Entity(table = "SITE_FUNCTION")
public class SiteFunction extends SiteAccess {

    @OneToOne
    @JoinColumn(name = "SITE_SERVICE_ID")
    @NotNull
    private SiteService siteService;

    @OneToMany
    @JoinColumn(name = "SITE_FUNCTION_ID",referencedColumnName = "ID")
    @NotNull
    private List<SiteContent> siteContentList;

    public SiteService getSiteService() {
        return siteService;
    }

    public void setSiteService(SiteService siteService) {
        this.siteService = siteService;
    }

    public List<SiteContent> getSiteContentList() {
        return siteContentList;
    }

    public void setSiteContentList(List<SiteContent> siteContentList) {
        this.siteContentList = siteContentList;
    }
}
