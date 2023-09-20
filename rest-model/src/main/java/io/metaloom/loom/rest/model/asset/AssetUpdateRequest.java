package io.metaloom.loom.rest.model.asset;

import java.util.List;

import com.fasterxml.jackson.annotation.JsonPropertyDescription;

import io.metaloom.loom.rest.model.RestRequestModel;
import io.metaloom.loom.rest.model.annotation.AnnotationResponse;
import io.metaloom.loom.rest.model.asset.info.AudioInfo;
import io.metaloom.loom.rest.model.asset.info.ConsistencyInfo;
import io.metaloom.loom.rest.model.asset.info.DocumentInfo;
import io.metaloom.loom.rest.model.asset.info.FileInfo;
import io.metaloom.loom.rest.model.asset.info.GeoLocationInfo;
import io.metaloom.loom.rest.model.asset.info.HashInfo;
import io.metaloom.loom.rest.model.asset.info.ImageInfo;
import io.metaloom.loom.rest.model.asset.info.MediaInfo;
import io.metaloom.loom.rest.model.asset.info.VideoInfo;
import io.metaloom.loom.rest.model.asset.location.AssetS3Meta;
import io.metaloom.loom.rest.model.tag.TagReference;
import io.vertx.core.json.JsonObject;

public class AssetUpdateRequest implements RestRequestModel, AssetModel<AssetUpdateRequest> {

	// @JsonPropertyDescription("The specific identified kind of asset.")
	// private AssetKind kind;

	@JsonPropertyDescription("The filename for the asset.")
	private String filename;

	@JsonPropertyDescription("The dominant color for the asset.")
	private String dominantColor;

	@JsonPropertyDescription("Custom meta properties for the asset.")
	private JsonObject meta;

	@JsonPropertyDescription("Timeline information on the asset.")
	private List<AnnotationResponse> timeline;

	@JsonPropertyDescription("S3 meta information on the asset. (only set when S3 is being utilized).")
	private AssetS3Meta s3;

	// @JsonPropertyDescription("The local path of the asset. This will only be returned when the asset was created using a local path.")
	// private String localPath;

	@JsonPropertyDescription("A list of tags on the asset.")
	private List<TagReference> tags;

	@JsonPropertyDescription("Information about the asset file.")
	private FileInfo file;

	@JsonPropertyDescription("Information about consistency checks on the the asset.")
	private ConsistencyInfo consistency;

	@JsonPropertyDescription("A set of different computed hashes for the asset.")
	private HashInfo hashes;

	@JsonPropertyDescription("Information about common media properties (e.g. duration, dimension)")
	private MediaInfo media;

	@JsonPropertyDescription("Information about the image component of the asset (if present)")
	private ImageInfo image;

	@JsonPropertyDescription("Information about the video component of the asset (if present)")
	private VideoInfo video;

	@JsonPropertyDescription("Information about the audio component of the asset (if present)")
	private AudioInfo audio;

	@JsonPropertyDescription("Information about the document (text) component of the asset (if present)")
	private DocumentInfo document;

	@JsonPropertyDescription("The geo spatial location of the asset.")
	private GeoLocationInfo geo;

	public AssetUpdateRequest() {
	}

	// public AssetKind getKind() {
	// return kind;
	// }
	//
	// public AssetUpdateRequest setKind(AssetKind kind) {
	// this.kind = kind;
	// return this;
	// }

	public AssetS3Meta getS3() {
		return s3;
	}

	public AssetUpdateRequest setS3(AssetS3Meta s3) {
		this.s3 = s3;
		return this;
	}

	public String getFilename() {
		return filename;
	}

	public AssetUpdateRequest setFilename(String filename) {
		this.filename = filename;
		return this;
	}

	@Override
	public FileInfo getFile() {
		return file;
	}

	@Override
	public AssetUpdateRequest setFile(FileInfo file) {
		this.file = file;
		return this;
	}

	@Override
	public ConsistencyInfo getConsistency() {
		return consistency;
	}

	@Override
	public AssetUpdateRequest setConsistency(ConsistencyInfo consistency) {
		this.consistency = consistency;
		return this;
	}

	@Override
	public JsonObject getMeta() {
		return meta;
	}

	@Override
	public AssetUpdateRequest setMeta(JsonObject meta) {
		this.meta = meta;
		return this;
	}

	public List<AnnotationResponse> getTimeline() {
		return timeline;
	}

	public AssetUpdateRequest setTimeline(List<AnnotationResponse> timeline) {
		this.timeline = timeline;
		return this;
	}

	// public String getLocalPath() {
	// return localPath;
	// }
	//
	// public AssetUpdateRequest setLocalPath(String localPath) {
	// this.localPath = localPath;
	// return this;
	// }

	public List<TagReference> getTags() {
		return tags;
	}

	public AssetUpdateRequest setTags(List<TagReference> tags) {
		this.tags = tags;
		return this;
	}

	@Override
	public HashInfo getHashes() {
		return hashes;
	}

	@Override
	public AssetUpdateRequest setHashes(HashInfo hashes) {
		this.hashes = hashes;
		return this;
	}

	@Override
	public MediaInfo getMedia() {
		return media;
	}

	@Override
	public AssetUpdateRequest setMedia(MediaInfo media) {
		this.media = media;
		return this;
	}

	@Override
	public AudioInfo getAudio() {
		return audio;
	}

	@Override
	public AssetUpdateRequest setAudio(AudioInfo audio) {
		this.audio = audio;
		return this;
	}

	@Override
	public ImageInfo getImage() {
		return image;
	}

	@Override
	public AssetUpdateRequest setImage(ImageInfo image) {
		this.image = image;
		return this;
	}

	@Override
	public VideoInfo getVideo() {
		return video;
	}

	@Override
	public AssetUpdateRequest setVideo(VideoInfo video) {
		this.video = video;
		return this;
	}

	@Override
	public DocumentInfo getDocument() {
		return document;
	}

	@Override
	public AssetUpdateRequest setDocument(DocumentInfo document) {
		this.document = document;
		return this;
	}

	@Override
	public GeoLocationInfo getGeo() {
		return geo;
	}

	@Override
	public AssetUpdateRequest setGeo(GeoLocationInfo geo) {
		this.geo = geo;
		return this;
	}

	@Override
	public AssetUpdateRequest self() {
		return this;
	}

}
