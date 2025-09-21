package dev.chiksmedina.solar.linear.search

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType.Companion.NonZero
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap.Companion.Butt
import androidx.compose.ui.graphics.StrokeCap.Companion.Round
import androidx.compose.ui.graphics.StrokeJoin.Companion.Miter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import dev.chiksmedina.solar.linear.SearchGroup

val SearchGroup.RoundedMagniferZoomIn: ImageVector
    get() {
        if (_roundedMagniferZoomIn != null) {
            return _roundedMagniferZoomIn!!
        }
        _roundedMagniferZoomIn = Builder(
            name = "RoundedMagniferZoomIn", defaultWidth = 24.0.dp,
            defaultHeight = 24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f
        ).apply {
            path(
                fill = SolidColor(Color(0x00000000)), stroke = SolidColor(Color(0xFF000000)),
                strokeLineWidth = 1.5f, strokeLineCap = Butt, strokeLineJoin = Miter,
                strokeLineMiter = 4.0f, pathFillType = NonZero
            ) {
                moveTo(11.0f, 11.0f)
                moveToRelative(-9.0f, 0.0f)
                arcToRelative(9.0f, 9.0f, 0.0f, true, true, 18.0f, 0.0f)
                arcToRelative(9.0f, 9.0f, 0.0f, true, true, -18.0f, 0.0f)
            }
            path(
                fill = SolidColor(Color(0x00000000)), stroke = SolidColor(Color(0xFF000000)),
                strokeLineWidth = 1.5f, strokeLineCap = Round, strokeLineJoin = Miter,
                strokeLineMiter = 4.0f, pathFillType = NonZero
            ) {
                moveTo(9.0f, 11.0f)
                horizontalLineTo(11.0f)
                moveTo(11.0f, 11.0f)
                horizontalLineTo(13.0f)
                moveTo(11.0f, 11.0f)
                verticalLineTo(13.0f)
                moveTo(11.0f, 11.0f)
                verticalLineTo(9.0f)
            }
            path(
                fill = SolidColor(Color(0x00000000)), stroke = SolidColor(Color(0xFF000000)),
                strokeLineWidth = 1.5f, strokeLineCap = Round, strokeLineJoin = Miter,
                strokeLineMiter = 4.0f, pathFillType = NonZero
            ) {
                moveTo(21.812f, 20.9748f)
                curveTo(21.7493f, 21.0695f, 21.636f, 21.1828f, 21.4094f, 21.4094f)
                curveTo(21.1828f, 21.636f, 21.0695f, 21.7493f, 20.9748f, 21.812f)
                curveTo(20.4202f, 22.1793f, 19.6699f, 21.99f, 19.3559f, 21.4036f)
                curveTo(19.3023f, 21.3035f, 19.2563f, 21.15f, 19.1643f, 20.843f)
                curveTo(19.0638f, 20.5076f, 19.0136f, 20.3398f, 19.0038f, 20.2218f)
                curveTo(18.9466f, 19.5268f, 19.5268f, 18.9466f, 20.2218f, 19.0038f)
                curveTo(20.3398f, 19.0136f, 20.5075f, 19.0638f, 20.843f, 19.1643f)
                curveTo(21.15f, 19.2563f, 21.3035f, 19.3023f, 21.4036f, 19.3559f)
                curveTo(21.99f, 19.6699f, 22.1793f, 20.4202f, 21.812f, 20.9748f)
                close()
            }
        }
            .build()
        return _roundedMagniferZoomIn!!
    }

private var _roundedMagniferZoomIn: ImageVector? = null
