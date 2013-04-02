package com.yf.object;

public class BuilderTest {
	private final int requiredParam1;
	private final int requiredParam2;
	private final int optionalParam1;
	private final int optionalParam2;

	public static class Builder {
		// required Param
		private final int requiredParam1;
		private final int requiredParam2;
		// optional param
		private  int optionalParam1=0;
		private  int optionalParam2=0;

		public Builder(int requiredParam1, int requiredParam2) {
			this.requiredParam1 = requiredParam1;
			this.requiredParam2 = requiredParam2;
		}

		public Builder initOptionalParam1(int optionParam) {
			optionalParam1 = optionParam;
			return this;
		}

		public Builder initOptionalParam2(int optionalParam) {
			optionalParam2 = optionalParam;
			return this;
		}

		public BuilderTest build() {
			return new BuilderTest(this);
		}
	}

	private BuilderTest(Builder builder) {
		requiredParam1 = builder.requiredParam1;
		requiredParam2 = builder.requiredParam2;
		optionalParam1 = builder.optionalParam1;
		optionalParam2 = builder.optionalParam2;
	}
	public static void main(String args[]){
		BuilderTest t =new BuilderTest.Builder(3, 4).build();
		System.out.println(t.requiredParam1);
		System.out.println(t.optionalParam1);
	}
}
