package dev.chiksmedina.solar.lineduotone.security

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType.Companion.NonZero
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap.Companion.Butt
import androidx.compose.ui.graphics.StrokeJoin.Companion.Miter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import dev.chiksmedina.solar.lineduotone.SecurityGroup

val SecurityGroup.ShieldMinimalistic: ImageVector
    get() {
        if (_shieldMinimalistic != null) {
            return _shieldMinimalistic!!
        }
        _shieldMinimalistic = Builder(
            name = "ShieldMinimalistic", defaultWidth = 24.0.dp,
            defaultHeight = 24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f
        ).apply {
            path(
                fill = SolidColor(Color(0x00000000)), stroke = SolidColor(Color(0xFF000000)),
                strokeLineWidth = 1.5f, strokeLineCap = Butt, strokeLineJoin = Miter,
                strokeLineMiter = 4.0f, pathFillType = NonZero
            ) {
                moveTo(12.0f, 22.0f)
                curveTo(10.9808f, 22.0f, 10.62f, 21.8424f, 9.8986f, 21.5273f)
                curveTo(7.239f, 20.3655f, 3.0f, 17.6294f, 3.0f, 11.9914f)
                verticalLineTo(10.4168f)
                curveTo(3.0f, 7.2192f, 3.0f, 5.6204f, 3.3775f, 5.0825f)
                curveTo(3.755f, 4.5447f, 5.2583f, 4.03f, 8.2648f, 3.0008f)
                lineTo(8.8377f, 2.8047f)
                curveTo(10.4049f, 2.2682f, 11.1885f, 2.0f, 11.9999f, 2.0f)
            }
            path(
                fill = SolidColor(Color(0x00000000)), stroke = SolidColor(Color(0xFF000000)),
                fillAlpha = 0.5f, strokeAlpha = 0.5f, strokeLineWidth = 1.5f, strokeLineCap =
                Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f, pathFillType = NonZero
            ) {
                moveTo(12.0001f, 22.0f)
                curveTo(13.0193f, 22.0f, 13.3801f, 21.8424f, 14.1015f, 21.5273f)
                curveTo(16.7611f, 20.3655f, 21.0001f, 17.6294f, 21.0001f, 11.9914f)
                verticalLineTo(10.4168f)
                curveTo(21.0001f, 7.2192f, 21.0001f, 5.6204f, 20.6226f, 5.0825f)
                curveTo(20.245f, 4.5447f, 18.7417f, 4.03f, 15.7351f, 3.0008f)
                lineTo(15.1623f, 2.8047f)
                curveTo(13.595f, 2.2682f, 12.8114f, 2.0f, 12.0f, 2.0f)
            }
        }
            .build()
        return _shieldMinimalistic!!
    }

private var _shieldMinimalistic: ImageVector? = null
