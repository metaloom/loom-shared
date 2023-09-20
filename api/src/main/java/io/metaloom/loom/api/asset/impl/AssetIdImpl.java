package io.metaloom.loom.api.asset.impl;

import java.util.UUID;

import io.metaloom.loom.api.asset.AssetId;
import io.metaloom.utils.hash.SHA512Sum;

public class AssetIdImpl implements AssetId {

	private final UUID uuid;

	private final SHA512Sum hash;

	public AssetIdImpl(UUID uuid) {
		this.uuid = uuid;
		this.hash = null;
	}

	public AssetIdImpl(SHA512Sum hash) {
		this.hash = hash;
		this.uuid = null;
	}

	@Override
	public UUID uuid() {
		return uuid;
	}

	@Override
	public SHA512Sum hashsum() {
		return hash;
	}

	@Override
	public boolean isUUID() {
		return uuid != null;
	}

	@Override
	public String toString() {
		return uuid != null ? uuid.toString() : hash.toString();
	}

}
