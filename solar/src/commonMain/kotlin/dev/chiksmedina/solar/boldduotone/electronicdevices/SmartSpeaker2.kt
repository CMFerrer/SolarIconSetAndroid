package dev.chiksmedina.solar.boldduotone.electronicdevices

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType.Companion.NonZero
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap.Companion.Butt
import androidx.compose.ui.graphics.StrokeJoin.Companion.Miter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import dev.chiksmedina.solar.boldduotone.ElectronicDevicesGroup

val ElectronicDevicesGroup.SmartSpeaker2: ImageVector
    get() {
        if (_smartSpeaker2 != null) {
            return _smartSpeaker2!!
        }
        _smartSpeaker2 = Builder(
            name = "SmartSpeaker2", defaultWidth = 24.0.dp, defaultHeight =
            24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f
        ).apply {
            path(
                fill = SolidColor(Color(0xFF000000)), stroke = null, fillAlpha = 0.5f, strokeAlpha
                = 0.5f, strokeLineWidth = 0.0f, strokeLineCap = Butt, strokeLineJoin = Miter,
                strokeLineMiter = 4.0f, pathFillType = NonZero
            ) {
                moveTo(18.0476f, 3.4354f)
                curveTo(18.0691f, 3.5186f, 18.0814f, 3.6035f, 18.0849f, 3.6896f)
                curveTo(18.1421f, 5.1057f, 15.8124f, 6.8747f, 12.648f, 7.7548f)
                curveTo(9.291f, 8.6885f, 6.2659f, 8.2684f, 5.8911f, 6.8165f)
                curveTo(5.8589f, 6.6919f, 5.8473f, 6.5637f, 5.8551f, 6.4329f)
                curveTo(5.8567f, 6.4071f, 5.859f, 6.3811f, 5.862f, 6.3551f)
                curveTo(6.0233f, 4.9776f, 8.2789f, 3.3347f, 11.2908f, 2.4971f)
                curveTo(14.6477f, 1.5634f, 17.6729f, 1.9835f, 18.0476f, 3.4354f)
                close()
            }
            path(
                fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                pathFillType = NonZero
            ) {
                moveTo(12.648f, 7.7547f)
                curveTo(9.2911f, 8.6884f, 6.2659f, 8.2683f, 5.8911f, 6.8164f)
                curveTo(5.8589f, 6.6918f, 5.8474f, 6.5636f, 5.8552f, 6.4328f)
                lineTo(5.2461f, 13.3087f)
                curveTo(5.8051f, 13.8701f, 7.4902f, 14.9997f, 11.9996f, 14.9997f)
                curveTo(16.6277f, 14.9997f, 18.2809f, 13.8098f, 18.7949f, 13.2656f)
                lineTo(18.0849f, 3.6895f)
                curveTo(18.1421f, 5.1056f, 15.8124f, 6.8745f, 12.648f, 7.7547f)
                close()
            }
            path(
                fill = SolidColor(Color(0xFF000000)), stroke = null, fillAlpha = 0.5f, strokeAlpha
                = 0.5f, strokeLineWidth = 0.0f, strokeLineCap = Butt, strokeLineJoin = Miter,
                strokeLineMiter = 4.0f, pathFillType = NonZero
            ) {
                moveTo(7.0299f, 21.4129f)
                curveTo(8.0056f, 21.9999f, 9.3423f, 21.9999f, 12.0156f, 21.9999f)
                curveTo(14.6588f, 21.9999f, 15.9804f, 21.9999f, 16.9506f, 21.4216f)
                curveTo(17.6678f, 20.9942f, 18.2472f, 20.3563f, 18.6162f, 19.5881f)
                curveTo(19.1153f, 18.5488f, 19.0377f, 17.1793f, 18.8825f, 14.4403f)
                lineTo(18.7949f, 13.2656f)
                curveTo(18.2809f, 13.8098f, 16.6277f, 14.9997f, 11.9996f, 14.9997f)
                curveTo(7.4902f, 14.9997f, 5.8051f, 13.8701f, 5.2461f, 13.3087f)
                lineTo(5.1543f, 14.3509f)
                curveTo(4.9638f, 17.1187f, 4.8686f, 18.5027f, 5.3631f, 19.5547f)
                curveTo(5.7285f, 20.3322f, 6.3088f, 20.9791f, 7.0299f, 21.4129f)
                close()
            }
        }
            .build()
        return _smartSpeaker2!!
    }

private var _smartSpeaker2: ImageVector? = null
