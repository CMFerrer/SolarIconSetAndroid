package com.chiksmedina.solar.broken.search

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType.Companion.NonZero
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap.Companion.Round
import androidx.compose.ui.graphics.StrokeJoin.Companion.Miter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.chiksmedina.solar.broken.SearchGroup

val SearchGroup.MinimalisticMagniferZoomIn: ImageVector
    get() {
        if (_minimalisticMagniferZoomIn != null) {
            return _minimalisticMagniferZoomIn!!
        }
        _minimalisticMagniferZoomIn = Builder(
            name = "MinimalisticMagniferZoomIn", defaultWidth =
            24.0.dp, defaultHeight = 24.0.dp, viewportWidth = 24.0f, viewportHeight =
            24.0f
        ).apply {
            path(
                fill = SolidColor(Color(0x00000000)), stroke = SolidColor(Color(0xFF000000)),
                strokeLineWidth = 1.5f, strokeLineCap = Round, strokeLineJoin = Miter,
                strokeLineMiter = 4.0f, pathFillType = NonZero
            ) {
                moveTo(9.0f, 11.5f)
                horizontalLineTo(11.5f)
                moveTo(11.5f, 11.5f)
                horizontalLineTo(14.0f)
                moveTo(11.5f, 11.5f)
                verticalLineTo(14.0f)
                moveTo(11.5f, 11.5f)
                verticalLineTo(9.0f)
            }
            path(
                fill = SolidColor(Color(0x00000000)), stroke = SolidColor(Color(0xFF000000)),
                strokeLineWidth = 1.5f, strokeLineCap = Round, strokeLineJoin = Miter,
                strokeLineMiter = 4.0f, pathFillType = NonZero
            ) {
                moveTo(20.0f, 20.0f)
                lineTo(22.0f, 22.0f)
            }
            path(
                fill = SolidColor(Color(0x00000000)), stroke = SolidColor(Color(0xFF000000)),
                strokeLineWidth = 1.5f, strokeLineCap = Round, strokeLineJoin = Miter,
                strokeLineMiter = 4.0f, pathFillType = NonZero
            ) {
                moveTo(6.75f, 3.2709f)
                curveTo(8.1473f, 2.4626f, 9.7696f, 2.0f, 11.5f, 2.0f)
                curveTo(16.7467f, 2.0f, 21.0f, 6.2533f, 21.0f, 11.5f)
                curveTo(21.0f, 16.7467f, 16.7467f, 21.0f, 11.5f, 21.0f)
                curveTo(6.2533f, 21.0f, 2.0f, 16.7467f, 2.0f, 11.5f)
                curveTo(2.0f, 9.7696f, 2.4626f, 8.1473f, 3.2709f, 6.75f)
            }
        }
            .build()
        return _minimalisticMagniferZoomIn!!
    }

private var _minimalisticMagniferZoomIn: ImageVector? = null
