package com.chiksmedina.solar.broken.search

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType
import androidx.compose.ui.graphics.PathFillType.Companion.NonZero
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeCap.Companion.Round
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.StrokeJoin.Companion.Miter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.chiksmedina.solar.broken.SearchGroup

public val SearchGroup.RoundedMagniferZoomOut: ImageVector
    get() {
        if (_roundedMagniferZoomOut != null) {
            return _roundedMagniferZoomOut!!
        }
        _roundedMagniferZoomOut = Builder(name = "RoundedMagniferZoomOut", defaultWidth = 24.0.dp,
                defaultHeight = 24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0x00000000)), stroke = SolidColor(Color(0xFF000000)),
                    strokeLineWidth = 1.5f, strokeLineCap = Round, strokeLineJoin = Miter,
                    strokeLineMiter = 4.0f, pathFillType = NonZero) {
                moveTo(9.0f, 11.0f)
                horizontalLineTo(11.0f)
                horizontalLineTo(13.0f)
            }
            path(fill = SolidColor(Color(0x00000000)), stroke = SolidColor(Color(0xFF000000)),
                    strokeLineWidth = 1.5f, strokeLineCap = Round, strokeLineJoin = Miter,
                    strokeLineMiter = 4.0f, pathFillType = NonZero) {
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
            path(fill = SolidColor(Color(0x00000000)), stroke = SolidColor(Color(0xFF000000)),
                    strokeLineWidth = 1.5f, strokeLineCap = Round, strokeLineJoin = Miter,
                    strokeLineMiter = 4.0f, pathFillType = NonZero) {
                moveTo(6.75f, 3.2709f)
                curveTo(8.1473f, 2.4626f, 9.7696f, 2.0f, 11.5f, 2.0f)
                curveTo(16.7467f, 2.0f, 21.0f, 6.2533f, 21.0f, 11.5f)
                curveTo(21.0f, 16.7467f, 16.7467f, 21.0f, 11.5f, 21.0f)
                curveTo(6.2533f, 21.0f, 2.0f, 16.7467f, 2.0f, 11.5f)
                curveTo(2.0f, 9.7696f, 2.4626f, 8.1473f, 3.2709f, 6.75f)
            }
        }
        .build()
        return _roundedMagniferZoomOut!!
    }

private var _roundedMagniferZoomOut: ImageVector? = null
