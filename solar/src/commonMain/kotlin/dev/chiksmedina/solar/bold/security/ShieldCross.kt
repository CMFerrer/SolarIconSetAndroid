package dev.chiksmedina.solar.bold.security

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType.Companion.EvenOdd
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap.Companion.Butt
import androidx.compose.ui.graphics.StrokeJoin.Companion.Miter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import dev.chiksmedina.solar.bold.SecurityGroup

val SecurityGroup.ShieldCross: ImageVector
    get() {
        if (_shieldCross != null) {
            return _shieldCross!!
        }
        _shieldCross = Builder(
            name = "ShieldCross", defaultWidth = 24.0.dp, defaultHeight =
            24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f
        ).apply {
            path(
                fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                pathFillType = EvenOdd
            ) {
                moveTo(3.3775f, 5.0824f)
                curveTo(3.0f, 5.6203f, 3.0f, 7.2191f, 3.0f, 10.4167f)
                verticalLineTo(11.9914f)
                curveTo(3.0f, 17.6294f, 7.239f, 20.3655f, 9.8986f, 21.5273f)
                curveTo(10.62f, 21.8424f, 10.9807f, 22.0f, 12.0f, 22.0f)
                curveTo(13.0193f, 22.0f, 13.38f, 21.8424f, 14.1014f, 21.5273f)
                curveTo(16.761f, 20.3655f, 21.0f, 17.6294f, 21.0f, 11.9914f)
                verticalLineTo(10.4167f)
                curveTo(21.0f, 7.2191f, 21.0f, 5.6203f, 20.6225f, 5.0824f)
                curveTo(20.245f, 4.5445f, 18.7417f, 4.03f, 15.7351f, 3.0008f)
                lineTo(15.1623f, 2.8047f)
                curveTo(13.595f, 2.2682f, 12.8114f, 2.0f, 12.0f, 2.0f)
                curveTo(11.1886f, 2.0f, 10.405f, 2.2682f, 8.8377f, 2.8047f)
                lineTo(8.2649f, 3.0008f)
                curveTo(5.2583f, 4.03f, 3.755f, 4.5445f, 3.3775f, 5.0824f)
                close()
                moveTo(10.0303f, 8.9697f)
                curveTo(9.7374f, 8.6768f, 9.2626f, 8.6768f, 8.9697f, 8.9697f)
                curveTo(8.6768f, 9.2625f, 8.6768f, 9.7374f, 8.9697f, 10.0303f)
                lineTo(10.9394f, 12.0f)
                lineTo(8.9697f, 13.9697f)
                curveTo(8.6768f, 14.2625f, 8.6768f, 14.7374f, 8.9697f, 15.0303f)
                curveTo(9.2626f, 15.3232f, 9.7375f, 15.3232f, 10.0304f, 15.0303f)
                lineTo(12.0f, 13.0607f)
                lineTo(13.9696f, 15.0303f)
                curveTo(14.2625f, 15.3232f, 14.7374f, 15.3232f, 15.0303f, 15.0303f)
                curveTo(15.3232f, 14.7374f, 15.3232f, 14.2625f, 15.0303f, 13.9696f)
                lineTo(13.0607f, 12.0f)
                lineTo(15.0303f, 10.0303f)
                curveTo(15.3232f, 9.7374f, 15.3232f, 9.2626f, 15.0303f, 8.9697f)
                curveTo(14.7374f, 8.6768f, 14.2626f, 8.6768f, 13.9697f, 8.9697f)
                lineTo(12.0f, 10.9393f)
                lineTo(10.0303f, 8.9697f)
                close()
            }
        }
            .build()
        return _shieldCross!!
    }

private var _shieldCross: ImageVector? = null
