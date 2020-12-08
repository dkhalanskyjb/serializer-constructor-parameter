import kotlinx.serialization.*
import kotlinx.serialization.descriptors.SerialDescriptor
import kotlinx.serialization.encoding.Decoder
import kotlinx.serialization.encoding.Encoder

class X() {
}

class XSerializer(param: Unit) : KSerializer<X> {
    override val descriptor: SerialDescriptor get() = TODO()
    override fun serialize(encoder: Encoder, value: X) { TODO() }
    override fun deserialize(decoder: Decoder): X { TODO() }
}

@Serializable
data class Item(
    @Serializable(with = XSerializer::class)
    val x: X
)