package com.chiksmedina.solar.bold.essentionalui

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType.Companion.EvenOdd
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap.Companion.Butt
import androidx.compose.ui.graphics.StrokeJoin.Companion.Miter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.chiksmedina.solar.bold.EssentionalUiGroup

val EssentionalUiGroup.AddSquare: ImageVector
    get() {
        if (_addSquare != null) {
            return _addSquare!!
        }
        _addSquare = Builder(
            name = "AddSquare", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
            viewportWidth = 24.0f, viewportHeight = 24.0f
        ).apply {
            path(
                fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                pathFillType = EvenOdd
            ) {
                moveTo(12.0f, 22.0f)
                curveTo(7.286f, 22.0f, 4.9289f, 22.0f, 3.4645f, 20.5355f)
                curveTo(2.0f, 19.0711f, 2.0f, 16.714f, 2.0f, 12.0f)
                curveTo(2.0f, 7.286f, 2.0f, 4.9289f, 3.4645f, 3.4645f)
                curveTo(4.9289f, 2.0f, 7.286f, 2.0f, 12.0f, 2.0f)
                curveTo(16.714f, 2.0f, 19.0711f, 2.0f, 20.5355f, 3.4645f)
                curveTo(22.0f, 4.9289f, 22.0f, 7.286f, 22.0f, 12.0f)
                curveTo(22.0f, 16.714f, 22.0f, 19.0711f, 20.5355f, 20.5355f)
                curveTo(19.0711f, 22.0f, 16.714f, 22.0f, 12.0f, 22.0f)
                close()
                moveTo(12.0f, 8.25f)
                curveTo(12.4142f, 8.25f, 12.75f, 8.5858f, 12.75f, 9.0f)
                verticalLineTo(11.25f)
                horizontalLineTo(15.0f)
                curveTo(15.4142f, 11.25f, 15.75f, 11.5858f, 15.75f, 12.0f)
                curveTo(15.75f, 12.4142f, 15.4142f, 12.75f, 15.0f, 12.75f)
                horizontalLineTo(12.75f)
                lineTo(12.75f, 15.0f)
                curveTo(12.75f, 15.4142f, 12.4142f, 15.75f, 12.0f, 15.75f)
                curveTo(11.5858f, 15.75f, 11.25f, 15.4142f, 11.25f, 15.0f)
                verticalLineTo(12.75f)
                horizontalLineTo(9.0f)
                curveTo(8.5858f, 12.75f, 8.25f, 12.4142f, 8.25f, 12.0f)
                curveTo(8.25f, 11.5858f, 8.5858f, 11.25f, 9.0f, 11.25f)
                horizontalLineTo(11.25f)
                lineTo(11.25f, 9.0f)
                curveTo(11.25f, 8.5858f, 11.5858f, 8.25f, 12.0f, 8.25f)
                close()
            }
        }
            .build()
        return _addSquare!!
    }

private var _addSquare: ImageVector? = null
