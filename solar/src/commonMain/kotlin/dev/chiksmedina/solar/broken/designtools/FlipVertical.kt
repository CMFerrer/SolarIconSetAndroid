package dev.chiksmedina.solar.broken.designtools

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType.Companion.NonZero
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap.Companion.Round
import androidx.compose.ui.graphics.StrokeJoin.Companion.Miter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import dev.chiksmedina.solar.broken.DesignToolsGroup

val DesignToolsGroup.FlipVertical: ImageVector
    get() {
        if (_flipVertical != null) {
            return _flipVertical!!
        }
        _flipVertical = Builder(
            name = "FlipVertical", defaultWidth = 24.0.dp, defaultHeight =
            24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f
        ).apply {
            path(
                fill = SolidColor(Color(0x00000000)), stroke = SolidColor(Color(0xFF000000)),
                strokeLineWidth = 1.5f, strokeLineCap = Round, strokeLineJoin = Miter,
                strokeLineMiter = 4.0f, pathFillType = NonZero
            ) {
                moveTo(8.0f, 22.0f)
                horizontalLineTo(5.8862f)
                curveTo(4.184f, 22.0f, 3.3329f, 22.0f, 3.0538f, 21.4576f)
                curveTo(2.7747f, 20.9152f, 3.2693f, 20.2226f, 4.2587f, 18.8375f)
                lineTo(5.3882f, 17.2563f)
                curveTo(5.8281f, 16.6404f, 6.048f, 16.3325f, 6.371f, 16.1662f)
                curveTo(6.6941f, 16.0f, 7.0725f, 16.0f, 7.8293f, 16.0f)
                lineTo(16.1702f, 16.0f)
                curveTo(16.927f, 16.0f, 17.3055f, 16.0f, 17.6285f, 16.1662f)
                curveTo(17.9516f, 16.3325f, 18.1715f, 16.6404f, 18.6114f, 17.2563f)
                lineTo(19.7409f, 18.8375f)
                curveTo(20.7302f, 20.2226f, 21.2249f, 20.9152f, 20.9458f, 21.4576f)
                curveTo(20.6666f, 22.0f, 19.8156f, 22.0f, 18.1134f, 22.0f)
                horizontalLineTo(12.0f)
            }
            path(
                fill = SolidColor(Color(0x00000000)), stroke = SolidColor(Color(0xFF000000)),
                strokeLineWidth = 1.5f, strokeLineCap = Round, strokeLineJoin = Miter,
                strokeLineMiter = 4.0f, pathFillType = NonZero
            ) {
                moveTo(12.0f, 2.0f)
                lineTo(5.8862f, 2.0f)
                curveTo(4.184f, 2.0f, 3.3329f, 2.0f, 3.0538f, 2.5424f)
                curveTo(2.7747f, 3.0848f, 3.2693f, 3.7774f, 4.2587f, 5.1625f)
                lineTo(5.3882f, 6.7437f)
                curveTo(5.8281f, 7.3596f, 6.048f, 7.6675f, 6.371f, 7.8337f)
                curveTo(6.6941f, 8.0f, 7.0725f, 8.0f, 7.8293f, 8.0f)
                lineTo(16.1702f, 8.0f)
                curveTo(16.927f, 8.0f, 17.3055f, 8.0f, 17.6285f, 7.8337f)
                curveTo(17.9516f, 7.6675f, 18.1715f, 7.3596f, 18.6114f, 6.7437f)
                lineTo(19.7409f, 5.1625f)
                curveTo(20.7302f, 3.7774f, 21.2249f, 3.0848f, 20.9458f, 2.5424f)
                curveTo(20.6666f, 2.0f, 19.8156f, 2.0f, 18.1134f, 2.0f)
                lineTo(16.0567f, 2.0f)
            }
            path(
                fill = SolidColor(Color(0x00000000)), stroke = SolidColor(Color(0xFF000000)),
                strokeLineWidth = 1.5f, strokeLineCap = Round, strokeLineJoin = Miter,
                strokeLineMiter = 4.0f, pathFillType = NonZero
            ) {
                moveTo(14.0f, 12.0f)
                lineTo(10.0f, 12.0f)
                moveTo(6.0f, 12.0f)
                lineTo(2.0f, 12.0f)
                moveTo(22.0f, 12.0f)
                lineTo(18.0f, 12.0f)
            }
        }
            .build()
        return _flipVertical!!
    }

private var _flipVertical: ImageVector? = null
