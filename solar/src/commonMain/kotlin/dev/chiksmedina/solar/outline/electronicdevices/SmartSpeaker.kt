package dev.chiksmedina.solar.outline.electronicdevices

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType.Companion.EvenOdd
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap.Companion.Butt
import androidx.compose.ui.graphics.StrokeJoin.Companion.Miter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import dev.chiksmedina.solar.outline.ElectronicDevicesGroup

val ElectronicDevicesGroup.SmartSpeaker: ImageVector
    get() {
        if (_smartSpeaker != null) {
            return _smartSpeaker!!
        }
        _smartSpeaker = Builder(
            name = "SmartSpeaker", defaultWidth = 24.0.dp, defaultHeight =
            24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f
        ).apply {
            path(
                fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                pathFillType = EvenOdd
            ) {
                moveTo(16.4073f, 3.1584f)
                curveTo(13.4943f, 2.6139f, 10.5052f, 2.6139f, 7.5922f, 3.1584f)
                lineTo(7.3772f, 3.1986f)
                curveTo(5.6113f, 3.5287f, 4.2697f, 4.9674f, 4.0661f, 6.7436f)
                lineTo(4.0504f, 6.8806f)
                curveTo(3.7901f, 9.1523f, 3.6989f, 11.4384f, 3.7771f, 13.7201f)
                curveTo(4.3716f, 14.1844f, 5.5932f, 14.955f, 7.9203f, 15.4013f)
                curveTo(8.241f, 14.5956f, 8.6957f, 13.9426f, 9.341f, 13.4835f)
                curveTo(10.0789f, 12.9585f, 10.9776f, 12.75f, 12.0f, 12.75f)
                curveTo(13.0224f, 12.75f, 13.9211f, 12.9585f, 14.659f, 13.4835f)
                curveTo(15.3049f, 13.943f, 15.7598f, 14.5968f, 16.0806f, 15.4034f)
                curveTo(16.9718f, 15.2327f, 17.6939f, 15.0149f, 18.2762f, 14.787f)
                curveTo(19.2559f, 14.4034f, 19.8579f, 13.9844f, 20.2204f, 13.686f)
                curveTo(20.3048f, 11.3338f, 20.2088f, 8.9769f, 19.9326f, 6.636f)
                curveTo(19.7304f, 4.9228f, 18.4342f, 3.5373f, 16.7302f, 3.2188f)
                lineTo(16.4073f, 3.1584f)
                close()
                moveTo(20.114f, 15.5711f)
                curveTo(19.7571f, 15.7753f, 19.3307f, 15.985f, 18.823f, 16.1837f)
                curveTo(17.325f, 16.7702f, 15.1504f, 17.25f, 12.0f, 17.25f)
                curveTo(7.779f, 17.25f, 5.3028f, 16.376f, 3.8782f, 15.5787f)
                curveTo(3.9236f, 16.1863f, 3.981f, 16.7931f, 4.0504f, 17.399f)
                curveTo(4.2582f, 19.2116f, 5.6834f, 20.6496f, 7.5029f, 20.8763f)
                lineTo(8.5184f, 21.0029f)
                curveTo(9.0161f, 21.0649f, 9.2549f, 21.0947f, 9.4929f, 21.1195f)
                curveTo(11.1596f, 21.2935f, 12.8399f, 21.2935f, 14.5066f, 21.1195f)
                curveTo(14.7446f, 21.0947f, 14.9834f, 21.0649f, 15.4811f, 21.0029f)
                lineTo(16.3872f, 20.89f)
                curveTo(18.2685f, 20.6555f, 19.7405f, 19.1657f, 19.9494f, 17.2909f)
                lineTo(19.9666f, 17.1368f)
                curveTo(20.0247f, 16.6156f, 20.0738f, 16.0936f, 20.114f, 15.5711f)
                close()
                moveTo(14.5392f, 15.6271f)
                curveTo(14.3251f, 15.2007f, 14.0736f, 14.9079f, 13.7894f, 14.7057f)
                curveTo(13.3845f, 14.4176f, 12.8243f, 14.25f, 12.0f, 14.25f)
                curveTo(11.1757f, 14.25f, 10.6155f, 14.4176f, 10.2106f, 14.7057f)
                curveTo(9.9266f, 14.9077f, 9.6753f, 15.2002f, 9.4614f, 15.6259f)
                curveTo(10.2164f, 15.7045f, 11.0595f, 15.75f, 12.0f, 15.75f)
                curveTo(12.9435f, 15.75f, 13.7865f, 15.7048f, 14.5392f, 15.6271f)
                close()
                moveTo(7.3166f, 1.684f)
                curveTo(10.4117f, 1.1053f, 13.5878f, 1.1053f, 16.6829f, 1.684f)
                lineTo(17.0059f, 1.7443f)
                curveTo(19.3526f, 2.183f, 21.1429f, 4.0925f, 21.4223f, 6.4602f)
                curveTo(21.8472f, 10.0614f, 21.859f, 13.6991f, 21.4573f, 17.3029f)
                lineTo(21.4402f, 17.457f)
                curveTo(21.1541f, 20.0244f, 19.1397f, 22.0585f, 16.5727f, 22.3784f)
                lineTo(15.6563f, 22.4927f)
                curveTo(15.171f, 22.5531f, 14.9168f, 22.5848f, 14.6623f, 22.6114f)
                curveTo(12.8921f, 22.7962f, 11.1074f, 22.7962f, 9.3372f, 22.6114f)
                curveTo(9.0827f, 22.5848f, 8.8285f, 22.5531f, 8.3432f, 22.4927f)
                lineTo(7.3174f, 22.3648f)
                curveTo(4.814f, 22.0528f, 2.8471f, 20.0729f, 2.5602f, 17.5698f)
                curveTo(2.1466f, 13.9615f, 2.1466f, 10.318f, 2.5602f, 6.7098f)
                lineTo(2.5759f, 6.5728f)
                curveTo(2.8548f, 4.14f, 4.6912f, 2.1748f, 7.1015f, 1.7242f)
                lineTo(7.3166f, 1.684f)
                close()
                moveTo(8.5687f, 3.9225f)
                curveTo(8.8387f, 4.2366f, 8.8031f, 4.7101f, 8.489f, 4.9802f)
                curveTo(8.4102f, 5.0479f, 8.3468f, 5.1329f, 8.3044f, 5.2202f)
                curveTo(8.2606f, 5.3102f, 8.25f, 5.3797f, 8.25f, 5.4115f)
                curveTo(8.25f, 5.5512f, 8.3522f, 5.8544f, 9.0258f, 6.1617f)
                curveTo(9.6747f, 6.4578f, 10.683f, 6.6615f, 12.0f, 6.6615f)
                curveTo(13.317f, 6.6615f, 14.3253f, 6.4578f, 14.9742f, 6.1617f)
                curveTo(15.6478f, 5.8544f, 15.75f, 5.5512f, 15.75f, 5.4115f)
                curveTo(15.75f, 5.3814f, 15.7359f, 5.2621f, 15.511f, 5.0687f)
                curveTo(15.1969f, 4.7986f, 15.1613f, 4.3251f, 15.4313f, 4.011f)
                curveTo(15.7014f, 3.6969f, 16.1749f, 3.6613f, 16.489f, 3.9313f)
                curveTo(16.9047f, 4.2888f, 17.25f, 4.788f, 17.25f, 5.4115f)
                curveTo(17.25f, 6.4251f, 16.483f, 7.122f, 15.5969f, 7.5263f)
                curveTo(14.6861f, 7.9419f, 13.4444f, 8.1615f, 12.0f, 8.1615f)
                curveTo(10.5556f, 8.1615f, 9.3139f, 7.9419f, 8.4031f, 7.5263f)
                curveTo(7.517f, 7.122f, 6.75f, 6.4251f, 6.75f, 5.4115f)
                curveTo(6.75f, 4.8422f, 7.044f, 4.2443f, 7.511f, 3.8428f)
                curveTo(7.8251f, 3.5727f, 8.2986f, 3.6084f, 8.5687f, 3.9225f)
                close()
            }
        }
            .build()
        return _smartSpeaker!!
    }

private var _smartSpeaker: ImageVector? = null
