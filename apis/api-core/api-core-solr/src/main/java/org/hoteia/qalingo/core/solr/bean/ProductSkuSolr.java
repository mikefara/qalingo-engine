/**
 * Most of the code in the Qalingo project is copyrighted Hoteia and licensed
 * under the Apache License Version 2.0 (release version 0.8.0)
 *         http://www.apache.org/licenses/LICENSE-2.0
 *
 *                   Copyright (c) Hoteia, 2012-2014
 * http://www.hoteia.com - http://twitter.com/hoteia - contact@hoteia.com
 *
 */
package org.hoteia.qalingo.core.solr.bean;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import org.apache.solr.client.solrj.beans.Field;

public class ProductSkuSolr {

    @Field
    private Long id;

    @Field
    private Long scoring;
    
    @Field
    private String description;

    private Boolean isDefault;

    @Field
    private Boolean enabledB2B;
    
    @Field
    private Boolean enabledB2C;
    
    @Field
    private Boolean salableB2B;
    
    @Field
    private Boolean salableB2C;
    
    @Field
    private String code;

    @Field
    private String name;

    @Field
    private String productBrandCode;
    
    @Field
    private String productBrandName;
    
    @Field
    private String defaultCategoryCode;
    
    @Field
    private String price;
    
    @Field
    private List<String> catalogCodes = new ArrayList<String>();
    
    @Field
    private List<String> catalogCategories = new ArrayList<String>();

    @Field
    private List<String> tags = new ArrayList<String>();

    @Field
    private List<String> optionDefinitions = new ArrayList<String>();
    
    @Field
    private String random;
    
    @Field("datecreate")
    private Date dateCreate;

    @Field("dateupdate")
    private Date dateUpdate;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Long getScoring() {
        return scoring;
    }

    public void setScoring(Long scoring) {
        this.scoring = scoring;
    }

    public Boolean getIsDefault() {
        return isDefault;
    }

    public void setIsDefault(Boolean isDefault) {
        this.isDefault = isDefault;
    }

    public Boolean getEnabledB2B() {
        return enabledB2B;
    }

    public void setEnabledB2B(Boolean enabledB2B) {
        this.enabledB2B = enabledB2B;
    }
    
    public Boolean getEnabledB2C() {
        return enabledB2C;
    }

    public void setEnabledB2C(Boolean enabledB2C) {
        this.enabledB2C = enabledB2C;
    }
    
    public Boolean getSalableB2B() {
        return salableB2B;
    }

    public void setSalableB2B(Boolean salableB2B) {
        this.salableB2B = salableB2B;
    }
    
    public Boolean getSalableB2C() {
        return salableB2C;
    }

    public void setSalableB2C(Boolean salableB2C) {
        this.salableB2C = salableB2C;
    }

    public String getCode() {
        return code;
    }

    public void setCode(String code) {
        this.code = code;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }
    
    public String getProductBrandCode() {
        return productBrandCode;
    }

    public void setProductBrandCode(String productBrandCode) {
        this.productBrandCode = productBrandCode;
    }

    public String getProductBrandName() {
        return productBrandName;
    }
    
    public void setProductBrandName(String productBrandName) {
        this.productBrandName = productBrandName;
    }
    
    public String getDefaultCategoryCode() {
        return defaultCategoryCode;
    }

    public void setDefaultCategoryCode(String defaultCategoryCode) {
        this.defaultCategoryCode = defaultCategoryCode;
    }
    
    public String getPrice() {
        return price;
    }
    
    public void setPrice(String price) {
        this.price = price;
    }
    
    public List<String> getCatalogCodes() {
        return catalogCodes;
    }
    
    public void setCatalogCodes(List<String> catalogCodes) {
        this.catalogCodes = catalogCodes;
    }
    
    public void addCatalogCode(String catalogCode){
        if(this.catalogCodes == null){
            this.catalogCodes = new ArrayList<String>();
        }
        if(!this.catalogCodes.contains(catalogCode)){
            this.catalogCodes.add(catalogCode);
        }
    }
    
    public List<String> getCatalogCategories() {
        return catalogCategories;
    }

    public void setCatalogCategories(List<String> catalogCategories) {
        this.catalogCategories = catalogCategories;
    }
    
    public void addCatalogCategories(String catalogCategoryCode){
        if(this.catalogCategories == null){
            this.catalogCategories = new ArrayList<String>();
        }
        if(!this.catalogCategories.contains(catalogCategoryCode)){
            this.catalogCategories.add(catalogCategoryCode);
        }
    }
    
    public List<String> getTags() {
        return tags;
    }
    
    public void addTag(String tag){
        if(this.tags == null){
            this.tags = new ArrayList<String>();
        }
        if(!this.tags.contains(tag)){
            this.tags.add(tag);
        }
    }
    
    public void setTags(List<String> tags) {
        this.tags = tags;
    }
    
    public List<String> getOptionDefinitions() {
        return optionDefinitions;
    }
    
    public void addOptionDefinition(String optionDefinition){
        if(this.optionDefinitions == null){
            this.optionDefinitions = new ArrayList<String>();
        }
        if(!this.optionDefinitions.contains(optionDefinition)){
            this.optionDefinitions.add(optionDefinition);
        }
    }
    
    public void setOptionDefinitions(List<String> optionDefinitions) {
        this.optionDefinitions = optionDefinitions;
    }
    
    public void addTags(String tag){
        if(this.tags == null){
            this.tags = new ArrayList<String>();
        }
        if(!this.tags.contains(tag)){
            this.tags.add(tag);
        }
    }
    
    public String getRandom() {
        return random;
    }
    
    public void setRandom(String random) {
        this.random = random;
    }
    
    public Date getDateCreate() {
        return dateCreate;
    }

    public void setDateCreate(Date dateCreate) {
        this.dateCreate = dateCreate;
    }

    public Date getDateUpdate() {
        return dateUpdate;
    }

    public void setDateUpdate(Date dateUpdate) {
        this.dateUpdate = dateUpdate;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((code == null) ? 0 : code.hashCode());
        result = prime * result + ((id == null) ? 0 : id.hashCode());
        return result;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;
        if (getClass() != obj.getClass())
            return false;
        ProductSkuSolr other = (ProductSkuSolr) obj;
        if (code == null) {
            if (other.code != null)
                return false;
        } else if (!code.equals(other.code))
            return false;
        if (id == null) {
            if (other.id != null)
                return false;
        } else if (!id.equals(other.id))
            return false;
        return true;
    }

    @Override
    public String toString() {
        return "ProductSkuSolr [id=" + id + ", description=" + description + ", isDefault=" + isDefault + ", code=" + code + ", name=" + name + ", defaultCategoryCode=" + defaultCategoryCode
                + ", catalogCodes=" + catalogCodes + ", price=" + price + ", dateCreate=" + dateCreate + ", dateUpdate=" + dateUpdate + "]";
    }
    
}