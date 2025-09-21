package dev.chiksmedina.solar.broken.security

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType.Companion.NonZero
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap.Companion.Round
import androidx.compose.ui.graphics.StrokeJoin.Companion.Miter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import dev.chiksmedina.solar.broken.SecurityGroup

val SecurityGroup.ShieldKeyholeMinimalistic: ImageVector
    get() {
        if (_shieldKeyholeMinimalistic != null) {
            return _shieldKeyholeMinimalistic!!
        }
        _shieldKeyholeMinimalistic = Builder(
            name = "ShieldKeyholeMinimalistic", defaultWidth =
            24.0.dp, defaultHeight = 24.0.dp, viewportWidth = 24.0f, viewportHeight =
            24.0f
        ).apply {
            path(
                fill = SolidColor(Color(0x00000000)), stroke = SolidColor(Color(0xFF000000)),
                strokeLineWidth = 1.5f, strokeLineCap = Round, strokeLineJoin = Miter,
                strokeLineMiter = 4.0f, pathFillType = NonZero
            ) {
                moveTo(12.0f, 13.5001f)
                verticalLineTo(16.5001f)
                moveTo(13.4997f, 13.0978f)
                curveTo(12.0651f, 13.9261f, 10.2306f, 13.4345f, 9.4024f, 11.9999f)
                curveTo(8.5741f, 10.5653f, 9.0656f, 8.7308f, 10.5003f, 7.9025f)
                curveTo(11.085f, 7.5649f, 11.7363f, 7.4465f, 12.3587f, 7.522f)
                curveTo(13.2632f, 7.6316f, 14.107f, 8.1505f, 14.5976f, 9.0004f)
                curveTo(15.0883f, 9.8503f, 15.1158f, 10.8404f, 14.7585f, 11.6786f)
                curveTo(14.5126f, 12.2554f, 14.0845f, 12.7602f, 13.4997f, 13.0978f)
                close()
            }
            path(
                fill = SolidColor(Color(0x00000000)), stroke = SolidColor(Color(0xFF000000)),
                strokeLineWidth = 1.5f, strokeLineCap = Round, strokeLineJoin = Miter,
                strokeLineMiter = 4.0f, pathFillType = NonZero
            ) {
                moveTo(3.0f, 10.4167f)
                curveTo(3.0f, 7.2191f, 3.0f, 5.6203f, 3.3775f, 5.0824f)
                curveTo(3.755f, 4.5445f, 5.2583f, 4.03f, 8.2649f, 3.0008f)
                lineTo(8.8377f, 2.8047f)
                curveTo(10.405f, 2.2682f, 11.1886f, 2.0f, 12.0f, 2.0f)
                curveTo(12.8114f, 2.0f, 13.595f, 2.2682f, 15.1623f, 2.8047f)
                lineTo(15.7351f, 3.0008f)
                curveTo(18.7417f, 4.03f, 20.245f, 4.5445f, 20.6225f, 5.0824f)
                curveTo(21.0f, 5.6203f, 21.0f, 7.2191f, 21.0f, 10.4167f)
                curveTo(21.0f, 10.8996f, 21.0f, 11.4234f, 21.0f, 11.9914f)
                curveTo(21.0f, 14.4963f, 20.1632f, 16.4284f, 19.0f, 17.9041f)
                moveTo(3.1928f, 14.0f)
                curveTo(4.0503f, 18.2984f, 7.5764f, 20.5129f, 9.8986f, 21.5273f)
                curveTo(10.62f, 21.8424f, 10.9807f, 22.0f, 12.0f, 22.0f)
                curveTo(13.0193f, 22.0f, 13.38f, 21.8424f, 14.1014f, 21.5273f)
                curveTo(14.6796f, 21.2747f, 15.3324f, 20.9478f, 16.0f, 20.5328f)
            }
        }
            .build()
        return _shieldKeyholeMinimalistic!!
    }

private var _shieldKeyholeMinimalistic: ImageVector? = null
