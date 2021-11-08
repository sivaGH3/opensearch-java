/*
 * Licensed to Elasticsearch B.V. under one or more contributor
 * license agreements. See the NOTICE file distributed with
 * this work for additional information regarding copyright
 * ownership. Elasticsearch B.V. licenses this file to you under
 * the Apache License, Version 2.0 (the "License"); you may
 * not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *     http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing,
 * software distributed under the License is distributed on an
 * "AS IS" BASIS, WITHOUT WARRANTIES OR CONDITIONS OF ANY
 * KIND, either express or implied.  See the License for the
 * specific language governing permissions and limitations
 * under the License.
 */

//----------------------------------------------------
// THIS CODE IS GENERATED. MANUAL EDITS WILL BE LOST.
//----------------------------------------------------

package co.elastic.clients.elasticsearch.core.search;

import co.elastic.clients.json.DelegatingDeserializer;
import co.elastic.clients.json.JsonpDeserializable;
import co.elastic.clients.json.JsonpDeserializer;
import co.elastic.clients.json.JsonpMapper;
import co.elastic.clients.json.JsonpSerializable;
import co.elastic.clients.json.ObjectBuilderDeserializer;
import co.elastic.clients.json.ObjectDeserializer;
import co.elastic.clients.util.ModelTypeHelper;
import co.elastic.clients.util.ObjectBuilder;
import co.elastic.clients.util.ObjectBuilderBase;
import jakarta.json.stream.JsonGenerator;
import java.lang.Long;
import java.lang.String;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Objects;
import java.util.function.Function;
import javax.annotation.Nullable;

// typedef: _global.search._types.FetchProfile
@JsonpDeserializable
public class FetchProfile implements JsonpSerializable {
	private final String type;

	private final String description;

	private final long timeInNanos;

	private final FetchProfileBreakdown breakdown;

	@Nullable
	private final FetchProfileDebug debug;

	private final List<FetchProfile> children;

	// ---------------------------------------------------------------------------------------------

	private FetchProfile(Builder builder) {

		this.type = ModelTypeHelper.requireNonNull(builder.type, this, "type");
		this.description = ModelTypeHelper.requireNonNull(builder.description, this, "description");
		this.timeInNanos = ModelTypeHelper.requireNonNull(builder.timeInNanos, this, "timeInNanos");
		this.breakdown = ModelTypeHelper.requireNonNull(builder.breakdown, this, "breakdown");
		this.debug = builder.debug;
		this.children = ModelTypeHelper.unmodifiable(builder.children);

	}

	public static FetchProfile of(Function<Builder, ObjectBuilder<FetchProfile>> fn) {
		return fn.apply(new Builder()).build();
	}

	/**
	 * Required - API name: {@code type}
	 */
	public final String type() {
		return this.type;
	}

	/**
	 * Required - API name: {@code description}
	 */
	public final String description() {
		return this.description;
	}

	/**
	 * Required - API name: {@code time_in_nanos}
	 */
	public final long timeInNanos() {
		return this.timeInNanos;
	}

	/**
	 * Required - API name: {@code breakdown}
	 */
	public final FetchProfileBreakdown breakdown() {
		return this.breakdown;
	}

	/**
	 * API name: {@code debug}
	 */
	@Nullable
	public final FetchProfileDebug debug() {
		return this.debug;
	}

	/**
	 * API name: {@code children}
	 */
	public final List<FetchProfile> children() {
		return this.children;
	}

	/**
	 * Serialize this object to JSON.
	 */
	public void serialize(JsonGenerator generator, JsonpMapper mapper) {
		generator.writeStartObject();
		serializeInternal(generator, mapper);
		generator.writeEnd();
	}

	protected void serializeInternal(JsonGenerator generator, JsonpMapper mapper) {

		generator.writeKey("type");
		generator.write(this.type);

		generator.writeKey("description");
		generator.write(this.description);

		generator.writeKey("time_in_nanos");
		generator.write(this.timeInNanos);

		generator.writeKey("breakdown");
		this.breakdown.serialize(generator, mapper);

		if (this.debug != null) {
			generator.writeKey("debug");
			this.debug.serialize(generator, mapper);

		}
		if (ModelTypeHelper.isDefined(this.children)) {
			generator.writeKey("children");
			generator.writeStartArray();
			for (FetchProfile item0 : this.children) {
				item0.serialize(generator, mapper);

			}
			generator.writeEnd();

		}

	}

