package com.chiksmedina.solar.lineduotone.search

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
import com.chiksmedina.solar.lineduotone.SearchGroup

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
                fill = SolidColor(Color(0x00000000)), stroke = SolidColor(Color(0xFF8E93A6)),
                strokeLineWidth = 1.5f, strokeLineCap = Butt, strokeLineJoin = Miter,
                strokeLineMiter = 4.0f, pathFillType = NonZero
            ) {
                moveTo(11.5f, 11.5f)
                moveToRelative(-9.5f, 0.0f)
                arcToRelative(9.5f, 9.5f, 0.0f, true, true, 19.0f, 0.0f)
                arcToRelative(9.5f, 9.5f, 0.0f, true, true, -19.0f, 0.0f)
            }
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
        }
            .build()
        return _minimalisticMagniferZoomIn!!
    }

private var _minimalisticMagniferZoomIn: ImageVector? = null
