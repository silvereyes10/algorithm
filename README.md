# algorithm

```
enum FileExtensionEnum {
		MP3(FileTypeEnum.MUSIC),
		AAC(FileTypeEnum.MUSIC),
		FLAC(FileTypeEnum.MUSIC),
		JPG(FileTypeEnum.IMAGE),
		BMP(FileTypeEnum.IMAGE),
		GIF(FileTypeEnum.IMAGE),
		MP4(FileTypeEnum.MOVIE),
		AVI(FileTypeEnum.MOVIE),
		MKV(FileTypeEnum.MOVIE);

		private static final Map<String, FileTypeEnum> fileTypeMap
				= Arrays.stream(values())
				.collect(Collectors.toMap(extension -> extension.name().toLowerCase(), FileExtensionEnum::getFileTypeEnum));
		private FileTypeEnum fileTypeEnum;

		public FileTypeEnum getFileTypeEnum() {
			return fileTypeEnum;
		}

		FileExtensionEnum(FileTypeEnum fileTypeEnum) {
			this.fileTypeEnum = fileTypeEnum;
		}

		public static FileTypeEnum getFileTypeFromExtension(String fileExtension) {
			return fileTypeMap.getOrDefault(fileExtension, FileTypeEnum.OTHER);
		}
	}

	enum FileTypeEnum {
		MUSIC("music"),
		IMAGE("images"),
		MOVIE("movies"),
		OTHER("other");

		private final String fileTypeName;

		FileTypeEnum(String fileTypeName) {
			this.fileTypeName = fileTypeName;
		}

		public String getFileTypeName() {
			return fileTypeName;
		}
	}

```