	// ---------------------------------------------------------------------------------------------

	/**
	 * Builder for {@link FetchProfile}.
	 */
	public static class Builder extends ObjectBuilderBase implements ObjectBuilder<FetchProfile> {
		private String type;

		private String description;

		private Long timeInNanos;

		private FetchProfileBreakdown breakdown;

		@Nullable
		private FetchProfileDebug debug;

		@Nullable
		private List<FetchProfile> children;

		/**
		 * Required - API name: {@code type}
		 */
		public final Builder type(String value) {
			this.type = value;
			return this;
		}

		/**
		 * Required - API name: {@code description}
		 */
		public final Builder description(String value) {
			this.description = value;
			return this;
		}

		/**
		 * Required - API name: {@code time_in_nanos}
		 */
		public final Builder timeInNanos(long value) {
			this.timeInNanos = value;
			return this;
		}

		/**
		 * Required - API name: {@code breakdown}
		 */
		public final Builder breakdown(FetchProfileBreakdown value) {
			this.breakdown = value;
			return this;
		}

		/**
		 * Required - API name: {@code breakdown}
		 */
		public final Builder breakdown(
				Function<FetchProfileBreakdown.Builder, ObjectBuilder<FetchProfileBreakdown>> fn) {
			return this.breakdown(fn.apply(new FetchProfileBreakdown.Builder()).build());
		}

		/**
		 * API name: {@code debug}
		 */
		public final Builder debug(@Nullable FetchProfileDebug value) {
			this.debug = value;
			return this;
		}

		/**
		 * API name: {@code debug}
		 */
		public final Builder debug(Function<FetchProfileDebug.Builder, ObjectBuilder<FetchProfileDebug>> fn) {
			return this.debug(fn.apply(new FetchProfileDebug.Builder()).build());
		}

		/**
		 * API name: {@code children}
		 */
		public final Builder children(@Nullable List<FetchProfile> value) {
			this.children = value;
			return this;
		}

		/**
		 * API name: {@code children}
		 */
		public final Builder children(FetchProfile... value) {
			this.children = Arrays.asList(value);
			return this;
		}

		/**
		 * API name: {@code children}
		 */
		@SafeVarargs
		public final Builder children(Function<FetchProfile.Builder, ObjectBuilder<FetchProfile>>... fns) {
			this.children = new ArrayList<>(fns.length);
			for (Function<FetchProfile.Builder, ObjectBuilder<FetchProfile>> fn : fns) {
				this.children.add(fn.apply(new FetchProfile.Builder()).build());
			}
			return this;
		}

		/**
		 * Builds a {@link FetchProfile}.
		 *
		 * @throws NullPointerException
		 *             if some of the required fields are null.
		 */
		public FetchProfile build() {
			_checkSingleUse();

			return new FetchProfile(this);
		}
	}

	// ---------------------------------------------------------------------------------------------

	/**
	 * Json deserializer for {@link FetchProfile}
	 */
	public static final JsonpDeserializer<FetchProfile> _DESERIALIZER = ObjectBuilderDeserializer.lazy(Builder::new,
			FetchProfile::setupFetchProfileDeserializer, Builder::build);

	protected static void setupFetchProfileDeserializer(DelegatingDeserializer<FetchProfile.Builder> op) {

		op.add(Builder::type, JsonpDeserializer.stringDeserializer(), "type");
		op.add(Builder::description, JsonpDeserializer.stringDeserializer(), "description");
		op.add(Builder::timeInNanos, JsonpDeserializer.longDeserializer(), "time_in_nanos");
		op.add(Builder::breakdown, FetchProfileBreakdown._DESERIALIZER, "breakdown");
		op.add(Builder::debug, FetchProfileDebug._DESERIALIZER, "debug");
		op.add(Builder::children, JsonpDeserializer.arrayDeserializer(FetchProfile._DESERIALIZER), "children");

	}

}