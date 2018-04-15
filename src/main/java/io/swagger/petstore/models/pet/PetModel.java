package io.swagger.petstore.models.pet;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import javax.annotation.Generated;
import java.util.List;
import java.util.Objects;

@Generated("com.robohorse.robopojogenerator")
@JsonInclude(JsonInclude.Include.NON_NULL)
public class PetModel {

    @JsonProperty("photoUrls")
    private List<String> photoUrls;
    @JsonProperty("name")
    private String name;
    @JsonProperty("id")
    private Integer id;
    @JsonProperty("category")
    private Category category;
    @JsonProperty("tags")
    private List<TagsItem> tags;
    @JsonProperty("status")
    private String status;

    public PetModel() {

    }

    public PetModel(List<String> photoUrls, String name, Integer id, Category category, List<TagsItem> tags, String
            status) {
        this.photoUrls = photoUrls;
        this.name = name;
        this.id = id;
        this.category = category;
        this.tags = tags;
        this.status = status;
    }

    private PetModel(Builder builder) {
        setPhotoUrls(builder.photoUrls);
        setName(builder.name);
        setId(builder.id);
        setCategory(builder.category);
        setTags(builder.tags);
        setStatus(builder.status);
    }

    public static Builder newBuilder() {
        return new Builder();
    }

    public List<String> getPhotoUrls() {
        return photoUrls;
    }

    public void setPhotoUrls(List<String> photoUrls) {
        this.photoUrls = photoUrls;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Category getCategory() {
        return category;
    }

    public void setCategory(Category category) {
        this.category = category;
    }

    public List<TagsItem> getTags() {
        return tags;
    }

    public void setTags(List<TagsItem> tags) {
        this.tags = tags;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("PetModel{");
        sb.append("photoUrls=").append(photoUrls);
        sb.append(", name='").append(name).append('\'');
        sb.append(", id=").append(id);
        sb.append(", category=").append(category);
        sb.append(", tags=").append(tags);
        sb.append(", status='").append(status).append('\'');
        sb.append('}');
        return sb.toString();
    }

    @Override
    public int hashCode() {
        return Objects.hash(category, id, name, photoUrls, status, tags);
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        PetModel that = (PetModel) o;

        return Objects.equals(this.category, that.category) &&
                Objects.equals(this.id, that.id) &&
                Objects.equals(this.name, that.name) &&
                Objects.equals(this.photoUrls, that.photoUrls) &&
                Objects.equals(this.status, that.status) &&
                Objects.equals(this.tags, that.tags);
    }

    public static enum Status {

        AVAILABLE, UNAVAILABLE

    }

    public static final class Builder {
        private List<String> photoUrls;
        private String name;
        private Integer id;
        private Category category;
        private List<TagsItem> tags;
        private String status;

        private Builder() {
        }

        public Builder withPhotoUrls(List<String> val) {
            photoUrls = val;
            return this;
        }

        public Builder withName(String val) {
            name = val;
            return this;
        }

        public Builder withId(Integer val) {
            id = val;
            return this;
        }

        public Builder withCategory(Category val) {
            category = val;
            return this;
        }

        public Builder withTags(List<TagsItem> val) {
            tags = val;
            return this;
        }

        public Builder withStatus(String val) {
            status = val;
            return this;
        }

        public PetModel build() {
            return new PetModel(this);
        }
    }
}