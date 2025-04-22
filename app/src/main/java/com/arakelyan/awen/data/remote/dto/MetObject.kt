import kotlinx.serialization.SerialName
import kotlinx.serialization.Serializable

@Serializable
data class ElementMeasurements(
    @SerialName("Height") val height: Float = 0f,
    @SerialName("Width") val width: Float = 0f,
    @SerialName("Depth") val depth: Float = 0f
)

@Serializable
data class Measurement(
    @SerialName("elementName") val elementName: String = "",
    @SerialName("elementDescription") val elementDescription: String = "",
    @SerialName("elementMeasurements") val elementMeasurements: ElementMeasurements?
)

@Serializable
data class Constituent(
    @SerialName("constituentID") val constituentID: Int,
    @SerialName("role") val role: String = "",
    @SerialName("name") val name: String = "",
    @SerialName("constituentULAN_URL") val constituentUlanUrl: String = "",
    @SerialName("constituentWikidata_URL") val constituentWikidataUrl: String = "",
    @SerialName("gender") val gender: String = ""
)

@Serializable
data class Tag(
    @SerialName("term") val term: String = "",
    @SerialName("AAT_URL") val aatUrl: String = "",
    @SerialName("Wikidata_URL") val wikidataUrl: String = ""
)

@Serializable
data class MetObject(
    @SerialName("objectID") val objectID: Int,
    @SerialName("isHighlight") val isHighlight: Boolean,
    @SerialName("accessionNumber") val accessionNumber: String = "",
    @SerialName("accessionYear") val accessionYear: String = "",
    @SerialName("isPublicDomain") val isPublicDomain: Boolean,
    @SerialName("primaryImage") val primaryImage: String = "",
    @SerialName("primaryImageSmall") val primaryImageSmall: String = "",
    @SerialName("additionalImages") val additionalImages: List<String> = emptyList(),
    @SerialName("constituents") val constituents: List<Constituent> = emptyList(),
    @SerialName("department") val department: String = "",
    @SerialName("objectName") val objectName: String = "",
    @SerialName("title") val title: String = "",
    @SerialName("culture") val culture: String = "",
    @SerialName("period") val period: String = "",
    @SerialName("dynasty") val dynasty: String = "",
    @SerialName("reign") val reign: String = "",
    @SerialName("portfolio") val portfolio: String = "",
    @SerialName("artistRole") val artistRole: String = "",
    @SerialName("artistPrefix") val artistPrefix: String = "",
    @SerialName("artistDisplayName") val artistDisplayName: String = "",
    @SerialName("artistDisplayBio") val artistDisplayBio: String = "",
    @SerialName("artistSuffix") val artistSuffix: String = "",
    @SerialName("artistAlphaSort") val artistAlphaSort: String = "",
    @SerialName("artistNationality") val artistNationality: String = "",
    @SerialName("artistBeginDate") val artistBeginDate: String = "",
    @SerialName("artistEndDate") val artistEndDate: String = "",
    @SerialName("artistGender") val artistGender: String = "",
    @SerialName("artistWikidata_URL") val artistWikidataUrl: String = "",
    @SerialName("artistULAN_URL") val artistUlanUrl: String = "",
    @SerialName("objectDate") val objectDate: String = "",
    @SerialName("objectBeginDate") val objectBeginDate: Int?,
    @SerialName("objectEndDate") val objectEndDate: Int?,
    @SerialName("medium") val medium: String = "",
    @SerialName("dimensions") val dimensions: String = "",
    @SerialName("measurements") val measurements: List<Measurement> = emptyList(),
    @SerialName("creditLine") val creditLine: String = "",
    @SerialName("geographyType") val geographyType: String = "",
    @SerialName("city") val city: String = "",
    @SerialName("state") val state: String = "",
    @SerialName("county") val county: String = "",
    @SerialName("country") val country: String = "",
    @SerialName("region") val region: String = "",
    @SerialName("subregion") val subregion: String = "",
    @SerialName("locale") val locale: String = "",
    @SerialName("locus") val locus: String = "",
    @SerialName("excavation") val excavation: String = "",
    @SerialName("river") val river: String = "",
    @SerialName("classification") val classification: String = "",
    @SerialName("rightsAndReproduction") val rightsAndReproduction: String = "",
    @SerialName("linkResource") val linkResource: String = "",
    @SerialName("awenadataDate") val awenadataDate: String = "",
    @SerialName("repository") val repository: String = "",
    @SerialName("objectURL") val objectURL: String = "",
    @SerialName("tags") val tags: List<Tag> = emptyList(),
    @SerialName("objectWikidata_URL") val objectWikidataUrl: String = "",
    @SerialName("isTimelineWork") val isTimelineWork: Boolean,
    @SerialName("GalleryNumber") val galleryNumber: String = ""
)
